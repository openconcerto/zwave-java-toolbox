package zwave;

public class SerialAPIMessage {
	private byte[] data;
	private long time;

	public SerialAPIMessage(byte[] data) {
		this.data = data;
		this.time = System.currentTimeMillis();
	}

	public long getTime() {
		return time;
	}

	public boolean isResponse() {
		return data[2] == ZWaveAPIConstants.RESPONSE;
	}

	public byte getCommand() {
		return data[3];
	}

	public String getCommandName() {
		return getCommandName(data[3]);
	}

	public byte[] getHandlerData() {
		byte cmd = getCommand();
		if (cmd != ZWaveAPIConstants.FUNC_ID_APPLICATION_COMMAND_HANDLER_BRIDGE) {
			throw new IllegalStateException("message is not APPLICATION_COMMAND_HANDLER_BRIDGE : " + this.getSummary());
		}
		byte len = data[7];
		byte[] handlerData = new byte[len];
		System.arraycopy(data, 8, handlerData, 0, len);
		return handlerData;
	}

	public String getSummary() {

		StringBuilder b = new StringBuilder();
		if (isResponse()) {
			b.append("RESPONSE ");
		} else {
			b.append("REQUEST ");
		}
		byte cmd = getCommand();
		b.append(getCommandName());
		b.append(" : ");
		if (cmd == ZWaveAPIConstants.FUNC_ID_APPLICATION_COMMAND_HANDLER_BRIDGE) {
			byte dest = data[5];
			byte src = data[6];
			byte[] handlerData = getHandlerData();
			b.append(src);
			b.append("->");
			b.append(dest);
			b.append(" : ");

			byte commandClass = handlerData[0];
			for (CommandClass c : CommandClass.values()) {
				final byte classCode = c.getClassCode();
				if (classCode == commandClass) {

					if (classCode == CommandClass.MANUFACTURER_SPECIFIC.getClassCode()) {
						if (handlerData[1] == ZWaveValues.MANUFACTURER_SPECIFIC_REPORT) {
							b.append("MANUFACTURER_SPECIFIC_REPORT ");
						} else {
							b.append(c.getLabel());
							b.append(" ");
						}

					} else {
						b.append(c.getLabel());
						b.append(" ");
					}

					break;
				}
			}

			b.append(Utilities.asHexWithSpace(handlerData));

		} else if (cmd == ZWaveAPIConstants.FUNC_ID_ZW_GET_NODE_PROTOCOL_INFO) {
			if (isResponse()) {
				byte[] infoData = new byte[6];
				System.arraycopy(this.getBytes(), 4, infoData, 0, 6);
				NodeProtocolInfo info = new NodeProtocolInfo(infoData);
				b.append(info.getDeviceClassName() + " (0x" + Utilities.asHex(info.getDeviceClass()) + ")");
				b.append(" generic: 0x" + Utilities.asHex(info.getGenericDeviceClass()));
				b.append(" specific: 0x" + Utilities.asHex(info.getSpecificDeviceClass()));
			} else {
				b.append("node " + data[4]);
			}
		} else if (cmd == ZWaveAPIConstants.FUNC_ID_SERIAL_API_SETUP) {
			b.append(ZWaveAPIConstants.getSetupCommandName(data[4]));
			if (isResponse()) {
				byte[] setupdata = new byte[data.length - 6];
				System.arraycopy(data, 5, setupdata, 0, setupdata.length);
				b.append(", data: ");
				b.append(Utilities.asHexWithSpace(setupdata));
			}
		}

		b.append(" [");
		b.append(Utilities.asHexWithSpace(data));
		b.append("]");
		return b.toString();
	}

	public byte getByte(int i) {
		return data[i];
	}

	public String getHexString() {
		return Utilities.asHexWithSpace(data);
	}

	public byte[] getBytes() {
		return data;
	}

	static String getCommandName(byte command) {
		String commandName;
		switch (command) {
		case ZWaveAPIConstants.FUNC_ID_ZW_GET_DCDC_CONFIG:
			commandName = "Get DCDC configuration";
			break;
		case ZWaveAPIConstants.FUNC_ID_SERIAL_API_READY:
			commandName = "Ready";
			break;
		case ZWaveAPIConstants.FUNC_ID_SERIAL_API_GET_CAPABILITIES:
			commandName = "Get capabilities";
			break;
		case ZWaveAPIConstants.FUNC_ID_ZW_GET_CONTROLLER_CAPABILITIES:
			commandName = "Get controller capabilities";
			break;
		case ZWaveAPIConstants.FUNC_ID_SERIAL_API_SETUP:
			commandName = "Setup";
			break;
		case ZWaveAPIConstants.FUNC_ID_SERIAL_API_STARTED:
			commandName = "Started";
			break;
		case ZWaveAPIConstants.FUNC_ID_SERIAL_API_SOFT_RESET:
			commandName = "Soft reset";
			break;
		case ZWaveAPIConstants.FUNC_ID_SERIAL_API_GET_INIT_DATA:
			commandName = "Get initial data";
			break;
		case ZWaveAPIConstants.FUNC_ID_ZW_REQUEST_NODE_INFO:
			commandName = "Request node info";
			break;
		case ZWaveAPIConstants.FUNC_ID_ZW_SEND_DATA:
			commandName = "Send data";
			break;
		case ZWaveAPIConstants.FUNC_ID_ZW_GET_NODE_PROTOCOL_INFO:
			commandName = "Get node protocol information";
			break;
		case ZWaveAPIConstants.FUNC_ID_APPLICATION_COMMAND_HANDLER_BRIDGE:
			commandName = "Command handler bridge";
			break;
		case ZWaveAPIConstants.FUNC_ID_MEMORY_GET_ID:
			commandName = "Memory get ID";
			break;
		case ZWaveAPIConstants.FUNC_ID_ZW_APPLICATION_CONTROLLER_UPDATE:
			commandName = "Application controller update";
			break;
		default:
			commandName = "Unknown command (" + Utilities.asHexWithSpace(new byte[] { command }) + ")";
			break;
		}
		return commandName;
	}
}
