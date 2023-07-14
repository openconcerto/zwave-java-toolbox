package zwave;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import org.json.JSONException;
import org.json.JSONObject;

public class NodeProtocolInfo {

	/************ Basic Device Class identifiers **************/
	public static final byte BASIC_TYPE_CONTROLLER = 0x01; /* Node is a portable controller */
	public static final byte BASIC_TYPE_ROUTING_SLAVE = 0x04; /* Node is a slave with routing capabilities */
	public static final byte BASIC_TYPE_SLAVE = 0x03; /* Node is a slave */
	public static final byte BASIC_TYPE_STATIC_CONTROLLER = 0x02; /* Node is a static controller */

	/***** Generic and Specific Device Class identifiers ******/
	/* Device class Av Control Pobyte */
	public static final byte GENERIC_TYPE_AV_CONTROL_POINT = 0x03; /* AV Control Pobyte */
	public static final byte SPECIFIC_TYPE_NOT_USED = 0x00; /* Specific Device Class Not Used */
	public static final byte SPECIFIC_TYPE_DOORBELL = 0x12;
	public static final byte SPECIFIC_TYPE_SATELLITE_RECEIVER = 0x04; /* Satellite Receiver */
	public static final byte SPECIFIC_TYPE_SATELLITE_RECEIVER_V2 = 0x11; /* Satellite Receiver V2 */

	/* Device class Display */
	public static final byte GENERIC_TYPE_DISPLAY = 0x04;
	// public static final byte SPECIFIC_TYPE_NOT_USED = 0x00; /*Specific Device
	// Class Not Used */
	public static final byte SPECIFIC_TYPE_SIMPLE_DISPLAY = 0x01; /* Display (simple) Device Type */

	/* Device class Entry Control */
	public static final byte GENERIC_TYPE_ENTRY_CONTROL = 0x40; /* Entry Control */
	// public static final byte SPECIFIC_TYPE_NOT_USED = 0x00; /*Specific Device
	// Class Not Used */
	public static final byte SPECIFIC_TYPE_DOOR_LOCK = 0x01; /* Door Lock */
	public static final byte SPECIFIC_TYPE_ADVANCED_DOOR_LOCK = 0x02; /* Advanced Door Lock */
	public static final byte SPECIFIC_TYPE_SECURE_KEYPAD_DOOR_LOCK = 0x03; /* Door Lock (keypad & lever) Device Type */
	public static final byte SPECIFIC_TYPE_SECURE_KEYPAD_DOOR_LOCK_DEADBOLT = 0x04; /*
																					 * Door Lock (keypad & deadbolt)
																					 * Device Type
																					 */
	public static final byte SPECIFIC_TYPE_SECURE_DOOR = 0x05; /* Barrier Operator Specific Device Class */
	public static final byte SPECIFIC_TYPE_SECURE_GATE = 0x06; /* Barrier Operator Specific Device Class */
	public static final byte SPECIFIC_TYPE_SECURE_BARRIER_ADDON = 0x07; /* Barrier Operator Specific Device Class */
	public static final byte SPECIFIC_TYPE_SECURE_BARRIER_OPEN_ONLY = 0x08; /* Barrier Operator Specific Device Class */
	public static final byte SPECIFIC_TYPE_SECURE_BARRIER_CLOSE_ONLY = 0x09; /*
																				 * Barrier Operator Specific Device
																				 * Class
																				 */
	public static final byte SPECIFIC_TYPE_SECURE_LOCKBOX = 0x0A; /* SDS12724 */

	/* Device class Generic Controller */
	public static final byte GENERIC_TYPE_GENERIC_CONTROLLER = 0x01; /* Remote Controller */
	// public static final byte SPECIFIC_TYPE_NOT_USED = 0x00; /*Specific Device
	// Class Not Used */
	public static final byte SPECIFIC_TYPE_PORTABLE_REMOTE_CONTROLLER = 0x01; /*
																				 * Remote Control (Multi Purpose) Device
																				 * Type
																				 */
	public static final byte SPECIFIC_TYPE_PORTABLE_SCENE_CONTROLLER = 0x02; /* Portable Scene Controller */
	public static final byte SPECIFIC_TYPE_PORTABLE_INSTALLER_TOOL = 0x03;
	public static final byte SPECIFIC_TYPE_REMOTE_CONTROL_AV = 0x04; /* Remote Control (AV) Device Type */
	public static final byte SPECIFIC_TYPE_REMOTE_CONTROL_SIMPLE = 0x06; /* Remote Control (Simple) Device Type */

