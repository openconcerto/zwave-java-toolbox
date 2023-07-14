package zwave;

public class ZWaveAPIConstants {

	public static final byte SOF = (byte) 0x01; /* Start Of Frame */
	public static final byte ACK = (byte) 0x06; /* Acknowledge successfull frame reception */
	public static final byte NAK = (byte) 0x15; /* Not Acknowledge successfull frame reception - please retransmit... */
	public static final byte CAN = (byte) 0x18; /* Frame received (from host) was dropped - waiting for ACK */

	/* Frame types */
	public static final byte REQUEST = (byte) 0x00;
	public static final byte RESPONSE = (byte) 0x01;

	public static final byte GET_INIT_DATA_FLAG_SLAVE_API = (byte) 0x01;
	public static final byte GET_INIT_DATA_FLAG_TIMER_SUPPORT = (byte) 0x02;
	public static final byte GET_INIT_DATA_FLAG_CONTROLLER_STATUS = (byte) 0x04; /* Obsolete. USE next */
	public static final byte GET_INIT_DATA_FLAG_SECONDARY_CTRL = (byte) 0x04;
	public static final byte GET_INIT_DATA_FLAG_IS_SUC = (byte) 0x08;

	/* Firmware update functionality specifics */
	/*
	 * Enum definitions for Firmware Update functionality selector;
	 * firmwareUpdateFunction
	 */
	public class FIRMWARE_UPDATE_NVM_T {
		public static final byte FIRMWARE_UPDATE_NVM_INIT = (byte) 0;
		public static final byte FIRMWARE_UPDATE_NVM_SET_NEW_IMAGE = (byte) 1;
		public static final byte FIRMWARE_UPDATE_NVM_GET_NEW_IMAGE = (byte) 2;
		public static final byte FIRMWARE_UPDATE_NVM_UPDATE_CRC16 = (byte) 3;
		public static final byte FIRMWARE_UPDATE_NVM_IS_VALID_CRC16 = (byte) 4;
		public static final byte FIRMWARE_UPDATE_NVM_WRITE = (byte) 5;
		public static final byte FIRMWARE_UPDATE_NVM_UNKNOWN = (byte) 0xFF;
	}

	/* Function IDs */
	public static final byte FUNC_ID_SERIAL_API_HELO = (byte) 0x01;
	public static final byte FUNC_ID_SERIAL_API_GET_INIT_DATA = (byte) 0x02;
	public static final byte FUNC_ID_SERIAL_API_APPL_NODE_INFORMATION = (byte) 0x03;
	public static final byte FUNC_ID_APPLICATION_COMMAND_HANDLER = (byte) 0x04;
	public static final byte FUNC_ID_ZW_GET_CONTROLLER_CAPABILITIES = (byte) 0x05;

	/* SERIAL API ver 4 added - START */
	public static final byte FUNC_ID_SERIAL_API_SET_TIMEOUTS = (byte) 0x06;
	public static final byte FUNC_ID_SERIAL_API_GET_CAPABILITIES = (byte) 0x07;
	public static final byte FUNC_ID_SERIAL_API_SOFT_RESET = (byte) 0x08;
	/* SERIAL API ver 4 added - END */

	public static final byte FUNC_ID_ZW_GET_PROTOCOL_VERSION = (byte) 0x09;

	/* Function ID for startup message */
	public static final byte FUNC_ID_SERIAL_API_STARTED = (byte) 0x0A;
	public static final byte FUNC_ID_SERIAL_API_SETUP = (byte) 0x0B;
	public static final byte FUNC_ID_SERIAL_API_APPL_NODE_INFORMATION_CMD_CLASSES = (byte) 0x0C;

	public static final byte FUNC_ID_ZW_SET_RF_RECEIVE_MODE = (byte) 0x10;
	public static final byte FUNC_ID_ZW_SET_SLEEP_MODE = (byte) 0x11;
	public static final byte FUNC_ID_ZW_SEND_NODE_INFORMATION = (byte) 0x12;
	public static final byte FUNC_ID_ZW_SEND_DATA = (byte) 0x13;
	public static final byte FUNC_ID_ZW_SEND_DATA_MULTI = (byte) 0x14;
	public static final byte FUNC_ID_ZW_GET_VERSION = (byte) 0x15;

