package zwave;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.fazecast.jSerialComm.SerialPort;

import zwave.ZWaveAPIConstants.Region;

public class ZWaveSerialAPI {

	private static final byte[] ACK_BYTES = new byte[] { ZWaveAPIConstants.ACK };
	private static final byte[] NAK_BYTES = new byte[] { ZWaveAPIConstants.NAK };
	private SerialPort serialPort;
	private Receiver t;
	private PrintStream logPrintStream;

	private final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
	private long lastCleanUpTime;
	private int maxMessageLifetime = 3600;
	private final LinkedList<SerialAPIMessage> messages = new LinkedList<>();
	private final ExecutorService executor = Executors.newSingleThreadScheduledExecutor();
	private List<MessageListener> listeners = new ArrayList<>(1);

	public ZWaveSerialAPI(String serialPortName) throws IOException {
		this(serialPortName, null);
	}

	public ZWaveSerialAPI(String serialPortName, File logFile) throws IOException {
		if (logFile != null) {
			System.out.println("Z-Wave communcation log file : " + logFile.getCanonicalPath());
		}
		serialPort = SerialPort.getCommPort(serialPortName);
		serialPort.setComPortParameters(115200, 8, 1, SerialPort.NO_PARITY);
		serialPort.setComPortTimeouts(SerialPort.TIMEOUT_READ_BLOCKING, 20, 0);
		boolean open = serialPort.openPort();
		if (!open) {
			throw new IOException("cannot open serial serialPort " + serialPortName);
		}
		if (logFile != null) {
			logPrintStream = new PrintStream(logFile);
		}
		startListening("start");

		System.out.println("Using serial serialPort: " + serialPortName);
		sendNAK();
		// Soft reset
		softReset();
		System.out.println("Soft reset requested");
		// Controller will reply "Started"
		waitRequest(ZWaveAPIConstants.FUNC_ID_SERIAL_API_STARTED);
		// The controller supports 8 and 16 bits node ids, if mode is not set the
		// controller will not reply data
		System.out.println("Using 8 bits node ids");
		sendSetupCommand(ZWaveAPIConstants.SERIAL_API_SETUP_CMD_NODEID_BASETYPE_SET,
				ZWaveAPIConstants.NODEID_BASETYPE_8BITS);
	}

	/**
	 * Define how long a not processed message should be keeped in memory.
	 * 
	 * Lifetime is checked only when a new message is received
	 * 
	 * @param duration in seconds
	 */
	public void setMaxMessageLifetime(int seconds) {
		this.maxMessageLifetime = seconds;
	}

	public synchronized void log(String str) {
		if (logPrintStream != null) {
			logPrintStream.print(sdf.format(new Date(System.currentTimeMillis())));
			logPrintStream.print(" ");
			logPrintStream.println(str);
			logPrintStream.flush();
		}
	}

	public void sendNAK() {
		serialPort.writeBytes(NAK_BYTES, 1);
		log(">> NAK  " + Utilities.asHexWithSpace(NAK_BYTES));
	}

	public void sendACK() {
		serialPort.writeBytes(ACK_BYTES, 1);
		log(">> ACK  " + Utilities.asHexWithSpace(ACK_BYTES));
	}

	/**
	 * Get the radio frequency region used by the controller
	 * 
	 * @return the region or null is not found or command not supported
	 */
	public Region getRegion() {
		final SerialAPIMessage msg = sendSetupCommand(ZWaveAPIConstants.SERIAL_API_SETUP_CMD_RF_REGION_GET);
		if (msg == null) {
			return null;
		}
		byte code = msg.getByte(5);
		for (Region r : Region.values()) {
			if (r.getCode() == code) {
				return r;
			}
		}
		return null;
	}

	/**
	 * Set the radio frequency region used by the controller
	 * 
	 * @param region
	 * 
	 */
	public void setRFRegion(ZWaveAPIConstants.Region region) {
		sendRequestAndWaitForReply(ZWaveAPIConstants.FUNC_ID_SERIAL_API_SETUP,
				ZWaveAPIConstants.SERIAL_API_SETUP_CMD_RF_REGION_SET, region.getCode());

		softReset();
	}