	/* Device class Meter */
	public static final byte GENERIC_TYPE_METER = 0x31; /* Meter */
	// public static final byte SPECIFIC_TYPE_NOT_USED = 0x00; /*Specific Device
	// Class Not Used */
	public static final byte SPECIFIC_TYPE_SIMPLE_METER = 0x01; /* Sub Energy Meter Device Type */
	public static final byte SPECIFIC_TYPE_ADV_ENERGY_CONTROL = 0x02; /*
																		 * Whole Home Energy Meter (Advanced) Device
																		 * Type
																		 */
	public static final byte SPECIFIC_TYPE_WHOLE_HOME_METER_SIMPLE = 0x03; /* Whole Home Meter (Simple) Device Type */

	/* Device class Meter Pulse */
	public static final byte GENERIC_TYPE_METER_PULSE = 0x30; /* Pulse Meter */
	// public static final byte SPECIFIC_TYPE_NOT_USED = 0x00; /*Specific Device
	// Class Not Used */

	/* Device class Non Interoperable */
	public static final byte GENERIC_TYPE_NON_INTEROPERABLE = (byte) 0xFF; /* Non byteeroperable */
	// public static final byte SPECIFIC_TYPE_NOT_USED = 0x00; /*Specific Device
	// Class Not Used */

	/* Device class Repeater Slave */
	public static final byte GENERIC_TYPE_REPEATER_SLAVE = 0x0F; /* Repeater Slave */
	// public static final byte SPECIFIC_TYPE_NOT_USED = 0x00; /*Specific Device
	// Class Not Used */
	public static final byte SPECIFIC_TYPE_REPEATER_SLAVE = 0x01; /* Basic Repeater Slave */
	public static final byte SPECIFIC_TYPE_VIRTUAL_NODE = 0x02; /* Virtual node */

	/* Device class Security Panel */
	public static final byte GENERIC_TYPE_SECURITY_PANEL = 0x17;
	// public static final byte SPECIFIC_TYPE_NOT_USED = 0x00; /*Specific Device
	// Class Not Used */
	public static final byte SPECIFIC_TYPE_ZONED_SECURITY_PANEL = 0x01;

	/* Device class Semi Interoperable */
	public static final byte GENERIC_TYPE_SEMI_INTEROPERABLE = 0x50; /* Semi Interoperable */
	// public static final byte SPECIFIC_TYPE_NOT_USED = 0x00; /*Specific Device
	// Class Not Used */
	public static final byte SPECIFIC_TYPE_ENERGY_PRODUCTION = 0x01; /* Energy Production */

	/* Device class Sensor Alarm */
	public static final byte GENERIC_TYPE_SENSOR_ALARM = (byte) 0xA1;
	// public static final byte SPECIFIC_TYPE_NOT_USED = 0x00; /*Specific Device
	// Class Not Used */
	public static final byte SPECIFIC_TYPE_ADV_ZENSOR_NET_ALARM_SENSOR = 0x05;
	public static final byte SPECIFIC_TYPE_ADV_ZENSOR_NET_SMOKE_SENSOR = 0x0A;
	public static final byte SPECIFIC_TYPE_BASIC_ROUTING_ALARM_SENSOR = 0x01;
	public static final byte SPECIFIC_TYPE_BASIC_ROUTING_SMOKE_SENSOR = 0x06;
	public static final byte SPECIFIC_TYPE_BASIC_ZENSOR_NET_ALARM_SENSOR = 0x03;
	public static final byte SPECIFIC_TYPE_BASIC_ZENSOR_NET_SMOKE_SENSOR = 0x08;
	public static final byte SPECIFIC_TYPE_ROUTING_ALARM_SENSOR = 0x02;
	public static final byte SPECIFIC_TYPE_ROUTING_SMOKE_SENSOR = 0x07;
	public static final byte SPECIFIC_TYPE_ZENSOR_NET_ALARM_SENSOR = 0x04;
	public static final byte SPECIFIC_TYPE_ZENSOR_NET_SMOKE_SENSOR = 0x09;
	public static final byte SPECIFIC_TYPE_ALARM_SENSOR = 0x0B; /* Sensor (Alarm) Device Type */