	/* SERIAL API ver 4 added - START */
	public static final byte FUNC_ID_ZW_SEND_DATA_ABORT = (byte) 0x16;
	public static final byte FUNC_ID_ZW_RF_POWER_LEVEL_SET = (byte) 0x17;
	public static final byte FUNC_ID_ZW_SEND_DATA_META = (byte) 0x18;
	/* SERIAL API ver 4 added - END */

	public static final byte FUNC_ID_ZW_RESERVED_SD = (byte) 0x19;
	public static final byte FUNC_ID_ZW_RESERVED_SDM = (byte) 0x1A;
	public static final byte FUNC_ID_ZW_RESERVED_SRI = (byte) 0x1B;

	public static final byte FUNC_ID_ZW_SET_ROUTING_INFO = (byte) 0x1B;

	public static final byte FUNC_ID_ZW_GET_RANDOM = (byte) 0x1C;
	public static final byte FUNC_ID_ZW_RANDOM = (byte) 0x1D;
	public static final byte FUNC_ID_ZW_RF_POWER_LEVEL_REDISCOVERY_SET = (byte) 0x1E;

	public static final byte FUNC_ID_MEMORY_GET_ID = (byte) 0x20;
	public static final byte FUNC_ID_MEMORY_GET_BYTE = (byte) 0x21;
	public static final byte FUNC_ID_MEMORY_PUT_BYTE = (byte) 0x22;
	public static final byte FUNC_ID_MEMORY_GET_BUFFER = (byte) 0x23;
	public static final byte FUNC_ID_MEMORY_PUT_BUFFER = (byte) 0x24;
	/* Unimplemented - START */
	public static final byte FUNC_ID_SERIAL_API_GET_APPL_HOST_MEMORY_OFFSET = (byte) 0x25;
	public static final byte FUNC_ID_DEBUG_OUTPUT = (byte) 0x26;
	/* Unimplemented - END */

	public static final byte FUNC_ID_AUTO_PROGRAMMING = (byte) 0x27;

	public static final byte FUNC_ID_NVR_GET_VALUE = (byte) 0x28;

	public static final byte FUNC_ID_NVM_GET_ID = (byte) 0x29;
	public static final byte FUNC_ID_NVM_EXT_READ_LONG_BUFFER = (byte) 0x2A;
	public static final byte FUNC_ID_NVM_EXT_WRITE_LONG_BUFFER = (byte) 0x2B;
	public static final byte FUNC_ID_NVM_EXT_READ_LONG_BYTE = (byte) 0x2C;
	public static final byte FUNC_ID_NVM_EXT_WRITE_LONG_BYTE = (byte) 0x2D;
	public static final byte FUNC_ID_NVM_BACKUP_RESTORE = (byte) 0x2E;

	public static final byte FUNC_ID_CLOCK_SET = (byte) 0x30;
	public static final byte FUNC_ID_CLOCK_GET = (byte) 0x31;
	public static final byte FUNC_ID_CLOCK_CMP = (byte) 0x32;
	public static final byte FUNC_ID_RTC_TIMER_CREATE = (byte) 0x33;
	public static final byte FUNC_ID_RTC_TIMER_READ = (byte) 0x34;
	public static final byte FUNC_ID_RTC_TIMER_DELETE = (byte) 0x35;
	public static final byte FUNC_ID_RTC_TIMER_CALL = (byte) 0x36;

	public static final byte FUNC_ID_CLEAR_TX_TIMERS = (byte) 0x37;
	public static final byte FUNC_ID_GET_TX_TIMERS = (byte) 0x38;

	public static final byte FUNC_ID_ZW_REMOVE_NODE_ID_FROM_NETWORK = (byte) 0x3F;

	public static final byte FUNC_ID_ZW_SET_LEARN_NODE_STATE = (byte) 0x40;
	public static final byte FUNC_ID_ZW_GET_NODE_PROTOCOL_INFO = (byte) 0x41;
	public static final byte FUNC_ID_ZW_SET_DEFAULT = (byte) 0x42;
	public static final byte FUNC_ID_ZW_NEW_CONTROLLER = (byte) 0x43;
	public static final byte FUNC_ID_ZW_REPLICATION_COMMAND_COMPLETE = (byte) 0x44;
	public static final byte FUNC_ID_ZW_REPLICATION_SEND_DATA = (byte) 0x45;
	public static final byte FUNC_ID_ZW_ASSIGN_RETURN_ROUTE = (byte) 0x46;
	public static final byte FUNC_ID_ZW_DELETE_RETURN_ROUTE = (byte) 0x47;
	public static final byte FUNC_ID_ZW_REQUEST_NODE_NEIGHBOR_UPDATE = (byte) 0x48;
	public static final byte FUNC_ID_ZW_APPLICATION_UPDATE = (byte) 0x49;