	public boolean sendRequest(byte commandID, byte... parameters) {

		this.stopListening("send request " + SerialAPIMessage.getCommandName(commandID));
		byte[] frame = sendOnly(commandID, parameters);
		//

		byte[] buffer = new byte[1024];
		int r = serialPort.readBytes(buffer, 1);
		if (r == 0) {
			System.out.println("ZWaveSerialAPI.sendRequest() " + SerialAPIMessage.getCommandName(commandID) + " : "
					+ Utilities.asHex(frame) + " not reply");

			return false;
		}
		final byte b = buffer[0];
		if (b != ZWaveAPIConstants.ACK) {
			System.out.println("ZWaveSerialAPI.sendRequest() " + SerialAPIMessage.getCommandName(commandID) + " : "
					+ Utilities.asHex(frame) + " reply is not ACK : " + b);
			log("<< ???? " + Utilities.asHex(b));
		} else {
			log("<< ACK  " + Utilities.asHex(b));
		}

		final boolean ok = b == ZWaveAPIConstants.ACK;

		this.startListening("resuming after send request " + SerialAPIMessage.getCommandName(commandID) + " done ");
		return ok;

	}

	private byte[] sendOnly(byte commandID, byte... parameters) {
		int frameLength = 5;
		if (parameters != null) {
			frameLength += parameters.length;
		}
		byte[] frame = new byte[frameLength];
		frame[0] = ZWaveAPIConstants.SOF;
		frame[1] = (byte) (frame.length - 2);
		frame[2] = ZWaveAPIConstants.REQUEST;
		frame[3] = commandID;
		if (parameters != null) {
			for (int i = 0; i < parameters.length; i++) {
				frame[4 + i] = parameters[i];
			}
		}
		// CRC
		frame[frameLength - 1] = Utilities.crc(frame);
		serialPort.writeBytes(frame, frame.length);
		log(">> DATA " + new SerialAPIMessage(frame).getSummary());
		return frame;
	}

	private SerialAPIMessage sendRequestAndWaitForReply(byte commandID, byte... parameters) {

		this.stopListening("sendRequestAndWaitForReply " + SerialAPIMessage.getCommandName(commandID));

		int frameLength = 5;
		if (parameters != null) {
			frameLength += parameters.length;
		}
		byte[] frame = new byte[frameLength];
		frame[0] = ZWaveAPIConstants.SOF;
		frame[1] = (byte) (frame.length - 2);
		frame[2] = ZWaveAPIConstants.REQUEST;
		frame[3] = commandID;
		if (parameters != null) {
			for (int i = 0; i < parameters.length; i++) {
				frame[4 + i] = parameters[i];
			}
		}
		// CRC
		frame[frameLength - 1] = Utilities.crc(frame);

		serialPort.writeBytes(frame, frame.length);
		log(">> DATA " + new SerialAPIMessage(frame).getSummary());

		// Wait ACK
		byte[] buffer = new byte[1024];
		int r = serialPort.readBytes(buffer, 1);
		if (r == 0) {
			System.out.println("ZWaveSerialAPI.sendRequestAndWaitForReply() " + Utilities.asHex(frame) + " not reply");
			this.startListening(
					"sendRequestAndWaitForReply resuming after no reply" + SerialAPIMessage.getCommandName(commandID));
			return null;
		}
		final byte b = buffer[0];
		if (b != ZWaveAPIConstants.ACK) {
			System.out.println("ZWaveSerialAPI.sendRequestAndWaitForReply() " + Utilities.asHex(frame)
					+ " reply is not ACK : " + b);
			log("<< ???? " + Utilities.asHex(b));
			this.startListening(
					"sendRequestAndWaitForReply resuming after NO ACK" + SerialAPIMessage.getCommandName(commandID));
		} else {
			log("<< ACK  " + Utilities.asHex(b));
			this.startListening(
					"sendRequestAndWaitForReply resuming after ACK" + SerialAPIMessage.getCommandName(commandID));
		}

		final boolean ok = (b == ZWaveAPIConstants.ACK);
		if (!ok) {
			return null;
		}
		SerialAPIMessage message = waitResponse(commandID);

		return message;
	}