	/* Device class Sensor Binary */
	public static final byte GENERIC_TYPE_SENSOR_BINARY = 0x20; /* Binary Sensor */
	// public static final byte SPECIFIC_TYPE_NOT_USED = 0x00; /*Specific Device
	// Class Not Used */
	public static final byte SPECIFIC_TYPE_ROUTING_SENSOR_BINARY = 0x01; /* Routing Binary Sensor */

	/* Device class Sensor Multilevel */
	public static final byte GENERIC_TYPE_SENSOR_MULTILEVEL = 0x21; /* Multilevel Sensor */
	// public static final byte SPECIFIC_TYPE_NOT_USED = 0x00; /*Specific Device
	// Class Not Used */
	public static final byte SPECIFIC_TYPE_ROUTING_SENSOR_MULTILEVEL = 0x01; /* Sensor (Multilevel) Device Type */
	public static final byte SPECIFIC_TYPE_CHIMNEY_FAN = 0x02;

	/* Device class Static Controller */
	public static final byte GENERIC_TYPE_STATIC_CONTROLLER = 0x02; /* Static Controller */
	// public static final byte SPECIFIC_TYPE_NOT_USED = 0x00; /*Specific Device
	// Class Not Used */
	public static final byte SPECIFIC_TYPE_PC_CONTROLLER = 0x01; /* Central Controller Device Type */
	public static final byte SPECIFIC_TYPE_SCENE_CONTROLLER = 0x02; /* Scene Controller */
	public static final byte SPECIFIC_TYPE_STATIC_INSTALLER_TOOL = 0x03;
	public static final byte SPECIFIC_TYPE_SET_TOP_BOX = 0x04; /* Set Top Box Device Type */
	public static final byte SPECIFIC_TYPE_SUB_SYSTEM_CONTROLLER = 0x05; /* Sub System Controller Device Type */
	public static final byte SPECIFIC_TYPE_TV = 0x06; /* TV Device Type */
	public static final byte SPECIFIC_TYPE_GATEWAY = 0x07; /* Gateway Device Type */

	/* Device class Switch Binary */
	public static final byte GENERIC_TYPE_SWITCH_BINARY = 0x10; /* Binary Switch */
	// public static final byte SPECIFIC_TYPE_NOT_USED = 0x00; /*Specific Device
	// Class Not Used */
	public static final byte SPECIFIC_TYPE_POWER_SWITCH_BINARY = 0x01; /* On/Off Power Switch Device Type */
	public static final byte SPECIFIC_TYPE_SCENE_SWITCH_BINARY = 0x03; /* Binary Scene Switch */
	public static final byte SPECIFIC_TYPE_POWER_STRIP = 0x04; /* Power Strip Device Type */
	public static final byte SPECIFIC_TYPE_SIREN = 0x05; /* Siren Device Type */
	public static final byte SPECIFIC_TYPE_VALVE_OPEN_CLOSE = 0x06; /* Valve (open/close) Device Type */
	public static final byte SPECIFIC_TYPE_COLOR_TUNABLE_BINARY = 0x02;

	/* Device class Switch Multilevel */
	public static final byte GENERIC_TYPE_SWITCH_MULTILEVEL = 0x11; /* Multilevel Switch */
	// public static final byte SPECIFIC_TYPE_NOT_USED = 0x00; /*Specific Device
	// Class Not Used */
	public static final byte SPECIFIC_TYPE_CLASS_A_MOTOR_CONTROL = 0x05; /*
																			 * Window Covering No Position/Endpobyte
																			 * Device Type
																			 */
	public static final byte SPECIFIC_TYPE_CLASS_B_MOTOR_CONTROL = 0x06; /*
																			 * Window Covering Endpobyte Aware Device
																			 * Type
																			 */
	public static final byte SPECIFIC_TYPE_CLASS_C_MOTOR_CONTROL = 0x07; /*
																			 * Window Covering Position/Endpobyte Aware
																			 * Device Type
																			 */
	public static final byte SPECIFIC_TYPE_MOTOR_MULTIPOSITION = 0x03; /* Multiposition Motor */
	public static final byte SPECIFIC_TYPE_POWER_SWITCH_MULTILEVEL = 0x01; /* Light Dimmer Switch Device Type */
	public static final byte SPECIFIC_TYPE_SCENE_SWITCH_MULTILEVEL = 0x04; /* Multilevel Scene Switch */
	public static final byte SPECIFIC_TYPE_FAN_SWITCH = 0x08; /* Fan Switch Device Type */
	public static final byte SPECIFIC_TYPE_COLOR_TUNABLE_MULTILEVEL = 0x02;