	/* Obsolete use ZW_APPLICATION_UPDATE */
	public static final byte FUNC_ID_ZW_APPLICATION_CONTROLLER_UPDATE = (byte) 0x49;

	public static final byte FUNC_ID_ZW_ADD_NODE_TO_NETWORK = (byte) 0x4A;
	public static final byte FUNC_ID_ZW_REMOVE_NODE_FROM_NETWORK = (byte) 0x4B;
	public static final byte FUNC_ID_ZW_CREATE_NEW_PRIMARY = (byte) 0x4C;
	public static final byte FUNC_ID_ZW_CONTROLLER_CHANGE = (byte) 0x4D;

	public static final byte FUNC_ID_ZW_RESERVED_FN = (byte) 0x4E;
	public static final byte FUNC_ID_ZW_RESERVED_AR = (byte) 0x4F;

	/* Slave only */
	public static final byte FUNC_ID_ZW_SET_LEARN_MODE = (byte) 0x50;
	/* Slave only end */

	public static final byte FUNC_ID_ZW_ASSIGN_SUC_RETURN_ROUTE = (byte) 0x51;
	public static final byte FUNC_ID_ZW_ENABLE_SUC = (byte) 0x52;
	public static final byte FUNC_ID_ZW_REQUEST_NETWORK_UPDATE = (byte) 0x53;
	public static final byte FUNC_ID_ZW_SET_SUC_NODE_ID = (byte) 0x54;
	public static final byte FUNC_ID_ZW_DELETE_SUC_RETURN_ROUTE = (byte) 0x55;
	public static final byte FUNC_ID_ZW_GET_SUC_NODE_ID = (byte) 0x56;
	public static final byte FUNC_ID_ZW_SEND_SUC_ID = (byte) 0x57;

	public static final byte FUNC_ID_ZW_RESERVED_ASR = (byte) 0x58;
	public static final byte FUNC_ID_ZW_RESERVED_RN = (byte) 0x59;

	public static final byte FUNC_ID_ZW_REQUEST_NODE_NEIGHBOR_UPDATE_OPTION = (byte) 0x5A;

	/* Slave only */
	public static final byte FUNC_ID_ZW_SUPPORT9600_ONLY = (byte) 0x5B;
	/* Slave only end */

	/* Enhanced/Routing Slave only */
	public static final byte FUNC_ID_ZW_REQUEST_NEW_ROUTE_DESTINATIONS = (byte) 0x5C;
	public static final byte FUNC_ID_ZW_IS_NODE_WITHIN_DIRECT_RANGE = (byte) 0x5D;
	/* Enhanced/Routing Slave only end */

	public static final byte FUNC_ID_ZW_EXPLORE_REQUEST_INCLUSION = (byte) 0x5E;
	public static final byte FUNC_ID_ZW_EXPLORE_REQUEST_EXCLUSION = (byte) 0x5F;

	public static final byte FUNC_ID_ZW_REQUEST_NODE_INFO = (byte) 0x60;
	public static final byte FUNC_ID_ZW_REMOVE_FAILED_NODE_ID = (byte) 0x61;
	public static final byte FUNC_ID_ZW_IS_FAILED_NODE_ID = (byte) 0x62;
	public static final byte FUNC_ID_ZW_REPLACE_FAILED_NODE = (byte) 0x63;

	/*
	 * In 6.0x the function id was wrong so we need to support this wrong function
	 * id as well in the future
	 */
	public static final byte FUNC_ID_ZW_SET_ROUTING_MAX_6_00 = (byte) 0x65;

	public static final byte FUNC_ID_ZW_IS_PRIMARY_CTRL = (byte) 0x66;

	public static final byte FUNC_ID_ZW_AES_ECB = (byte) 0x67;

