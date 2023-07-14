package zwave.mqtt;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.eclipse.paho.client.mqttv3.IMqttClient;
import org.eclipse.paho.client.mqttv3.IMqttMessageListener;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import zwave.Utilities;
import zwave.ZWaveAPIConstants;
import zwave.Capabilites;
import zwave.InitialData;
import zwave.NodeProtocolInfo;
import zwave.ProductInfo;
import zwave.SerialAPIMessage;
import zwave.ZWaveSerialAPI;
import zwave.ZWaveAPIConstants.Region;

public class MQTTBridge {
	private final ExecutorService executor;
	private boolean verbose;

	public static void main(String[] args) throws Exception {
		if (args.length < 2) {
			printUsage();
			System.exit(1);
		}
		boolean verbose = false;
		char[] password = null;
		String broker = null;
		String serial = null;
		for (String arg : args) {
			if (arg.equalsIgnoreCase("--verbose")) {
				verbose = true;
			} else if (arg.startsWith("--password=")) {
				password = arg.substring(11).toCharArray();
			} else if (arg.startsWith("tcp://") || arg.startsWith("ssl://")) {
				broker = arg;
			} else {
				serial = arg;
			}

		}
		if (broker == null) {
			System.out.println("Missing parameter : broker url");
			System.exit(1);
		}
		if (serial == null) {
			System.out.println("Missing parameter : serial port");
			System.exit(1);
		}

		MQTTBridge bridge = new MQTTBridge();
		bridge.setVerbose(verbose);
		bridge.start(serial, broker, null);

	}

	private void setVerbose(boolean verbose) {
		this.verbose = verbose;
	}

	private static void printUsage() {
		System.out.println("MQTTBridge for Z-Wave");
		System.out.println();
		System.out.println("Usage : java -jar zwave-mqqt.jar [OPTIONS] SERIAL_PORT BROKER_URL ");
		System.out.println();
		System.out.println("MQTT broker url can be tcp://HOST:PORT or ssl://HOST:PORT");
		System.out.println();
		System.out.println("Options");
		System.out.println("--verbose            increase verbosity");
		System.out.println("--password=PASSWORD  broker password");
		System.out.println();
		System.out.println("Examples");
		System.out.println("Windows : java -jar zwave-mqqt.jar COM5 tcp://192.168.1.8:1883");
		System.out.println("Linux :   java -jar zwave-mqqt.jar /dev/ttyUSB0 tcp://192.168.1.8:1883");
	}

	public MQTTBridge() {
		executor = Executors.newSingleThreadExecutor();
	}