	/* Device class Switch Remote */
	public static final byte GENERIC_TYPE_SWITCH_REMOTE = 0x12; /* Remote Switch */
	// public static final byte SPECIFIC_TYPE_NOT_USED = 0x00; /*Specific Device
	// Class Not Used */
	public static final byte SPECIFIC_TYPE_SWITCH_REMOTE_BINARY = 0x01; /* Binary Remote Switch */
	public static final byte SPECIFIC_TYPE_SWITCH_REMOTE_MULTILEVEL = 0x02; /* Multilevel Remote Switch */
	public static final byte SPECIFIC_TYPE_SWITCH_REMOTE_TOGGLE_BINARY = 0x03; /* Binary Toggle Remote Switch */
	public static final byte SPECIFIC_TYPE_SWITCH_REMOTE_TOGGLE_MULTILEVEL = 0x04; /* Multilevel Toggle Remote Switch */

	/* Device class Switch Toggle */
	public static final byte GENERIC_TYPE_SWITCH_TOGGLE = 0x13; /* Toggle Switch */
	// public static final byte SPECIFIC_TYPE_NOT_USED = 0x00; /*Specific Device
	// Class Not Used */
	public static final byte SPECIFIC_TYPE_SWITCH_TOGGLE_BINARY = 0x01; /* Binary Toggle Switch */
	public static final byte SPECIFIC_TYPE_SWITCH_TOGGLE_MULTILEVEL = 0x02; /* Multilevel Toggle Switch */

	/* Device class Thermostat */
	public static final byte GENERIC_TYPE_THERMOSTAT = 0x08; /* Thermostat */
	// public static final byte SPECIFIC_TYPE_NOT_USED = 0x00; /*Specific Device
	// Class Not Used */
	public static final byte SPECIFIC_TYPE_SETBACK_SCHEDULE_THERMOSTAT = 0x03; /* Setback Schedule Thermostat */
	public static final byte SPECIFIC_TYPE_SETBACK_THERMOSTAT = 0x05; /* Thermostat (Setback) Device Type */
	public static final byte SPECIFIC_TYPE_SETPOINT_THERMOSTAT = 0x04;
	public static final byte SPECIFIC_TYPE_THERMOSTAT_GENERAL = 0x02; /* Thermostat General */
	public static final byte SPECIFIC_TYPE_THERMOSTAT_GENERAL_V2 = 0x06; /* Thermostat (HVAC) Device Type */
	public static final byte SPECIFIC_TYPE_THERMOSTAT_HEATING = 0x01; /* Thermostat Heating */

	/* Device class Ventilation */
	public static final byte GENERIC_TYPE_VENTILATION = 0x16;
	// public static final byte SPECIFIC_TYPE_NOT_USED = 0x00; /*Specific Device
	// Class Not Used */
	public static final byte SPECIFIC_TYPE_RESIDENTIAL_HRV = 0x01;

	/* Device class Window Covering */
	public static final byte GENERIC_TYPE_WINDOW_COVERING = 0x09; /* Window Covering */
	// public static final byte SPECIFIC_TYPE_NOT_USED = 0x00; /*Specific Device
	// Class Not Used */
	public static final byte SPECIFIC_TYPE_SIMPLE_WINDOW_COVERING = 0x01; /* Simple Window Covering Control */

	/* Device class Zip Node */
	public static final byte GENERIC_TYPE_ZIP_NODE = 0x15;
	// public static final byte SPECIFIC_TYPE_NOT_USED = 0x00; /*Specific Device
	// Class Not Used */
	public static final byte SPECIFIC_TYPE_ZIP_ADV_NODE = 0x02;
	public static final byte SPECIFIC_TYPE_ZIP_TUN_NODE = 0x01;

	/* Device class Wall Controller */
	public static final byte GENERIC_TYPE_WALL_CONTROLLER = 0x18;
	// public static final byte SPECIFIC_TYPE_NOT_USED = 0x00; /*Specific Device
	// Class Not Used */
	public static final byte SPECIFIC_TYPE_BASIC_WALL_CONTROLLER = 0x01; /* Wall Controller Device Type */

	/* Device class Network Extender */
	public static final byte GENERIC_TYPE_NETWORK_EXTENDER = 0x05; /* Network Extender Generic Device Class */
	// public static final byte SPECIFIC_TYPE_NOT_USED = 0x00; /*Specific Device
	// Class Not Used */
	public static final byte SPECIFIC_TYPE_SECURE_EXTENDER = 0x01; /* Specific Device Secure Extender */