	public static final byte FUNC_ID_TIMER_START = (byte) 0x70;
	public static final byte FUNC_ID_TIMER_RESTART = (byte) 0x71;
	public static final byte FUNC_ID_TIMER_CANCEL = (byte) 0x72;
	public static final byte FUNC_ID_TIMER_CALL = (byte) 0x73;

	/* Firmware Update API */
	public static final byte FUNC_ID_ZW_FIRMWARE_UPDATE_NVM = (byte) 0x78;

	/* Installer API */
	public static final byte FUNC_ID_GET_ROUTING_TABLE_LINE = (byte) 0x80;
	public static final byte FUNC_ID_GET_TX_COUNTER = (byte) 0x81;
	public static final byte FUNC_ID_RESET_TX_COUNTER = (byte) 0x82;
	public static final byte FUNC_ID_STORE_NODEINFO = (byte) 0x83;
	public static final byte FUNC_ID_STORE_HOMEID = (byte) 0x84;
	/* Installer API only end */

	public static final byte FUNC_ID_LOCK_ROUTE_RESPONSE = (byte) 0x90;
	public static final byte FUNC_ID_ZW_SEND_DATA_ROUTE_DEMO = (byte) 0x91;

	public static final byte FUNC_ID_ZW_GET_LAST_WORKING_ROUTE = (byte) 0x92;
	public static final byte FUNC_ID_ZW_SET_LAST_WORKING_ROUTE = (byte) 0x93;

	public static final byte FUNC_ID_SERIAL_API_TEST = (byte) 0x95;

	public static final byte FUNC_ID_SERIAL_API_EXT = (byte) 0x98;

	/* ZW_CONTROLLER_BRIDGE only START */
	public static final byte FUNC_ID_SERIAL_API_APPL_SLAVE_NODE_INFORMATION = (byte) 0xA0;
	/*
	 * OBSOLETE: In DevKit 4.5x/6.0x Controller Bridge applications, this is
	 * obsoleted
	 */
	/* by the FUNC_ID_APPLICATION_COMMAND_HANDLER_BRIDGE */
	public static final byte FUNC_ID_APPLICATION_SLAVE_COMMAND_HANDLER = (byte) 0xA1;
	public static final byte FUNC_ID_ZW_SEND_SLAVE_NODE_INFORMATION = (byte) 0xA2;
	public static final byte FUNC_ID_ZW_SEND_SLAVE_DATA = (byte) 0xA3;
	public static final byte FUNC_ID_ZW_SET_SLAVE_LEARN_MODE = (byte) 0xA4;
	public static final byte FUNC_ID_ZW_GET_VIRTUAL_NODES = (byte) 0xA5;
	public static final byte FUNC_ID_ZW_IS_VIRTUAL_NODE = (byte) 0xA6;
	public static final byte FUNC_ID_ZW_RESERVED_SSD = (byte) 0xA7;
	/*
	 * DevKit 4.5x/6.0x added - obsoletes FUNC_ID_APPLICATION_SLAVE_COMMAND_HANDLER
	 * and
	 */
	/*
	 * FUNC_ID_APPLICATION_COMMAND_HANDLER for the Controller Bridge applications as
	 */
	/*
	 * this handles both cases - only for 4.5x/6.0x based Controller Bridge
	 * applications
	 */
	public static final byte FUNC_ID_APPLICATION_COMMAND_HANDLER_BRIDGE = (byte) 0xA8;
	/* DevKit 4.5x/6.0x added - Adds sourceNodeID to the parameter list */
	public static final byte FUNC_ID_ZW_SEND_DATA_BRIDGE = (byte) 0xA9;
	public static final byte FUNC_ID_ZW_SEND_DATA_META_BRIDGE = (byte) 0xAA;
	public static final byte FUNC_ID_ZW_SEND_DATA_MULTI_BRIDGE = (byte) 0xAB;
	/* ZW_CONTROLLER_BRIDGE only END */

	public static final byte FUNC_ID_PWR_SETSTOPMODE = (byte) 0xB0; // ZW102 only
	public static final byte FUNC_ID_PWR_CLK_PD = (byte) 0xB1; // ZW102 only
	public static final byte FUNC_ID_PWR_CLK_PUP = (byte) 0xB2; // ZW102 only
	public static final byte FUNC_ID_PWR_SELECT_CLK = (byte) 0xB3; // ZW102 only
	public static final byte FUNC_ID_ZW_SET_WUT_TIMEOUT = (byte) 0xB4; // ZW201 only
	public static final byte FUNC_ID_ZW_IS_WUT_KICKED = (byte) 0xB5; // ZW201 only