	private SerialAPIMessage waitResponse(byte commandID) {
		for (int i = 0; i < 1000; i++) {
			SerialAPIMessage m = getResponseMessage(commandID);
			if (m != null) {
				return m;

			}
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(
				"ZWaveSerialAPI.waitResponse() TIMEOUT for command : " + SerialAPIMessage.getCommandName(commandID));
		return null;
	}

	private SerialAPIMessage waitRequest(byte commandID) {
		for (int i = 0; i < 1000; i++) {
			SerialAPIMessage m = getRequestMessage(commandID);
			if (m != null) {
				return m;

			}
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("ZWaveSerialAPI.waitResponse() TIMEOUT for command : " + Utilities.asHex(commandID));
		return null;
	}

	private void addMessageListener(MessageListener messageListener) {
		this.listeners.add(messageListener);

	}

	public SerialAPIMessage sendSetupCommand(byte... cmd) {
		SerialAPIMessage data = sendRequestAndWaitForReply(ZWaveAPIConstants.FUNC_ID_SERIAL_API_SETUP, cmd);
		return data;
	}

	public byte[] getMemoryId() {
		final byte[] hex = new byte[4];
		SerialAPIMessage data = sendRequestAndWaitForReply(ZWaveAPIConstants.FUNC_ID_MEMORY_GET_ID);

		if (data != null) {
			System.arraycopy(data.getBytes(), 4, hex, 0, hex.length);
		}
		return hex;

	}

	public int getDCDCConfiguration() {
		SerialAPIMessage data = sendRequestAndWaitForReply(ZWaveAPIConstants.FUNC_ID_ZW_GET_DCDC_CONFIG);
		if (data == null) {
			return -1;
		}
		return data.getByte(4);
	}

	public ProductInfo getManufacturerProductInfo(byte id) {
		SerialAPIMessage msg = sendData(id, new byte[] { CommandClass.MANUFACTURER_SPECIFIC.getClassCode(),
				ZWaveValues.MANUFACTURER_SPECIFIC_GET });
		if (msg == null) {
			return null;
		}
		byte[] data = msg.getHandlerData();
		byte[] productData = new byte[data.length - 2];
		System.arraycopy(data, 2, productData, 0, productData.length);
		return new ProductInfo(productData);
	}

	public NodeProtocolInfo getNodeProtocolInfo(byte id) {
		SerialAPIMessage msg = sendRequestAndWaitForReply(ZWaveAPIConstants.FUNC_ID_ZW_GET_NODE_PROTOCOL_INFO, id);
		if (msg == null) {
			return null;
		}
		byte[] data = new byte[6];
		System.arraycopy(msg.getBytes(), 4, data, 0, 6);
		return new NodeProtocolInfo(data);
	}

	public SerialAPIMessage sendData(byte nodeId, byte[] data) {
		SerialAPIMessage reply = null;

		try (ByteArrayOutputStream out = new ByteArrayOutputStream()) {
			out.write(nodeId);
			if (data != null && data.length > 0) {
				out.write(data.length);
				out.write(data);
			} else {
				out.write(0);
			}
			out.write(0x25);
			out.write(0x06);
			reply = sendRequestAndWaitForReply(ZWaveAPIConstants.FUNC_ID_ZW_SEND_DATA, out.toByteArray());
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (reply == null) {
			return null;
		}
		boolean callback = (reply.getByte(4) != 0);

		SerialAPIMessage reply2 = waitRequest(ZWaveAPIConstants.FUNC_ID_ZW_SEND_DATA);
		if (callback) {
			for (int i = 0; i < 1000; i++) {
				SerialAPIMessage found = null;
				for (SerialAPIMessage message : messages) {
					if (!message.isResponse()
							&& message.getCommand() == ZWaveAPIConstants.FUNC_ID_APPLICATION_COMMAND_HANDLER_BRIDGE) {

						if (message.getByte(8) == data[0]) {

							found = message;
							break;
						}
					}

				}
				if (found != null) {
					messages.remove(found);
					return found;
				}

				try {
					Thread.sleep(30);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		}
		return reply2;

	}

	public SerialAPIMessage sendCommand(byte nodeId, CommandClass cmdClass, byte cmd, byte... value) {
		byte[] data = new byte[2 + value.length];
		data[0] = cmdClass.getClassCode();
		data[1] = cmd;
		System.arraycopy(value, 0, data, 2, value.length);
		return sendData(nodeId, data);
	}

	/**
	 * Set a value between 0 and 255 (#0x00 …0xff)
	 * 
	 * @param nodeId the id of the node
	 * @param value  the value to set
	 */
	public boolean basicSet(byte nodeId, byte value) {
		SerialAPIMessage result = sendCommand(nodeId, CommandClass.BASIC, ZWaveValues.BASIC_SET, value);
		return result != null;
	}

	/**
	 * Ask the node to report a value
	 * 
	 * @param nodeId the id of the node
	 * @return the value (between 0 and 255) or -1 if the value cannot be retreived
	 *         (missing node, timeout...)
	 */
	public int basicGet(byte nodeId) {
		SerialAPIMessage result = sendCommand(nodeId, CommandClass.BASIC, ZWaveValues.BASIC_GET);
		if (result == null) {
			return -1;
		}
		return result.getHandlerData()[2] & 0xFF;
	}

	public InitialData getInitialData() {
		final SerialAPIMessage result = sendRequestAndWaitForReply(ZWaveAPIConstants.FUNC_ID_SERIAL_API_GET_INIT_DATA);
		if (result == null)
			return null;
		return new InitialData(result);
	}

	/**
	 * Get serial API information
	 */
	public Capabilites getCapabilities() {
		SerialAPIMessage result = sendRequestAndWaitForReply(ZWaveAPIConstants.FUNC_ID_SERIAL_API_GET_CAPABILITIES,
				(byte) 0x03);
		if (result == null)
			return null;
		return new Capabilites(result);
	}

	/**
	 * Get serial API supported commands
	 */
	public List<Integer> getControlerSupportedCommands() {
		// Is is reliable ?
		Set<Integer> commands = new HashSet<>();
		SerialAPIMessage msg = sendSetupCommand(ZWaveAPIConstants.SERIAL_API_SETUP_CMD_SUPPORTED);
		byte flags = msg.getByte(5);
		BitSet set1 = BitSet.valueOf(new byte[] { flags });
		for (int i = 0; i < 8; i++) {
			if (set1.get(i)) {
				commands.add(i + 1);
			}
		}

		int size = msg.getBytes().length - 7;
		final int bitCount = size * 8;
		byte[] mask = new byte[size];
		System.arraycopy(msg.getBytes(), 6, mask, 0, size);
		BitSet set2 = BitSet.valueOf(mask);

		for (int i = 0; i < bitCount; i++) {
			if (set2.get(i)) {
				commands.add(i + 1);
			}
		}
		final ArrayList<Integer> result = new ArrayList<>(commands);
		Collections.sort(result);
		return result;
	}

	public void sendReady() {
		sendRequest(ZWaveAPIConstants.FUNC_ID_SERIAL_API_READY, (byte) 1);
	}

	public void softReset() {
		sendRequest(ZWaveAPIConstants.FUNC_ID_SERIAL_API_SOFT_RESET);

	}

	public int readBytes(byte[] buffer, int bytesToRead) {
		return this.serialPort.readBytes(buffer, bytesToRead);
	}

	public synchronized void startListening(String context) {
		if (t != null) {
			t.interrupt();
		}

		t = new Receiver(this, context);
		this.executor.execute(t);
	}

	public synchronized void stopListening(String context) {
		if (this.t != null) {
			t.interrupt();
		}
		try {
			Future<?> future = this.executor.submit(new Runnable() {

				@Override
				public void run() {
					// Nothing
				}
			});
			future.get();
		} catch (ExecutionException | InterruptedException e) {
			e.printStackTrace();
		}

	}

	public List<SerialAPIMessage> getMessageQueue() {
		return this.messages;
	}

	public synchronized void addMessage(SerialAPIMessage message) {
		if (this.listeners.isEmpty()) {

			this.messages.add(message);
		} else {
			for (MessageListener listener : this.listeners) {
				listener.messageReceived(message);
			}
		}
		if (System.currentTimeMillis() - lastCleanUpTime > this.maxMessageLifetime / 2) {
			long max = System.currentTimeMillis() - this.maxMessageLifetime;
			ListIterator<SerialAPIMessage> iter = messages.listIterator();
			while (iter.hasNext()) {
				if (iter.next().getTime() < max) {
					iter.remove();
				}
			}

		}
	}

	public synchronized SerialAPIMessage getResponseMessage(byte commandID) {

		SerialAPIMessage found = null;
		for (SerialAPIMessage message : messages) {
			if (message.isResponse() && message.getCommand() == commandID) {
				found = message;
				break;
			}

		}
		if (found != null) {
			messages.remove(found);
			return found;
		}
		return null;
	}

	public synchronized SerialAPIMessage getRequestMessage(byte commandID) {
		SerialAPIMessage found = null;
		for (SerialAPIMessage message : messages) {
			if (!message.isResponse() && message.getCommand() == commandID) {
				found = message;
				break;
			}

		}
		if (found != null) {
			messages.remove(found);
			return found;
		}
		return null;
	}

	private static void printUsage() {
		System.out.println("Z-Wave tools");
		System.out.println();
		System.out.println("Usage : java -jar zwave-toolbox.jar [OPTIONS] SERIAL_PORT");
		System.out.println();
		System.out.println("Options");
		System.out.println("--listen            do not exit and print received Z-Wave messages");
		System.out.println("--log-file=FILE     log all the messages in a file");
		System.out.println("--get-NODEID		basic get on node NODEID");
		System.out.println("--set-NODEID=VALUE	basic set VALUE on node NODEID");
		System.out.println();
		System.out.println("Examples");
		System.out.println("Windows : java -jar zwave-mqqt.jar COM5");
		System.out.println("          java -jar zwave-mqqt.jar COM5 --get-3");
		System.out.println("Linux :   java -jar zwave-toolbox.jar /dev/ttyUSB0");
	}

	public static void main(String[] args) throws IOException {
		if (args.length < 1) {
			printUsage();
			System.exit(0);
		}

		boolean listen = false;
		String logFilePath = null;
		String port = null;
		Integer getId = null;
		Integer setId = null;
		Integer setValue = null;
		for (String arg : args) {
			if (arg.equalsIgnoreCase("--listen")) {
				listen = true;
			} else if (arg.startsWith("--log-file=")) {
				logFilePath = arg.substring(11);
			} else if (arg.startsWith("--get-")) {
				getId = Integer.parseInt(arg.substring(6));
			} else if (arg.startsWith("--set-")) {
				int index = arg.indexOf('=');
				if (index < 0) {
					System.err.println("missing set parameter\n");
					printUsage();
					System.exit(1);
				}
				try {
					setId = Integer.parseInt(arg.substring(6, index));
					setValue = Integer.parseInt(arg.substring(index + 1));
				} catch (Exception e) {
					System.err.println("invalid set parameter\n");
					printUsage();
					System.exit(1);
				}
			} else {
				port = arg;
			}
		}
		File logFile = null;
		if (logFilePath != null && !logFilePath.trim().isEmpty()) {
			logFile = new File(logFilePath);
		}
		if (port == null) {
			printUsage();
			System.exit(1);
		}
		// Init
		ZWaveSerialAPI api = new ZWaveSerialAPI(port, logFile);

		Capabilites capabilites = api.getCapabilities();
		if (capabilites == null) {
			System.err.println("Error : cannot get controller capabilities");
			System.exit(1);
		}
		System.out.println("Z-Wave device firmware: Z-Wave " + capabilites.getFirmwareVersion());

		InitialData initData = api.getInitialData();
		if (initData == null) {
			System.out.println("Error : cannot get initial data");
			System.exit(2);
		}
		System.out.println("Chip type: "
				+ initData.getChipTypeName().replace('x', String.valueOf(initData.getChipVersion()).charAt(0)));

		int conf = api.getDCDCConfiguration();
		if (conf == 0) {
			System.out.println("DCDC configuration: auto");
		} else if (conf == 1) {
			System.out.println("DCDC configuration: bypass");
		} else if (conf == 2) {
			System.out.println("DCDC configuration: low noise");
		} else {
			System.out.println("DCDC configuration: unknown");
		}

		byte[] homeId = api.getMemoryId();
		System.out.println("Home Id: " + Utilities.asHexWithSpace(homeId));

		api.sendReady();

		Region region = api.getRegion();
		System.out.println("RF region: " + region.getName());

		System.out.println("Controller has " + initData.getNodeIds().size() + " registered nodes");
		if (getId != null) {
			Byte id = getId.byteValue();
			if (!initData.getNodeIds().contains(id)) {
				System.out.println("warning : node " + id + " is not registered");
			}
			System.out.println("node " + id + " current value : " + api.basicGet(id));
		} else if (setId != null) {
			Byte id = setId.byteValue();
			if (!initData.getNodeIds().contains(id)) {
				System.out.println("warning : node " + id + " is not registered");
			}
			boolean b = api.basicSet(id, setValue.byteValue());
			if (b) {
				System.out.println("node " + id + " set value : " + setValue + " success");
			} else {
				System.err.println("node " + id + " set value : " + setValue + " failed");
				System.exit(1);
			}
		} else {
			for (Byte id : initData.getNodeIds()) {
				System.out.println("Node: " + id + " (0x" + Utilities.asHex(id) + ")");
				NodeProtocolInfo info = api.getNodeProtocolInfo(id);
				System.out.println("- basic device class: " + info.getDeviceClassName());
				System.out.println("- generic device class: " + info.getGenericDeviceClassName());
				System.out.println("- specific device class: " + info.getSpecificDeviceClassName());
				System.out.println("- listening: " + info.isListening());
				System.out.println("- routing: " + info.isRouting());
				if (info.isListening() && id != 1) {
					ProductInfo pInfo = api.getManufacturerProductInfo(id);
					if (pInfo != null) {
						System.out.println("- manufacturer: " + pInfo.getManufacturerName());
						System.out.println("- name: " + pInfo.getName());
						System.out.println("- description: " + pInfo.getDescription());
					} else {
						System.out.println("- description: not available");
					}
				}
				if (info.getGenericDeviceClass() == NodeProtocolInfo.GENERIC_TYPE_SWITCH_BINARY) {
					int v = api.basicGet(id.byteValue());
					if (v == -1) {
						System.out.println("- switch state: unknown");
					} else {
						System.out.println("- switch state: " + ((v == 0) ? "off" : "on"));
					}
				}
			}
		}
		if (listen) {
			api.addMessageListener(new MessageListener() {

				@Override
				public void messageReceived(SerialAPIMessage message) {
					System.out.println(
							"MESSAGE RECEIVED : " + api.sdf.format(new Date(message.getTime())) + message.getSummary());

				}
			});
		} else {
			api.close();
			System.exit(0);
		}

	}

	private void close() {
		this.serialPort.closePort();
		this.executor.shutdown();
	}

}