	/* Device class Appliance */
	public static final byte GENERIC_TYPE_APPLIANCE = 0x06;
	// public static final byte SPECIFIC_TYPE_NOT_USED = 0x00; /*Specific Device
	// Class Not Used */
	public static final byte SPECIFIC_TYPE_GENERAL_APPLIANCE = 0x01;
	public static final byte SPECIFIC_TYPE_KITCHEN_APPLIANCE = 0x02;
	public static final byte SPECIFIC_TYPE_LAUNDRY_APPLIANCE = 0x03;

	/* Device class Sensor Notification */
	public static final byte GENERIC_TYPE_SENSOR_NOTIFICATION = 0x07;
	// public static final byte SPECIFIC_TYPE_NOT_USED = 0x00; /*Specific Device
	// Class Not Used */
	public static final byte SPECIFIC_TYPE_NOTIFICATION_SENSOR = 0x01;

	private final byte properties1;
	private final byte properties2;
	private final byte properties3;
	private final byte deviceClass;
	private final byte genericDeviceClass;
	private final byte specificDeviceClass;
	private String genericDeviceClassName;
	private String specificDeviceClassName;

	public NodeProtocolInfo(byte[] data) {
		// TODO decode properties
		// Protocol version, Max baud rate, Routing, Listening
		this.properties1 = data[0];
		// Security, Controller, Specific Device, Routing End Node, Beam capablity,
		// Sensor 250ms, Sensoir 1000ms, Optional Functionality
		this.properties2 = data[1];
		// Speed Extension, Reserved 2
		this.properties3 = data[2];
		this.deviceClass = data[3];
		this.genericDeviceClass = data[4];
		this.specificDeviceClass = data[5];
		// Resolve names
		try (InputStream in = getClass().getResourceAsStream("config/deviceClasses.json")) {
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] tempData = new byte[1024];
			while ((nRead = in.read(tempData, 0, tempData.length)) != -1) {
				buffer.write(tempData, 0, nRead);
			}

			buffer.flush();
			byte[] byteArray = buffer.toByteArray();

			String text = new String(byteArray, StandardCharsets.UTF_8);
			JSONObject obj = new JSONObject(text);
			JSONObject generic = obj.optJSONObject("generic");
			final String keyGeneric = "0x" + Utilities.asHex(this.genericDeviceClass);
			JSONObject genericNode = generic.optJSONObject(keyGeneric);
			if (genericNode == null) {
				genericDeviceClassName = "unknown generic class " + keyGeneric;
			} else {
				genericDeviceClassName = genericNode.optString("label");

				JSONObject specific = genericNode.optJSONObject("specific");
				final String keySpecific = "0x" + Utilities.asHex(this.specificDeviceClass);
				JSONObject specificNode = specific.optJSONObject(keySpecific);
				if (specificNode == null) {
					specificDeviceClassName = "unknown specific class " + keySpecific + " for generic class"
							+ keyGeneric;
				} else {
					specificDeviceClassName = specificNode.optString("label");
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (JSONException e) {
			e.printStackTrace();
		}
	}

	public boolean isListening() {
		return (properties1 & 0x80) != 0;
	}

	public boolean isRouting() {
		return (properties1 & 0x40) != 0;
	}

	public int getProtocolVersion() {
		return (properties1 & 0x07) + 1;
	}

	public byte getDeviceClass() {
		return deviceClass;
	}

	public byte getGenericDeviceClass() {
		return genericDeviceClass;
	}

	public byte getSpecificDeviceClass() {
		return specificDeviceClass;
	}

	public String getDeviceClassName() {
		if (this.deviceClass == BASIC_TYPE_CONTROLLER) {
			return "Controller";
		} else if (this.deviceClass == BASIC_TYPE_ROUTING_SLAVE) {
			return "Slave with routing capabilities";
		} else if (this.deviceClass == BASIC_TYPE_SLAVE) {
			return "Slave";
		} else if (this.deviceClass == BASIC_TYPE_STATIC_CONTROLLER) {
			return "Static controller";
		}
		return "unknwown";
	}

	public String getGenericDeviceClassName() {
		return genericDeviceClassName;
	}

	public String getSpecificDeviceClassName() {
		return specificDeviceClassName;
	}
}