	public static final byte FUNC_ID_ZW_WATCHDOG_ENABLE = (byte) 0xB6;
	public static final byte FUNC_ID_ZW_WATCHDOG_DISABLE = (byte) 0xB7;
	public static final byte FUNC_ID_ZW_WATCHDOG_KICK = (byte) 0xB8;
	/* Obsolete use FUNC_ID_ZW_INT_EXT_LEVEL_SET */
	public static final byte FUNC_ID_ZW_SET_EXT_INT_LEVEL = (byte) 0xB9; // ZW201 only
	public static final byte FUNC_ID_ZW_INT_EXT_LEVEL_SET = (byte) 0xB9;

	public static final byte FUNC_ID_ZW_RF_POWER_LEVEL_GET = (byte) 0xBA;
	public static final byte FUNC_ID_ZW_GET_NEIGHBOR_COUNT = (byte) 0xBB;
	public static final byte FUNC_ID_ZW_ARE_NODES_NEIGHBOURS = (byte) 0xBC;

	public static final byte FUNC_ID_ZW_TYPE_LIBRARY = (byte) 0xBD;
	public static final byte FUNC_ID_ZW_SEND_TEST_FRAME = (byte) 0xBE;
	public static final byte FUNC_ID_ZW_GET_PROTOCOL_STATUS = (byte) 0xBF;

	public static final byte FUNC_ID_ZW_SET_PROMISCUOUS_MODE = (byte) 0xD0;
	/* SERIAL API ver 5 added - START */
	public static final byte FUNC_ID_PROMISCUOUS_APPLICATION_COMMAND_HANDLER = (byte) 0xD1;
	/* SERIAL API ver 5 added - END */

	public static final byte FUNC_ID_ZW_WATCHDOG_START = (byte) 0xD2;
	public static final byte FUNC_ID_ZW_WATCHDOG_STOP = (byte) 0xD3;

	public static final byte FUNC_ID_ZW_SET_ROUTING_MAX = (byte) 0xD4;
	/* Unimplemented - START */
	/* Obsoleted */
	public static final byte FUNC_ID_ZW_GET_ROUTING_MAX = (byte) 0xD5;
	/* Unimplemented - END */

	public static final byte FUNC_ID_ZW_GET_DCDC_CONFIG = (byte) 0xDE;

	/* Allocated for NUNIT test */
	public static final byte FUNC_ID_ZW_NUNIT_CMD = (byte) 0xE0;
	public static final byte FUNC_ID_ZW_NUNIT_INIT = (byte) 0xE1;
	public static final byte FUNC_ID_ZW_NUNIT_LIST = (byte) 0xE2;
	public static final byte FUNC_ID_ZW_NUNIT_RUN = (byte) 0xE3;
	public static final byte FUNC_ID_ZW_NUNIT_END = (byte) 0xE4;

	public static final byte FUNC_ID_IO_PORT_STATUS = (byte) 0xE5;
	public static final byte FUNC_ID_IO_PORT = (byte) 0xE6;

	/* Allocated for Power Management */
	public static final byte FUNC_ID_SERIAL_API_POWER_MANAGEMENT = (byte) 0xEE;
	public static final byte FUNC_ID_SERIAL_API_READY = (byte) 0xEF;

	/* Allocated for proprietary serial API commands */
	public static final byte FUNC_ID_PROPRIETARY_0 = (byte) 0xF0;
	public static final byte FUNC_ID_PROPRIETARY_1 = (byte) 0xF1;
	public static final byte FUNC_ID_PROPRIETARY_2 = (byte) 0xF2;
	public static final byte FUNC_ID_PROPRIETARY_3 = (byte) 0xF3;
	public static final byte FUNC_ID_PROPRIETARY_4 = (byte) 0xF4;
	public static final byte FUNC_ID_PROPRIETARY_5 = (byte) 0xF5;
	public static final byte FUNC_ID_PROPRIETARY_6 = (byte) 0xF6;
	public static final byte FUNC_ID_PROPRIETARY_7 = (byte) 0xF7;
	public static final byte FUNC_ID_PROPRIETARY_8 = (byte) 0xF8;
	public static final byte FUNC_ID_PROPRIETARY_9 = (byte) 0xF9;
	public static final byte FUNC_ID_PROPRIETARY_A = (byte) 0xFA;
	public static final byte FUNC_ID_PROPRIETARY_B = (byte) 0xFB;
	public static final byte FUNC_ID_PROPRIETARY_C = (byte) 0xFC;
	public static final byte FUNC_ID_PROPRIETARY_D = (byte) 0xFD;
	public static final byte FUNC_ID_PROPRIETARY_E = (byte) 0xFE;