	public void start(String serialPort, String broker, char[] password) {
		try {

			// Connect to the MQTT broker
			System.out.println("Connecting to MQTT broker " + broker);
			final String clientId = "zwavebridge_" + serialPort.hashCode();
			final IMqttClient publisher = new MqttClient(broker, clientId, new MemoryPersistence());
			final MqttConnectOptions options = new MqttConnectOptions();
			options.setAutomaticReconnect(true);
			options.setCleanSession(true);
			options.setConnectionTimeout(10);
			if (password != null) {
				options.setPassword(password);
			}
			publisher.connect(options);

			try {
				// Initialize Z-Wave controller
				System.out.println("Opening serial port " + serialPort);
				final ZWaveSerialAPI api = new ZWaveSerialAPI(serialPort, null);
				final InitialData initData = api.getInitialData();
				if (verbose) {
					Capabilites capabilites = api.getCapabilities();
					if (capabilites != null) {
						System.out.println("Z-Wave device firmware: Z-Wave " + capabilites.getFirmwareVersion());
					}
				}
				if (verbose) {
					System.out.println("Chip type: " + initData.getChipTypeName().replace('x',
							String.valueOf(initData.getChipVersion()).charAt(0)));

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
				}
				api.sendReady();
				if (verbose) {
					Region region = api.getRegion();
					System.out.println("RF region: " + region.getName());
				}

				System.out.println("Controller has " + initData.getNodeIds().size() + " registered nodes");
				for (final Byte nodeId : initData.getNodeIds()) {

					final NodeProtocolInfo info = api.getNodeProtocolInfo(nodeId);

					if (info.getGenericDeviceClass() == NodeProtocolInfo.GENERIC_TYPE_SWITCH_BINARY) {

						String manufacturer = "unknown manufacturer";
						String model = "unknown model";

						if (info.isListening() && nodeId != 1) {
							ProductInfo pInfo = api.getManufacturerProductInfo(nodeId);
							if (pInfo != null) {
								manufacturer = pInfo.getManufacturerName();
								model = pInfo.getDescription() + " (" + pInfo.getName() + ")";

							} else {
								System.out.println("- description: not available");
							}
						}
						System.out.print("Publishing node " + nodeId + " as switch ");
						System.out.println(info.getSpecificDeviceClassName() + " : " + model);
						final String deviceName = "Switch " + model + " node " + nodeId;
						final String switchName = "Main switch";

						final String id = "zwavebridge_" + nodeId;
						final String path2 = "zwavebridge/node_" + nodeId + "/switch";
						final String stateTopic = path2 + "/state";
						final JSONObject obj = new JSONObject();

						obj.put("name", switchName);
						obj.put("state_topic", stateTopic);
						final String cmdTopic = path2 + "/set";
						obj.put("command_topic", cmdTopic);
						obj.put("payload_on", "ON");
						obj.put("payload_off", "OFF");
						obj.put("state_on", "ON");
						obj.put("state_off", "OFF");
						obj.put("optimistic", false);
						obj.put("qos", 0);
						obj.put("unique_id", "zwavebridge_" + nodeId);
						obj.put("retain", true);
						obj.put("enabled_by_default", true);
						obj.put("device_class", "switch");
						final JSONObject device = new JSONObject();
						final JSONArray identifiers = new JSONArray();
						identifiers.put(id);
						device.put("identifiers", identifiers);
						device.put("model", model);
						device.put("manufacturer", manufacturer);
						device.put("name", deviceName);
						obj.put("device", device);
						final String component = "switch";
						final String topic = "homeassistant/" + component + "/zwavebridge/node_" + id + "/config";
						System.out.println("MQTT topic for home assitant auto discovery : " + topic);
						System.out.println("MQTT state topic : " + stateTopic + " (implemented payload : ON / OFF)");
						System.out.println("MQTT command topic : " + cmdTopic + " (implemented payload : ON / OFF)");
						// Publish config json
						final String jsonMsg = obj.toString();
						final MqttMessage msg = new MqttMessage(jsonMsg.getBytes(StandardCharsets.UTF_8));
						msg.setQos(0);
						msg.setRetained(true);
						publisher.publish(topic, msg);
						// Publish current state of the switch
						int b = api.basicGet(nodeId.byteValue());
						String state = (b == 0) ? "OFF" : "ON";
						// Publish the new state
						final MqttMessage stateMessage = new MqttMessage(state.getBytes());
						stateMessage.setQos(0);
						stateMessage.setRetained(false);
						publisher.publish(stateTopic, stateMessage);
						if (verbose) {
							System.out.println("Switch node " + nodeId.byteValue() + " is " + state);
						}
						publisher.subscribe(cmdTopic, new IMqttMessageListener() {

							@Override
							public void messageArrived(String topic, MqttMessage msg) throws Exception {
								final String command = new String(msg.getPayload());
								final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
								executor.submit(new Runnable() {

									@Override
									public void run() {
										try {

											if (command.equalsIgnoreCase("on")) {
												if (verbose) {
													System.out.println(sdf.format(new Date()) + " switching ON  node "
															+ nodeId.byteValue());
												}
												api.basicSet(nodeId.byteValue(), (byte) 255);
											} else {
												if (verbose) {
													System.out.println(sdf.format(new Date()) + " switching OFF node "
															+ nodeId.byteValue());
												}
												api.basicSet(nodeId.byteValue(), (byte) 0);
											}
											// Publish the new state
											final MqttMessage stateMessage = new MqttMessage(command.getBytes());
											stateMessage.setQos(0);
											stateMessage.setRetained(false);
											publisher.publish(stateTopic, stateMessage);
										} catch (MqttException e) {
											e.printStackTrace();
										}

									}
								});

							}
						});

					} else {
						if (verbose) {
							System.out.println("Skipping node " + nodeId + " (0x" + Utilities.asHex(nodeId) + ") : "
									+ info.getSpecificDeviceClassName() + " ");
						}
					}
				}
			} catch (Exception e) {
				System.err.println("Error : " + e.getMessage());
				System.exit(1);
			}
		} catch (Exception e) {
			System.err.println("MQTT connection error : " + e.getMessage());
			System.exit(1);
		}
	}
}