	/* Illegal function ID */
	public static final byte FUNC_ID_UNKNOWN = (byte) 0xFF;
	public static final int ZW_MAX_NODES = 232;

	public static final int MAX_NODE_PARM_SIZE = 20;

	/* Setup API commands */
	public static final byte SERIAL_API_SETUP_CMD_SUPPORTED = (byte) 0x01;
	public static final byte SERIAL_API_SETUP_CMD_TX_STATUS_REPORT_SET = (byte) 0x02;
	public static final byte SERIAL_API_SETUP_CMD_TX_POWERLEVEL_SET = (byte) 0x04;
	public static final byte SERIAL_API_SETUP_CMD_TX_POWERLEVEL_GET = (byte) 0x08;
	public static final byte SERIAL_API_SETUP_CMD_TX_GET_MAX_PAYLOAD_SIZE = (byte) 0x10;
	public static final byte SERIAL_API_SETUP_CMD_RF_REGION_GET = (byte) 0x20;
	public static final byte SERIAL_API_SETUP_CMD_RF_REGION_SET = (byte) 0x40;

	public enum Region {
		RF_REGION_EU((byte) 0x00, "Europe"), RF_REGION_US((byte) 0x01, "US"),
		RF_REGION_AUSTRALIA((byte) 0x02, "Australia/New Zealand"), RF_REGION_HONG_KONG((byte) 0x03, "Hong Kong"),
		RF_REGION_MALAYSIA((byte) 0x04, "Malaysia"), RF_REGION_INDIA((byte) 0x05, "India"),
		RF_REGION_ISRAEL((byte) 0x06, "Israel"), RF_REGION_TERRORIST((byte) 0x07, ":("),
		RF_REGION_CHINA((byte) 0x08, "China"), RF_REGION_US_LR((byte) 0x09, "US long range"),
		RF_REGION_JAPAN((byte) 0x20, "Japan"), RF_REGION_KOREA((byte) 0x20, "Korea");

		private final byte code;
		private final String name;

		Region(byte code, String name) {
			this.code = code;
			this.name = name;
		}

		public byte getCode() {
			return code;
		}

		public String getName() {
			return name;
		}
	}

	public static final byte SERIAL_API_SETUP_CMD_NODEID_BASETYPE_SET = (byte) 0x80;
	public static final byte NODEID_BASETYPE_8BITS = (byte) 0x01;
	public static final byte NODEID_BASETYPE_16BITS = (byte) 0x02;
	/* Setup API commands (extended) */
	public static final byte SERIAL_API_SETUP_CMD_TX_MAX_LR_POWER_SET = (byte) 0x03;
	public static final byte SERIAL_API_SETUP_CMD_TX_MAX_LR_POWER_GET = (byte) 0x05;
	public static final byte SERIAL_API_SETUP_CMD_TX_GET_MAX_LR_PAYLOAD_SIZE = (byte) 0x11;
	public static final byte SERIAL_API_SETUP_CMD_TX_POWERLEVEL_SET_16BITS = (byte) 0x12;
	public static final byte SERIAL_API_SETUP_CMD_TX_POWERLEVEL_GET_16BITS = (byte) 0x13;

	public static String getSetupCommandName(byte b) {
		if (b == SERIAL_API_SETUP_CMD_NODEID_BASETYPE_SET) {
			return "set node id type";
		}
		if (b == SERIAL_API_SETUP_CMD_SUPPORTED) {
			return "get supported commands";
		}
		if (b == SERIAL_API_SETUP_CMD_RF_REGION_GET) {
			return "get RF region";
		}
		if (b == SERIAL_API_SETUP_CMD_RF_REGION_SET) {
			return "set RF region";
		}
		return "??";
	}
}
