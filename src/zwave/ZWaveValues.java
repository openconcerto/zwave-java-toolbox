
package zwave;

public class ZWaveValues {


	/************* Z-Wave+ Role Type identifiers **************/
	public static final byte ROLE_TYPE_CONTROLLER_CENTRAL_STATIC = 0x00;
	public static final byte ROLE_TYPE_CONTROLLER_SUB_STATIC = 0x01;
	public static final byte ROLE_TYPE_CONTROLLER_PORTABLE = 0x02;
	public static final byte ROLE_TYPE_CONTROLLER_PORTABLE_REPORTING = 0x03;
	public static final byte ROLE_TYPE_SLAVE_PORTABLE = 0x04;
	public static final byte ROLE_TYPE_SLAVE_ALWAYS_ON = 0x05;
	public static final byte ROLE_TYPE_SLAVE_SLEEPING_REPORTING = 0x06;
	public static final byte ROLE_TYPE_SLAVE_SLEEPING_LISTENING = 0x07;

	/************* Z-Wave+ Icon Type identifiers **************/
	/* The Z-Wave+ Icon Types defined in this section is the */
	/* work of the Z-Wave Alliance. */
	/* The most current list of Z-Wave+ Icon Types may be */
	/* found at Z-Wave Alliance web site along with */
	/* sample icons. */
	/* New Z-Wave+ Icon Types may be requested from the */
	/* Z-Wave Alliance. */
	/**********************************************************/
	public static final int ICON_TYPE_UNASSIGNED = 0x0000; // MUST NOT be used by any product

	public static final int ICON_TYPE_GENERIC_CENTRAL_CONTROLLER = 0x0100; // Central Controller Device Type

	public static final int ICON_TYPE_GENERIC_DISPLAY_SIMPLE = 0x0200; // Display Simple Device Type

	public static final int ICON_TYPE_GENERIC_DOOR_LOCK_KEYPAD = 0x0300; // Door Lock Keypad Device Type

	public static final int ICON_TYPE_GENERIC_FAN_SWITCH = 0x0400; // Fan Switch Device Type

	public static final int ICON_TYPE_GENERIC_GATEWAY = 0x0500; // Gateway Device Type

	public static final int ICON_TYPE_GENERIC_LIGHT_DIMMER_SWITCH = 0x0600; // Light Dimmer Switch Device Type

	public static final int ICON_TYPE_GENERIC_ON_OFF_POWER_SWITCH = 0x0700; // On/Off Power Switch Device Type

	public static final int ICON_TYPE_GENERIC_POWER_STRIP = 0x0800; // Power Strip Device Type

	public static final int ICON_TYPE_GENERIC_REMOTE_CONTROL_AV = 0x0900; // Remote Control AV Device Type

	public static final int ICON_TYPE_GENERIC_REMOTE_CONTROL_MULTI_PURPOSE = 0x0A00; // Remote Control Multi Purpose
																						// Device Type

	public static final int ICON_TYPE_GENERIC_REMOTE_CONTROL_SIMPLE = 0x0B00; // Remote Control Simple Device Type
	public static final int ICON_TYPE_SPECIFIC_REMOTE_CONTROL_SIMPLE_KEYFOB = 0x0B01; // Remote Control Simple Device
																						// Type (Key fob)

	public static final int ICON_TYPE_GENERIC_SENSOR_NOTIFICATION = 0x0C00; // Sensor Notification Device Type
	public static final int ICON_TYPE_SPECIFIC_SENSOR_NOTIFICATION_SMOKE_ALARM = 0x0C01; // Sensor Notification Device
																							// Type (Notification type
																							// Smoke Alarm)
	public static final int ICON_TYPE_SPECIFIC_SENSOR_NOTIFICATION_CO_ALARM = 0x0C02; // Sensor Notification Device
																						// Type (Notification type CO
																						// Alarm)
	public static final int ICON_TYPE_SPECIFIC_SENSOR_NOTIFICATION_CO2_ALARM = 0x0C03; // Sensor Notification Device
																						// Type (Notification type CO2
																						// Alarm)
	public static final int ICON_TYPE_SPECIFIC_SENSOR_NOTIFICATION_HEAT_ALARM = 0x0C04; // Sensor Notification Device
																							// Type (Notification type
																							// Heat Alarm)
	public static final int ICON_TYPE_SPECIFIC_SENSOR_NOTIFICATION_WATER_ALARM = 0x0C05; // Sensor Notification Device
																							// Type (Notification type
																							// Water Alarm)
	public static final int ICON_TYPE_SPECIFIC_SENSOR_NOTIFICATION_ACCESS_CONTROL = 0x0C06; // Sensor Notification
																								// Device Type
																								// (Notification type
																								// Access Control)
	public static final int ICON_TYPE_SPECIFIC_SENSOR_NOTIFICATION_HOME_SECURITY = 0x0C07; // Sensor Notification
																							// Device Type (Notification
																							// type Home Security)
	public static final int ICON_TYPE_SPECIFIC_SENSOR_NOTIFICATION_POWER_MANAGEMENT = 0x0C08; // Sensor Notification
																								// Device Type
																								// (Notification type
																								// Power Management)
	public static final int ICON_TYPE_SPECIFIC_SENSOR_NOTIFICATION_SYSTEM = 0x0C09; // Sensor Notification Device Type
																						// (Notification type System)
	public static final int ICON_TYPE_SPECIFIC_SENSOR_NOTIFICATION_EMERGENCY_ALARM = 0x0C0A; // Sensor Notification
																								// Device Type
																								// (Notification type
																								// Emergency Alarm)
	public static final int ICON_TYPE_SPECIFIC_SENSOR_NOTIFICATION_CLOCK = 0x0C0B; // Sensor Notification Device Type
																					// (Notification type Clock)
	public static final int ICON_TYPE_SPECIFIC_SENSOR_NOTIFICATION_MULTIDEVICE = 0x0CFF; // Sensor Notification Device
																							// Type (Bundled
																							// Notification functions)

	public static final int ICON_TYPE_GENERIC_SENSOR_MULTILEVEL = 0x0D00; // Sensor Multilevel Device Type
	public static final int ICON_TYPE_SPECIFIC_SENSOR_MULTILEVEL_AIR_TEMPERATURE = 0x0D01; // Sensor Multilevel Device
																							// Type (Sensor type Air
																							// Temperature)
	public static final int ICON_TYPE_SPECIFIC_SENSOR_MULTILEVEL_GENERAL_PURPOSE_VALUE = 0x0D02; // Sensor Multilevel
																									// Device Type
																									// (Sensor type
																									// General Purpose
																									// Value)
	public static final int ICON_TYPE_SPECIFIC_SENSOR_MULTILEVEL_LUMINANCE = 0x0D03; // Sensor Multilevel Device Type
																						// (Sensor type Luminance)
	public static final int ICON_TYPE_SPECIFIC_SENSOR_MULTILEVEL_POWER = 0x0D04; // Sensor Multilevel Device Type
																					// (Sensor type Power)
	public static final int ICON_TYPE_SPECIFIC_SENSOR_MULTILEVEL_HUMIDITY = 0x0D05; // Sensor Multilevel Device Type
																						// (Sensor type Humidity)
	public static final int ICON_TYPE_SPECIFIC_SENSOR_MULTILEVEL_VELOCITY = 0x0D06; // Sensor Multilevel Device Type
																						// (Sensor type Velocity)
	public static final int ICON_TYPE_SPECIFIC_SENSOR_MULTILEVEL_DIRECTION = 0x0D07; // Sensor Multilevel Device Type
																						// (Sensor type Direction)
	public static final int ICON_TYPE_SPECIFIC_SENSOR_MULTILEVEL_ATMOSPHERIC_PRESSURE = 0x0D08; // Sensor Multilevel
																									// Device Type
																									// (Sensor type
																									// Atmospheric
																									// Pressure)
	public static final int ICON_TYPE_SPECIFIC_SENSOR_MULTILEVEL_BAROMETRIC_PRESSURE = 0x0D09; // Sensor Multilevel
																								// Device Type (Sensor
																								// type Barometric
																								// Pressure)
	public static final int ICON_TYPE_SPECIFIC_SENSOR_MULTILEVEL_SOLOR_RADIATION = 0x0D0A; // Sensor Multilevel Device
																							// Type (Sensor type Solar
																							// Radiation)
	public static final int ICON_TYPE_SPECIFIC_SENSOR_MULTILEVEL_DEW_POINT = 0x0D0B; // Sensor Multilevel Device Type
																						// (Sensor type Dew Pobyte)
	public static final int ICON_TYPE_SPECIFIC_SENSOR_MULTILEVEL_RAIN_RATE = 0x0D0C; // Sensor Multilevel Device Type
																						// (Sensor type Rain Rate)
	public static final int ICON_TYPE_SPECIFIC_SENSOR_MULTILEVEL_TIDE_LEVEL = 0x0D0D; // Sensor Multilevel Device Type
																						// (Sensor type Tide Level)
	public static final int ICON_TYPE_SPECIFIC_SENSOR_MULTILEVEL_WEIGHT = 0x0D0E; // Sensor Multilevel Device Type
																					// (Sensor type Weight)
	public static final int ICON_TYPE_SPECIFIC_SENSOR_MULTILEVEL_VOLTAGE = 0x0D0F; // Sensor Multilevel Device Type
																					// (Sensor type Voltage)
	public static final int ICON_TYPE_SPECIFIC_SENSOR_MULTILEVEL_CURRENT = 0x0D10; // Sensor Multilevel Device Type
																					// (Sensor type Current)
	public static final int ICON_TYPE_SPECIFIC_SENSOR_MULTILEVEL_CO2_LEVEL = 0x0D11; // Sensor Multilevel Device Type
																						// (Sensor type CO2 Level)
	public static final int ICON_TYPE_SPECIFIC_SENSOR_MULTILEVEL_AIR_FLOW = 0x0D12; // Sensor Multilevel Device Type
																						// (Sensor type Air Flow)
	public static final int ICON_TYPE_SPECIFIC_SENSOR_MULTILEVEL_TANK_CAPACITY = 0x0D13; // Sensor Multilevel Device
																							// Type (Sensor type Tank
																							// Capacity)
	public static final int ICON_TYPE_SPECIFIC_SENSOR_MULTILEVEL_DISTANCE = 0x0D14; // Sensor Multilevel Device Type
																						// (Sensor type Distance)
	public static final int ICON_TYPE_SPECIFIC_SENSOR_MULTILEVEL_ANGLE_POSITION = 0x0D15; // Sensor Multilevel Device
																							// Type (Sensor type Angle
																							// Position)
	public static final int ICON_TYPE_SPECIFIC_SENSOR_MULTILEVEL_ROTATION = 0x0D16; // Sensor Multilevel Device Type
																						// (Sensor type Rotation)
	public static final int ICON_TYPE_SPECIFIC_SENSOR_MULTILEVEL_WATER_TEMPERATURE = 0x0D17; // Sensor Multilevel
																								// Device Type (Sensor
																								// type Water
																								// Temperature)
	public static final int ICON_TYPE_SPECIFIC_SENSOR_MULTILEVEL_SOIL_TEMPERATURE = 0x0D18; // Sensor Multilevel Device
																								// Type (Sensor type
																								// Soil Temperature)
	public static final int ICON_TYPE_SPECIFIC_SENSOR_MULTILEVEL_SEISMIC_INTENSITY = 0x0D19; // Sensor Multilevel
																								// Device Type (Sensor
																								// type Seismic
																								// Intensity)
	public static final int ICON_TYPE_SPECIFIC_SENSOR_MULTILEVEL_SEISMIC_MAGNITUDE = 0x0D1A; // Sensor Multilevel
																								// Device Type (Sensor
																								// type Seismic
																								// Magnitude)
	public static final int ICON_TYPE_SPECIFIC_SENSOR_MULTILEVEL_ULTRAVIOLET = 0x0D1B; // Sensor Multilevel Device Type
																						// (Sensor type Ultraviolet)
	public static final int ICON_TYPE_SPECIFIC_SENSOR_MULTILEVEL_ELECTRICAL_RESISTIVITY = 0x0D1C; // Sensor Multilevel
																									// Device Type
																									// (Sensor type
																									// Electrical
																									// Resistivity)
	public static final int ICON_TYPE_SPECIFIC_SENSOR_MULTILEVEL_ELECTRICAL_CONDUCTIVITY = 0x0D1D; // Sensor Multilevel
																									// Device Type
																									// (Sensor type
																									// Electrical
																									// Conductivity)
	public static final int ICON_TYPE_SPECIFIC_SENSOR_MULTILEVEL_LOUDNESS = 0x0D1E; // Sensor Multilevel Device Type
																						// (Sensor type Loudness)
	public static final int ICON_TYPE_SPECIFIC_SENSOR_MULTILEVEL_MOISTURE = 0x0D1F; // Sensor Multilevel Device Type
																						// (Sensor type Moisture)
	public static final int ICON_TYPE_SPECIFIC_SENSOR_MULTILEVEL_FREQUENCY = 0x0D20; // Sensor Multilevel Device Type
																						// (Sensor type Frequency)
	public static final int ICON_TYPE_SPECIFIC_SENSOR_MULTILEVEL_TIME = 0x0D21; // Sensor Multilevel Device Type
																					// (Sensor type Time )
	public static final int ICON_TYPE_SPECIFIC_SENSOR_MULTILEVEL_TARGET_TEMPERATURE = 0x0D22; // Sensor Multilevel
																								// Device Type (Sensor
																								// type Target
																								// Temperature)
	public static final int ICON_TYPE_SPECIFIC_SENSOR_MULTILEVEL_MULTIDEVICE = 0x0DFF; // Sensor Multilevel Device Type
																						// (Bundled Sensor functions)

	public static final int ICON_TYPE_GENERIC_SET_TOP_BOX = 0x0E00; // Set Top Box Device Type

	public static final int ICON_TYPE_GENERIC_SIREN = 0x0F00; // Siren Device Type

	public static final int ICON_TYPE_GENERIC_SUB_ENERGY_METER = 0x1000; // Sub Energy Meter Device Type

	public static final int ICON_TYPE_GENERIC_SUB_SYSTEM_CONTROLLER = 0x1100; // Sub System Controller Device Type

	public static final int ICON_TYPE_GENERIC_THERMOSTAT_HVAC = 0x1200; // Thermostat HVAC Device Type

	public static final int ICON_TYPE_GENERIC_THERMOSTAT_SETBACK = 0x1300; // Thermostat Setback Device Type

	public static final int ICON_TYPE_GENERIC_TV = 0x1400; // TV Device Type

	public static final int ICON_TYPE_GENERIC_VALVE_OPEN_CLOSE = 0x1500; // Valve Open/Close Device Type

	public static final int ICON_TYPE_GENERIC_WALL_CONTROLLER = 0x1600; // Wall Controller Device Type

	public static final int ICON_TYPE_GENERIC_WHOLE_HOME_METER_SIMPLE = 0x1700; // Whole Home Meter Simple Device Type

	public static final int ICON_TYPE_GENERIC_WINDOW_COVERING_NO_POSITION_ENDPOINT = 0x1800; // Window Covering No
																								// Position/Endpobyte
																								// Device Type

	public static final int ICON_TYPE_GENERIC_WINDOW_COVERING_ENDPOINT_AWARE = 0x1900; // Window Covering Endpobyte
																						// Aware Device Type

	public static final int ICON_TYPE_GENERIC_WINDOW_COVERING_POSITION_ENDPOINT_AWARE = 0x1A00; // Window Covering
																									// Position/Endpobyte
																									// Aware Device Type

	public static final int ICON_TYPE_GENERIC_REPEATER_SLAVE = 0x1B00; // Repeater Device Type

	/************* Manufacturer ID identifiers **************/
	public static final int MFG_ID_NOT_DEFINED_OR_UNDEFINED = 0xFFFF; // Not defined or un-defined
	public static final int MFG_ID_2B_ELECTRONICS = 0x0028; // 2B Electronics
	public static final int MFG_ID_2GIG_TECHNOLOGIES_INC = 0x009B; // 2gig Technologies Inc.
	public static final int MFG_ID_3E_TECHNOLOGIES = 0x002A; // 3e Technologies
	public static final int MFG_ID_A1_COMPONENTS = 0x0022; // A-1 Components
	public static final int MFG_ID_ABILIA = 0x0117; // Abilia
	public static final int MFG_ID_ACT_ADVANCED_CONTROL_TECHNOLOGIES = 0x0001; // ACT - Advanced Control Technologies
	public static final int MFG_ID_ADOX_INC = 0x0101; // ADOX, Inc.
	public static final int MFG_ID_ADVANCED_OPTRONIC_DEVICES_COLTD = 0x016C; // Advanced Optronic Devices Co.,Ltd
	public static final int MFG_ID_ADVENTURE_INTERACTIVE = 0x009E; // Adventure Interactive
	public static final int MFG_ID_AEON_LABS = 0x0086; // AEON Labs
	public static final int MFG_ID_AIRLINE_MECHANICAL_CO_LTD = 0x0111; // Airline Mechanical Co., Ltd.
	public static final int MFG_ID_AIRVENT_SAM_SPA = 0x0088; // Airvent SAM S.p.A.
	public static final int MFG_ID_ALARMCOM = 0x0094; // Alarm.com
	public static final int MFG_ID_ALERTME = 0x0126; // Alertme
	public static final int MFG_ID_ALLEGION = 0x003B; // Allegion
	public static final int MFG_ID_AMERICAN_GRID_INC = 0x005A; // American Grid, Inc.
	public static final int MFG_ID_ANYCOMM_CORPORATION = 0x0078; // anyCOMM Corporation
	public static final int MFG_ID_APPLIED_MICRO_ELECTRONICS_AME_BV = 0x0144; // Applied Micro Electronics "AME" BV
	public static final int MFG_ID_ASIA_HEADING = 0x0029; // Asia Heading
	public static final int MFG_ID_ASSA_ABLOY = 0x0129; // ASSA ABLOY
	public static final int MFG_ID_ASTRALINK = 0x013B; // AstraLink
	public static final int MFG_ID_ATT = 0x0134; // AT&T
	public static final int MFG_ID_ATECH = 0x002B; // Atech
	public static final int MFG_ID_AVADESIGN_TECHNOLOGY_CO_LTD = 0x0155; // Avadesign Technology Co., Ltd.
	public static final int MFG_ID_AXESSTEL_INC = 0x0146; // Axesstel Inc
	public static final int MFG_ID_BALBOA_INSTRUMENTS = 0x0018; // Balboa Instruments
	public static final int MFG_ID_BENEXT = 0x008A; // BeNext
	public static final int MFG_ID_BESAFER = 0x002C; // BeSafer
	public static final int MFG_ID_BFT_SPA = 0x014B; // BFT S.p.A.
	public static final int MFG_ID_BIT7_INC = 0x0052; // Bit7 Inc.
	public static final int MFG_ID_BLACK_DECKER = 0x0090; // Black & Decker
	public static final int MFG_ID_BOCA_DEVICES = 0x0023; // Boca Devices
	public static final int MFG_ID_BONIG_UND_KALLENBACH_OHG = 0x0169; // Bönig und Kallenbach oHG
	public static final int MFG_ID_BOSCH_SECURITY_SYSTEMS_INC = 0x015C; // Bosch Security Systems, Inc
	public static final int MFG_ID_BRK_BRANDS_INC = 0x0138; // BRK Brands, Inc.
	public static final int MFG_ID_BROADBAND_ENERGY_NETWORKS_INC = 0x002D; // Broadband Energy Networks Inc.
	public static final int MFG_ID_BUFFALO_INC = 0x0145; // Buffalo Inc.
	public static final int MFG_ID_BULOGICS = 0x0026; // BuLogics
	public static final int MFG_ID_CAMEO_COMMUNICATIONS_INC = 0x009C; // Cameo Communications Inc.
	public static final int MFG_ID_CARRIER = 0x002E; // Carrier
	public static final int MFG_ID_CASAWORKS = 0x000B; // CasaWorks
	public static final int MFG_ID_CBCC_SARL = 0x0166; // CBCC Sarl
	public static final int MFG_ID_CHECKIT_SOLUTIONS_INC = 0x014E; // Check-It Solutions Inc.
	public static final int MFG_ID_CHROMAGIC_TECHNOLOGIES_CORPORATION = 0x0116; // Chromagic Technologies Corporation
	public static final int MFG_ID_CISCO_CONSUMER_BUSINESS_GROUP = 0x0082; // Cisco Consumer Business Group
	public static final int MFG_ID_CLIMAX_TECHNOLOGY_LTD = 0x018E; // Climax Technology, Ltd.
	public static final int MFG_ID_CLOUD_MEDIA = 0x0200; // Cloud Media
	public static final int MFG_ID_COLOR_KINETICS_INCORPORATED = 0x002F; // Color Kinetics Incorporated
	public static final int MFG_ID_COMPUTIME = 0x0140; // Computime
	public static final int MFG_ID_CONNECTED_OBJECT = 0x011B; // Connected Object
	public static final int MFG_ID_CONNECTHOME = 0x0179; // ConnectHome
	public static final int MFG_ID_CONTROLTHINK_LC = 0x0019; // ControlThink LC
	public static final int MFG_ID_CONVERGEX_LTD = 0x000F; // ConvergeX Ltd.
	public static final int MFG_ID_COOLGUARD = 0x007D; // CoolGuard
	public static final int MFG_ID_COOPER_LIGHTING = 0x0079; // Cooper Lighting
	public static final int MFG_ID_COOPER_WIRING_DEVICES = 0x001A; // Cooper Wiring Devices
	public static final int MFG_ID_COVENTIVE_TECHNOLOGIES_INC = 0x009D; // Coventive Technologies Inc.
	public static final int MFG_ID_CYBERHOUSE = 0x0014; // Cyberhouse
	public static final int MFG_ID_CYBERTAN_TECHNOLOGY_INC = 0x0067; // CyberTAN Technology, Inc.
	public static final int MFG_ID_CYTECH_TECHNOLOGY_PRE_LTD = 0x0030; // Cytech Technology Pre Ltd.
	public static final int MFG_ID_DANFOSS = 0x0002; // Danfoss
	public static final int MFG_ID_DAWON_DNS = 0x018C; // Dawon DNS
	public static final int MFG_ID_DEFACONTROLS_BV = 0x013F; // Defacontrols BV
	public static final int MFG_ID_DESTINY_NETWORKS = 0x0031; // Destiny Networks
	public static final int MFG_ID_DEVOLO = 0x0175; // Devolo
	public static final int MFG_ID_DIEHL_AKO = 0x0103; // Diehl AKO
	public static final int MFG_ID_DIGITAL_5_INC = 0x0032; // Digital 5, Inc.
	public static final int MFG_ID_DLINK = 0x0108; // D-Link
	public static final int MFG_ID_DMP_DIGITAL_MONITORING_PRODUCTS = 0x0127; // DMP (Digital Monitoring Products)
	public static final int MFG_ID_DOMINO_SISTEMI_DOO = 0x0177; // Domino sistemi d.o.o.
	public static final int MFG_ID_DRACOR_INC = 0x017D; // DRACOR Inc.
	public static final int MFG_ID_DRAGON_TECH_INDUSTRIAL_LTD = 0x0184; // Dragon Tech Industrial, Ltd.
	public static final int MFG_ID_DYNAQUIP_CONTROLS = 0x0132; // DynaQuip Controls
	public static final int MFG_ID_EBV = 0x017C; // EbV
	public static final int MFG_ID_ECHOSTAR = 0x016B; // Echostar
	public static final int MFG_ID_ECOLINK = 0x014A; // Ecolink
	public static final int MFG_ID_ECONET_CONTROLS = 0x0157; // EcoNet Controls
	public static final int MFG_ID_EHOME_AUTOMATION = 0x010D; // e-Home AUTOMATION
	public static final int MFG_ID_EKA_SYSTEMS = 0x0087; // Eka Systems
	public static final int MFG_ID_ELECTRONIC_SOLUTIONS = 0x0033; // Electronic Solutions
	public static final int MFG_ID_ELGEV_ELECTRONICS_LTD = 0x0034; // El-Gev Electronics LTD
	public static final int MFG_ID_ELK_PRODUCTS_INC = 0x001B; // ELK Products, Inc.
	public static final int MFG_ID_EMBEDIT_AS = 0x0035; // Embedit A/S
	public static final int MFG_ID_ENBLINK_CO_LTD = 0x014D; // Enblink Co. Ltd
	public static final int MFG_ID_ERONE = 0x006F; // Erone
	public static final int MFG_ID_ESSENCE_SECURITY = 0x0160; // Essence Security
	public static final int MFG_ID_EUROTRONICS = 0x0148; // Eurotronics
	public static final int MFG_ID_EVERSPRING = 0x0060; // Everspring
	public static final int MFG_ID_EVOLVE = 0x0113; // Evolve
	public static final int MFG_ID_EXCEPTIONAL_INNOVATIONS = 0x0036; // Exceptional Innovations
	public static final int MFG_ID_EXHAUSTO = 0x0004; // Exhausto
	public static final int MFG_ID_EXIGENT_SENSORS = 0x009F; // Exigent Sensors
	public static final int MFG_ID_EXPRESS_CONTROLS = 0x001E; // Express Controls
	public static final int MFG_ID_FAKRO = 0x0085; // Fakro
	public static final int MFG_ID_FANTEM = 0x016A; // Fantem
	public static final int MFG_ID_FIBARGROUP = 0x010F; // Fibargroup
	public static final int MFG_ID_FLEXTRONICS = 0x018D; // Flextronics
	public static final int MFG_ID_FLUE_SENTINEL = 0x0024; // Flue Sentinel
	public static final int MFG_ID_FOARD_SYSTEMS = 0x0037; // Foard Systems
	public static final int MFG_ID_FOCAL_POINT_LIMITED = 0x018F; // Focal Pobyte Limited
	public static final int MFG_ID_FOLLOWGOOD_TECHNOLOGY_COMPANY_LTD = 0x0137; // FollowGood Technology Company Ltd.
	public static final int MFG_ID_FORTREZZ_LLC = 0x0084; // FortrezZ LLC
	public static final int MFG_ID_FOXCONN = 0x011D; // Foxconn
	public static final int MFG_ID_FROSTDALE = 0x0110; // Frostdale
	public static final int MFG_ID_GLOBALCHINATECH = 0x018A; // Globalchina-Tech
	public static final int MFG_ID_GOAP = 0x0159; // Goap
	public static final int MFG_ID_GOGGIN_RESEARCH = 0x0076; // Goggin Research
	public static final int MFG_ID_GOOD_WAY_TECHNOLOGY_CO_LTD = 0x0068; // Good Way Technology Co., Ltd
	public static final int MFG_ID_GREENWAVE_REALITY_INC = 0x0099; // GreenWave Reality Inc.
	public static final int MFG_ID_GRIB = 0x018B; // Grib
	public static final int MFG_ID_GUANGZHOU_RUIXIANG_ME_CO_LTD = 0x016D; // Guangzhou Ruixiang M&E Co., Ltd
	public static final int MFG_ID_GUANGZHOU_ZEEWAVE_INFORMATION_TECHNOLOGY_CO_LTD = 0x0158; // GuangZhou Zeewave
																								// Information
																								// Technology Co., Ltd.
	public static final int MFG_ID_HAWKING_TECHNOLOGIES_INC = 0x0073; // Hawking Technologies Inc.
	public static final int MFG_ID_HITECH_AUTOMATION = 0x0017; // HiTech Automation
	public static final int MFG_ID_HOLION_ELECTRONIC_ENGINEERING_CO_LTD = 0x0181; // Holion Electronic Engineering Co.,
																					// Ltd
	public static final int MFG_ID_HOLTEC_ELECTRONICS_BV = 0x013E; // Holtec Electronics BV
	public static final int MFG_ID_HOME_AUTOMATED_LIVING = 0x000D; // Home Automated Living
	public static final int MFG_ID_HOME_AUTOMATION_EUROPE = 0x009A; // Home Automation Europe
	public static final int MFG_ID_HOME_AUTOMATION_INC = 0x005B; // Home Automation Inc.
	public static final int MFG_ID_HOME_DIRECTOR = 0x0038; // Home Director
	public static final int MFG_ID_HOMEMANAGEABLES_INC = 0x0070; // Homemanageables, Inc.
	public static final int MFG_ID_HOMEPRO = 0x0050; // Homepro
	public static final int MFG_ID_HOMESCENARIO = 0x0162; // HomeScenario
	public static final int MFG_ID_HOMESEER_TECHNOLOGIES = 0x000C; // HomeSeer Technologies
	public static final int MFG_ID_HONEYWELL = 0x0039; // Honeywell
	public static final int MFG_ID_HORSTMANN_CONTROLS_LIMITED = 0x0059; // Horstmann Controls Limited
	public static final int MFG_ID_HUAPIN_INFORMATION_TECHNOLOGY_COLTD = 0x0180; // Huapin Information Technology
																					// Co.,Ltd
	public static final int MFG_ID_HUNTER_DOUGLAS = 0x007C; // Hunter Douglas
	public static final int MFG_ID_ICOM_TECHNOLOGY_BV = 0x0011; // iCOM Technology b.v.
	public static final int MFG_ID_ICONTROL = 0x0106; // iControl
	public static final int MFG_ID_IDRF = 0x0165; // ID-RF
	public static final int MFG_ID_IMPACT_TECHNOLOGIES_AND_PRODUCTS = 0x0056; // Impact Technologies and Products
	public static final int MFG_ID_IMPACT_TECHNOLOGIES_BV = 0x0061; // Impact Technologies BV
	public static final int MFG_ID_INFUSION_DEVELOPMENT = 0x012B; // Infusion Development
	public static final int MFG_ID_INGERSOLL_RAND_SCHLAGE = 0x006C; // Ingersoll Rand (Schlage)
	public static final int MFG_ID_INGERSOLL_RAND_ECOLINK = 0x011F; // Ingersoll Rand (was Ecolink)
	public static final int MFG_ID_INLON_SRL = 0x003A; // Inlon Srl
	public static final int MFG_ID_INNOBAND_TECHNOLOGIES_INC = 0x0141; // Innoband Technologies, Inc
	public static final int MFG_ID_INNOVUS = 0x0077; // INNOVUS
	public static final int MFG_ID_INSIGNIA = 0x0100; // Insignia
	public static final int MFG_ID_INTEL = 0x0006; // Intel
	public static final int MFG_ID_INTELLICON = 0x001C; // IntelliCon
	public static final int MFG_ID_INTERACTIVE_ELECTRONICS_SYSTEMS_IES = 0x0072; // Interactive Electronics Systems
																					// (IES)
	public static final int MFG_ID_INTERMATIC = 0x0005; // Intermatic
	public static final int MFG_ID_INTERNET_DOM = 0x0013; // Internet Dom
	public static final int MFG_ID_IQGROUP = 0x005F; // IQ-Group
	public static final int MFG_ID_IWATSU = 0x0123; // IWATSU
	public static final int MFG_ID_JASCO_PRODUCTS = 0x0063; // Jasco Products
	public static final int MFG_ID_JIN_TAO_BAO = 0x015A; // Jin Tao Bao
	public static final int MFG_ID_JSW_PACIFIC_CORPORATION = 0x0164; // JSW Pacific Corporation
	public static final int MFG_ID_KAMSTRUP_AS = 0x0091; // Kamstrup A/S
	public static final int MFG_ID_KELLENDONK_ELEKTRONIK = 0x006A; // Kellendonk Elektronik
	public static final int MFG_ID_KICHLER = 0x0114; // Kichler
	public static final int MFG_ID_KOPERA_DEVELOPMENT_INC = 0x0174; // Kopera Development Inc.
	public static final int MFG_ID_LAGOTEK_CORPORATION = 0x0051; // Lagotek Corporation
	public static final int MFG_ID_LEAK_INTELLIGENCE_LLC = 0x0173; // Leak Intelligence, LLC
	public static final int MFG_ID_LEVION_TECHNOLOGIES_GMBH = 0x0187; // LEVION Technologies Gmbh
	public static final int MFG_ID_LEVITON = 0x001D; // Leviton
	public static final int MFG_ID_LEXEL = 0x0015; // Lexel
	public static final int MFG_ID_LG_ELECTRONICS = 0x015B; // LG Electronics
	public static final int MFG_ID_LIFESTYLE_NETWORKS = 0x003C; // Lifestyle Networks
	public static final int MFG_ID_LINEAR_CORP = 0x014F; // Linear Corp
	public static final int MFG_ID_LIVEGUARD_LTD = 0x017A; // Liveguard Ltd.
	public static final int MFG_ID_LIVING_STYLE_ENTERPRISES_LTD = 0x013A; // Living Style Enterprises, Ltd.
	public static final int MFG_ID_LOCSTAR_TECHNOLOGY_CO_LTD = 0x015E; // Locstar Technology Co., Ltd
	public static final int MFG_ID_LOGITECH = 0x007F; // Logitech
	public static final int MFG_ID_LOUDWATER_TECHNOLOGIES_LLC = 0x0025; // Loudwater Technologies, LLC
	public static final int MFG_ID_LS_CONTROL = 0x0071; // LS Control
	public static final int MFG_ID_LVI_PRODUKTER_AB = 0x0062; // LVI Produkter AB
	public static final int MFG_ID_MANODO_KTC = 0x006E; // Manodo / KTC
	public static final int MFG_ID_MARMITEK_BV = 0x003D; // Marmitek BV
	public static final int MFG_ID_MARTEC_ACCESS_PRODUCTS = 0x003E; // Martec Access Products
	public static final int MFG_ID_MARTIN_RENZ_GMBH = 0x0092; // Martin Renz GmbH
	public static final int MFG_ID_MB_TURN_KEY_DESIGN = 0x008F; // MB Turn Key Design
	public static final int MFG_ID_MCOHOME_TECHNOLOGY_CO_LTD = 0x015F; // McoHome Technology Co., Ltd
	public static final int MFG_ID_MEEDIO_LLC = 0x0027; // Meedio, LLC
	public static final int MFG_ID_MEGACHIPS = 0x0107; // MegaChips
	public static final int MFG_ID_MERTEN = 0x007A; // Merten
	public static final int MFG_ID_MITSUMI = 0x0112; // MITSUMI
	public static final int MFG_ID_MODSTROM = 0x008D; // Modstrøm
	public static final int MFG_ID_MOHITO_NETWORKS = 0x000E; // Mohito Networks
	public static final int MFG_ID_MONSTER_CABLE = 0x007E; // Monster Cable
	public static final int MFG_ID_MOTION_CONTROL_SYSTEMS = 0x0125; // Motion Control Systems
	public static final int MFG_ID_MOTOROLA = 0x003F; // Motorola
	public static final int MFG_ID_MSK_MIYAKAWA_SEISAKUSHO = 0x0122; // MSK - Miyakawa Seisakusho
	public static final int MFG_ID_MTC_MAINTRONIC_GERMANY = 0x0083; // MTC Mabyteronic Germany
	public static final int MFG_ID_MYSTROM = 0x0143; // myStrom
	public static final int MFG_ID_NANJING_EASTHOUSE_ELECTRICAL_CO_LTD = 0x016E; // Nanjing Easthouse Electrical Co.,
																					// Ltd.
	public static final int MFG_ID_NAPCO_SECURITY_TECHNOLOGIES_INC = 0x0121; // Napco Security Technologies, Inc.
	public static final int MFG_ID_NEFIT = 0x006D; // Nefit
	public static final int MFG_ID_NESS_CORPORATION_PTY_LTD = 0x0189; // Ness Corporation Pty Ltd
	public static final int MFG_ID_NETGEAR = 0x0133; // Netgear
	public static final int MFG_ID_NEXIA_HOME_INTELLIGENCE = 0x0178; // Nexia Home Intelligence
	public static final int MFG_ID_NEXTENERGY = 0x0075; // NextEnergy
	public static final int MFG_ID_NINGBO_SENTEK_ELECTRONICS_CO_LTD = 0x0185; // Ningbo Sentek Electronics Co., Ltd
	public static final int MFG_ID_NORTHQ = 0x0096; // NorthQ
	public static final int MFG_ID_NOVAR_ELECTRICAL_DEVICES_AND_SYSTEMS_EDS = 0x0040; // Novar Electrical Devices and
																						// Systems (EDS)
	public static final int MFG_ID_OMNIMA_LIMITED = 0x0119; // Omnima Limited
	public static final int MFG_ID_ONSITE_PRO = 0x014C; // OnSite Pro
	public static final int MFG_ID_OPENPEAK_INC = 0x0041; // OpenPeak Inc.
	public static final int MFG_ID_PANASONIC_ELECTRIC_WORKS_CO_LTD = 0x0104; // Panasonic Electric Works Co., Ltd.
	public static final int MFG_ID_PASSIVSYSTEMS_LIMITED = 0x0172; // PassivSystems Limited
	public static final int MFG_ID_PELLA = 0x013D; // Pella
	public static final int MFG_ID_PHILIO_TECHNOLOGY_CORP = 0x013C; // Philio Technology Corp
	public static final int MFG_ID_PHYSICAL_GRAPH_CORPORATION = 0x0150; // Physical Graph Corporation
	public static final int MFG_ID_PITECH = 0x007B; // PiTech
	public static final int MFG_ID_POLYCONTROL = 0x010E; // Poly-control
	public static final int MFG_ID_POPP_CO = 0x0154; // Popp & Co
	public static final int MFG_ID_POWERHOUSE_DYNAMICS = 0x0170; // Powerhouse Dynamics
	public static final int MFG_ID_POWERLINX = 0x0074; // PowerLinx
	public static final int MFG_ID_POWERLYNX = 0x0016; // PowerLynx
	public static final int MFG_ID_PRAGMATIC_CONSULTING_INC = 0x0042; // Pragmatic Consulting Inc.
	public static final int MFG_ID_PRODRIVE_TECHNOLOGIES = 0x0128; // Prodrive Technologies
	public static final int MFG_ID_PROMIXIS_LLC = 0x0161; // Promixis, LLC
	public static final int MFG_ID_PULSE_TECHNOLOGIES_ASPALIS = 0x005D; // Pulse Technologies (Aspalis)
	public static final int MFG_ID_QEES = 0x0095; // Qees
	public static final int MFG_ID_QOLSYS = 0x012A; // Qolsys
	public static final int MFG_ID_QUBY = 0x0130; // Quby
	public static final int MFG_ID_QUEENLOCK_IND_CO_LTD = 0x0163; // Queenlock Ind. Co., Ltd.
	public static final int MFG_ID_RADEMACHER_GERATEELEKTRONIK_GMBH_CO_KG = 0x0142; // Rademacher Geräte-Elektronik
																					// GmbH & Co. KG
	public static final int MFG_ID_RADIO_THERMOSTAT_COMPANY_OF_AMERICA_RTC = 0x0098; // Radio Thermostat Company of
																						// America (RTC)
	public static final int MFG_ID_RARITAN = 0x008E; // Raritan
	public static final int MFG_ID_REITZGROUPDE = 0x0064; // Reitz-Group.de
	public static final int MFG_ID_REMOTEC = 0x5254; // Remotec
	public static final int MFG_ID_RESIDENTIAL_CONTROL_SYSTEMS_INC_RCS = 0x0010; // Residential Control Systems, Inc.
																					// (RCS)
	public static final int MFG_ID_REVOLV_INC = 0x0153; // Revolv Inc
	public static final int MFG_ID_RIMPORT_LTD = 0x0147; // R-import Ltd.
	public static final int MFG_ID_RS_SCENE_AUTOMATION = 0x0065; // RS Scene Automation
	public static final int MFG_ID_SAN_SHIH_ELECTRICAL_ENTERPRISE_CO_LTD = 0x0093; // San Shih Electrical Enterprise
																					// Co., Ltd.
	public static final int MFG_ID_SANAV = 0x012C; // SANAV
	public static final int MFG_ID_SCIENTIA_TECHNOLOGIES_INC = 0x001F; // Scientia Technologies, Inc.
	public static final int MFG_ID_SECURE_WIRELESS = 0x011E; // Secure Wireless
	public static final int MFG_ID_SECURENET_TECHNOLOGIES = 0x0167; // SecureNet Technologies
	public static final int MFG_ID_SECURIFI_LTD = 0x0182; // Securifi Ltd.
	public static final int MFG_ID_SELUXIT = 0x0069; // Seluxit
	public static final int MFG_ID_SENMATIC_AS = 0x0043; // Senmatic A/S
	public static final int MFG_ID_SEQUOIA_TECHNOLOGY_LTD = 0x0044; // Sequoia Technology LTD
	public static final int MFG_ID_SERCOMM_CORP = 0x0151; // Sercomm Corp
	public static final int MFG_ID_SHARP = 0x010B; // Sharp
	public static final int MFG_ID_SIEGENIAAUBI_KG = 0x0081; // SIEGENIA-AUBI KG
	public static final int MFG_ID_SIGMA_DESIGNS = 0x0000; // Sigma Designs (Former Zensys)
	public static final int MFG_ID_SINE_WIRELESS = 0x0045; // Sine Wireless
	public static final int MFG_ID_SMART_PRODUCTS_INC = 0x0046; // Smart Products, Inc.
	public static final int MFG_ID_SMK_MANUFACTURING_INC = 0x0102; // SMK Manufacturing Inc.
	public static final int MFG_ID_SOMFY = 0x0047; // Somfy
	public static final int MFG_ID_SQUARE_CONNECT = 0x0124; // Square Connect
	public static final int MFG_ID_STRATTEC_SECURITY_CORPORATION = 0x0168; // STRATTEC Security Corporation
	public static final int MFG_ID_SUMITOMO = 0x0105; // Sumitomo
	public static final int MFG_ID_SUPERNA = 0x0054; // Superna
	public static final int MFG_ID_SYLVANIA = 0x0009; // Sylvania
	public static final int MFG_ID_SYSTECH_CORPORATION = 0x0136; // Systech Corporation
	public static final int MFG_ID_TEAM_DIGITAL_LIMITED = 0x0186; // Team Digital Limited
	public static final int MFG_ID_TEAM_PRECISION_PCL = 0x0089; // Team Precision PCL
	public static final int MFG_ID_TECHNIKU = 0x000A; // Techniku
	public static final int MFG_ID_TECOM_CO_LTD = 0x012F; // Tecom Co., Ltd.
	public static final int MFG_ID_TELL_IT_ONLINE = 0x0012; // Tell It Online
	public static final int MFG_ID_TELLDUS_TECHNOLOGIES_AB = 0x0176; // Telldus Technologies AB
	public static final int MFG_ID_TELSEY = 0x0048; // Telsey
	public static final int MFG_ID_TELULAR = 0x017E; // Telular
	public static final int MFG_ID_TERRA_OPTIMA_BV_TIDLIGERE_PRIMAIR_SERVICES = 0x005C; // Terra Optima B.V. (tidligere
																						// Primair Services)
	public static final int MFG_ID_THERE_CORPORATION = 0x010C; // There Corporation
	public static final int MFG_ID_TKB_HOME = 0x0118; // TKB Home
	public static final int MFG_ID_TKH_GROUP_EMINENT = 0x011C; // TKH Group / Eminent
	public static final int MFG_ID_TRANE_CORPORATION = 0x008B; // Trane Corporation
	public static final int MFG_ID_TRICKLESTAR = 0x0066; // TrickleStar
	public static final int MFG_ID_TRICKLESTAR_LTD_EMPOWER_CONTROLS_LTD = 0x006B; // Tricklestar Ltd. (former Empower
																					// Controls Ltd.)
	public static final int MFG_ID_TRIDIUM = 0x0055; // Tridium
	public static final int MFG_ID_TWISTHINK = 0x0049; // Twisthink
	public static final int MFG_ID_UFAIRY_GR_TECH = 0x0152; // UFairy G.R. Tech
	public static final int MFG_ID_UNIVERSAL_ELECTRONICS_INC = 0x0020; // Universal Electronics Inc.
	public static final int MFG_ID_UNIVERSE_FUTURE = 0x0183; // Universe Future
	public static final int MFG_ID_VDA = 0x010A; // VDA
	public static final int MFG_ID_VERA_CONTROL = 0x008C; // Vera Control
	public static final int MFG_ID_VERO_DUCO = 0x0080; // Vero Duco
	public static final int MFG_ID_VIEWSONIC = 0x0053; // Viewsonic
	public static final int MFG_ID_VIEWSONIC_CORPORATION = 0x005E; // ViewSonic Corporation
	public static final int MFG_ID_VIMAR_CRS = 0x0007; // Vimar CRS
	public static final int MFG_ID_VIPASTAR = 0x0188; // Vipa-Star
	public static final int MFG_ID_VISION_SECURITY = 0x0109; // Vision Security
	public static final int MFG_ID_VISUALIZE = 0x004A; // Visualize
	public static final int MFG_ID_VITELEC = 0x0058; // Vitelec
	public static final int MFG_ID_VIVINT = 0x0156; // Vivbyte
	public static final int MFG_ID_VSSAFETY_AS = 0x017B; // Vs-Safety AS
	public static final int MFG_ID_WATT_STOPPER = 0x004B; // Watt Stopper
	public static final int MFG_ID_WAYNE_DALTON = 0x0008; // Wayne Dalton
	public static final int MFG_ID_WEBEHOME_AB = 0x0171; // WeBeHome AB
	public static final int MFG_ID_WENZHOU_MTLC_ELECTRIC_APPLIANCES_COLTD = 0x011A; // Wenzhou MTLC Electric Appliances
																					// Co.,Ltd.
	public static final int MFG_ID_WHIRLPOOL = 0x0057; // Whirlpool
	public static final int MFG_ID_WIDOM = 0x0149; // wiDom
	public static final int MFG_ID_WILLIS_ELECTRIC_CO_LTD = 0x015D; // Willis Electric Co., Ltd.
	public static final int MFG_ID_WILSHINE_HOLDING_CO_LTD = 0x012D; // Wilshine Holding Co., Ltd
	public static final int MFG_ID_WINK_INC = 0x017F; // Wink Inc.
	public static final int MFG_ID_WINTOP = 0x0097; // Wbyteop
	public static final int MFG_ID_WOODWARD_LABS = 0x004C; // Woodward Labs
	public static final int MFG_ID_WRAP = 0x0003; // Wr@p
	public static final int MFG_ID_WUHAN_NWD_TECHNOLOGY_CO_LTD = 0x012E; // Wuhan NWD Technology Co., Ltd.
	public static final int MFG_ID_XANBOO = 0x004D; // Xanboo
	public static final int MFG_ID_ZDATA_LLC = 0x004E; // Zdata, LLC.
	public static final int MFG_ID_ZHEJIANG_JIUXING_ELECTRIC_CO_LTD = 0x016F; // Zhejiang Jiuxing Electric Co Ltd
	public static final int MFG_ID_ZHOME = 0x0139; // Zhome
	public static final int MFG_ID_ZIPATO = 0x0131; // Zipato
	public static final int MFG_ID_ZONOFF = 0x0120; // Zonoff
	public static final int MFG_ID_ZWAVE_TECHNOLOGIA = 0x004F; // Z-Wave Technologia
	public static final int MFG_ID_ZWAVEME = 0x0115; // Z-Wave.Me
	public static final int MFG_ID_ZYKRONIX = 0x0021; // Zykronix
	public static final int MFG_ID_ZYXEL = 0x0135; // ZyXEL

	/*************** command class identifiers ****************/
	public static final byte COMMAND_CLASS_ALARM = 0x71;
	public static final byte COMMAND_CLASS_ALARM_V2 = 0x71;
	public static final byte COMMAND_CLASS_NOTIFICATION_V3 = 0x71;
	public static final byte COMMAND_CLASS_NOTIFICATION_V4 = 0x71;
	public static final byte COMMAND_CLASS_APPLICATION_STATUS = 0x22;
	public static final byte COMMAND_CLASS_ASSOCIATION_COMMAND_CONFIGURATION = (byte) 0x9B;
	public static final byte COMMAND_CLASS_ASSOCIATION = (byte) 0x85;
	public static final byte COMMAND_CLASS_ASSOCIATION_V2 = (byte) 0x85;
	public static final byte COMMAND_CLASS_AV_CONTENT_DIRECTORY_MD = (byte) 0x95;
	public static final byte COMMAND_CLASS_AV_CONTENT_SEARCH_MD = (byte) 0x97;
	public static final byte COMMAND_CLASS_AV_RENDERER_STATUS = (byte) 0x96;
	public static final byte COMMAND_CLASS_AV_TAGGING_MD = (byte) 0x99;
	public static final byte COMMAND_CLASS_BASIC_TARIFF_INFO = 0x36;
	public static final byte COMMAND_CLASS_BASIC_WINDOW_COVERING = 0x50;
	public static final byte COMMAND_CLASS_BASIC = 0x20;
	public static final byte COMMAND_CLASS_BATTERY = (byte) 0x80;
	public static final byte COMMAND_CLASS_CHIMNEY_FAN = 0x2A;
	public static final byte COMMAND_CLASS_CLIMATE_CONTROL_SCHEDULE = 0x46;
	public static final byte COMMAND_CLASS_CLOCK = (byte) 0x81;
	public static final byte COMMAND_CLASS_CONFIGURATION = 0x70;
	public static final byte COMMAND_CLASS_CONFIGURATION_V2 = 0x70;
	public static final byte COMMAND_CLASS_CONTROLLER_REPLICATION = 0x21;
	public static final byte COMMAND_CLASS_CRC_16_ENCAP = 0x56;
	public static final byte COMMAND_CLASS_DCP_CONFIG = 0x3A;
	public static final byte COMMAND_CLASS_DCP_MONITOR = 0x3B;
	public static final byte COMMAND_CLASS_DOOR_LOCK_LOGGING = 0x4C;
	public static final byte COMMAND_CLASS_DOOR_LOCK = 0x62;
	public static final byte COMMAND_CLASS_DOOR_LOCK_V2 = 0x62;
	public static final byte COMMAND_CLASS_ENERGY_PRODUCTION = (byte) 0x90;
	public static final byte COMMAND_CLASS_FIRMWARE_UPDATE_MD = 0x7A;
	public static final byte COMMAND_CLASS_FIRMWARE_UPDATE_MD_V2 = 0x7A;
	public static final byte COMMAND_CLASS_FIRMWARE_UPDATE_MD_V3 = 0x7A;
	public static final byte COMMAND_CLASS_GEOGRAPHIC_LOCATION = (byte) 0x8C;
	public static final byte COMMAND_CLASS_GROUPING_NAME = 0x7B;
	public static final byte COMMAND_CLASS_HAIL = (byte) 0x82;
	public static final byte COMMAND_CLASS_HRV_CONTROL = 0x39;
	public static final byte COMMAND_CLASS_HRV_STATUS = 0x37;
	public static final byte COMMAND_CLASS_INDICATOR = (byte) 0x87;
	public static final byte COMMAND_CLASS_IP_CONFIGURATION = (byte) 0x9A;
	public static final byte COMMAND_CLASS_LANGUAGE = (byte) 0x89;
	public static final byte COMMAND_CLASS_LOCK = 0x76;
	public static final byte COMMAND_CLASS_MANUFACTURER_PROPRIETARY = (byte) 0x91;
	public static final byte COMMAND_CLASS_MANUFACTURER_SPECIFIC = 0x72;
	public static final byte COMMAND_CLASS_MANUFACTURER_SPECIFIC_V2 = 0x72;
	public static final byte COMMAND_CLASS_MARK = (byte) 0xEF;
	public static final byte COMMAND_CLASS_METER_PULSE = 0x35;
	public static final byte COMMAND_CLASS_METER_TBL_CONFIG = 0x3C;
	public static final byte COMMAND_CLASS_METER_TBL_MONITOR = 0x3D;
	public static final byte COMMAND_CLASS_METER_TBL_MONITOR_V2 = 0x3D;
	public static final byte COMMAND_CLASS_METER_TBL_PUSH = 0x3E;
	public static final byte COMMAND_CLASS_METER = 0x32;
	public static final byte COMMAND_CLASS_METER_V2 = 0x32;
	public static final byte COMMAND_CLASS_METER_V3 = 0x32;
	public static final byte COMMAND_CLASS_METER_V4 = 0x32;
	public static final byte COMMAND_CLASS_MTP_WINDOW_COVERING = 0x51;
	public static final byte COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V2 = (byte) 0x8E;
	public static final byte COMMAND_CLASS_MULTI_CHANNEL_V2 = 0x60;
	public static final byte COMMAND_CLASS_MULTI_CHANNEL_V3 = 0x60;
	public static final byte COMMAND_CLASS_MULTI_CMD = (byte) 0x8F;
	public static final byte COMMAND_CLASS_MULTI_INSTANCE_ASSOCIATION = (byte) 0x8E; /* Discontinued */
	public static final byte COMMAND_CLASS_MULTI_INSTANCE = 0x60; /* Discontinued */
	public static final byte COMMAND_CLASS_NETWORK_MANAGEMENT_PROXY = 0x52;
	public static final byte COMMAND_CLASS_NETWORK_MANAGEMENT_BASIC = 0x4D;
	public static final byte COMMAND_CLASS_NETWORK_MANAGEMENT_INCLUSION = 0x34;
	public static final byte COMMAND_CLASS_NO_OPERATION = 0x00;
	public static final byte COMMAND_CLASS_NODE_NAMING = 0x77;
	public static final byte COMMAND_CLASS_NON_INTEROPERABLE = (byte) 0xF0;
	public static final byte COMMAND_CLASS_POWERLEVEL = 0x73;
	public static final byte COMMAND_CLASS_PREPAYMENT_ENCAPSULATION = 0x41;
	public static final byte COMMAND_CLASS_PREPAYMENT = 0x3F;
	public static final byte COMMAND_CLASS_PROPRIETARY = (byte) 0x88;
	public static final byte COMMAND_CLASS_PROTECTION = 0x75;
	public static final byte COMMAND_CLASS_PROTECTION_V2 = 0x75;
	public static final byte COMMAND_CLASS_RATE_TBL_CONFIG = 0x48;
	public static final byte COMMAND_CLASS_RATE_TBL_MONITOR = 0x49;
	public static final byte COMMAND_CLASS_REMOTE_ASSOCIATION_ACTIVATE = 0x7C;
	public static final byte COMMAND_CLASS_REMOTE_ASSOCIATION = 0x7D;
	public static final byte COMMAND_CLASS_SCENE_ACTIVATION = 0x2B;
	public static final byte COMMAND_CLASS_SCENE_ACTUATOR_CONF = 0x2C;
	public static final byte COMMAND_CLASS_SCENE_CONTROLLER_CONF = 0x2D;
	public static final byte COMMAND_CLASS_SCHEDULE_ENTRY_LOCK = 0x4E;
	public static final byte COMMAND_CLASS_SCHEDULE_ENTRY_LOCK_V2 = 0x4E;
	public static final byte COMMAND_CLASS_SCHEDULE_ENTRY_LOCK_V3 = 0x4E;
	public static final byte COMMAND_CLASS_SCREEN_ATTRIBUTES = (byte) 0x93;
	public static final byte COMMAND_CLASS_SCREEN_ATTRIBUTES_V2 = (byte) 0x93;
	public static final byte COMMAND_CLASS_SCREEN_MD = (byte) 0x92;
	public static final byte COMMAND_CLASS_SCREEN_MD_V2 = (byte) 0x92;
	public static final byte COMMAND_CLASS_SECURITY_PANEL_MODE = 0x24;
	public static final byte COMMAND_CLASS_SECURITY_PANEL_ZONE_SENSOR = 0x2F;
	public static final byte COMMAND_CLASS_SECURITY_PANEL_ZONE = 0x2E;
	public static final byte COMMAND_CLASS_SECURITY = (byte) 0x98;
	public static final byte COMMAND_CLASS_SENSOR_ALARM = (byte) 0x9C; /*
																		 * SDS10963-4 The Sensor Alarm command class can
																		 * be used to realize Sensor Alarms.
																		 */
	public static final byte COMMAND_CLASS_SENSOR_BINARY = 0x30;
	public static final byte COMMAND_CLASS_SENSOR_BINARY_V2 = 0x30;
	public static final byte COMMAND_CLASS_SENSOR_CONFIGURATION = (byte) 0x9E; /*
																				 * This command class adds the
																				 * possibility for sensors to act on
																				 * either a measured value or on a
																				 */
	public static final byte COMMAND_CLASS_SENSOR_MULTILEVEL = 0x31;
	public static final byte COMMAND_CLASS_SENSOR_MULTILEVEL_V2 = 0x31;
	public static final byte COMMAND_CLASS_SENSOR_MULTILEVEL_V3 = 0x31;
	public static final byte COMMAND_CLASS_SENSOR_MULTILEVEL_V4 = 0x31;
	public static final byte COMMAND_CLASS_SENSOR_MULTILEVEL_V5 = 0x31;
	public static final byte COMMAND_CLASS_SENSOR_MULTILEVEL_V6 = 0x31;
	public static final byte COMMAND_CLASS_SENSOR_MULTILEVEL_V7 = 0x31;
	public static final byte COMMAND_CLASS_SILENCE_ALARM = (byte) 0x9D; /*
																		 * SDS10963-4 The Alarm Silence command class
																		 * can be used to nuisance silence to
																		 * temporarily disable the sounding
																		 */
	public static final byte COMMAND_CLASS_SIMPLE_AV_CONTROL = (byte) 0x94;
	public static final byte COMMAND_CLASS_SWITCH_ALL = 0x27;
	public static final byte COMMAND_CLASS_SWITCH_BINARY = 0x25;
	public static final byte COMMAND_CLASS_SWITCH_MULTILEVEL = 0x26;
	public static final byte COMMAND_CLASS_SWITCH_MULTILEVEL_V2 = 0x26;
	public static final byte COMMAND_CLASS_SWITCH_MULTILEVEL_V3 = 0x26;
	public static final byte COMMAND_CLASS_SWITCH_TOGGLE_BINARY = 0x28;
	public static final byte COMMAND_CLASS_SWITCH_TOGGLE_MULTILEVEL = 0x29;
	public static final byte COMMAND_CLASS_TARIFF_CONFIG = 0x4A;
	public static final byte COMMAND_CLASS_TARIFF_TBL_MONITOR = 0x4B;
	public static final byte COMMAND_CLASS_THERMOSTAT_FAN_MODE = 0x44;
	public static final byte COMMAND_CLASS_THERMOSTAT_FAN_MODE_V2 = 0x44;
	public static final byte COMMAND_CLASS_THERMOSTAT_FAN_MODE_V3 = 0x44;
	public static final byte COMMAND_CLASS_THERMOSTAT_FAN_MODE_V4 = 0x44;
	public static final byte COMMAND_CLASS_THERMOSTAT_FAN_STATE = 0x45;
	public static final byte COMMAND_CLASS_THERMOSTAT_FAN_STATE_V2 = 0x45;
	public static final byte COMMAND_CLASS_THERMOSTAT_HEATING = 0x38;
	public static final byte COMMAND_CLASS_THERMOSTAT_MODE = 0x40;
	public static final byte COMMAND_CLASS_THERMOSTAT_MODE_V2 = 0x40;
	public static final byte COMMAND_CLASS_THERMOSTAT_MODE_V3 = 0x40;
	public static final byte COMMAND_CLASS_THERMOSTAT_OPERATING_STATE = 0x42;
	public static final byte COMMAND_CLASS_THERMOSTAT_OPERATING_STATE_V2 = 0x42;
	public static final byte COMMAND_CLASS_THERMOSTAT_SETBACK = 0x47;
	public static final byte COMMAND_CLASS_THERMOSTAT_SETPOINT = 0x43;
	public static final byte COMMAND_CLASS_THERMOSTAT_SETPOINT_V2 = 0x43;
	public static final byte COMMAND_CLASS_THERMOSTAT_SETPOINT_V3 = 0x43;
	public static final byte COMMAND_CLASS_TIME_PARAMETERS = (byte) 0x8B;
	public static final byte COMMAND_CLASS_TIME = (byte) 0x8A;
	public static final byte COMMAND_CLASS_TIME_V2 = (byte) 0x8A;
	public static final byte COMMAND_CLASS_TRANSPORT_SERVICE = 0x55;
	public static final byte COMMAND_CLASS_TRANSPORT_SERVICE_V2 = 0x55;
	public static final byte COMMAND_CLASS_USER_CODE = 0x63;
	public static final byte COMMAND_CLASS_VERSION = (byte) 0x86;
	public static final byte COMMAND_CLASS_VERSION_V2 = (byte) 0x86;
	public static final byte COMMAND_CLASS_WAKE_UP = (byte) 0x84;
	public static final byte COMMAND_CLASS_WAKE_UP_V2 = (byte) 0x84;
	public static final byte COMMAND_CLASS_ZIP_6LOWPAN = 0x4F;
	public static final byte COMMAND_CLASS_ZIP = 0x23;
	public static final byte COMMAND_CLASS_ZIP_V2 = 0x23;
	public static final byte COMMAND_CLASS_APPLICATION_CAPABILITY = 0x57;
	public static final byte COMMAND_CLASS_SWITCH_COLOR = 0x33;
	public static final byte COMMAND_CLASS_SWITCH_COLOR_V2 = 0x33;
	public static final byte COMMAND_CLASS_SCHEDULE = 0x53;
	public static final byte COMMAND_CLASS_NETWORK_MANAGEMENT_PRIMARY = 0x54;
	public static final byte COMMAND_CLASS_ZIP_ND = 0x58;
	public static final byte COMMAND_CLASS_ASSOCIATION_GRP_INFO = 0x59;
	public static final byte COMMAND_CLASS_DEVICE_RESET_LOCALLY = 0x5A;
	public static final byte COMMAND_CLASS_CENTRAL_SCENE = 0x5B;
	public static final byte COMMAND_CLASS_IP_ASSOCIATION = 0x5C;
	public static final byte COMMAND_CLASS_ANTITHEFT = 0x5D;
	public static final byte COMMAND_CLASS_ANTITHEFT_V2 = 0x5D;
	public static final byte COMMAND_CLASS_ZWAVEPLUS_INFO = 0x5E; /* SDS11907-3 */
	public static final byte COMMAND_CLASS_ZWAVEPLUS_INFO_V2 = 0x5E; /* SDS11907-3 */
	public static final byte COMMAND_CLASS_ZIP_GATEWAY = 0x5F;
	public static final byte COMMAND_CLASS_ZIP_PORTAL = 0x61;
	public static final byte COMMAND_CLASS_APPLIANCE = 0x64;
	public static final byte COMMAND_CLASS_DMX = 0x65;
	public static final byte COMMAND_CLASS_BARRIER_OPERATOR = 0x66;

	/*************** command class extended identifiers ****************/
	public static final int COMMAND_CLASS_SECURITY_SCHEME0_MARK = 0xF100;

	/* Unknown command class commands */
	public static final byte UNKNOWN_VERSION = 0x00;

	/* Alarm command class commands */
	public static final byte ALARM_VERSION = 0x01;
	public static final byte ALARM_GET = 0x04;
	public static final byte ALARM_REPORT = 0x05;

	/* Alarm command class commands */
	public static final byte ALARM_VERSION_V2 = 0x02;
	public static final byte ALARM_GET_V2 = 0x04;
	public static final byte ALARM_REPORT_V2 = 0x05;
	public static final byte ALARM_SET_V2 = 0x06;
	public static final byte ALARM_TYPE_SUPPORTED_GET_V2 = 0x07;
	public static final byte ALARM_TYPE_SUPPORTED_REPORT_V2 = 0x08;
	/* Values used for Alarm Get command */
	public static final byte ALARM_GET_RESERVED_V2 = 0x00;
	public static final byte ALARM_GET_SMOKE_V2 = 0x01;
	public static final byte ALARM_GET_CO_V2 = 0x02;
	public static final byte ALARM_GET_CO2_V2 = 0x03;
	public static final byte ALARM_GET_HEAT_V2 = 0x04;
	public static final byte ALARM_GET_WATER_V2 = 0x05;
	public static final byte ALARM_GET_ACCESS_CONTROL_V2 = 0x06;
	public static final byte ALARM_GET_BURGLAR_V2 = 0x07;
	public static final byte ALARM_GET_POWER_MANAGEMENT_V2 = 0x08;
	public static final byte ALARM_GET_SYSTEM_V2 = 0x09;
	public static final byte ALARM_GET_EMERGENCY_V2 = 0x0A;
	public static final byte ALARM_GET_CLOCK_V2 = 0x0B;
	public static final byte ALARM_GET_FIRST_V2 = (byte) 0xFF;
	/* Values used for Alarm Report command */
	public static final byte ALARM_REPORT_RESERVED_V2 = 0x00;
	public static final byte ALARM_REPORT_SMOKE_V2 = 0x01;
	public static final byte ALARM_REPORT_CO_V2 = 0x02;
	public static final byte ALARM_REPORT_CO2_V2 = 0x03;
	public static final byte ALARM_REPORT_HEAT_V2 = 0x04;
	public static final byte ALARM_REPORT_WATER_V2 = 0x05;
	public static final byte ALARM_REPORT_ACCESS_CONTROL_V2 = 0x06;
	public static final byte ALARM_REPORT_BURGLAR_V2 = 0x07;
	public static final byte ALARM_REPORT_POWER_MANAGEMENT_V2 = 0x08;
	public static final byte ALARM_REPORT_SYSTEM_V2 = 0x09;
	public static final byte ALARM_REPORT_EMERGENCY_V2 = 0x0A;
	public static final byte ALARM_REPORT_CLOCK_V2 = 0x0B;
	public static final byte ALARM_REPORT_FIRST_V2 = (byte) 0xFF;
	/* Values used for Alarm Set command */
	public static final byte ALARM_SET_RESERVED_V2 = 0x00;
	public static final byte ALARM_SET_SMOKE_V2 = 0x01;
	public static final byte ALARM_SET_CO_V2 = 0x02;
	public static final byte ALARM_SET_CO2_V2 = 0x03;
	public static final byte ALARM_SET_HEAT_V2 = 0x04;
	public static final byte ALARM_SET_WATER_V2 = 0x05;
	public static final byte ALARM_SET_ACCESS_CONTROL_V2 = 0x06;
	public static final byte ALARM_SET_BURGLAR_V2 = 0x07;
	public static final byte ALARM_SET_POWER_MANAGEMENT_V2 = 0x08;
	public static final byte ALARM_SET_SYSTEM_V2 = 0x09;
	public static final byte ALARM_SET_EMERGENCY_V2 = 0x0A;
	public static final byte ALARM_SET_CLOCK_V2 = 0x0B;
	public static final byte ALARM_SET_FIRST_V2 = (byte) 0xFF;
	/* Values used for Alarm Type Supported Report command */
	public static final byte ALARM_TYPE_SUPPORTED_REPORT_PROPERTIES1_NUMBER_OF_BIT_MASKS_MASK_V2 = 0x1F;
	public static final byte ALARM_TYPE_SUPPORTED_REPORT_PROPERTIES1_RESERVED_MASK_V2 = 0x60;
	public static final byte ALARM_TYPE_SUPPORTED_REPORT_PROPERTIES1_RESERVED_SHIFT_V2 = 0x05;
	public static final byte ALARM_TYPE_SUPPORTED_REPORT_PROPERTIES1_V1_ALARM_BIT_MASK_V2 = (byte) 0x80;

	/* Notification command class commands */
	public static final byte NOTIFICATION_VERSION_V3 = 0x03;
	public static final byte NOTIFICATION_GET_V3 = 0x04;
	public static final byte NOTIFICATION_REPORT_V3 = 0x05;
	public static final byte NOTIFICATION_SET_V3 = 0x06;
	public static final byte NOTIFICATION_SUPPORTED_GET_V3 = 0x07;
	public static final byte NOTIFICATION_SUPPORTED_REPORT_V3 = 0x08;
	public static final byte EVENT_SUPPORTED_GET_V3 = 0x01;
	public static final byte EVENT_SUPPORTED_REPORT_V3 = 0x02;
	/* Values used for Notification Get command */
	public static final byte NOTIFICATION_GET_RESERVED_V3 = 0x00;
	public static final byte NOTIFICATION_GET_SMOKE_V3 = 0x01;
	public static final byte NOTIFICATION_GET_CO_V3 = 0x02;
	public static final byte NOTIFICATION_GET_CO2_V3 = 0x03;
	public static final byte NOTIFICATION_GET_HEAT_V3 = 0x04;
	public static final byte NOTIFICATION_GET_WATER_V3 = 0x05;
	public static final byte NOTIFICATION_GET_ACCESS_CONTROL_V3 = 0x06;
	public static final byte NOTIFICATION_GET_BURGLAR_V3 = 0x07;
	public static final byte NOTIFICATION_GET_POWER_MANAGEMENT_V3 = 0x08;
	public static final byte NOTIFICATION_GET_SYSTEM_V3 = 0x09;
	public static final byte NOTIFICATION_GET_EMERGENCY_V3 = 0x0A;
	public static final byte NOTIFICATION_GET_CLOCK_V3 = 0x0B;
	public static final byte NOTIFICATION_GET_FIRST_V3 = (byte) 0xFF;
	/* Values used for Notification Report command */
	public static final byte NOTIFICATION_REPORT_RESERVED_V3 = 0x00;
	public static final byte NOTIFICATION_REPORT_SMOKE_V3 = 0x01;
	public static final byte NOTIFICATION_REPORT_CO_V3 = 0x02;
	public static final byte NOTIFICATION_REPORT_CO2_V3 = 0x03;
	public static final byte NOTIFICATION_REPORT_HEAT_V3 = 0x04;
	public static final byte NOTIFICATION_REPORT_WATER_V3 = 0x05;
	public static final byte NOTIFICATION_REPORT_ACCESS_CONTROL_V3 = 0x06;
	public static final byte NOTIFICATION_REPORT_BURGLAR_V3 = 0x07;
	public static final byte NOTIFICATION_REPORT_POWER_MANAGEMENT_V3 = 0x08;
	public static final byte NOTIFICATION_REPORT_SYSTEM_V3 = 0x09;
	public static final byte NOTIFICATION_REPORT_EMERGENCY_V3 = 0x0A;
	public static final byte NOTIFICATION_REPORT_CLOCK_V3 = 0x0B;
	public static final byte NOTIFICATION_REPORT_FIRST_V3 = (byte) 0xFF;
	public static final byte NOTIFICATION_REPORT_PROPERTIES1_EVENT_PARAMETERS_LENGTH_MASK_V3 = 0x1F;
	public static final byte NOTIFICATION_REPORT_PROPERTIES1_RESERVED_MASK_V3 = 0x60;
	public static final byte NOTIFICATION_REPORT_PROPERTIES1_RESERVED_SHIFT_V3 = 0x05;
	public static final byte NOTIFICATION_REPORT_PROPERTIES1_SEQUENCE_BIT_MASK_V3 = (byte) 0x80;
	/* Values used for Notification Set command */
	public static final byte NOTIFICATION_SET_RESERVED_V3 = 0x00;
	public static final byte NOTIFICATION_SET_SMOKE_V3 = 0x01;
	public static final byte NOTIFICATION_SET_CO_V3 = 0x02;
	public static final byte NOTIFICATION_SET_CO2_V3 = 0x03;
	public static final byte NOTIFICATION_SET_HEAT_V3 = 0x04;
	public static final byte NOTIFICATION_SET_WATER_V3 = 0x05;
	public static final byte NOTIFICATION_SET_ACCESS_CONTROL_V3 = 0x06;
	public static final byte NOTIFICATION_SET_BURGLAR_V3 = 0x07;
	public static final byte NOTIFICATION_SET_POWER_MANAGEMENT_V3 = 0x08;
	public static final byte NOTIFICATION_SET_SYSTEM_V3 = 0x09;
	public static final byte NOTIFICATION_SET_EMERGENCY_V3 = 0x0A;
	public static final byte NOTIFICATION_SET_CLOCK_V3 = 0x0B;
	public static final byte NOTIFICATION_SET_FIRST_V3 = (byte) 0xFF;
	/* Values used for Notification Supported Report command */
	public static final byte NOTIFICATION_SUPPORTED_REPORT_PROPERTIES1_NUMBER_OF_BIT_MASKS_MASK_V3 = 0x1F;
	public static final byte NOTIFICATION_SUPPORTED_REPORT_PROPERTIES1_RESERVED_MASK_V3 = 0x60;
	public static final byte NOTIFICATION_SUPPORTED_REPORT_PROPERTIES1_RESERVED_SHIFT_V3 = 0x05;
	public static final byte NOTIFICATION_SUPPORTED_REPORT_PROPERTIES1_V1_ALARM_BIT_MASK_V3 = (byte) 0x80;
	/* Values used for Event Supported Get command */
	public static final byte EVENT_SUPPORTED_GET_RESERVED_V3 = 0x00;
	public static final byte EVENT_SUPPORTED_GET_SMOKE_V3 = 0x01;
	public static final byte EVENT_SUPPORTED_GET_CO_V3 = 0x02;
	public static final byte EVENT_SUPPORTED_GET_CO2_V3 = 0x03;
	public static final byte EVENT_SUPPORTED_GET_HEAT_V3 = 0x04;
	public static final byte EVENT_SUPPORTED_GET_WATER_V3 = 0x05;
	public static final byte EVENT_SUPPORTED_GET_ACCESS_CONTROL_V3 = 0x06;
	public static final byte EVENT_SUPPORTED_GET_BURGLAR_V3 = 0x07;
	public static final byte EVENT_SUPPORTED_GET_POWER_MANAGEMENT_V3 = 0x08;
	public static final byte EVENT_SUPPORTED_GET_SYSTEM_V3 = 0x09;
	public static final byte EVENT_SUPPORTED_GET_EMERGENCY_V3 = 0x0A;
	public static final byte EVENT_SUPPORTED_GET_CLOCK_V3 = 0x0B;
	public static final byte EVENT_SUPPORTED_GET_FIRST_V3 = (byte) 0xFF;
	/* Values used for Event Supported Report command */
	public static final byte EVENT_SUPPORTED_REPORT_RESERVED_V3 = 0x00;
	public static final byte EVENT_SUPPORTED_REPORT_SMOKE_V3 = 0x01;
	public static final byte EVENT_SUPPORTED_REPORT_CO_V3 = 0x02;
	public static final byte EVENT_SUPPORTED_REPORT_CO2_V3 = 0x03;
	public static final byte EVENT_SUPPORTED_REPORT_HEAT_V3 = 0x04;
	public static final byte EVENT_SUPPORTED_REPORT_WATER_V3 = 0x05;
	public static final byte EVENT_SUPPORTED_REPORT_ACCESS_CONTROL_V3 = 0x06;
	public static final byte EVENT_SUPPORTED_REPORT_BURGLAR_V3 = 0x07;
	public static final byte EVENT_SUPPORTED_REPORT_POWER_MANAGEMENT_V3 = 0x08;
	public static final byte EVENT_SUPPORTED_REPORT_SYSTEM_V3 = 0x09;
	public static final byte EVENT_SUPPORTED_REPORT_EMERGENCY_V3 = 0x0A;
	public static final byte EVENT_SUPPORTED_REPORT_CLOCK_V3 = 0x0B;
	public static final byte EVENT_SUPPORTED_REPORT_FIRST_V3 = (byte) 0xFF;
	public static final byte EVENT_SUPPORTED_REPORT_PROPERTIES1_NUMBER_OF_BIT_MASKS_MASK_V3 = 0x1F;
	public static final byte EVENT_SUPPORTED_REPORT_PROPERTIES1_RESERVED_MASK_V3 = (byte) 0xE0;
	public static final byte EVENT_SUPPORTED_REPORT_PROPERTIES1_RESERVED_SHIFT_V3 = 0x05;

	/* Notification command class commands */
	public static final byte NOTIFICATION_VERSION_V4 = 0x04;
	public static final byte NOTIFICATION_GET_V4 = 0x04;
	public static final byte NOTIFICATION_REPORT_V4 = 0x05;
	public static final byte NOTIFICATION_SET_V4 = 0x06;
	public static final byte NOTIFICATION_SUPPORTED_GET_V4 = 0x07;
	public static final byte NOTIFICATION_SUPPORTED_REPORT_V4 = 0x08;
	public static final byte EVENT_SUPPORTED_GET_V4 = 0x01;
	public static final byte EVENT_SUPPORTED_REPORT_V4 = 0x02;
	/* Values used for Notification Get command */
	public static final byte NOTIFICATION_GET_RESERVED_V4 = 0x00;
	public static final byte NOTIFICATION_GET_SMOKE_V4 = 0x01;
	public static final byte NOTIFICATION_GET_CO_V4 = 0x02;
	public static final byte NOTIFICATION_GET_CO2_V4 = 0x03;
	public static final byte NOTIFICATION_GET_HEAT_V4 = 0x04;
	public static final byte NOTIFICATION_GET_WATER_V4 = 0x05;
	public static final byte NOTIFICATION_GET_ACCESS_CONTROL_V4 = 0x06;
	public static final byte NOTIFICATION_GET_HOME_SECURITY_V4 = 0x07;
	public static final byte NOTIFICATION_GET_POWER_MANAGEMENT_V4 = 0x08;
	public static final byte NOTIFICATION_GET_SYSTEM_V4 = 0x09;
	public static final byte NOTIFICATION_GET_EMERGENCY_V4 = 0x0A;
	public static final byte NOTIFICATION_GET_CLOCK_V4 = 0x0B;
	public static final byte NOTIFICATION_GET_APPLIANCE_V4 = 0x0C;
	public static final byte NOTIFICATION_GET_HOME_HEALTH_V4 = 0x0D;
	public static final byte NOTIFICATION_GET_FIRST_V4 = (byte) 0xFF;
	/* Values used for Notification Report command */
	public static final byte NOTIFICATION_REPORT_OFF_V4 = 0x00;
	public static final byte NOTIFICATION_REPORT_NO_PENDING_NOTIFICATIONS_V4 = (byte) 0xFE;
	public static final byte NOTIFICATION_REPORT_ON_V4 = (byte) 0xFF;
	public static final byte NOTIFICATION_REPORT_RESERVED_V4 = 0x00;
	public static final byte NOTIFICATION_REPORT_SMOKE_V4 = 0x01;
	public static final byte NOTIFICATION_REPORT_CO_V4 = 0x02;
	public static final byte NOTIFICATION_REPORT_CO2_V4 = 0x03;
	public static final byte NOTIFICATION_REPORT_HEAT_V4 = 0x04;
	public static final byte NOTIFICATION_REPORT_WATER_V4 = 0x05;
	public static final byte NOTIFICATION_REPORT_ACCESS_CONTROL_V4 = 0x06;
	public static final byte NOTIFICATION_REPORT_HOME_SECURITY_V4 = 0x07;
	public static final byte NOTIFICATION_REPORT_POWER_MANAGEMENT_V4 = 0x08;
	public static final byte NOTIFICATION_REPORT_SYSTEM_V4 = 0x09;
	public static final byte NOTIFICATION_REPORT_EMERGENCY_V4 = 0x0A;
	public static final byte NOTIFICATION_REPORT_CLOCK_V4 = 0x0B;
	public static final byte NOTIFICATION_REPORT_APPLIANCE_V4 = 0x0C;
	public static final byte NOTIFICATION_REPORT_HOME_HEALTH_V4 = 0x0D;
	public static final byte NOTIFICATION_REPORT_FIRST_V4 = (byte) 0xFF;
	public static final byte NOTIFICATION_REPORT_PROPERTIES1_EVENT_PARAMETERS_LENGTH_MASK_V4 = 0x1F;
	public static final byte NOTIFICATION_REPORT_PROPERTIES1_RESERVED_MASK_V4 = 0x60;
	public static final byte NOTIFICATION_REPORT_PROPERTIES1_RESERVED_SHIFT_V4 = 0x05;
	public static final byte NOTIFICATION_REPORT_PROPERTIES1_SEQUENCE_BIT_MASK_V4 = (byte) 0x80;
	/* Values used for Notification Set command */
	public static final byte NOTIFICATION_SET_RESERVED_V4 = 0x00;
	public static final byte NOTIFICATION_SET_SMOKE_V4 = 0x01;
	public static final byte NOTIFICATION_SET_CO_V4 = 0x02;
	public static final byte NOTIFICATION_SET_CO2_V4 = 0x03;
	public static final byte NOTIFICATION_SET_HEAT_V4 = 0x04;
	public static final byte NOTIFICATION_SET_WATER_V4 = 0x05;
	public static final byte NOTIFICATION_SET_ACCESS_CONTROL_V4 = 0x06;
	public static final byte NOTIFICATION_SET_HOME_SECURITY_V4 = 0x07;
	public static final byte NOTIFICATION_SET_POWER_MANAGEMENT_V4 = 0x08;
	public static final byte NOTIFICATION_SET_SYSTEM_V4 = 0x09;
	public static final byte NOTIFICATION_SET_EMERGENCY_V4 = 0x0A;
	public static final byte NOTIFICATION_SET_CLOCK_V4 = 0x0B;
	public static final byte NOTIFICATION_SET_APPLIANCE_V4 = 0x0C;
	public static final byte NOTIFICATION_SET_HOME_HEALTH_V4 = 0x0D;
	public static final byte NOTIFICATION_SET_FIRST_V4 = (byte) 0xFF;
	public static final byte NOTIFICATION_SET_OFF_V4 = 0x00;
	public static final byte NOTIFICATION_SET_NO_PENDING_NOTIFICATIONS_V4 = (byte) 0xFE;
	public static final byte NOTIFICATION_SET_ON_V4 = (byte) 0xFF;
	/* Values used for Notification Supported Report command */
	public static final byte NOTIFICATION_SUPPORTED_REPORT_PROPERTIES1_NUMBER_OF_BIT_MASKS_MASK_V4 = 0x1F;
	public static final byte NOTIFICATION_SUPPORTED_REPORT_PROPERTIES1_RESERVED_MASK_V4 = 0x60;
	public static final byte NOTIFICATION_SUPPORTED_REPORT_PROPERTIES1_RESERVED_SHIFT_V4 = 0x05;
	public static final byte NOTIFICATION_SUPPORTED_REPORT_PROPERTIES1_V1_ALARM_BIT_MASK_V4 = (byte) 0x80;
	/* Values used for Event Supported Get command */
	public static final byte EVENT_SUPPORTED_GET_RESERVED_V4 = 0x00;
	public static final byte EVENT_SUPPORTED_GET_SMOKE_V4 = 0x01;
	public static final byte EVENT_SUPPORTED_GET_CO_V4 = 0x02;
	public static final byte EVENT_SUPPORTED_GET_CO2_V4 = 0x03;
	public static final byte EVENT_SUPPORTED_GET_HEAT_V4 = 0x04;
	public static final byte EVENT_SUPPORTED_GET_WATER_V4 = 0x05;
	public static final byte EVENT_SUPPORTED_GET_ACCESS_CONTROL_V4 = 0x06;
	public static final byte EVENT_SUPPORTED_GET_HOME_SECURITY_V4 = 0x07;
	public static final byte EVENT_SUPPORTED_GET_POWER_MANAGEMENT_V4 = 0x08;
	public static final byte EVENT_SUPPORTED_GET_SYSTEM_V4 = 0x09;
	public static final byte EVENT_SUPPORTED_GET_EMERGENCY_V4 = 0x0A;
	public static final byte EVENT_SUPPORTED_GET_CLOCK_V4 = 0x0B;
	public static final byte EVENT_SUPPORTED_GET_APPLIANCE_V4 = 0x0C;
	public static final byte EVENT_SUPPORTED_GET_HOME_HEALTH_V4 = 0x0D;
	public static final byte EVENT_SUPPORTED_GET_FIRST_V4 = (byte) 0xFF;
	/* Values used for Event Supported Report command */
	public static final byte EVENT_SUPPORTED_REPORT_RESERVED_V4 = 0x00;
	public static final byte EVENT_SUPPORTED_REPORT_SMOKE_V4 = 0x01;
	public static final byte EVENT_SUPPORTED_REPORT_CO_V4 = 0x02;
	public static final byte EVENT_SUPPORTED_REPORT_CO2_V4 = 0x03;
	public static final byte EVENT_SUPPORTED_REPORT_HEAT_V4 = 0x04;
	public static final byte EVENT_SUPPORTED_REPORT_WATER_V4 = 0x05;
	public static final byte EVENT_SUPPORTED_REPORT_ACCESS_CONTROL_V4 = 0x06;
	public static final byte EVENT_SUPPORTED_REPORT_HOME_SECURITY_V4 = 0x07;
	public static final byte EVENT_SUPPORTED_REPORT_POWER_MANAGEMENT_V4 = 0x08;
	public static final byte EVENT_SUPPORTED_REPORT_SYSTEM_V4 = 0x09;
	public static final byte EVENT_SUPPORTED_REPORT_EMERGENCY_V4 = 0x0A;
	public static final byte EVENT_SUPPORTED_REPORT_CLOCK_V4 = 0x0B;
	public static final byte EVENT_SUPPORTED_REPORT_APPLIANCE_V4 = 0x0C;
	public static final byte EVENT_SUPPORTED_REPORT_HOME_HEALTH_V4 = 0x0D;
	public static final byte EVENT_SUPPORTED_REPORT_FIRST_V4 = (byte) 0xFF;
	public static final byte EVENT_SUPPORTED_REPORT_PROPERTIES1_NUMBER_OF_BIT_MASKS_MASK_V4 = 0x1F;
	public static final byte EVENT_SUPPORTED_REPORT_PROPERTIES1_RESERVED_MASK_V4 = (byte) 0xE0;
	public static final byte EVENT_SUPPORTED_REPORT_PROPERTIES1_RESERVED_SHIFT_V4 = 0x05;

	/* Application Status command class commands */
	public static final byte APPLICATION_STATUS_VERSION = 0x01;
	public static final byte APPLICATION_BUSY = 0x01;
	public static final byte APPLICATION_REJECTED_REQUEST = 0x02;
	/* Values used for Application Busy command */
	public static final byte APPLICATION_BUSY_TRY_AGAIN_LATER = 0x00;
	public static final byte APPLICATION_BUSY_TRY_AGAIN_IN_WAIT_TIME_SECONDS = 0x01;
	public static final byte APPLICATION_BUSY_REQUEST_QUEUED_EXECUTED_LATER = 0x02;

	/* Association Command Configuration command class commands */
	public static final byte ASSOCIATION_COMMAND_CONFIGURATION_VERSION = 0x01;
	public static final byte COMMAND_CONFIGURATION_GET = 0x04;
	public static final byte COMMAND_CONFIGURATION_REPORT = 0x05;
	public static final byte COMMAND_CONFIGURATION_SET = 0x03;
	public static final byte COMMAND_RECORDS_SUPPORTED_GET = 0x01;
	public static final byte COMMAND_RECORDS_SUPPORTED_REPORT = 0x02;
	/* Values used for Command Configuration Report command */
	public static final byte COMMAND_CONFIGURATION_REPORT_PROPERTIES1_REPORTS_TO_FOLLOW_MASK = 0x0F;
	public static final byte COMMAND_CONFIGURATION_REPORT_PROPERTIES1_RESERVED_MASK = 0x70;
	public static final byte COMMAND_CONFIGURATION_REPORT_PROPERTIES1_RESERVED_SHIFT = 0x04;
	public static final byte COMMAND_CONFIGURATION_REPORT_PROPERTIES1_FIRST_BIT_MASK = (byte) 0x80;
	/* Values used for Command Records Supported Report command */
	public static final byte COMMAND_RECORDS_SUPPORTED_REPORT_PROPERTIES1_CONF_CMD_BIT_MASK = 0x01;
	public static final byte COMMAND_RECORDS_SUPPORTED_REPORT_PROPERTIES1_V_C_BIT_MASK = 0x02;
	public static final byte COMMAND_RECORDS_SUPPORTED_REPORT_PROPERTIES1_MAX_COMMAND_LENGTH_MASK = (byte) 0xFC;
	public static final byte COMMAND_RECORDS_SUPPORTED_REPORT_PROPERTIES1_MAX_COMMAND_LENGTH_SHIFT = 0x02;

	/* Association command class commands */
	public static final byte ASSOCIATION_VERSION = 0x01;
	public static final byte ASSOCIATION_GET = 0x02;
	public static final byte ASSOCIATION_GROUPINGS_GET = 0x05;
	public static final byte ASSOCIATION_GROUPINGS_REPORT = 0x06;
	public static final byte ASSOCIATION_REMOVE = 0x04;
	public static final byte ASSOCIATION_REPORT = 0x03;
	public static final byte ASSOCIATION_SET = 0x01;

	/* Association command class commands */
	public static final byte ASSOCIATION_VERSION_V2 = 0x02;
	public static final byte ASSOCIATION_GET_V2 = 0x02;
	public static final byte ASSOCIATION_GROUPINGS_GET_V2 = 0x05;
	public static final byte ASSOCIATION_GROUPINGS_REPORT_V2 = 0x06;
	public static final byte ASSOCIATION_REMOVE_V2 = 0x04;
	public static final byte ASSOCIATION_REPORT_V2 = 0x03;
	public static final byte ASSOCIATION_SET_V2 = 0x01;
	public static final byte ASSOCIATION_SPECIFIC_GROUP_GET_V2 = 0x0B;
	public static final byte ASSOCIATION_SPECIFIC_GROUP_REPORT_V2 = 0x0C;

	/* Av Content Directory Md command class commands */
	public static final byte AV_CONTENT_DIRECTORY_MD_VERSION = 0x01;
	public static final byte AV_CONTENT_BROWSE_MD_BY_LETTER_GET = 0x03;
	public static final byte AV_CONTENT_BROWSE_MD_BY_LETTER_REPORT = 0x04;
	public static final byte AV_CONTENT_BROWSE_MD_CHILD_COUNT_GET = 0x05;
	public static final byte AV_CONTENT_BROWSE_MD_CHILD_COUNT_REPORT = 0x06;
	public static final byte AV_CONTENT_BROWSE_MD_GET = 0x01;
	public static final byte AV_CONTENT_BROWSE_MD_REPORT = 0x02;
	public static final byte AV_MATCH_ITEM_TO_RENDERER_MD_GET = 0x07;
	public static final byte AV_MATCH_ITEM_TO_RENDERER_MD_REPORT = 0x08;

	/* Av Content Search Md command class commands */
	public static final byte AV_CONTENT_SEARCH_MD_VERSION = 0x01;
	public static final byte AV_CONTENT_SEARCH_MD_GET = 0x01;
	public static final byte AV_CONTENT_SEARCH_MD_REPORT = 0x02;

	/* Av Renderer Status command class commands */
	public static final byte AV_RENDERER_STATUS_VERSION = 0x01;
	public static final byte AV_RENDERER_STATUS_GET = 0x01;
	public static final byte AV_RENDERER_STATUS_REPORT = 0x02;

	/* Av Tagging Md command class commands */
	public static final byte AV_TAGGING_MD_VERSION = 0x01;
	public static final byte AV_TAGGING_MD_GET = 0x01;
	public static final byte AV_TAGGING_MD_REPORT = 0x02;

	/* Basic Tariff Info command class commands */
	public static final byte BASIC_TARIFF_INFO_VERSION = 0x01;
	public static final byte BASIC_TARIFF_INFO_GET = 0x01;
	public static final byte BASIC_TARIFF_INFO_REPORT = 0x02;
	/* Values used for Basic Tariff Info Report command */
	public static final byte BASIC_TARIFF_INFO_REPORT_PROPERTIES1_TOTAL_NO_IMPORT_RATES_MASK = 0x0F;
	public static final byte BASIC_TARIFF_INFO_REPORT_PROPERTIES1_RESERVED_MASK = 0x70;
	public static final byte BASIC_TARIFF_INFO_REPORT_PROPERTIES1_RESERVED_SHIFT = 0x04;
	public static final byte BASIC_TARIFF_INFO_REPORT_PROPERTIES1_DUAL_BIT_MASK = (byte) 0x80;
	public static final byte BASIC_TARIFF_INFO_REPORT_PROPERTIES2_E1_CURRENT_RATE_IN_USE_MASK = 0x0F;
	public static final byte BASIC_TARIFF_INFO_REPORT_PROPERTIES2_RESERVED_MASK = (byte) 0xF0;
	public static final byte BASIC_TARIFF_INFO_REPORT_PROPERTIES2_RESERVED_SHIFT = 0x04;
	public static final byte BASIC_TARIFF_INFO_REPORT_PROPERTIES3_E2_CURRENT_RATE_IN_USE_MASK = 0x0F;
	public static final byte BASIC_TARIFF_INFO_REPORT_PROPERTIES3_RESERVED_MASK = (byte) 0xF0;
	public static final byte BASIC_TARIFF_INFO_REPORT_PROPERTIES3_RESERVED_SHIFT = 0x04;

	/* Basic Window Covering command class commands */
	public static final byte BASIC_WINDOW_COVERING_VERSION = 0x01;
	public static final byte BASIC_WINDOW_COVERING_START_LEVEL_CHANGE = 0x01;
	public static final byte BASIC_WINDOW_COVERING_STOP_LEVEL_CHANGE = 0x02;
	/* Values used for Basic Window Covering Start Level Change command */
	public static final byte BASIC_WINDOW_COVERING_START_LEVEL_CHANGE_LEVEL_RESERVED1_MASK = 0x3F;
	public static final byte BASIC_WINDOW_COVERING_START_LEVEL_CHANGE_LEVEL_OPEN_CLOSE_BIT_MASK = 0x40;
	public static final byte BASIC_WINDOW_COVERING_START_LEVEL_CHANGE_LEVEL_RESERVED2_BIT_MASK = (byte) 0x80;

	/* Basic command class commands */
	public static final byte BASIC_VERSION = 0x01;
	public static final byte BASIC_GET = 0x02;
	public static final byte BASIC_REPORT = 0x03;
	public static final byte BASIC_SET = 0x01;

	/* Battery command class commands */
	public static final byte BATTERY_VERSION = 0x01;
	public static final byte BATTERY_GET = 0x02;
	public static final byte BATTERY_REPORT = 0x03;

	/* Chimney Fan command class commands */
	public static final byte CHIMNEY_FAN_VERSION = 0x01;
	public static final byte CHIMNEY_FAN_ALARM_LOG_GET = 0x20;
	public static final byte CHIMNEY_FAN_ALARM_LOG_REPORT = 0x21;
	public static final byte CHIMNEY_FAN_ALARM_LOG_SET = 0x1F;
	public static final byte CHIMNEY_FAN_ALARM_STATUS_GET = 0x23;
	public static final byte CHIMNEY_FAN_ALARM_STATUS_REPORT = 0x24;
	public static final byte CHIMNEY_FAN_ALARM_STATUS_SET = 0x22;
	public static final byte CHIMNEY_FAN_ALARM_TEMP_GET = 0x0E;
	public static final byte CHIMNEY_FAN_ALARM_TEMP_REPORT = 0x0F;
	public static final byte CHIMNEY_FAN_ALARM_TEMP_SET = 0x0D;
	public static final byte CHIMNEY_FAN_BOOST_TIME_GET = 0x11;
	public static final byte CHIMNEY_FAN_BOOST_TIME_REPORT = 0x12;
	public static final byte CHIMNEY_FAN_BOOST_TIME_SET = 0x10;
	public static final byte CHIMNEY_FAN_DEFAULT_SET = 0x28;
	public static final byte CHIMNEY_FAN_MIN_SPEED_GET = 0x26;
	public static final byte CHIMNEY_FAN_MIN_SPEED_REPORT = 0x27;
	public static final byte CHIMNEY_FAN_MIN_SPEED_SET = 0x25;
	public static final byte CHIMNEY_FAN_MODE_GET = 0x17;
	public static final byte CHIMNEY_FAN_MODE_REPORT = 0x18;
	public static final byte CHIMNEY_FAN_MODE_SET = 0x16;
	public static final byte CHIMNEY_FAN_SETUP_GET = 0x1A;
	public static final byte CHIMNEY_FAN_SETUP_REPORT = 0x1B;
	public static final byte CHIMNEY_FAN_SETUP_SET = 0x19;
	public static final byte CHIMNEY_FAN_SPEED_GET = 0x05;
	public static final byte CHIMNEY_FAN_SPEED_REPORT = 0x06;
	public static final byte CHIMNEY_FAN_SPEED_SET = 0x04;
	public static final byte CHIMNEY_FAN_START_TEMP_GET = 0x08;
	public static final byte CHIMNEY_FAN_START_TEMP_REPORT = 0x09;
	public static final byte CHIMNEY_FAN_START_TEMP_SET = 0x07;
	public static final byte CHIMNEY_FAN_STATE_GET = 0x02;
	public static final byte CHIMNEY_FAN_STATE_REPORT = 0x03;
	public static final byte CHIMNEY_FAN_STATE_SET = 0x01;
	public static final byte CHIMNEY_FAN_STATUS_GET = 0x1D;
	public static final byte CHIMNEY_FAN_STATUS_REPORT = 0x1E;
	public static final byte CHIMNEY_FAN_STOP_TEMP_GET = 0x0B;
	public static final byte CHIMNEY_FAN_STOP_TEMP_REPORT = 0x0C;
	public static final byte CHIMNEY_FAN_STOP_TEMP_SET = 0x0A;
	public static final byte CHIMNEY_FAN_STOP_TIME_GET = 0x14;
	public static final byte CHIMNEY_FAN_STOP_TIME_REPORT = 0x15;
	public static final byte CHIMNEY_FAN_STOP_TIME_SET = 0x13;
	/* Values used for Chimney Fan Alarm Log Report command */
	public static final byte CHIMNEY_FAN_ALARM_LOG_REPORT_ALARM_EVENT_1_RESERVED1_BIT_MASK = 0x01;
	public static final byte CHIMNEY_FAN_ALARM_LOG_REPORT_ALARM_EVENT_1_EXTERNAL_ALARM_1_BIT_MASK = 0x02;
	public static final byte CHIMNEY_FAN_ALARM_LOG_REPORT_ALARM_EVENT_1_SENSOR_ERROR_1_BIT_MASK = 0x04;
	public static final byte CHIMNEY_FAN_ALARM_LOG_REPORT_ALARM_EVENT_1_ALARM_TEMPERATURE_EXCEEDED_1_BIT_MASK = 0x08;
	public static final byte CHIMNEY_FAN_ALARM_LOG_REPORT_ALARM_EVENT_1_RESERVED2_MASK = 0x70;
	public static final byte CHIMNEY_FAN_ALARM_LOG_REPORT_ALARM_EVENT_1_RESERVED2_SHIFT = 0x04;
	public static final byte CHIMNEY_FAN_ALARM_LOG_REPORT_ALARM_EVENT_1_ALARM_STILL_ACTIVE_1_BIT_MASK = (byte) 0x80;
	public static final byte CHIMNEY_FAN_ALARM_LOG_REPORT_ALARM_EVENT_2_RESERVED1_BIT_MASK = 0x01;
	public static final byte CHIMNEY_FAN_ALARM_LOG_REPORT_ALARM_EVENT_2_EXTERNAL_ALARM_2_BIT_MASK = 0x02;
	public static final byte CHIMNEY_FAN_ALARM_LOG_REPORT_ALARM_EVENT_2_SENSOR_ERROR_2_BIT_MASK = 0x04;
	public static final byte CHIMNEY_FAN_ALARM_LOG_REPORT_ALARM_EVENT_2_ALARM_TEMPERATURE_EXCEEDED_2_BIT_MASK = 0x08;
	public static final byte CHIMNEY_FAN_ALARM_LOG_REPORT_ALARM_EVENT_2_RESERVED2_MASK = 0x70;
	public static final byte CHIMNEY_FAN_ALARM_LOG_REPORT_ALARM_EVENT_2_RESERVED2_SHIFT = 0x04;
	public static final byte CHIMNEY_FAN_ALARM_LOG_REPORT_ALARM_EVENT_2_ALARM_STILL_ACTIVE_2_BIT_MASK = (byte) 0x80;
	public static final byte CHIMNEY_FAN_ALARM_LOG_REPORT_ALARM_EVENT_3_RESERVED1_BIT_MASK = 0x01;
	public static final byte CHIMNEY_FAN_ALARM_LOG_REPORT_ALARM_EVENT_3_EXTERNAL_ALARM_3_BIT_MASK = 0x02;
	public static final byte CHIMNEY_FAN_ALARM_LOG_REPORT_ALARM_EVENT_3_SENSOR_ERROR_3_BIT_MASK = 0x04;
	public static final byte CHIMNEY_FAN_ALARM_LOG_REPORT_ALARM_EVENT_3_ALARM_TEMPERATURE_EXCEEDED_3_BIT_MASK = 0x08;
	public static final byte CHIMNEY_FAN_ALARM_LOG_REPORT_ALARM_EVENT_3_RESERVED2_MASK = 0x70;
	public static final byte CHIMNEY_FAN_ALARM_LOG_REPORT_ALARM_EVENT_3_RESERVED2_SHIFT = 0x04;
	public static final byte CHIMNEY_FAN_ALARM_LOG_REPORT_ALARM_EVENT_3_ALARM_STILL_ACTIVE_3_BIT_MASK = (byte) 0x80;
	public static final byte CHIMNEY_FAN_ALARM_LOG_REPORT_ALARM_EVENT_4_RESERVED1_BIT_MASK = 0x01;
	public static final byte CHIMNEY_FAN_ALARM_LOG_REPORT_ALARM_EVENT_4_EXTERNAL_ALARM_4_BIT_MASK = 0x02;
	public static final byte CHIMNEY_FAN_ALARM_LOG_REPORT_ALARM_EVENT_4_SENSOR_ERROR_4_BIT_MASK = 0x04;
	public static final byte CHIMNEY_FAN_ALARM_LOG_REPORT_ALARM_EVENT_4_ALARM_TEMPERATURE_EXCEEDED_4_BIT_MASK = 0x08;
	public static final byte CHIMNEY_FAN_ALARM_LOG_REPORT_ALARM_EVENT_4_RESERVED2_MASK = 0x70;
	public static final byte CHIMNEY_FAN_ALARM_LOG_REPORT_ALARM_EVENT_4_RESERVED2_SHIFT = 0x04;
	public static final byte CHIMNEY_FAN_ALARM_LOG_REPORT_ALARM_EVENT_4_ALARM_STILL_ACTIVE_4_BIT_MASK = (byte) 0x80;
	public static final byte CHIMNEY_FAN_ALARM_LOG_REPORT_ALARM_EVENT_5_RESERVED1_BIT_MASK = 0x01;
	public static final byte CHIMNEY_FAN_ALARM_LOG_REPORT_ALARM_EVENT_5_EXTERNAL_ALARM_5_BIT_MASK = 0x02;
	public static final byte CHIMNEY_FAN_ALARM_LOG_REPORT_ALARM_EVENT_5_SENSOR_ERROR_5_BIT_MASK = 0x04;
	public static final byte CHIMNEY_FAN_ALARM_LOG_REPORT_ALARM_EVENT_5_ALARM_TEMPERATURE_EXCEEDED_5_BIT_MASK = 0x08;
	public static final byte CHIMNEY_FAN_ALARM_LOG_REPORT_ALARM_EVENT_5_RESERVED2_MASK = 0x70;
	public static final byte CHIMNEY_FAN_ALARM_LOG_REPORT_ALARM_EVENT_5_RESERVED2_SHIFT = 0x04;
	public static final byte CHIMNEY_FAN_ALARM_LOG_REPORT_ALARM_EVENT_5_ALARM_STILL_ACTIVE_5_BIT_MASK = (byte) 0x80;
	/* Values used for Chimney Fan Alarm Log Set command */
	public static final byte CHIMNEY_FAN_ALARM_LOG_SET_RESET_LOG = 0x08;
	/* Values used for Chimney Fan Alarm Status Report command */
	public static final byte CHIMNEY_FAN_ALARM_STATUS_REPORT_ALARM_STATUS_SERVICE_BIT_MASK = 0x01;
	public static final byte CHIMNEY_FAN_ALARM_STATUS_REPORT_ALARM_STATUS_EXTERNAL_ALARM_BIT_MASK = 0x02;
	public static final byte CHIMNEY_FAN_ALARM_STATUS_REPORT_ALARM_STATUS_SENSOR_ERROR_BIT_MASK = 0x04;
	public static final byte CHIMNEY_FAN_ALARM_STATUS_REPORT_ALARM_STATUS_ALARM_TEMPERATURE_EXCEEDED_BIT_MASK = 0x08;
	public static final byte CHIMNEY_FAN_ALARM_STATUS_REPORT_ALARM_STATUS_NOT_USED_MASK = 0x30;
	public static final byte CHIMNEY_FAN_ALARM_STATUS_REPORT_ALARM_STATUS_NOT_USED_SHIFT = 0x04;
	public static final byte CHIMNEY_FAN_ALARM_STATUS_REPORT_ALARM_STATUS_SPEED_CHANGE_ENABLE_BIT_MASK = 0x40;
	public static final byte CHIMNEY_FAN_ALARM_STATUS_REPORT_ALARM_STATUS_START_TEMPERATURE_EXCEEDED_BIT_MASK = (byte) 0x80;
	/* Values used for Chimney Fan Alarm Status Set command */
	public static final byte CHIMNEY_FAN_ALARM_STATUS_SET_MESSAGE_NOT_USED1_BIT_MASK = 0x01;
	public static final byte CHIMNEY_FAN_ALARM_STATUS_SET_MESSAGE_ACKNOWLEDGE_EXTERNAL_ALARM_BIT_MASK = 0x02;
	public static final byte CHIMNEY_FAN_ALARM_STATUS_SET_MESSAGE_ACKNOWLEDGE_SENSOR_ERROR_BIT_MASK = 0x04;
	public static final byte CHIMNEY_FAN_ALARM_STATUS_SET_MESSAGE_ACKNOWLEDGE_ALARM_TEMPERATURE_EXCEEDED_BIT_MASK = 0x08;
	public static final byte CHIMNEY_FAN_ALARM_STATUS_SET_MESSAGE_NOT_USED2_MASK = (byte) 0xF0;
	public static final byte CHIMNEY_FAN_ALARM_STATUS_SET_MESSAGE_NOT_USED2_SHIFT = 0x04;
	/* Values used for Chimney Fan Alarm Temp Report command */
	public static final byte CHIMNEY_FAN_ALARM_TEMP_REPORT_PROPERTIES1_SIZE_MASK = 0x07;
	public static final byte CHIMNEY_FAN_ALARM_TEMP_REPORT_PROPERTIES1_SCALE_MASK = 0x18;
	public static final byte CHIMNEY_FAN_ALARM_TEMP_REPORT_PROPERTIES1_SCALE_SHIFT = 0x03;
	public static final byte CHIMNEY_FAN_ALARM_TEMP_REPORT_PROPERTIES1_PRECISION_MASK = (byte) 0xE0;
	public static final byte CHIMNEY_FAN_ALARM_TEMP_REPORT_PROPERTIES1_PRECISION_SHIFT = 0x05;
	/* Values used for Chimney Fan Alarm Temp Set command */
	public static final byte CHIMNEY_FAN_ALARM_TEMP_SET_PROPERTIES1_SIZE_MASK = 0x07;
	public static final byte CHIMNEY_FAN_ALARM_TEMP_SET_PROPERTIES1_SCALE_MASK = 0x18;
	public static final byte CHIMNEY_FAN_ALARM_TEMP_SET_PROPERTIES1_SCALE_SHIFT = 0x03;
	public static final byte CHIMNEY_FAN_ALARM_TEMP_SET_PROPERTIES1_PRECISION_MASK = (byte) 0xE0;
	public static final byte CHIMNEY_FAN_ALARM_TEMP_SET_PROPERTIES1_PRECISION_SHIFT = 0x05;
	/* Values used for Chimney Fan Mode Report command */
	public static final byte CHIMNEY_FAN_MODE_REPORT_OFF = 0x00;
	public static final byte CHIMNEY_FAN_MODE_REPORT_ON = (byte) 0xFF;
	/* Values used for Chimney Fan Mode Set command */
	public static final byte CHIMNEY_FAN_MODE_SET_OFF = 0x00;
	public static final byte CHIMNEY_FAN_MODE_SET_ON = (byte) 0xFF;
	/* Values used for Chimney Fan Setup Report command */
	public static final byte CHIMNEY_FAN_SETUP_REPORT_OFF = 0x00;
	public static final byte CHIMNEY_FAN_SETUP_REPORT_ON = (byte) 0xFF;
	public static final byte CHIMNEY_FAN_SETUP_REPORT_PROPERTIES1_SIZE_1_MASK = 0x07;
	public static final byte CHIMNEY_FAN_SETUP_REPORT_PROPERTIES1_SCALE_1_MASK = 0x18;
	public static final byte CHIMNEY_FAN_SETUP_REPORT_PROPERTIES1_SCALE_1_SHIFT = 0x03;
	public static final byte CHIMNEY_FAN_SETUP_REPORT_PROPERTIES1_PRECISION_1_MASK = (byte) 0xE0;
	public static final byte CHIMNEY_FAN_SETUP_REPORT_PROPERTIES1_PRECISION_1_SHIFT = 0x05;
	public static final byte CHIMNEY_FAN_SETUP_REPORT_PROPERTIES2_SIZE_2_MASK = 0x07;
	public static final byte CHIMNEY_FAN_SETUP_REPORT_PROPERTIES2_SCALE_2_MASK = 0x18;
	public static final byte CHIMNEY_FAN_SETUP_REPORT_PROPERTIES2_SCALE_2_SHIFT = 0x03;
	public static final byte CHIMNEY_FAN_SETUP_REPORT_PROPERTIES2_PRECISION_2_MASK = (byte) 0xE0;
	public static final byte CHIMNEY_FAN_SETUP_REPORT_PROPERTIES2_PRECISION_2_SHIFT = 0x05;
	public static final byte CHIMNEY_FAN_SETUP_REPORT_PROPERTIES3_SIZE_3_MASK = 0x07;
	public static final byte CHIMNEY_FAN_SETUP_REPORT_PROPERTIES3_SCALE_3_MASK = 0x18;
	public static final byte CHIMNEY_FAN_SETUP_REPORT_PROPERTIES3_SCALE_3_SHIFT = 0x03;
	public static final byte CHIMNEY_FAN_SETUP_REPORT_PROPERTIES3_PRECISION_3_MASK = (byte) 0xE0;
	public static final byte CHIMNEY_FAN_SETUP_REPORT_PROPERTIES3_PRECISION_3_SHIFT = 0x05;
	/* Values used for Chimney Fan Setup Set command */
	public static final byte CHIMNEY_FAN_SETUP_SET_OFF = 0x00;
	public static final byte CHIMNEY_FAN_SETUP_SET_ON = (byte) 0xFF;
	public static final byte CHIMNEY_FAN_SETUP_SET_PROPERTIES1_SIZE_1_MASK = 0x07;
	public static final byte CHIMNEY_FAN_SETUP_SET_PROPERTIES1_SCALE_1_MASK = 0x18;
	public static final byte CHIMNEY_FAN_SETUP_SET_PROPERTIES1_SCALE_1_SHIFT = 0x03;
	public static final byte CHIMNEY_FAN_SETUP_SET_PROPERTIES1_PRECISION_1_MASK = (byte) 0xE0;
	public static final byte CHIMNEY_FAN_SETUP_SET_PROPERTIES1_PRECISION_1_SHIFT = 0x05;
	public static final byte CHIMNEY_FAN_SETUP_SET_PROPERTIES2_SIZE_2_MASK = 0x07;
	public static final byte CHIMNEY_FAN_SETUP_SET_PROPERTIES2_SCALE_2_MASK = 0x18;
	public static final byte CHIMNEY_FAN_SETUP_SET_PROPERTIES2_SCALE_2_SHIFT = 0x03;
	public static final byte CHIMNEY_FAN_SETUP_SET_PROPERTIES2_PRECISION_2_MASK = (byte) 0xE0;
	public static final byte CHIMNEY_FAN_SETUP_SET_PROPERTIES2_PRECISION_2_SHIFT = 0x05;
	public static final byte CHIMNEY_FAN_SETUP_SET_PROPERTIES3_SIZE_3_MASK = 0x07;
	public static final byte CHIMNEY_FAN_SETUP_SET_PROPERTIES3_SCALE_3_MASK = 0x18;
	public static final byte CHIMNEY_FAN_SETUP_SET_PROPERTIES3_SCALE_3_SHIFT = 0x03;
	public static final byte CHIMNEY_FAN_SETUP_SET_PROPERTIES3_PRECISION_3_MASK = (byte) 0xE0;
	public static final byte CHIMNEY_FAN_SETUP_SET_PROPERTIES3_PRECISION_3_SHIFT = 0x05;
	/* Values used for Chimney Fan Start Temp Report command */
	public static final byte CHIMNEY_FAN_START_TEMP_REPORT_PROPERTIES1_SIZE_MASK = 0x07;
	public static final byte CHIMNEY_FAN_START_TEMP_REPORT_PROPERTIES1_SCALE_MASK = 0x18;
	public static final byte CHIMNEY_FAN_START_TEMP_REPORT_PROPERTIES1_SCALE_SHIFT = 0x03;
	public static final byte CHIMNEY_FAN_START_TEMP_REPORT_PROPERTIES1_PRECISION_MASK = (byte) 0xE0;
	public static final byte CHIMNEY_FAN_START_TEMP_REPORT_PROPERTIES1_PRECISION_SHIFT = 0x05;
	/* Values used for Chimney Fan Start Temp Set command */
	public static final byte CHIMNEY_FAN_START_TEMP_SET_PROPERTIES1_SIZE_MASK = 0x07;
	public static final byte CHIMNEY_FAN_START_TEMP_SET_PROPERTIES1_SCALE_MASK = 0x18;
	public static final byte CHIMNEY_FAN_START_TEMP_SET_PROPERTIES1_SCALE_SHIFT = 0x03;
	public static final byte CHIMNEY_FAN_START_TEMP_SET_PROPERTIES1_PRECISION_MASK = (byte) 0xE0;
	public static final byte CHIMNEY_FAN_START_TEMP_SET_PROPERTIES1_PRECISION_SHIFT = 0x05;
	/* Values used for Chimney Fan State Report command */
	public static final byte CHIMNEY_FAN_STATE_REPORT_OFF = 0x00;
	public static final byte CHIMNEY_FAN_STATE_REPORT_BOOST = 0x01;
	public static final byte CHIMNEY_FAN_STATE_REPORT_EXHAUST = 0x02;
	public static final byte CHIMNEY_FAN_STATE_REPORT_RELOAD = 0x03;
	public static final byte CHIMNEY_FAN_STATE_REPORT_VENTING = 0x04;
	public static final byte CHIMNEY_FAN_STATE_REPORT_STOP = 0x05;
	public static final byte CHIMNEY_FAN_STATE_REPORT_VENTING_EX = 0x06;
	public static final byte CHIMNEY_FAN_STATE_REPORT_SERVICE = 0x07;
	public static final byte CHIMNEY_FAN_STATE_REPORT_SENSOR_FAILURE = 0x08;
	public static final byte CHIMNEY_FAN_STATE_REPORT_CHIMNEY_FIRE = 0x09;
	public static final byte CHIMNEY_FAN_STATE_REPORT_EXTERNAL_ALARM = 0x0A;
	/* Values used for Chimney Fan State Set command */
	public static final byte CHIMNEY_FAN_STATE_SET_NEXT_STATE = 0x01;
	/* Values used for Chimney Fan Status Report command */
	public static final byte CHIMNEY_FAN_STATUS_REPORT_OFF = 0x00;
	public static final byte CHIMNEY_FAN_STATUS_REPORT_BOOST = 0x01;
	public static final byte CHIMNEY_FAN_STATUS_REPORT_EXHAUST = 0x02;
	public static final byte CHIMNEY_FAN_STATUS_REPORT_RELOAD = 0x03;
	public static final byte CHIMNEY_FAN_STATUS_REPORT_VENTING = 0x04;
	public static final byte CHIMNEY_FAN_STATUS_REPORT_STOP = 0x05;
	public static final byte CHIMNEY_FAN_STATUS_REPORT_VENTING_EX = 0x06;
	public static final byte CHIMNEY_FAN_STATUS_REPORT_SERVICE = 0x07;
	public static final byte CHIMNEY_FAN_STATUS_REPORT_SENSOR_FAILURE = 0x08;
	public static final byte CHIMNEY_FAN_STATUS_REPORT_CHIMNEY_FIRE = 0x09;
	public static final byte CHIMNEY_FAN_STATUS_REPORT_EXTERNAL_ALARM = 0x0A;
	public static final byte CHIMNEY_FAN_STATUS_REPORT_ALARM_STATUS_SERVICE_BIT_MASK = 0x01;
	public static final byte CHIMNEY_FAN_STATUS_REPORT_ALARM_STATUS_EXTERNAL_ALARM_BIT_MASK = 0x02;
	public static final byte CHIMNEY_FAN_STATUS_REPORT_ALARM_STATUS_SENSOR_ERROR_BIT_MASK = 0x04;
	public static final byte CHIMNEY_FAN_STATUS_REPORT_ALARM_STATUS_ALARM_TEMPERATURE_EXCEEDED_BIT_MASK = 0x08;
	public static final byte CHIMNEY_FAN_STATUS_REPORT_ALARM_STATUS_NOT_USED_MASK = 0x30;
	public static final byte CHIMNEY_FAN_STATUS_REPORT_ALARM_STATUS_NOT_USED_SHIFT = 0x04;
	public static final byte CHIMNEY_FAN_STATUS_REPORT_ALARM_STATUS_SPEED_CHANGE_ENABLE_BIT_MASK = 0x40;
	public static final byte CHIMNEY_FAN_STATUS_REPORT_ALARM_STATUS_START_TEMPERATURE_EXCEEDED_BIT_MASK = (byte) 0x80;
	public static final byte CHIMNEY_FAN_STATUS_REPORT_PROPERTIES1_SIZE_MASK = 0x07;
	public static final byte CHIMNEY_FAN_STATUS_REPORT_PROPERTIES1_SCALE_MASK = 0x18;
	public static final byte CHIMNEY_FAN_STATUS_REPORT_PROPERTIES1_SCALE_SHIFT = 0x03;
	public static final byte CHIMNEY_FAN_STATUS_REPORT_PROPERTIES1_PRECISION_MASK = (byte) 0xE0;
	public static final byte CHIMNEY_FAN_STATUS_REPORT_PROPERTIES1_PRECISION_SHIFT = 0x05;
	/* Values used for Chimney Fan Stop Temp Report command */
	public static final byte CHIMNEY_FAN_STOP_TEMP_REPORT_PROPERTIES1_SIZE_MASK = 0x07;
	public static final byte CHIMNEY_FAN_STOP_TEMP_REPORT_PROPERTIES1_SCALE_MASK = 0x18;
	public static final byte CHIMNEY_FAN_STOP_TEMP_REPORT_PROPERTIES1_SCALE_SHIFT = 0x03;
	public static final byte CHIMNEY_FAN_STOP_TEMP_REPORT_PROPERTIES1_PRECISION_MASK = (byte) 0xE0;
	public static final byte CHIMNEY_FAN_STOP_TEMP_REPORT_PROPERTIES1_PRECISION_SHIFT = 0x05;
	/* Values used for Chimney Fan Stop Temp Set command */
	public static final byte CHIMNEY_FAN_STOP_TEMP_SET_PROPERTIES1_SIZE_MASK = 0x07;
	public static final byte CHIMNEY_FAN_STOP_TEMP_SET_PROPERTIES1_SCALE_MASK = 0x18;
	public static final byte CHIMNEY_FAN_STOP_TEMP_SET_PROPERTIES1_SCALE_SHIFT = 0x03;
	public static final byte CHIMNEY_FAN_STOP_TEMP_SET_PROPERTIES1_PRECISION_MASK =(byte) 0xE0;
	public static final byte CHIMNEY_FAN_STOP_TEMP_SET_PROPERTIES1_PRECISION_SHIFT = 0x05;

	/* Climate Control Schedule command class commands */
	public static final byte CLIMATE_CONTROL_SCHEDULE_VERSION = 0x01;
	public static final byte SCHEDULE_CHANGED_GET = 0x04;
	public static final byte SCHEDULE_CHANGED_REPORT = 0x05;
	public static final byte SCHEDULE_GET = 0x02;
	public static final byte SCHEDULE_OVERRIDE_GET = 0x07;
	public static final byte SCHEDULE_OVERRIDE_REPORT = 0x08;
	public static final byte SCHEDULE_OVERRIDE_SET = 0x06;
	public static final byte SCHEDULE_REPORT = 0x03;
	public static final byte SCHEDULE_SET = 0x01;
	/* Values used for Schedule Get command */
	public static final byte SCHEDULE_GET_PROPERTIES1_WEEKDAY_MASK = 0x07;
	public static final byte SCHEDULE_GET_PROPERTIES1_RESERVED_MASK = (byte) 0xF8;
	public static final byte SCHEDULE_GET_PROPERTIES1_RESERVED_SHIFT = 0x03;
	/* Values used for Schedule Override Report command */
	public static final byte SCHEDULE_OVERRIDE_REPORT_PROPERTIES1_OVERRIDE_TYPE_MASK = 0x03;
	public static final byte SCHEDULE_OVERRIDE_REPORT_PROPERTIES1_RESERVED_MASK = (byte) 0xFC;
	public static final byte SCHEDULE_OVERRIDE_REPORT_PROPERTIES1_RESERVED_SHIFT = 0x02;
	public static final byte SCHEDULE_OVERRIDE_REPORT_NO_OVERRIDE = 0x00;
	public static final byte SCHEDULE_OVERRIDE_REPORT_TEMPORARY_OVERRIDE = 0x01;
	public static final byte SCHEDULE_OVERRIDE_REPORT_PERMANENT_OVERRIDE = 0x02;
	public static final byte SCHEDULE_OVERRIDE_REPORT_RESERVED = 0x03;
	/* Values used for Schedule Override Set command */
	public static final byte SCHEDULE_OVERRIDE_SET_PROPERTIES1_OVERRIDE_TYPE_MASK = 0x03;
	public static final byte SCHEDULE_OVERRIDE_SET_PROPERTIES1_RESERVED_MASK = (byte) 0xFC;
	public static final byte SCHEDULE_OVERRIDE_SET_PROPERTIES1_RESERVED_SHIFT = 0x02;
	public static final byte SCHEDULE_OVERRIDE_SET_NO_OVERRIDE = 0x00;
	public static final byte SCHEDULE_OVERRIDE_SET_TEMPORARY_OVERRIDE = 0x01;
	public static final byte SCHEDULE_OVERRIDE_SET_PERMANENT_OVERRIDE = 0x02;
	public static final byte SCHEDULE_OVERRIDE_SET_RESERVED = 0x03;
	/* Values used for Schedule Report command */
	public static final byte SCHEDULE_REPORT_PROPERTIES1_WEEKDAY_MASK = 0x07;
	public static final byte SCHEDULE_REPORT_PROPERTIES1_RESERVED_MASK = (byte) 0xF8;
	public static final byte SCHEDULE_REPORT_PROPERTIES1_RESERVED_SHIFT = 0x03;
	/* Values used for Schedule Set command */
	public static final byte SCHEDULE_SET_PROPERTIES1_WEEKDAY_MASK = 0x07;
	public static final byte SCHEDULE_SET_PROPERTIES1_RESERVED_MASK = (byte) 0xF8;
	public static final byte SCHEDULE_SET_PROPERTIES1_RESERVED_SHIFT = 0x03;

	/* Clock command class commands */
	public static final byte CLOCK_VERSION = 0x01;
	public static final byte CLOCK_GET = 0x05;
	public static final byte CLOCK_REPORT = 0x06;
	public static final byte CLOCK_SET = 0x04;
	/* Values used for Clock Report command */
	public static final byte CLOCK_REPORT_LEVEL_HOUR_MASK = 0x1F;
	public static final byte CLOCK_REPORT_LEVEL_WEEKDAY_MASK = (byte) 0xE0;
	public static final byte CLOCK_REPORT_LEVEL_WEEKDAY_SHIFT = 0x05;
	/* Values used for Clock Set command */
	public static final byte CLOCK_SET_LEVEL_HOUR_MASK = 0x1F;
	public static final byte CLOCK_SET_LEVEL_WEEKDAY_MASK = (byte) 0xE0;
	public static final byte CLOCK_SET_LEVEL_WEEKDAY_SHIFT = 0x05;

	/* Configuration command class commands */
	public static final byte CONFIGURATION_VERSION = 0x01;
	public static final byte CONFIGURATION_GET = 0x05;
	public static final byte CONFIGURATION_REPORT = 0x06;
	public static final byte CONFIGURATION_SET = 0x04;
	/* Values used for Configuration Report command */
	public static final byte CONFIGURATION_REPORT_LEVEL_SIZE_MASK = 0x07;
	public static final byte CONFIGURATION_REPORT_LEVEL_RESERVED_MASK = (byte) 0xF8;
	public static final byte CONFIGURATION_REPORT_LEVEL_RESERVED_SHIFT = 0x03;
	/* Values used for Configuration Set command */
	public static final byte CONFIGURATION_SET_LEVEL_SIZE_MASK = 0x07;
	public static final byte CONFIGURATION_SET_LEVEL_RESERVED_MASK = 0x78;
	public static final byte CONFIGURATION_SET_LEVEL_RESERVED_SHIFT = 0x03;
	public static final byte CONFIGURATION_SET_LEVEL_DEFAULT_BIT_MASK = (byte) 0x80;

	/* Configuration command class commands */
	public static final byte CONFIGURATION_VERSION_V2 = 0x02;
	public static final byte CONFIGURATION_BULK_GET_V2 = 0x08;
	public static final byte CONFIGURATION_BULK_REPORT_V2 = 0x09;
	public static final byte CONFIGURATION_BULK_SET_V2 = 0x07;
	public static final byte CONFIGURATION_GET_V2 = 0x05;
	public static final byte CONFIGURATION_REPORT_V2 = 0x06;
	public static final byte CONFIGURATION_SET_V2 = 0x04;
	/* Values used for Configuration Bulk Report command */
	public static final byte CONFIGURATION_BULK_REPORT_PROPERTIES1_SIZE_MASK_V2 = 0x07;
	public static final byte CONFIGURATION_BULK_REPORT_PROPERTIES1_RESERVED_MASK_V2 = 0x38;
	public static final byte CONFIGURATION_BULK_REPORT_PROPERTIES1_RESERVED_SHIFT_V2 = 0x03;
	public static final byte CONFIGURATION_BULK_REPORT_PROPERTIES1_HANDSHAKE_BIT_MASK_V2 = 0x40;
	public static final byte CONFIGURATION_BULK_REPORT_PROPERTIES1_DEFAULT_BIT_MASK_V2 = (byte) 0x80;
	/* Values used for Configuration Bulk Set command */
	public static final byte CONFIGURATION_BULK_SET_PROPERTIES1_SIZE_MASK_V2 = 0x07;
	public static final byte CONFIGURATION_BULK_SET_PROPERTIES1_RESERVED_MASK_V2 = 0x38;
	public static final byte CONFIGURATION_BULK_SET_PROPERTIES1_RESERVED_SHIFT_V2 = 0x03;
	public static final byte CONFIGURATION_BULK_SET_PROPERTIES1_HANDSHAKE_BIT_MASK_V2 = 0x40;
	public static final byte CONFIGURATION_BULK_SET_PROPERTIES1_DEFAULT_BIT_MASK_V2 = (byte) 0x80;
	/* Values used for Configuration Report command */
	public static final byte CONFIGURATION_REPORT_LEVEL_SIZE_MASK_V2 = 0x07;
	public static final byte CONFIGURATION_REPORT_LEVEL_RESERVED_MASK_V2 = (byte) 0xF8;
	public static final byte CONFIGURATION_REPORT_LEVEL_RESERVED_SHIFT_V2 = 0x03;
	/* Values used for Configuration Set command */
	public static final byte CONFIGURATION_SET_LEVEL_SIZE_MASK_V2 = 0x07;
	public static final byte CONFIGURATION_SET_LEVEL_RESERVED_MASK_V2 = 0x78;
	public static final byte CONFIGURATION_SET_LEVEL_RESERVED_SHIFT_V2 = 0x03;
	public static final byte CONFIGURATION_SET_LEVEL_DEFAULT_BIT_MASK_V2 = (byte) 0x80;

	/* Controller Replication command class commands */
	public static final byte CONTROLLER_REPLICATION_VERSION = 0x01;
	public static final byte CTRL_REPLICATION_TRANSFER_GROUP = 0x31;
	public static final byte CTRL_REPLICATION_TRANSFER_GROUP_NAME = 0x32;
	public static final byte CTRL_REPLICATION_TRANSFER_SCENE = 0x33;
	public static final byte CTRL_REPLICATION_TRANSFER_SCENE_NAME = 0x34;

	/* Crc 16 Encap command class commands */
	public static final byte CRC_16_ENCAP_VERSION = 0x01;
	public static final byte CRC_16_ENCAP = 0x01;

	/* Dcp Config command class commands */
	public static final byte DCP_CONFIG_VERSION = 0x01;
	public static final byte DCP_LIST_REMOVE = 0x04;
	public static final byte DCP_LIST_SET = 0x03;
	public static final byte DCP_LIST_SUPPORTED_GET = 0x01;
	public static final byte DCP_LIST_SUPPORTED_REPORT = 0x02;
	/* Values used for Dcp List Set command */
	public static final byte DCP_LIST_SET_PROPERTIES1_NUMBER_OF_DC_MASK = 0x03;
	public static final byte DCP_LIST_SET_PROPERTIES1_RESERVED_MASK = (byte) 0xFC;
	public static final byte DCP_LIST_SET_PROPERTIES1_RESERVED_SHIFT = 0x02;

	/* Dcp Monitor command class commands */
	public static final byte DCP_MONITOR_VERSION = 0x01;
	public static final byte DCP_EVENT_STATUS_GET = 0x03;
	public static final byte DCP_EVENT_STATUS_REPORT = 0x04;
	public static final byte DCP_LIST_GET = 0x01;
	public static final byte DCP_LIST_REPORT = 0x02;
	/* Values used for Dcp List Report command */
	public static final byte DCP_LIST_REPORT_PROPERTIES1_NUMBER_OF_DC_MASK = 0x03;
	public static final byte DCP_LIST_REPORT_PROPERTIES1_RESERVED_MASK = (byte) 0xFC;
	public static final byte DCP_LIST_REPORT_PROPERTIES1_RESERVED_SHIFT = 0x02;

	/* Door Lock Logging command class commands */
	public static final byte DOOR_LOCK_LOGGING_VERSION = 0x01;
	public static final byte DOOR_LOCK_LOGGING_RECORDS_SUPPORTED_GET = 0x01;
	public static final byte DOOR_LOCK_LOGGING_RECORDS_SUPPORTED_REPORT = 0x02;
	public static final byte RECORD_GET = 0x03;
	public static final byte RECORD_REPORT = 0x04;
	/* Values used for Record Report command */
	public static final byte RECORD_REPORT_PROPERTIES1_HOUR_LOCAL_TIME_MASK = 0x1F;
	public static final byte RECORD_REPORT_PROPERTIES1_RECORD_STATUS_MASK = (byte) 0xE0;
	public static final byte RECORD_REPORT_PROPERTIES1_RECORD_STATUS_SHIFT = 0x05;

	/* Door Lock command class commands */
	public static final byte DOOR_LOCK_VERSION = 0x01;
	public static final byte DOOR_LOCK_CONFIGURATION_GET = 0x05;
	public static final byte DOOR_LOCK_CONFIGURATION_REPORT = 0x06;
	public static final byte DOOR_LOCK_CONFIGURATION_SET = 0x04;
	public static final byte DOOR_LOCK_OPERATION_GET = 0x02;
	public static final byte DOOR_LOCK_OPERATION_REPORT = 0x03;
	public static final byte DOOR_LOCK_OPERATION_SET = 0x01;
	/* Values used for Door Lock Configuration Report command */
	public static final byte DOOR_LOCK_CONFIGURATION_REPORT_CONSTANT_OPERATION = 0x01;
	public static final byte DOOR_LOCK_CONFIGURATION_REPORT_TIMED_OPERATION = 0x02;
	public static final byte DOOR_LOCK_CONFIGURATION_REPORT_PROPERTIES1_INSIDE_DOOR_HANDLES_STATE_MASK = 0x0F;
	public static final byte DOOR_LOCK_CONFIGURATION_REPORT_PROPERTIES1_OUTSIDE_DOOR_HANDLES_STATE_MASK = (byte) 0xF0;
	public static final byte DOOR_LOCK_CONFIGURATION_REPORT_PROPERTIES1_OUTSIDE_DOOR_HANDLES_STATE_SHIFT = 0x04;
	/* Values used for Door Lock Configuration Set command */
	public static final byte DOOR_LOCK_CONFIGURATION_SET_CONSTANT_OPERATION = 0x01;
	public static final byte DOOR_LOCK_CONFIGURATION_SET_TIMED_OPERATION = 0x02;
	public static final byte DOOR_LOCK_CONFIGURATION_SET_PROPERTIES1_INSIDE_DOOR_HANDLES_STATE_MASK = 0x0F;
	public static final byte DOOR_LOCK_CONFIGURATION_SET_PROPERTIES1_OUTSIDE_DOOR_HANDLES_STATE_MASK = (byte) 0xF0;
	public static final byte DOOR_LOCK_CONFIGURATION_SET_PROPERTIES1_OUTSIDE_DOOR_HANDLES_STATE_SHIFT = 0x04;
	/* Values used for Door Lock Operation Report command */
	public static final byte DOOR_LOCK_OPERATION_REPORT_DOOR_UNSECURED = 0x00;
	public static final byte DOOR_LOCK_OPERATION_REPORT_DOOR_UNSECURED_WITH_TIMEOUT = 0x01;
	public static final byte DOOR_LOCK_OPERATION_REPORT_DOOR_UNSECURED_FOR_INSIDE_DOOR_HANDLES = 0x10;
	public static final byte DOOR_LOCK_OPERATION_REPORT_DOOR_UNSECURED_FOR_INSIDE_DOOR_HANDLES_WITH_TIMEOUT = 0x11;
	public static final byte DOOR_LOCK_OPERATION_REPORT_DOOR_UNSECURED_FOR_OUTSIDE_DOOR_HANDLES = 0x20;
	public static final byte DOOR_LOCK_OPERATION_REPORT_DOOR_UNSECURED_FOR_OUTSIDE_DOOR_HANDLES_WITH_TIMEOUT = 0x21;
	public static final byte DOOR_LOCK_OPERATION_REPORT_DOOR_SECURED = (byte) 0xFF;
	public static final byte DOOR_LOCK_OPERATION_REPORT_PROPERTIES1_INSIDE_DOOR_HANDLES_MODE_MASK = 0x0F;
	public static final byte DOOR_LOCK_OPERATION_REPORT_PROPERTIES1_OUTSIDE_DOOR_HANDLES_MODE_MASK = (byte) 0xF0;
	public static final byte DOOR_LOCK_OPERATION_REPORT_PROPERTIES1_OUTSIDE_DOOR_HANDLES_MODE_SHIFT = 0x04;
	/* Values used for Door Lock Operation Set command */
	public static final byte DOOR_LOCK_OPERATION_SET_DOOR_UNSECURED = 0x00;
	public static final byte DOOR_LOCK_OPERATION_SET_DOOR_UNSECURED_WITH_TIMEOUT = 0x01;
	public static final byte DOOR_LOCK_OPERATION_SET_DOOR_UNSECURED_FOR_INSIDE_DOOR_HANDLES = 0x10;
	public static final byte DOOR_LOCK_OPERATION_SET_DOOR_UNSECURED_FOR_INSIDE_DOOR_HANDLES_WITH_TIMEOUT = 0x11;
	public static final byte DOOR_LOCK_OPERATION_SET_DOOR_UNSECURED_FOR_OUTSIDE_DOOR_HANDLES = 0x20;
	public static final byte DOOR_LOCK_OPERATION_SET_DOOR_UNSECURED_FOR_OUTSIDE_DOOR_HANDLES_WITH_TIMEOUT = 0x21;
	public static final byte DOOR_LOCK_OPERATION_SET_DOOR_SECURED = (byte) 0xFF;

	/* Door Lock command class commands */
	public static final byte DOOR_LOCK_VERSION_V2 = 0x02;
	public static final byte DOOR_LOCK_CONFIGURATION_GET_V2 = 0x05;
	public static final byte DOOR_LOCK_CONFIGURATION_REPORT_V2 = 0x06;
	public static final byte DOOR_LOCK_CONFIGURATION_SET_V2 = 0x04;
	public static final byte DOOR_LOCK_OPERATION_GET_V2 = 0x02;
	public static final byte DOOR_LOCK_OPERATION_REPORT_V2 = 0x03;
	public static final byte DOOR_LOCK_OPERATION_SET_V2 = 0x01;
	/* Values used for Door Lock Configuration Report command */
	public static final byte DOOR_LOCK_CONFIGURATION_REPORT_CONSTANT_OPERATION_V2 = 0x01;
	public static final byte DOOR_LOCK_CONFIGURATION_REPORT_TIMED_OPERATION_V2 = 0x02;
	public static final byte DOOR_LOCK_CONFIGURATION_REPORT_PROPERTIES1_INSIDE_DOOR_HANDLES_STATE_MASK_V2 = 0x0F;
	public static final byte DOOR_LOCK_CONFIGURATION_REPORT_PROPERTIES1_OUTSIDE_DOOR_HANDLES_STATE_MASK_V2 = (byte) 0xF0;
	public static final byte DOOR_LOCK_CONFIGURATION_REPORT_PROPERTIES1_OUTSIDE_DOOR_HANDLES_STATE_SHIFT_V2 = 0x04;
	/* Values used for Door Lock Configuration Set command */
	public static final byte DOOR_LOCK_CONFIGURATION_SET_CONSTANT_OPERATION_V2 = 0x01;
	public static final byte DOOR_LOCK_CONFIGURATION_SET_TIMED_OPERATION_V2 = 0x02;
	public static final byte DOOR_LOCK_CONFIGURATION_SET_PROPERTIES1_INSIDE_DOOR_HANDLES_STATE_MASK_V2 = 0x0F;
	public static final byte DOOR_LOCK_CONFIGURATION_SET_PROPERTIES1_OUTSIDE_DOOR_HANDLES_STATE_MASK_V2 = (byte) 0xF0;
	public static final byte DOOR_LOCK_CONFIGURATION_SET_PROPERTIES1_OUTSIDE_DOOR_HANDLES_STATE_SHIFT_V2 = 0x04;
	/* Values used for Door Lock Operation Report command */
	public static final byte DOOR_LOCK_OPERATION_REPORT_DOOR_UNSECURED_V2 = 0x00;
	public static final byte DOOR_LOCK_OPERATION_REPORT_DOOR_UNSECURED_WITH_TIMEOUT_V2 = 0x01;
	public static final byte DOOR_LOCK_OPERATION_REPORT_DOOR_UNSECURED_FOR_INSIDE_DOOR_HANDLES_V2 = 0x10;
	public static final byte DOOR_LOCK_OPERATION_REPORT_DOOR_UNSECURED_FOR_INSIDE_DOOR_HANDLES_WITH_TIMEOUT_V2 = 0x11;
	public static final byte DOOR_LOCK_OPERATION_REPORT_DOOR_UNSECURED_FOR_OUTSIDE_DOOR_HANDLES_V2 = 0x20;
	public static final byte DOOR_LOCK_OPERATION_REPORT_DOOR_UNSECURED_FOR_OUTSIDE_DOOR_HANDLES_WITH_TIMEOUT_V2 = 0x21;
	public static final byte DOOR_LOCK_OPERATION_REPORT_DOOR_LOCK_STATE_UNKNOWN_V2 = (byte) 0xFE;
	public static final byte DOOR_LOCK_OPERATION_REPORT_DOOR_SECURED_V2 = (byte) 0xFF;
	public static final byte DOOR_LOCK_OPERATION_REPORT_PROPERTIES1_INSIDE_DOOR_HANDLES_MODE_MASK_V2 = 0x0F;
	public static final byte DOOR_LOCK_OPERATION_REPORT_PROPERTIES1_OUTSIDE_DOOR_HANDLES_MODE_MASK_V2 = (byte) 0xF0;
	public static final byte DOOR_LOCK_OPERATION_REPORT_PROPERTIES1_OUTSIDE_DOOR_HANDLES_MODE_SHIFT_V2 = 0x04;
	/* Values used for Door Lock Operation Set command */
	public static final byte DOOR_LOCK_OPERATION_SET_DOOR_UNSECURED_V2 = 0x00;
	public static final byte DOOR_LOCK_OPERATION_SET_DOOR_UNSECURED_WITH_TIMEOUT_V2 = 0x01;
	public static final byte DOOR_LOCK_OPERATION_SET_DOOR_UNSECURED_FOR_INSIDE_DOOR_HANDLES_V2 = 0x10;
	public static final byte DOOR_LOCK_OPERATION_SET_DOOR_UNSECURED_FOR_INSIDE_DOOR_HANDLES_WITH_TIMEOUT_V2 = 0x11;
	public static final byte DOOR_LOCK_OPERATION_SET_DOOR_UNSECURED_FOR_OUTSIDE_DOOR_HANDLES_V2 = 0x20;
	public static final byte DOOR_LOCK_OPERATION_SET_DOOR_UNSECURED_FOR_OUTSIDE_DOOR_HANDLES_WITH_TIMEOUT_V2 = 0x21;
	public static final byte DOOR_LOCK_OPERATION_SET_DOOR_LOCK_STATE_UNKNOWN_V2 = (byte) 0xFE;
	public static final byte DOOR_LOCK_OPERATION_SET_DOOR_SECURED_V2 = (byte) 0xFF;

	/* Energy Production command class commands */
	public static final byte ENERGY_PRODUCTION_VERSION = 0x01;
	public static final byte ENERGY_PRODUCTION_GET = 0x02;
	public static final byte ENERGY_PRODUCTION_REPORT = 0x03;
	/* Values used for Energy Production Get command */
	public static final byte ENERGY_PRODUCTION_GET_INSTANT_ENERGY_PRODUCTION = 0x00;
	public static final byte ENERGY_PRODUCTION_GET_TOTAL_ENERGY_PRODUCTION = 0x01;
	public static final byte ENERGY_PRODUCTION_GET_ENERGY_PRODUCTION_TODAY = 0x02;
	public static final byte ENERGY_PRODUCTION_GET_TOTAL_PRODUCTION_TIME = 0x03;
	/* Values used for Energy Production Report command */
	public static final byte ENERGY_PRODUCTION_REPORT_INSTANT_ENERGY_PRODUCTION = 0x00;
	public static final byte ENERGY_PRODUCTION_REPORT_TOTAL_ENERGY_PRODUCTION = 0x01;
	public static final byte ENERGY_PRODUCTION_REPORT_ENERGY_PRODUCTION_TODAY = 0x02;
	public static final byte ENERGY_PRODUCTION_REPORT_TOTAL_PRODUCTION_TIME = 0x03;
	public static final byte ENERGY_PRODUCTION_REPORT_LEVEL_SIZE_MASK = 0x07;
	public static final byte ENERGY_PRODUCTION_REPORT_LEVEL_SCALE_MASK = 0x18;
	public static final byte ENERGY_PRODUCTION_REPORT_LEVEL_SCALE_SHIFT = 0x03;
	public static final byte ENERGY_PRODUCTION_REPORT_LEVEL_PRECISION_MASK = (byte) 0xE0;
	public static final byte ENERGY_PRODUCTION_REPORT_LEVEL_PRECISION_SHIFT = 0x05;

	/* Firmware Update Md command class commands */
	public static final byte FIRMWARE_UPDATE_MD_VERSION = 0x01;
	public static final byte FIRMWARE_MD_GET = 0x01;
	public static final byte FIRMWARE_MD_REPORT = 0x02;
	public static final byte FIRMWARE_UPDATE_MD_GET = 0x05;
	public static final byte FIRMWARE_UPDATE_MD_REPORT = 0x06;
	public static final byte FIRMWARE_UPDATE_MD_REQUEST_GET = 0x03;
	public static final byte FIRMWARE_UPDATE_MD_REQUEST_REPORT = 0x04;
	public static final byte FIRMWARE_UPDATE_MD_STATUS_REPORT = 0x07;
	/* Values used for Firmware Update Md Get command */
	public static final byte FIRMWARE_UPDATE_MD_GET_PROPERTIES1_REPORT_NUMBER_1_MASK = 0x7F;
	public static final byte FIRMWARE_UPDATE_MD_GET_PROPERTIES1_ZERO_BIT_MASK = (byte) 0x80;
	/* Values used for Firmware Update Md Report command */
	public static final byte FIRMWARE_UPDATE_MD_REPORT_PROPERTIES1_REPORT_NUMBER_1_MASK = 0x7F;
	public static final byte FIRMWARE_UPDATE_MD_REPORT_PROPERTIES1_LAST_BIT_MASK = (byte) 0x80;
	/* Values used for Firmware Update Md Request Report command */
	public static final byte FIRMWARE_UPDATE_MD_REQUEST_REPORT_INVALID_COMBINATION = 0x00;
	public static final byte FIRMWARE_UPDATE_MD_REQUEST_REPORT_REQUIRES_AUTHENTICATION = 0x01;
	public static final byte FIRMWARE_UPDATE_MD_REQUEST_REPORT_VALID_COMBINATION = (byte) 0xFF;
	/* Values used for Firmware Update Md Status Report command */
	public static final byte FIRMWARE_UPDATE_MD_STATUS_REPORT_UNABLE_TO_RECEIVE_WITHOUT_CHECKSUM_ERROR = 0x00;
	public static final byte FIRMWARE_UPDATE_MD_STATUS_REPORT_UNABLE_TO_RECEIVE = 0x01;
	public static final byte FIRMWARE_UPDATE_MD_STATUS_REPORT_SUCCESSFULLY = (byte) 0xFF;

	/* Firmware Update Md command class commands */
	public static final byte FIRMWARE_UPDATE_MD_VERSION_V2 = 0x02;
	public static final byte FIRMWARE_MD_GET_V2 = 0x01;
	public static final byte FIRMWARE_MD_REPORT_V2 = 0x02;
	public static final byte FIRMWARE_UPDATE_MD_GET_V2 = 0x05;
	public static final byte FIRMWARE_UPDATE_MD_REPORT_V2 = 0x06;
	public static final byte FIRMWARE_UPDATE_MD_REQUEST_GET_V2 = 0x03;
	public static final byte FIRMWARE_UPDATE_MD_REQUEST_REPORT_V2 = 0x04;
	public static final byte FIRMWARE_UPDATE_MD_STATUS_REPORT_V2 = 0x07;
	/* Values used for Firmware Update Md Get command */
	public static final byte FIRMWARE_UPDATE_MD_GET_PROPERTIES1_REPORT_NUMBER_1_MASK_V2 = 0x7F;
	public static final byte FIRMWARE_UPDATE_MD_GET_PROPERTIES1_ZERO_BIT_MASK_V2 = (byte) 0x80;
	/* Values used for Firmware Update Md Report command */
	public static final byte FIRMWARE_UPDATE_MD_REPORT_PROPERTIES1_REPORT_NUMBER_1_MASK_V2 = 0x7F;
	public static final byte FIRMWARE_UPDATE_MD_REPORT_PROPERTIES1_LAST_BIT_MASK_V2 = (byte) 0x80;
	/* Values used for Firmware Update Md Request Report command */
	public static final byte FIRMWARE_UPDATE_MD_REQUEST_REPORT_INVALID_COMBINATION_V2 = 0x00;
	public static final byte FIRMWARE_UPDATE_MD_REQUEST_REPORT_REQUIRES_AUTHENTICATION_V2 = 0x01;
	public static final byte FIRMWARE_UPDATE_MD_REQUEST_REPORT_VALID_COMBINATION_V2 = (byte) 0xFF;
	/* Values used for Firmware Update Md Status Report command */
	public static final byte FIRMWARE_UPDATE_MD_STATUS_REPORT_UNABLE_TO_RECEIVE_WITHOUT_CHECKSUM_ERROR_V2 = 0x00;
	public static final byte FIRMWARE_UPDATE_MD_STATUS_REPORT_UNABLE_TO_RECEIVE_V2 = 0x01;
	public static final byte FIRMWARE_UPDATE_MD_STATUS_REPORT_SUCCESSFULLY_V2 = (byte) 0xFF;

	/* Firmware Update Md command class commands */
	public static final byte FIRMWARE_UPDATE_MD_VERSION_V3 = 0x03;
	public static final byte FIRMWARE_MD_GET_V3 = 0x01;
	public static final byte FIRMWARE_MD_REPORT_V3 = 0x02;
	public static final byte FIRMWARE_UPDATE_MD_GET_V3 = 0x05;
	public static final byte FIRMWARE_UPDATE_MD_REPORT_V3 = 0x06;
	public static final byte FIRMWARE_UPDATE_MD_REQUEST_GET_V3 = 0x03;
	public static final byte FIRMWARE_UPDATE_MD_REQUEST_REPORT_V3 = 0x04;
	public static final byte FIRMWARE_UPDATE_MD_STATUS_REPORT_V3 = 0x07;
	/* Values used for Firmware Update Md Get command */
	public static final byte FIRMWARE_UPDATE_MD_GET_PROPERTIES1_REPORT_NUMBER_1_MASK_V3 = 0x7F;
	public static final byte FIRMWARE_UPDATE_MD_GET_PROPERTIES1_ZERO_BIT_MASK_V3 = (byte) 0x80;
	/* Values used for Firmware Update Md Report command */
	public static final byte FIRMWARE_UPDATE_MD_REPORT_PROPERTIES1_REPORT_NUMBER_1_MASK_V3 = 0x7F;
	public static final byte FIRMWARE_UPDATE_MD_REPORT_PROPERTIES1_LAST_BIT_MASK_V3 = (byte) 0x80;
	/* Values used for Firmware Update Md Request Report command */
	public static final byte FIRMWARE_UPDATE_MD_REQUEST_REPORT_INVALID_COMBINATION_V3 = 0x00;
	public static final byte FIRMWARE_UPDATE_MD_REQUEST_REPORT_REQUIRES_AUTHENTICATION_V3 = 0x01;
	public static final byte FIRMWARE_UPDATE_MD_REQUEST_REPORT_INVALID_FRAGMENT_SIZE_V3 = 0x02;
	public static final byte FIRMWARE_UPDATE_MD_REQUEST_REPORT_NOT_UPGRADABLE_V3 = 0x03;
	public static final byte FIRMWARE_UPDATE_MD_REQUEST_REPORT_VALID_COMBINATION_V3 = (byte) 0xFF;
	/* Values used for Firmware Update Md Status Report command */
	public static final byte FIRMWARE_UPDATE_MD_STATUS_REPORT_UNABLE_TO_RECEIVE_WITHOUT_CHECKSUM_ERROR_V3 = 0x00;
	public static final byte FIRMWARE_UPDATE_MD_STATUS_REPORT_UNABLE_TO_RECEIVE_V3 = 0x01;
	public static final byte FIRMWARE_UPDATE_MD_STATUS_REPORT_SUCCESSFULLY_STORED_V3 = (byte) 0xFE;
	public static final byte FIRMWARE_UPDATE_MD_STATUS_REPORT_SUCCESSFULLY_V3 = (byte) 0xFF;

	/* Geographic Location command class commands */
	public static final byte GEOGRAPHIC_LOCATION_VERSION = 0x01;
	public static final byte GEOGRAPHIC_LOCATION_GET = 0x02;
	public static final byte GEOGRAPHIC_LOCATION_REPORT = 0x03;
	public static final byte GEOGRAPHIC_LOCATION_SET = 0x01;
	/* Values used for Geographic Location Report command */
	public static final byte GEOGRAPHIC_LOCATION_REPORT_LEVEL_LONGITUDE_MINUTES_MASK = 0x7F;
	public static final byte GEOGRAPHIC_LOCATION_REPORT_LEVEL_LONG_SIGN_BIT_MASK = (byte) 0x80;
	public static final byte GEOGRAPHIC_LOCATION_REPORT_LEVEL2_LATITUDE_MINUTES_MASK = 0x7F;
	public static final byte GEOGRAPHIC_LOCATION_REPORT_LEVEL2_LAT_SIGN_BIT_MASK = (byte) 0x80;
	/* Values used for Geographic Location Set command */
	public static final byte GEOGRAPHIC_LOCATION_SET_LEVEL_LONGITUDE_MINUTES_MASK = 0x7F;
	public static final byte GEOGRAPHIC_LOCATION_SET_LEVEL_LONG_SIGN_BIT_MASK = (byte) 0x80;
	public static final byte GEOGRAPHIC_LOCATION_SET_LEVEL2_LATITUDE_MINUTES_MASK = 0x7F;
	public static final byte GEOGRAPHIC_LOCATION_SET_LEVEL2_LAT_SIGN_BIT_MASK = (byte) 0x80;

	/* Grouping Name command class commands */
	public static final byte GROUPING_NAME_VERSION = 0x01;
	public static final byte GROUPING_NAME_GET = 0x02;
	public static final byte GROUPING_NAME_REPORT = 0x03;
	public static final byte GROUPING_NAME_SET = 0x01;
	/* Values used for Grouping Name Report command */
	public static final byte GROUPING_NAME_REPORT_PROPERTIES1_CHAR_PRESENTATION_MASK = 0x07;
	public static final byte GROUPING_NAME_REPORT_PROPERTIES1_RESERVED_MASK = (byte) 0xF8;
	public static final byte GROUPING_NAME_REPORT_PROPERTIES1_RESERVED_SHIFT = 0x03;
	/* Values used for Grouping Name Set command */
	public static final byte GROUPING_NAME_SET_PROPERTIES1_CHAR_PRESENTATION_MASK = 0x07;
	public static final byte GROUPING_NAME_SET_PROPERTIES1_RESERVED_MASK = (byte) 0xF8;
	public static final byte GROUPING_NAME_SET_PROPERTIES1_RESERVED_SHIFT = 0x03;

	/* Hail command class commands */
	public static final byte HAIL_VERSION = 0x01;
	public static final byte HAIL = 0x01;

	/* Hrv Control command class commands */
	public static final byte HRV_CONTROL_VERSION = 0x01;
	public static final byte HRV_CONTROL_BYPASS_GET = 0x05;
	public static final byte HRV_CONTROL_BYPASS_REPORT = 0x06;
	public static final byte HRV_CONTROL_BYPASS_SET = 0x04;
	public static final byte HRV_CONTROL_MODE_GET = 0x02;
	public static final byte HRV_CONTROL_MODE_REPORT = 0x03;
	public static final byte HRV_CONTROL_MODE_SET = 0x01;
	public static final byte HRV_CONTROL_MODE_SUPPORTED_GET = 0x0A;
	public static final byte HRV_CONTROL_MODE_SUPPORTED_REPORT = 0x0B;
	public static final byte HRV_CONTROL_VENTILATION_RATE_GET = 0x08;
	public static final byte HRV_CONTROL_VENTILATION_RATE_REPORT = 0x09;
	public static final byte HRV_CONTROL_VENTILATION_RATE_SET = 0x07;
	/* Values used for Hrv Control Mode Report command */
	public static final byte HRV_CONTROL_MODE_REPORT_PROPERTIES1_MODE_MASK = 0x1F;
	public static final byte HRV_CONTROL_MODE_REPORT_MODE_OFF = 0x00;
	public static final byte HRV_CONTROL_MODE_REPORT_MODE_DEMAND_AUTOMATIC = 0x01;
	public static final byte HRV_CONTROL_MODE_REPORT_MODE_SCHEDULE = 0x02;
	public static final byte HRV_CONTROL_MODE_REPORT_MODE_ENERGY_SAVINGS_MODE = 0x03;
	public static final byte HRV_CONTROL_MODE_REPORT_MODE_MANUAL = 0x04;
	public static final byte HRV_CONTROL_MODE_REPORT_PROPERTIES1_RESERVED_MASK = (byte) 0xE0;
	public static final byte HRV_CONTROL_MODE_REPORT_PROPERTIES1_RESERVED_SHIFT = 0x05;
	/* Values used for Hrv Control Mode Set command */
	public static final byte HRV_CONTROL_MODE_SET_PROPERTIES1_MODE_MASK = 0x1F;
	public static final byte HRV_CONTROL_MODE_SET_MODE_OFF = 0x00;
	public static final byte HRV_CONTROL_MODE_SET_MODE_DEMAND_AUTOMATIC = 0x01;
	public static final byte HRV_CONTROL_MODE_SET_MODE_SCHEDULE = 0x02;
	public static final byte HRV_CONTROL_MODE_SET_MODE_ENERGY_SAVINGS_MODE = 0x03;
	public static final byte HRV_CONTROL_MODE_SET_MODE_MANUAL = 0x04;
	public static final byte HRV_CONTROL_MODE_SET_PROPERTIES1_RESERVED_MASK = (byte) 0xE0;
	public static final byte HRV_CONTROL_MODE_SET_PROPERTIES1_RESERVED_SHIFT = 0x05;
	/* Values used for Hrv Control Mode Supported Report command */
	public static final byte HRV_CONTROL_MODE_SUPPORTED_REPORT_PROPERTIES1_MANUAL_CONTROL_SUPPORTED_MASK = 0x0F;
	public static final byte HRV_CONTROL_MODE_SUPPORTED_REPORT_MANUAL_CONTROL_SUPPORTED_BYPASS_OPEN_CLOSE = 0x00;
	public static final byte HRV_CONTROL_MODE_SUPPORTED_REPORT_MANUAL_CONTROL_SUPPORTED_BYPASS_AUTO = 0x01;
	public static final byte HRV_CONTROL_MODE_SUPPORTED_REPORT_MANUAL_CONTROL_SUPPORTED_MODULATED_BYPASS = 0x02;
	public static final byte HRV_CONTROL_MODE_SUPPORTED_REPORT_MANUAL_CONTROL_SUPPORTED_VENTILATION_RATE = 0x03;
	public static final byte HRV_CONTROL_MODE_SUPPORTED_REPORT_PROPERTIES1_RESERVED_MASK = (byte) 0xF0;
	public static final byte HRV_CONTROL_MODE_SUPPORTED_REPORT_PROPERTIES1_RESERVED_SHIFT = 0x04;

	/* Hrv Status command class commands */
	public static final byte HRV_STATUS_VERSION = 0x01;
	public static final byte HRV_STATUS_GET = 0x01;
	public static final byte HRV_STATUS_REPORT = 0x02;
	public static final byte HRV_STATUS_SUPPORTED_GET = 0x03;
	public static final byte HRV_STATUS_SUPPORTED_REPORT = 0x04;
	/* Values used for Hrv Status Get command */
	public static final byte HRV_STATUS_GET_OUTDOOR_AIR_TEMPERATURE = 0x00;
	public static final byte HRV_STATUS_GET_SUPPLY_AIR_TEMPERATURE = 0x01;
	public static final byte HRV_STATUS_GET_EXHAUST_AIR_TEMPERATURE = 0x02;
	public static final byte HRV_STATUS_GET_DISCHARGE_AIR_TEMPERATURE = 0x03;
	public static final byte HRV_STATUS_GET_ROOM_TEMPERATURE = 0x04;
	public static final byte HRV_STATUS_GET_RELATIVE_HUMIDITY_IN_ROOM = 0x05;
	public static final byte HRV_STATUS_GET_REMAINING_FILTER_LIFE = 0x06;
	/* Values used for Hrv Status Report command */
	public static final byte HRV_STATUS_REPORT_OUTDOOR_AIR_TEMPERATURE = 0x00;
	public static final byte HRV_STATUS_REPORT_SUPPLY_AIR_TEMPERATURE = 0x01;
	public static final byte HRV_STATUS_REPORT_EXHAUST_AIR_TEMPERATURE = 0x02;
	public static final byte HRV_STATUS_REPORT_DISCHARGE_AIR_TEMPERATURE = 0x03;
	public static final byte HRV_STATUS_REPORT_ROOM_TEMPERATURE = 0x04;
	public static final byte HRV_STATUS_REPORT_RELATIVE_HUMIDITY_IN_ROOM = 0x05;
	public static final byte HRV_STATUS_REPORT_REMAINING_FILTER_LIFE = 0x06;
	public static final byte HRV_STATUS_REPORT_PROPERTIES1_SIZE_MASK = 0x07;
	public static final byte HRV_STATUS_REPORT_PROPERTIES1_SCALE_MASK = 0x18;
	public static final byte HRV_STATUS_REPORT_PROPERTIES1_SCALE_SHIFT = 0x03;
	public static final byte HRV_STATUS_REPORT_PROPERTIES1_PRECISION_MASK = (byte) 0xE0;
	public static final byte HRV_STATUS_REPORT_PROPERTIES1_PRECISION_SHIFT = 0x05;

	/* Indicator command class commands */
	public static final byte INDICATOR_VERSION = 0x01;
	public static final byte INDICATOR_GET = 0x02;
	public static final byte INDICATOR_REPORT = 0x03;
	public static final byte INDICATOR_SET = 0x01;

	/* Ip Configuration command class commands */
	public static final byte IP_CONFIGURATION_VERSION = 0x01;
	public static final byte IP_CONFIGURATION_GET = 0x02;
	public static final byte IP_CONFIGURATION_RELEASE = 0x04;
	public static final byte IP_CONFIGURATION_RENEW = 0x05;
	public static final byte IP_CONFIGURATION_REPORT = 0x03;
	public static final byte IP_CONFIGURATION_SET = 0x01;
	/* Values used for Ip Configuration Report command */
	public static final byte IP_CONFIGURATION_REPORT_PROPERTIES1_AUTO_DNS_BIT_MASK = 0x01;
	public static final byte IP_CONFIGURATION_REPORT_PROPERTIES1_AUTO_IP_BIT_MASK = 0x02;
	public static final byte IP_CONFIGURATION_REPORT_PROPERTIES1_RESERVED_MASK = (byte) 0xFC;
	public static final byte IP_CONFIGURATION_REPORT_PROPERTIES1_RESERVED_SHIFT = 0x02;
	/* Values used for Ip Configuration Set command */
	public static final byte IP_CONFIGURATION_SET_PROPERTIES1_AUTO_DNS_BIT_MASK = 0x01;
	public static final byte IP_CONFIGURATION_SET_PROPERTIES1_AUTO_IP_BIT_MASK = 0x02;
	public static final byte IP_CONFIGURATION_SET_PROPERTIES1_RESERVED_MASK = (byte) 0xFC;
	public static final byte IP_CONFIGURATION_SET_PROPERTIES1_RESERVED_SHIFT = 0x02;

	/* Language command class commands */
	public static final byte LANGUAGE_VERSION = 0x01;
	public static final byte LANGUAGE_GET = 0x02;
	public static final byte LANGUAGE_REPORT = 0x03;
	public static final byte LANGUAGE_SET = 0x01;

	/* Lock command class commands */
	public static final byte LOCK_VERSION = 0x01;
	public static final byte LOCK_GET = 0x02;
	public static final byte LOCK_REPORT = 0x03;
	public static final byte LOCK_SET = 0x01;

	/* Manufacturer Proprietary command class commands */
	public static final byte MANUFACTURER_PROPRIETARY_VERSION = 0x01;

	/* Manufacturer Specific command class commands */
	public static final byte MANUFACTURER_SPECIFIC_VERSION = 0x01;
	public static final byte MANUFACTURER_SPECIFIC_GET = 0x04;
	public static final byte MANUFACTURER_SPECIFIC_REPORT = 0x05;

	/* Manufacturer Specific command class commands */
	public static final byte MANUFACTURER_SPECIFIC_VERSION_V2 = 0x02;
	public static final byte MANUFACTURER_SPECIFIC_GET_V2 = 0x04;
	public static final byte MANUFACTURER_SPECIFIC_REPORT_V2 = 0x05;
	public static final byte DEVICE_SPECIFIC_GET_V2 = 0x06;
	public static final byte DEVICE_SPECIFIC_REPORT_V2 = 0x07;
	/* Values used for Device Specific Get command */
	public static final byte DEVICE_SPECIFIC_GET_PROPERTIES1_DEVICE_ID_TYPE_MASK_V2 = 0x07;
	public static final byte DEVICE_SPECIFIC_GET_DEVICE_ID_TYPE_RESERVED_V2 = 0x00;
	public static final byte DEVICE_SPECIFIC_GET_DEVICE_ID_TYPE_SERIAL_NUMBER_V2 = 0x01;
	public static final byte DEVICE_SPECIFIC_GET_PROPERTIES1_RESERVED_MASK_V2 = (byte) 0xF8;
	public static final byte DEVICE_SPECIFIC_GET_PROPERTIES1_RESERVED_SHIFT_V2 = 0x03;
	/* Values used for Device Specific Report command */
	public static final byte DEVICE_SPECIFIC_REPORT_PROPERTIES1_DEVICE_ID_TYPE_MASK_V2 = 0x07;
	public static final byte DEVICE_SPECIFIC_REPORT_DEVICE_ID_TYPE_RESERVED_V2 = 0x00;
	public static final byte DEVICE_SPECIFIC_REPORT_DEVICE_ID_TYPE_SERIAL_NUMBER_V2 = 0x01;
	public static final byte DEVICE_SPECIFIC_REPORT_PROPERTIES1_RESERVED_MASK_V2 = (byte) 0xF8;
	public static final byte DEVICE_SPECIFIC_REPORT_PROPERTIES1_RESERVED_SHIFT_V2 = 0x03;
	public static final byte DEVICE_SPECIFIC_REPORT_PROPERTIES2_DEVICE_ID_DATA_LENGTH_INDICATOR_MASK_V2 = 0x1F;
	public static final byte DEVICE_SPECIFIC_REPORT_PROPERTIES2_DEVICE_ID_DATA_FORMAT_MASK_V2 = (byte) 0xE0;
	public static final byte DEVICE_SPECIFIC_REPORT_PROPERTIES2_DEVICE_ID_DATA_FORMAT_SHIFT_V2 = 0x05;
	public static final byte DEVICE_SPECIFIC_REPORT_DEVICE_ID_DATA_FORMAT_RESERVED_V2 = 0x00;
	public static final byte DEVICE_SPECIFIC_REPORT_DEVICE_ID_DATA_FORMAT_BINARY_V2 = 0x01;

	/* Mark command class commands */
	public static final byte MARK_VERSION = 0x01;

	/* Meter Pulse command class commands */
	public static final byte METER_PULSE_VERSION = 0x01;
	public static final byte METER_PULSE_GET = 0x04;
	public static final byte METER_PULSE_REPORT = 0x05;

	/* Meter Tbl Config command class commands */
	public static final byte METER_TBL_CONFIG_VERSION = 0x01;
	public static final byte METER_TBL_TABLE_POINT_ADM_NO_SET = 0x01;
	/* Values used for Meter Tbl Table Pobyte Adm No Set command */
	public static final byte METER_TBL_TABLE_POINT_ADM_NO_SET_PROPERTIES1_NUMBER_OF_CHARACTERS_MASK = 0x1F;
	public static final byte METER_TBL_TABLE_POINT_ADM_NO_SET_PROPERTIES1_RESERVED_MASK = (byte) 0xE0;
	public static final byte METER_TBL_TABLE_POINT_ADM_NO_SET_PROPERTIES1_RESERVED_SHIFT = 0x05;

	/* Meter Tbl Monitor command class commands */
	public static final byte METER_TBL_MONITOR_VERSION = 0x01;
	public static final byte METER_TBL_STATUS_REPORT = 0x0B;
	public static final byte METER_TBL_STATUS_DATE_GET = 0x0A;
	public static final byte METER_TBL_STATUS_DEPTH_GET = 0x09;
	public static final byte METER_TBL_STATUS_SUPPORTED_GET = 0x07;
	public static final byte METER_TBL_STATUS_SUPPORTED_REPORT = 0x08;
	public static final byte METER_TBL_CURRENT_DATA_GET = 0x0C;
	public static final byte METER_TBL_CURRENT_DATA_REPORT = 0x0D;
	public static final byte METER_TBL_HISTORICAL_DATA_GET = 0x0E;
	public static final byte METER_TBL_HISTORICAL_DATA_REPORT = 0x0F;
	public static final byte METER_TBL_REPORT = 0x06;
	public static final byte METER_TBL_TABLE_CAPABILITY_GET = 0x05;
	public static final byte METER_TBL_TABLE_ID_GET = 0x03;
	public static final byte METER_TBL_TABLE_ID_REPORT = 0x04;
	public static final byte METER_TBL_TABLE_POINT_ADM_NO_GET = 0x01;
	public static final byte METER_TBL_TABLE_POINT_ADM_NO_REPORT = 0x02;
	/* Values used for Meter Tbl Current Data Report command */
	public static final byte METER_TBL_CURRENT_DATA_REPORT_PROPERTIES1_RATE_TYPE_MASK = 0x03;
	public static final byte METER_TBL_CURRENT_DATA_REPORT_PROPERTIES1_RESERVED_MASK = (byte) 0xFC;
	public static final byte METER_TBL_CURRENT_DATA_REPORT_PROPERTIES1_RESERVED_SHIFT = 0x02;
	/* Values used for Meter Tbl Historical Data Report command */
	public static final byte METER_TBL_HISTORICAL_DATA_REPORT_PROPERTIES1_RATE_TYPE_MASK = 0x03;
	public static final byte METER_TBL_HISTORICAL_DATA_REPORT_PROPERTIES1_RESERVED_MASK = (byte) 0xFC;
	public static final byte METER_TBL_HISTORICAL_DATA_REPORT_PROPERTIES1_RESERVED_SHIFT = 0x02;
	/* Values used for Meter Tbl Report command */
	public static final byte METER_TBL_REPORT_PROPERTIES1_METER_TYPE_MASK = 0x3F;
	public static final byte METER_TBL_REPORT_PROPERTIES1_RATE_TYPE_MASK = (byte) 0xC0;
	public static final byte METER_TBL_REPORT_PROPERTIES1_RATE_TYPE_SHIFT = 0x06;
	public static final byte METER_TBL_REPORT_PROPERTIES2_PAY_METER_MASK = 0x0F;
	public static final byte METER_TBL_REPORT_PAY_METER_RESERVED = 0x00;
	public static final byte METER_TBL_REPORT_PAY_METER_CREDITMETER = 0x01;
	public static final byte METER_TBL_REPORT_PAY_METER_PREPAYMENT_METER = 0x02;
	public static final byte METER_TBL_REPORT_PAY_METER_PREPAYMENT_METER_DEBT = 0x03;
	public static final byte METER_TBL_REPORT_PROPERTIES2_RESERVED_MASK = (byte) 0xF0;
	public static final byte METER_TBL_REPORT_PROPERTIES2_RESERVED_SHIFT = 0x04;
	/* Values used for Meter Tbl Table Id Report command */
	public static final byte METER_TBL_TABLE_ID_REPORT_PROPERTIES1_NUMBER_OF_CHARACTERS_MASK = 0x1F;
	public static final byte METER_TBL_TABLE_ID_REPORT_PROPERTIES1_RESERVED_MASK = (byte) 0xE0;
	public static final byte METER_TBL_TABLE_ID_REPORT_PROPERTIES1_RESERVED_SHIFT = 0x05;
	/* Values used for Meter Tbl Table Pobyte Adm No Report command */
	public static final byte METER_TBL_TABLE_POINT_ADM_NO_REPORT_PROPERTIES1_NUMBER_OF_CHARACTERS_MASK = 0x1F;
	public static final byte METER_TBL_TABLE_POINT_ADM_NO_REPORT_PROPERTIES1_RESERVED_MASK = (byte) 0xE0;
	public static final byte METER_TBL_TABLE_POINT_ADM_NO_REPORT_PROPERTIES1_RESERVED_SHIFT = 0x05;

	/* Meter Tbl Monitor command class commands */
	public static final byte METER_TBL_MONITOR_VERSION_V2 = 0x02;
	public static final byte METER_TBL_STATUS_REPORT_V2 = 0x0B;
	public static final byte METER_TBL_STATUS_DATE_GET_V2 = 0x0A;
	public static final byte METER_TBL_STATUS_DEPTH_GET_V2 = 0x09;
	public static final byte METER_TBL_STATUS_SUPPORTED_GET_V2 = 0x07;
	public static final byte METER_TBL_STATUS_SUPPORTED_REPORT_V2 = 0x08;
	public static final byte METER_TBL_CURRENT_DATA_GET_V2 = 0x0C;
	public static final byte METER_TBL_CURRENT_DATA_REPORT_V2 = 0x0D;
	public static final byte METER_TBL_HISTORICAL_DATA_GET_V2 = 0x0E;
	public static final byte METER_TBL_HISTORICAL_DATA_REPORT_V2 = 0x0F;
	public static final byte METER_TBL_REPORT_V2 = 0x06;
	public static final byte METER_TBL_TABLE_CAPABILITY_GET_V2 = 0x05;
	public static final byte METER_TBL_TABLE_ID_GET_V2 = 0x03;
	public static final byte METER_TBL_TABLE_ID_REPORT_V2 = 0x04;
	public static final byte METER_TBL_TABLE_POINT_ADM_NO_GET_V2 = 0x01;
	public static final byte METER_TBL_TABLE_POINT_ADM_NO_REPORT_V2 = 0x02;
	/* Values used for Meter Tbl Current Data Report command */
	public static final byte METER_TBL_CURRENT_DATA_REPORT_PROPERTIES1_RATE_TYPE_MASK_V2 = 0x03;
	public static final byte METER_TBL_CURRENT_DATA_REPORT_PROPERTIES1_RESERVED_MASK_V2 = 0x7C;
	public static final byte METER_TBL_CURRENT_DATA_REPORT_PROPERTIES1_RESERVED_SHIFT_V2 = 0x02;
	public static final byte METER_TBL_CURRENT_DATA_REPORT_PROPERTIES1_OPERATING_STATUS_INDICATION_BIT_MASK_V2 = (byte) 0x80;
	/* Values used for Meter Tbl Historical Data Report command */
	public static final byte METER_TBL_HISTORICAL_DATA_REPORT_PROPERTIES1_RATE_TYPE_MASK_V2 = 0x03;
	public static final byte METER_TBL_HISTORICAL_DATA_REPORT_PROPERTIES1_RESERVED_MASK_V2 = 0x7C;
	public static final byte METER_TBL_HISTORICAL_DATA_REPORT_PROPERTIES1_RESERVED_SHIFT_V2 = 0x02;
	public static final byte METER_TBL_HISTORICAL_DATA_REPORT_PROPERTIES1_OPERATING_STATUS_INDICATION_BIT_MASK_V2 = (byte) 0x80;
	/* Values used for Meter Tbl Report command */
	public static final byte METER_TBL_REPORT_PROPERTIES1_METER_TYPE_MASK_V2 = 0x3F;
	public static final byte METER_TBL_REPORT_PROPERTIES1_RATE_TYPE_MASK_V2 = (byte) 0xC0;
	public static final byte METER_TBL_REPORT_PROPERTIES1_RATE_TYPE_SHIFT_V2 = 0x06;
	public static final byte METER_TBL_REPORT_PROPERTIES2_PAY_METER_MASK_V2 = 0x0F;
	public static final byte METER_TBL_REPORT_PAY_METER_RESERVED_V2 = 0x00;
	public static final byte METER_TBL_REPORT_PAY_METER_CREDITMETER_V2 = 0x01;
	public static final byte METER_TBL_REPORT_PAY_METER_PREPAYMENT_METER_V2 = 0x02;
	public static final byte METER_TBL_REPORT_PAY_METER_PREPAYMENT_METER_DEBT_V2 = 0x03;
	public static final byte METER_TBL_REPORT_PROPERTIES2_RESERVED_MASK_V2 = (byte) 0xF0;
	public static final byte METER_TBL_REPORT_PROPERTIES2_RESERVED_SHIFT_V2 = 0x04;
	/* Values used for Meter Tbl Table Id Report command */
	public static final byte METER_TBL_TABLE_ID_REPORT_PROPERTIES1_NUMBER_OF_CHARACTERS_MASK_V2 = 0x1F;
	public static final byte METER_TBL_TABLE_ID_REPORT_PROPERTIES1_RESERVED_MASK_V2 = (byte) 0xE0;
	public static final byte METER_TBL_TABLE_ID_REPORT_PROPERTIES1_RESERVED_SHIFT_V2 = 0x05;
	/* Values used for Meter Tbl Table Pobyte Adm No Report command */
	public static final byte METER_TBL_TABLE_POINT_ADM_NO_REPORT_PROPERTIES1_NUMBER_OF_CHARACTERS_MASK_V2 = 0x1F;
	public static final byte METER_TBL_TABLE_POINT_ADM_NO_REPORT_PROPERTIES1_RESERVED_MASK_V2 = (byte) 0xE0;
	public static final byte METER_TBL_TABLE_POINT_ADM_NO_REPORT_PROPERTIES1_RESERVED_SHIFT_V2 = 0x05;

	/* Meter Tbl Push command class commands */
	public static final byte METER_TBL_PUSH_VERSION = 0x01;
	public static final byte METER_TBL_PUSH_CONFIGURATION_GET = 0x02;
	public static final byte METER_TBL_PUSH_CONFIGURATION_REPORT = 0x03;
	public static final byte METER_TBL_PUSH_CONFIGURATION_SET = 0x01;
	/* Values used for Meter Tbl Push Configuration Report command */
	public static final byte METER_TBL_PUSH_CONFIGURATION_REPORT_PROPERTIES1_OPERATING_STATUS_PUSH_MODE_MASK = 0x0F;
	public static final byte METER_TBL_PUSH_CONFIGURATION_REPORT_PROPERTIES1_PS_BIT_MASK = 0x10;
	public static final byte METER_TBL_PUSH_CONFIGURATION_REPORT_PROPERTIES1_RESERVED_MASK = (byte) 0xE0;
	public static final byte METER_TBL_PUSH_CONFIGURATION_REPORT_PROPERTIES1_RESERVED_SHIFT = 0x05;
	/* Values used for Meter Tbl Push Configuration Set command */
	public static final byte METER_TBL_PUSH_CONFIGURATION_SET_PROPERTIES1_OPERATING_STATUS_PUSH_MODE_MASK = 0x0F;
	public static final byte METER_TBL_PUSH_CONFIGURATION_SET_PROPERTIES1_PS_BIT_MASK = 0x10;
	public static final byte METER_TBL_PUSH_CONFIGURATION_SET_PROPERTIES1_RESERVED_MASK = (byte) 0xE0;
	public static final byte METER_TBL_PUSH_CONFIGURATION_SET_PROPERTIES1_RESERVED_SHIFT = 0x05;

	/* Meter command class commands */
	public static final byte METER_VERSION = 0x01;
	public static final byte METER_GET = 0x01;
	public static final byte METER_REPORT = 0x02;
	/* Values used for Meter Report command */
	public static final byte METER_REPORT_ELECTRIC_METER = 0x01;
	public static final byte METER_REPORT_GAS_METER = 0x02;
	public static final byte METER_REPORT_WATER_METER = 0x03;
	public static final byte METER_REPORT_PROPERTIES1_SIZE_MASK = 0x07;
	public static final byte METER_REPORT_PROPERTIES1_SCALE_MASK = 0x18;
	public static final byte METER_REPORT_PROPERTIES1_SCALE_SHIFT = 0x03;
	public static final byte METER_REPORT_PROPERTIES1_PRECISION_MASK = (byte) 0xE0;
	public static final byte METER_REPORT_PROPERTIES1_PRECISION_SHIFT = 0x05;

	/* Meter command class commands */
	public static final byte METER_VERSION_V2 = 0x02;
	public static final byte METER_GET_V2 = 0x01;
	public static final byte METER_REPORT_V2 = 0x02;
	public static final byte METER_RESET_V2 = 0x05;
	public static final byte METER_SUPPORTED_GET_V2 = 0x03;
	public static final byte METER_SUPPORTED_REPORT_V2 = 0x04;
	/* Values used for Meter Get command */
	public static final byte METER_GET_PROPERTIES1_RESERVED_MASK_V2 = 0x07;
	public static final byte METER_GET_PROPERTIES1_SCALE_MASK_V2 = 0x18;
	public static final byte METER_GET_PROPERTIES1_SCALE_SHIFT_V2 = 0x03;
	public static final byte METER_GET_PROPERTIES1_RESERVED2_MASK_V2 = (byte) 0xE0;
	public static final byte METER_GET_PROPERTIES1_RESERVED2_SHIFT_V2 = 0x05;
	/* Values used for Meter Report command */
	public static final byte METER_REPORT_PROPERTIES1_METER_TYPE_MASK_V2 = 0x1F;
	public static final byte METER_REPORT_PROPERTIES1_RATE_TYPE_MASK_V2 = 0x60;
	public static final byte METER_REPORT_PROPERTIES1_RATE_TYPE_SHIFT_V2 = 0x05;
	public static final byte METER_REPORT_PROPERTIES1_RESERVED_BIT_MASK_V2 = (byte) 0x80;
	public static final byte METER_REPORT_PROPERTIES2_SIZE_MASK_V2 = 0x07;
	public static final byte METER_REPORT_PROPERTIES2_SCALE_MASK_V2 = 0x18;
	public static final byte METER_REPORT_PROPERTIES2_SCALE_SHIFT_V2 = 0x03;
	public static final byte METER_REPORT_PROPERTIES2_PRECISION_MASK_V2 = (byte) 0xE0;
	public static final byte METER_REPORT_PROPERTIES2_PRECISION_SHIFT_V2 = 0x05;
	/* Values used for Meter Supported Report command */
	public static final byte METER_SUPPORTED_REPORT_PROPERTIES1_METER_TYPE_MASK_V2 = 0x1F;
	public static final byte METER_SUPPORTED_REPORT_PROPERTIES1_RESERVED_MASK_V2 = 0x60;
	public static final byte METER_SUPPORTED_REPORT_PROPERTIES1_RESERVED_SHIFT_V2 = 0x05;
	public static final byte METER_SUPPORTED_REPORT_PROPERTIES1_METER_RESET_BIT_MASK_V2 = (byte) 0x80;
	public static final byte METER_SUPPORTED_REPORT_PROPERTIES2_SCALE_SUPPORTED_MASK_V2 = 0x0F;
	public static final byte METER_SUPPORTED_REPORT_PROPERTIES2_RESERVED_MASK_V2 = (byte) 0xF0;
	public static final byte METER_SUPPORTED_REPORT_PROPERTIES2_RESERVED_SHIFT_V2 = 0x04;

	/* Meter command class commands */
	public static final byte METER_VERSION_V3 = 0x03;
	public static final byte METER_GET_V3 = 0x01;
	public static final byte METER_REPORT_V3 = 0x02;
	public static final byte METER_RESET_V3 = 0x05;
	public static final byte METER_SUPPORTED_GET_V3 = 0x03;
	public static final byte METER_SUPPORTED_REPORT_V3 = 0x04;
	/* Values used for Meter Get command */
	public static final byte METER_GET_PROPERTIES1_RESERVED_MASK_V3 = 0x07;
	public static final byte METER_GET_PROPERTIES1_SCALE_MASK_V3 = 0x38;
	public static final byte METER_GET_PROPERTIES1_SCALE_SHIFT_V3 = 0x03;
	public static final byte METER_GET_PROPERTIES1_RESERVED2_MASK_V3 = (byte) 0xC0;
	public static final byte METER_GET_PROPERTIES1_RESERVED2_SHIFT_V3 = 0x06;
	/* Values used for Meter Report command */
	public static final byte METER_REPORT_PROPERTIES1_METER_TYPE_MASK_V3 = 0x1F;
	public static final byte METER_REPORT_PROPERTIES1_RATE_TYPE_MASK_V3 = 0x60;
	public static final byte METER_REPORT_PROPERTIES1_RATE_TYPE_SHIFT_V3 = 0x05;
	public static final byte METER_REPORT_PROPERTIES1_SCALE2_BIT_MASK_V3 = (byte) 0x80;
	public static final byte METER_REPORT_PROPERTIES2_SIZE_MASK_V3 = 0x07;
	public static final byte METER_REPORT_PROPERTIES2_SCALE_MASK_V3 = 0x18;
	public static final byte METER_REPORT_PROPERTIES2_SCALE_SHIFT_V3 = 0x03;
	public static final byte METER_REPORT_PROPERTIES2_PRECISION_MASK_V3 = (byte) 0xE0;
	public static final byte METER_REPORT_PROPERTIES2_PRECISION_SHIFT_V3 = 0x05;
	/* Values used for Meter Supported Report command */
	public static final byte METER_SUPPORTED_REPORT_PROPERTIES1_METER_TYPE_MASK_V3 = 0x1F;
	public static final byte METER_SUPPORTED_REPORT_PROPERTIES1_RESERVED_MASK_V3 = 0x60;
	public static final byte METER_SUPPORTED_REPORT_PROPERTIES1_RESERVED_SHIFT_V3 = 0x05;
	public static final byte METER_SUPPORTED_REPORT_PROPERTIES1_METER_RESET_BIT_MASK_V3 = (byte) 0x80;

	/* Meter command class commands */
	public static final byte METER_VERSION_V4 = 0x04;
	public static final byte METER_GET_V4 = 0x01;
	public static final byte METER_REPORT_V4 = 0x02;
	public static final byte METER_RESET_V4 = 0x05;
	public static final byte METER_SUPPORTED_GET_V4 = 0x03;
	public static final byte METER_SUPPORTED_REPORT_V4 = 0x04;
	/* Values used for Meter Get command */
	public static final byte METER_GET_PROPERTIES1_RESERVED_MASK_V4 = 0x07;
	public static final byte METER_GET_PROPERTIES1_SCALE_MASK_V4 = 0x38;
	public static final byte METER_GET_PROPERTIES1_SCALE_SHIFT_V4 = 0x03;
	public static final byte METER_GET_PROPERTIES1_RATE_TYPE_MASK_V4 = (byte) 0xC0;
	public static final byte METER_GET_PROPERTIES1_RATE_TYPE_SHIFT_V4 = 0x06;
	public static final byte METER_GET_RATE_TYPE_RESERVED_V4 = 0x00;
	public static final byte METER_GET_RATE_TYPE_IMPORT_V4 = 0x01;
	public static final byte METER_GET_RATE_TYPE_EXPORT_V4 = 0x02;
	public static final byte METER_GET_RATE_TYPE_NOT_TO_BE_USED_V4 = 0x03;
	/* Values used for Meter Report command */
	public static final byte METER_REPORT_PROPERTIES1_METER_TYPE_MASK_V4 = 0x1F;
	public static final byte METER_REPORT_METER_TYPE_RESERVED_V4 = 0x00;
	public static final byte METER_REPORT_METER_TYPE_ELECTRIC_METER_V4 = 0x01;
	public static final byte METER_REPORT_METER_TYPE_GAS_METER_V4 = 0x02;
	public static final byte METER_REPORT_METER_TYPE_WATER_METER_V4 = 0x03;
	public static final byte METER_REPORT_PROPERTIES1_RATE_TYPE_MASK_V4 = 0x60;
	public static final byte METER_REPORT_PROPERTIES1_RATE_TYPE_SHIFT_V4 = 0x05;
	public static final byte METER_REPORT_RATE_TYPE_RESERVED_V4 = 0x00;
	public static final byte METER_REPORT_RATE_TYPE_IMPORT_V4 = 0x01;
	public static final byte METER_REPORT_RATE_TYPE_EXPORT_V4 = 0x02;
	public static final byte METER_REPORT_RATE_TYPE_NOT_TO_BE_USED_V4 = 0x03;
	public static final byte METER_REPORT_PROPERTIES1_SCALE2_BIT_MASK_V4 = (byte) 0x80;
	public static final byte METER_REPORT_PROPERTIES2_SIZE_MASK_V4 = 0x07;
	public static final byte METER_REPORT_PROPERTIES2_SCALE10_MASK_V4 = 0x18;
	public static final byte METER_REPORT_PROPERTIES2_SCALE10_SHIFT_V4 = 0x03;
	public static final byte METER_REPORT_PROPERTIES2_PRECISION_MASK_V4 = (byte) 0xE0;
	public static final byte METER_REPORT_PROPERTIES2_PRECISION_SHIFT_V4 = 0x05;
	/* Values used for Meter Supported Report command */
	public static final byte METER_SUPPORTED_REPORT_PROPERTIES1_METER_TYPE_MASK_V4 = 0x1F;
	public static final byte METER_SUPPORTED_REPORT_METER_TYPE_RESERVED_V4 = 0x00;
	public static final byte METER_SUPPORTED_REPORT_METER_TYPE_ELECTRIC_METER_V4 = 0x01;
	public static final byte METER_SUPPORTED_REPORT_METER_TYPE_GAS_METER_V4 = 0x02;
	public static final byte METER_SUPPORTED_REPORT_METER_TYPE_WATER_METER_V4 = 0x03;
	public static final byte METER_SUPPORTED_REPORT_PROPERTIES1_RATE_TYPE_MASK_V4 = 0x60;
	public static final byte METER_SUPPORTED_REPORT_PROPERTIES1_RATE_TYPE_SHIFT_V4 = 0x05;
	public static final byte METER_SUPPORTED_REPORT_RATE_TYPE_RESERVED_V4 = 0x00;
	public static final byte METER_SUPPORTED_REPORT_RATE_TYPE_IMPORT_ONLY_V4 = 0x01;
	public static final byte METER_SUPPORTED_REPORT_RATE_TYPE_EXPORT_ONLY_V4 = 0x02;
	public static final byte METER_SUPPORTED_REPORT_RATE_TYPE_IMPORT_AND_EXPORT_V4 = 0x03;
	public static final byte METER_SUPPORTED_REPORT_PROPERTIES1_METER_RESET_BIT_MASK_V4 = (byte) 0x80;
	public static final byte METER_SUPPORTED_REPORT_PROPERTIES2_SCALE_SUPPORTED_0_MASK_V4 = 0x7F;
	public static final byte METER_SUPPORTED_REPORT_PROPERTIES2_M_S_T_BIT_MASK_V4 = (byte) 0x80;

	/* Mtp Window Covering command class commands */
	public static final byte MTP_WINDOW_COVERING_VERSION = 0x01;
	public static final byte MOVE_TO_POSITION_GET = 0x02;
	public static final byte MOVE_TO_POSITION_REPORT = 0x03;
	public static final byte MOVE_TO_POSITION_SET = 0x01;

	/* Multi Channel Association command class commands */
	public static final byte MULTI_CHANNEL_ASSOCIATION_VERSION_V2 = 0x02;
	public static final byte MULTI_CHANNEL_ASSOCIATION_GET_V2 = 0x02;
	public static final byte MULTI_CHANNEL_ASSOCIATION_GROUPINGS_GET_V2 = 0x05;
	public static final byte MULTI_CHANNEL_ASSOCIATION_GROUPINGS_REPORT_V2 = 0x06;
	public static final byte MULTI_CHANNEL_ASSOCIATION_REMOVE_V2 = 0x04;
	public static final byte MULTI_CHANNEL_ASSOCIATION_REPORT_V2 = 0x03;
	public static final byte MULTI_CHANNEL_ASSOCIATION_SET_V2 = 0x01;
	/* Values used for Multi Channel Association Remove command */
	public static final byte MULTI_CHANNEL_ASSOCIATION_REMOVE_MARKER_V2 = 0x00; /*
																				 * This marker identifier is used to
																				 * separate between nodes without and
																				 * with end pobytes attached. This field
																				 * can be omitted in case no Multi
																				 * Channel node follows.
																				 */
	/* Values used for Multi Channel Association Report command */
	public static final byte MULTI_CHANNEL_ASSOCIATION_REPORT_MARKER_V2 = 0x00; /*
																				 * This marker identifier is used to
																				 * separate between nodes without and
																				 * with end pobytes attached. This field
																				 * can be omitted in case no Multi
																				 * Channel node follows.
																				 */
	/* Values used for Multi Channel Association Set command */
	public static final byte MULTI_CHANNEL_ASSOCIATION_SET_MARKER_V2 = 0x00; /*
																				 * This marker identifier is used to
																				 * separate between nodes without and
																				 * with end pobytes attached. This field
																				 * can be omitted in case no Multi
																				 * Channel node follows.
																				 */

	/* Multi Channel command class commands */
	public static final byte MULTI_CHANNEL_VERSION_V2 = 0x02;
	public static final byte MULTI_CHANNEL_CAPABILITY_GET_V2 = 0x09;
	public static final byte MULTI_CHANNEL_CAPABILITY_REPORT_V2 = 0x0A;
	public static final byte MULTI_CHANNEL_CMD_ENCAP_V2 = 0x0D;
	public static final byte MULTI_CHANNEL_END_POINT_FIND_V2 = 0x0B;
	public static final byte MULTI_CHANNEL_END_POINT_FIND_REPORT_V2 = 0x0C;
	public static final byte MULTI_CHANNEL_END_POINT_GET_V2 = 0x07;
	public static final byte MULTI_CHANNEL_END_POINT_REPORT_V2 = 0x08;
	public static final byte MULTI_INSTANCE_CMD_ENCAP_V2 = 0x06;
	public static final byte MULTI_INSTANCE_GET_V2 = 0x04;
	public static final byte MULTI_INSTANCE_REPORT_V2 = 0x05;
	/* Values used for Multi Channel Capability Get command */
	public static final byte MULTI_CHANNEL_CAPABILITY_GET_PROPERTIES1_END_POINT_MASK_V2 = 0x7F;
	public static final byte MULTI_CHANNEL_CAPABILITY_GET_PROPERTIES1_RES_BIT_MASK_V2 = (byte) 0x80;
	/* Values used for Multi Channel Capability Report command */
	public static final byte MULTI_CHANNEL_CAPABILITY_REPORT_PROPERTIES1_END_POINT_MASK_V2 = 0x7F;
	public static final byte MULTI_CHANNEL_CAPABILITY_REPORT_PROPERTIES1_DYNAMIC_BIT_MASK_V2 = (byte) 0x80;
	/* Values used for Multi Channel Cmd Encap command */
	public static final byte MULTI_CHANNEL_CMD_ENCAP_PROPERTIES1_SOURCE_END_POINT_MASK_V2 = 0x7F;
	public static final byte MULTI_CHANNEL_CMD_ENCAP_PROPERTIES1_RES_BIT_MASK_V2 = (byte) 0x80;
	public static final byte MULTI_CHANNEL_CMD_ENCAP_PROPERTIES2_DESTINATION_END_POINT_MASK_V2 = 0x7F;
	public static final byte MULTI_CHANNEL_CMD_ENCAP_PROPERTIES2_BIT_ADDRESS_BIT_MASK_V2 = (byte) 0x80;
	/* Values used for Multi Channel End Pobyte Report command */
	public static final byte MULTI_CHANNEL_END_POINT_REPORT_PROPERTIES1_RES_MASK_V2 = 0x3F;
	public static final byte MULTI_CHANNEL_END_POINT_REPORT_PROPERTIES1_IDENTICAL_BIT_MASK_V2 = 0x40;
	public static final byte MULTI_CHANNEL_END_POINT_REPORT_PROPERTIES1_DYNAMIC_BIT_MASK_V2 = (byte) 0x80;
	public static final byte MULTI_CHANNEL_END_POINT_REPORT_PROPERTIES2_END_POINTS_MASK_V2 = 0x7F;
	public static final byte MULTI_CHANNEL_END_POINT_REPORT_PROPERTIES2_RES_BIT_MASK_V2 = (byte) 0x80;
	/* Values used for Multi Instance Cmd Encap command */
	public static final byte MULTI_INSTANCE_CMD_ENCAP_PROPERTIES1_INSTANCE_MASK_V2 = 0x7F;
	public static final byte MULTI_INSTANCE_CMD_ENCAP_PROPERTIES1_RES_BIT_MASK_V2 = (byte) 0x80;
	/* Values used for Multi Instance Report command */
	public static final byte MULTI_INSTANCE_REPORT_PROPERTIES1_INSTANCES_MASK_V2 = 0x7F;
	public static final byte MULTI_INSTANCE_REPORT_PROPERTIES1_RES_BIT_MASK_V2 = (byte) 0x80;

	/* Multi Channel command class commands */
	public static final byte MULTI_CHANNEL_VERSION_V3 = 0x03;
	public static final byte MULTI_CHANNEL_CAPABILITY_GET_V3 = 0x09;
	public static final byte MULTI_CHANNEL_CAPABILITY_REPORT_V3 = 0x0A;
	public static final byte MULTI_CHANNEL_CMD_ENCAP_V3 = 0x0D;
	public static final byte MULTI_CHANNEL_END_POINT_FIND_V3 = 0x0B;
	public static final byte MULTI_CHANNEL_END_POINT_FIND_REPORT_V3 = 0x0C;
	public static final byte MULTI_CHANNEL_END_POINT_GET_V3 = 0x07;
	public static final byte MULTI_CHANNEL_END_POINT_REPORT_V3 = 0x08;
	public static final byte MULTI_INSTANCE_CMD_ENCAP_V3 = 0x06;
	public static final byte MULTI_INSTANCE_GET_V3 = 0x04;
	public static final byte MULTI_INSTANCE_REPORT_V3 = 0x05;
	/* Values used for Multi Channel Capability Get command */
	public static final byte MULTI_CHANNEL_CAPABILITY_GET_PROPERTIES1_END_POINT_MASK_V3 = 0x7F;
	public static final byte MULTI_CHANNEL_CAPABILITY_GET_PROPERTIES1_RES_BIT_MASK_V3 = (byte) 0x80;
	/* Values used for Multi Channel Capability Report command */
	public static final byte MULTI_CHANNEL_CAPABILITY_REPORT_PROPERTIES1_END_POINT_MASK_V3 = 0x7F;
	public static final byte MULTI_CHANNEL_CAPABILITY_REPORT_PROPERTIES1_DYNAMIC_BIT_MASK_V3 = (byte) 0x80;
	/* Values used for Multi Channel Cmd Encap command */
	public static final byte MULTI_CHANNEL_CMD_ENCAP_PROPERTIES1_SOURCE_END_POINT_MASK_V3 = 0x7F;
	public static final byte MULTI_CHANNEL_CMD_ENCAP_PROPERTIES1_RES_BIT_MASK_V3 = (byte) 0x80;
	public static final byte MULTI_CHANNEL_CMD_ENCAP_PROPERTIES2_DESTINATION_END_POINT_MASK_V3 = 0x7F;
	public static final byte MULTI_CHANNEL_CMD_ENCAP_PROPERTIES2_BIT_ADDRESS_BIT_MASK_V3 = (byte) 0x80;
	/* Values used for Multi Channel End Pobyte Report command */
	public static final byte MULTI_CHANNEL_END_POINT_REPORT_PROPERTIES1_RES_MASK_V3 = 0x3F;
	public static final byte MULTI_CHANNEL_END_POINT_REPORT_PROPERTIES1_IDENTICAL_BIT_MASK_V3 = 0x40;
	public static final byte MULTI_CHANNEL_END_POINT_REPORT_PROPERTIES1_DYNAMIC_BIT_MASK_V3 = (byte) 0x80;
	public static final byte MULTI_CHANNEL_END_POINT_REPORT_PROPERTIES2_END_POINTS_MASK_V3 = 0x7F;
	public static final byte MULTI_CHANNEL_END_POINT_REPORT_PROPERTIES2_RES_BIT_MASK_V3 = (byte) 0x80;
	/* Values used for Multi Instance Cmd Encap command */
	public static final byte MULTI_INSTANCE_CMD_ENCAP_PROPERTIES1_INSTANCE_MASK_V3 = 0x7F;
	public static final byte MULTI_INSTANCE_CMD_ENCAP_PROPERTIES1_RES_BIT_MASK_V3 = (byte) 0x80;
	/* Values used for Multi Instance Report command */
	public static final byte MULTI_INSTANCE_REPORT_PROPERTIES1_INSTANCES_MASK_V3 = 0x7F;
	public static final byte MULTI_INSTANCE_REPORT_PROPERTIES1_RES_BIT_MASK_V3 = (byte) 0x80;

	/* Multi Cmd command class commands */
	public static final byte MULTI_CMD_VERSION = 0x01;
	public static final byte MULTI_CMD_ENCAP = 0x01;

	/* Multi Instance Association command class commands */
	public static final byte MULTI_INSTANCE_ASSOCIATION_VERSION = 0x01;
	public static final byte MULTI_INSTANCE_ASSOCIATION_GET = 0x02;
	public static final byte MULTI_INSTANCE_ASSOCIATION_GROUPINGS_GET = 0x05;
	public static final byte MULTI_INSTANCE_ASSOCIATION_GROUPINGS_REPORT = 0x06;
	public static final byte MULTI_INSTANCE_ASSOCIATION_REMOVE = 0x04;
	public static final byte MULTI_INSTANCE_ASSOCIATION_REPORT = 0x03;
	public static final byte MULTI_INSTANCE_ASSOCIATION_SET = 0x01;
	/* Values used for Multi Instance Association Remove command */
	public static final byte MULTI_INSTANCE_ASSOCIATION_REMOVE_MARKER = 0x00; /*
																				 * This marker identifier is used to
																				 * separate between nodes without and
																				 * with end pobytes attached. This field
																				 * can be omitted in case no Multi
																				 * Channel node follows.
																				 */
	/* Values used for Multi Instance Association Report command */
	public static final byte MULTI_INSTANCE_ASSOCIATION_REPORT_MARKER = 0x00; /*
																				 * This marker identifier is used to
																				 * separate between nodes without and
																				 * with end pobytes attached. This field
																				 * can be omitted in case no Multi
																				 * Channel node follows.
																				 */
	/* Values used for Multi Instance Association Set command */
	public static final byte MULTI_INSTANCE_ASSOCIATION_SET_MARKER = 0x00; /*
																			 * This marker identifier is used to
																			 * separate between nodes without and with
																			 * end pobytes attached. This field can be
																			 * omitted in case no Multi Channel node
																			 * follows.
																			 */

	/* Multi Instance command class commands */
	public static final byte MULTI_INSTANCE_VERSION = 0x01;
	public static final byte MULTI_INSTANCE_CMD_ENCAP = 0x06;
	public static final byte MULTI_INSTANCE_GET = 0x04;
	public static final byte MULTI_INSTANCE_REPORT = 0x05;

	/* Network Management Proxy command class commands */
	public static final byte NETWORK_MANAGEMENT_PROXY_VERSION = 0x01;
	public static final byte NODE_INFO_CACHED_GET = 0x03;
	public static final byte NODE_INFO_CACHED_REPORT = 0x04;
	public static final byte NODE_LIST_GET = 0x01;
	public static final byte NODE_LIST_REPORT = 0x02;
	/* Values used for Node Info Cached Get command */
	public static final byte NODE_INFO_CACHED_GET_PROPERTIES1_MAX_AGE_MASK = 0x0F;
	public static final byte NODE_INFO_CACHED_GET_PROPERTIES1_RESERVED_MASK = (byte) 0xF0;
	public static final byte NODE_INFO_CACHED_GET_PROPERTIES1_RESERVED_SHIFT = 0x04;
	/* Values used for Node Info Cached Report command */
	public static final byte NODE_INFO_CACHED_REPORT_PROPERTIES1_AGE_MASK = 0x0F;
	public static final byte NODE_INFO_CACHED_REPORT_PROPERTIES1_STATUS_MASK = (byte) 0xF0;
	public static final byte NODE_INFO_CACHED_REPORT_PROPERTIES1_STATUS_SHIFT = 0x04;
	public static final byte NODE_INFO_CACHED_REPORT_STATUS_STATUS_OK = 0x00;
	public static final byte NODE_INFO_CACHED_REPORT_STATUS_STATUS_NOT_RESPONDING = 0x01;
	public static final byte NODE_INFO_CACHED_REPORT_STATUS_STATUS_UNKNOWN = 0x02;
	public static final byte NODE_INFO_CACHED_REPORT_PROPERTIES2_CAPABILITY_MASK = 0x7F;
	public static final byte NODE_INFO_CACHED_REPORT_PROPERTIES2_LISTENING_BIT_MASK = (byte) 0x80;
	public static final byte NODE_INFO_CACHED_REPORT_PROPERTIES3_SECURITY_MASK = 0x0F;
	public static final byte NODE_INFO_CACHED_REPORT_PROPERTIES3_SENSOR_MASK = 0x70;
	public static final byte NODE_INFO_CACHED_REPORT_PROPERTIES3_SENSOR_SHIFT = 0x04;
	public static final byte NODE_INFO_CACHED_REPORT_PROPERTIES3_OPT_BIT_MASK = (byte) 0x80;
	public static final int NODE_INFO_CACHED_REPORT_SECURITY_SCHEME_0_MARK = 0xF100;

	/* Network Management Basic command class commands */
	public static final byte NETWORK_MANAGEMENT_BASIC_VERSION = 0x01;
	public static final byte LEARN_MODE_SET = 0x01;
	public static final byte LEARN_MODE_SET_STATUS = 0x02;
	public static final byte NODE_INFORMATION_SEND = 0x05;
	public static final byte NETWORK_UPDATE_REQUEST = 0x03;
	public static final byte NETWORK_UPDATE_REQUEST_STATUS = 0x04;
	public static final byte DEFAULT_SET = 0x06;
	public static final byte DEFAULT_SET_COMPLETE = 0x07;

	/* Network Management Inclusion command class commands */
	public static final byte NETWORK_MANAGEMENT_INCLUSION_VERSION = 0x01;
	public static final byte FAILED_NODE_REMOVE = 0x07;
	public static final byte FAILED_NODE_REMOVE_STATUS = 0x08;
	public static final byte NODE_ADD = 0x01;
	public static final byte NODE_ADD_STATUS = 0x02;
	public static final byte NODE_REMOVE = 0x03;
	public static final byte NODE_REMOVE_STATUS = 0x04;
	public static final byte FAILED_NODE_REPLACE = 0x09;
	public static final byte FAILED_NODE_REPLACE_STATUS = 0x0A;
	public static final byte NODE_NEIGHBOR_UPDATE_REQUEST = 0x0B;
	public static final byte NODE_NEIGHBOR_UPDATE_STATUS = 0x0C;
	public static final byte RETURN_ROUTE_ASSIGN = 0x0D;
	public static final byte RETURN_ROUTE_ASSIGN_COMPLETE = 0x0E;
	public static final byte RETURN_ROUTE_DELETE = 0x0F;
	public static final byte RETURN_ROUTE_DELETE_COMPLETE = 0x10;
	/* Values used for Node Add Status command */
	public static final byte NODE_ADD_STATUS_PROPERTIES1_CAPABILITY_MASK = 0x7F;
	public static final byte NODE_ADD_STATUS_PROPERTIES1_LISTENING_BIT_MASK = (byte) 0x80;
	public static final byte NODE_ADD_STATUS_PROPERTIES2_SECURITY_MASK = 0x7F;
	public static final byte NODE_ADD_STATUS_PROPERTIES2_OPT_BIT_MASK = (byte) 0x80;

	/* No Operation command class commands */
	public static final byte NO_OPERATION_VERSION = 0x01;

	/* Node Naming command class commands */
	public static final byte NODE_NAMING_VERSION = 0x01;
	public static final byte NODE_NAMING_NODE_LOCATION_REPORT = 0x06;
	public static final byte NODE_NAMING_NODE_LOCATION_SET = 0x04;
	public static final byte NODE_NAMING_NODE_LOCATION_GET = 0x05;
	public static final byte NODE_NAMING_NODE_NAME_GET = 0x02;
	public static final byte NODE_NAMING_NODE_NAME_REPORT = 0x03;
	public static final byte NODE_NAMING_NODE_NAME_SET = 0x01;
	/* Values used for Node Naming Node Location Report command */
	public static final byte NODE_NAMING_NODE_LOCATION_REPORT_LEVEL_CHAR_PRESENTATION_MASK = 0x07;
	public static final byte NODE_NAMING_NODE_LOCATION_REPORT_LEVEL_RESERVED_MASK = (byte) 0xF8;
	public static final byte NODE_NAMING_NODE_LOCATION_REPORT_LEVEL_RESERVED_SHIFT = 0x03;
	/* Values used for Node Naming Node Location Set command */
	public static final byte NODE_NAMING_NODE_LOCATION_SET_LEVEL_CHAR_PRESENTATION_MASK = 0x07;
	public static final byte NODE_NAMING_NODE_LOCATION_SET_LEVEL_RESERVED_MASK = (byte) 0xF8;
	public static final byte NODE_NAMING_NODE_LOCATION_SET_LEVEL_RESERVED_SHIFT = 0x03;
	/* Values used for Node Naming Node Name Report command */
	public static final byte NODE_NAMING_NODE_NAME_REPORT_LEVEL_CHAR_PRESENTATION_MASK = 0x07;
	public static final byte NODE_NAMING_NODE_NAME_REPORT_LEVEL_RESERVED_MASK = (byte) 0xF8;
	public static final byte NODE_NAMING_NODE_NAME_REPORT_LEVEL_RESERVED_SHIFT = 0x03;
	/* Values used for Node Naming Node Name Set command */
	public static final byte NODE_NAMING_NODE_NAME_SET_LEVEL_CHAR_PRESENTATION_MASK = 0x07;
	public static final byte NODE_NAMING_NODE_NAME_SET_LEVEL_RESERVED_MASK = (byte) 0xF8;
	public static final byte NODE_NAMING_NODE_NAME_SET_LEVEL_RESERVED_SHIFT = 0x03;

	/* Non Interoperable command class commands */
	public static final byte NON_INTEROPERABLE_VERSION = 0x01;

	/* Powerlevel command class commands */
	public static final byte POWERLEVEL_VERSION = 0x01;
	public static final byte POWERLEVEL_GET = 0x02;
	public static final byte POWERLEVEL_REPORT = 0x03;
	public static final byte POWERLEVEL_SET = 0x01;
	public static final byte POWERLEVEL_TEST_NODE_GET = 0x05;
	public static final byte POWERLEVEL_TEST_NODE_REPORT = 0x06;
	public static final byte POWERLEVEL_TEST_NODE_SET = 0x04;
	/* Values used for Powerlevel Report command */
	public static final byte POWERLEVEL_REPORT_NORMALPOWER = 0x00;
	public static final byte POWERLEVEL_REPORT_MINUS1DBM = 0x01;
	public static final byte POWERLEVEL_REPORT_MINUS2DBM = 0x02;
	public static final byte POWERLEVEL_REPORT_MINUS3DBM = 0x03;
	public static final byte POWERLEVEL_REPORT_MINUS4DBM = 0x04;
	public static final byte POWERLEVEL_REPORT_MINUS5DBM = 0x05;
	public static final byte POWERLEVEL_REPORT_MINUS6DBM = 0x06;
	public static final byte POWERLEVEL_REPORT_MINUS7DBM = 0x07;
	public static final byte POWERLEVEL_REPORT_MINUS8DBM = 0x08;
	public static final byte POWERLEVEL_REPORT_MINUS9DBM = 0x09;
	/* Values used for Powerlevel Set command */
	public static final byte POWERLEVEL_SET_NORMALPOWER = 0x00;
	public static final byte POWERLEVEL_SET_MINUS1DBM = 0x01;
	public static final byte POWERLEVEL_SET_MINUS2DBM = 0x02;
	public static final byte POWERLEVEL_SET_MINUS3DBM = 0x03;
	public static final byte POWERLEVEL_SET_MINUS4DBM = 0x04;
	public static final byte POWERLEVEL_SET_MINUS5DBM = 0x05;
	public static final byte POWERLEVEL_SET_MINUS6DBM = 0x06;
	public static final byte POWERLEVEL_SET_MINUS7DBM = 0x07;
	public static final byte POWERLEVEL_SET_MINUS8DBM = 0x08;
	public static final byte POWERLEVEL_SET_MINUS9DBM = 0x09;
	/* Values used for Powerlevel Test Node Report command */
	public static final byte POWERLEVEL_TEST_NODE_REPORT_ZW_TEST_NOT_A_NODEID = 0x00;
	public static final byte POWERLEVEL_TEST_NODE_REPORT_ZW_TEST_FAILED = 0x00;
	public static final byte POWERLEVEL_TEST_NODE_REPORT_ZW_TEST_SUCCES = 0x01;
	public static final byte POWERLEVEL_TEST_NODE_REPORT_ZW_TEST_INPROGRESS = 0x02;
	/* Values used for Powerlevel Test Node Set command */
	public static final byte POWERLEVEL_TEST_NODE_SET_NORMALPOWER = 0x00;
	public static final byte POWERLEVEL_TEST_NODE_SET_MINUS1DBM = 0x01;
	public static final byte POWERLEVEL_TEST_NODE_SET_MINUS2DBM = 0x02;
	public static final byte POWERLEVEL_TEST_NODE_SET_MINUS3DBM = 0x03;
	public static final byte POWERLEVEL_TEST_NODE_SET_MINUS4DBM = 0x04;
	public static final byte POWERLEVEL_TEST_NODE_SET_MINUS5DBM = 0x05;
	public static final byte POWERLEVEL_TEST_NODE_SET_MINUS6DBM = 0x06;
	public static final byte POWERLEVEL_TEST_NODE_SET_MINUS7DBM = 0x07;
	public static final byte POWERLEVEL_TEST_NODE_SET_MINUS8DBM = 0x08;
	public static final byte POWERLEVEL_TEST_NODE_SET_MINUS9DBM = 0x09;

	/* Prepayment Encapsulation command class commands */
	public static final byte PREPAYMENT_ENCAPSULATION_VERSION = 0x01;
	public static final byte CMD_ENCAPSULATION = 0x01;

	/* Prepayment command class commands */
	public static final byte PREPAYMENT_VERSION = 0x01;
	public static final byte PREPAYMENT_BALANCE_GET = 0x01;
	public static final byte PREPAYMENT_BALANCE_REPORT = 0x02;
	public static final byte PREPAYMENT_SUPPORTED_GET = 0x03;
	public static final byte PREPAYMENT_SUPPORTED_REPORT = 0x04;
	/* Values used for Prepayment Balance Get command */
	public static final byte PREPAYMENT_BALANCE_GET_PROPERTIES1_RESERVED_MASK = 0x3F;
	public static final byte PREPAYMENT_BALANCE_GET_PROPERTIES1_BALANCE_TYPE_MASK = (byte) 0xC0;
	public static final byte PREPAYMENT_BALANCE_GET_PROPERTIES1_BALANCE_TYPE_SHIFT = 0x06;
	public static final byte PREPAYMENT_BALANCE_GET_BALANCE_TYPE_UTILITY = 0x00;
	public static final byte PREPAYMENT_BALANCE_GET_BALANCE_TYPE_MONETARY = 0x01;
	/* Values used for Prepayment Balance Report command */
	public static final byte PREPAYMENT_BALANCE_REPORT_PROPERTIES1_METER_TYPE_MASK = 0x3F;
	public static final byte PREPAYMENT_BALANCE_REPORT_PROPERTIES1_BALANCE_TYPE_MASK = (byte) 0xC0;
	public static final byte PREPAYMENT_BALANCE_REPORT_PROPERTIES1_BALANCE_TYPE_SHIFT = 0x06;
	public static final byte PREPAYMENT_BALANCE_REPORT_PROPERTIES2_SCALE_MASK = 0x1F;
	public static final byte PREPAYMENT_BALANCE_REPORT_PROPERTIES2_BALANCE_PRECISION_MASK = (byte) 0xE0;
	public static final byte PREPAYMENT_BALANCE_REPORT_PROPERTIES2_BALANCE_PRECISION_SHIFT = 0x05;
	public static final byte PREPAYMENT_BALANCE_REPORT_PROPERTIES3_RESERVED_MASK = 0x1F;
	public static final byte PREPAYMENT_BALANCE_REPORT_PROPERTIES3_DEBT_PRECISION_MASK = (byte) 0xE0;
	public static final byte PREPAYMENT_BALANCE_REPORT_PROPERTIES3_DEBT_PRECISION_SHIFT = 0x05;
	public static final byte PREPAYMENT_BALANCE_REPORT_PROPERTIES4_RESERVED_MASK = 0x1F;
	public static final byte PREPAYMENT_BALANCE_REPORT_PROPERTIES4_EMER_CREDIT_PRECISION_MASK = (byte) 0xE0;
	public static final byte PREPAYMENT_BALANCE_REPORT_PROPERTIES4_EMER_CREDIT_PRECISION_SHIFT = 0x05;
	/* Values used for Prepayment Supported Report command */
	public static final byte PREPAYMENT_SUPPORTED_REPORT_PROPERTIES1_TYPES_SUPPORTED_MASK = 0x0F;
	public static final byte PREPAYMENT_SUPPORTED_REPORT_PROPERTIES1_RESERVED_MASK = (byte) 0xF0;
	public static final byte PREPAYMENT_SUPPORTED_REPORT_PROPERTIES1_RESERVED_SHIFT = 0x04;

	/* Proprietary command class commands */
	public static final byte PROPRIETARY_VERSION = 0x01;
	public static final byte PROPRIETARY_GET = 0x02;
	public static final byte PROPRIETARY_REPORT = 0x03;
	public static final byte PROPRIETARY_SET = 0x01;

	/* Protection command class commands */
	public static final byte PROTECTION_VERSION = 0x01;
	public static final byte PROTECTION_GET = 0x02;
	public static final byte PROTECTION_REPORT = 0x03;
	public static final byte PROTECTION_SET = 0x01;
	/* Values used for Protection Report command */
	public static final byte PROTECTION_REPORT_UNPROTECTED = 0x00;
	public static final byte PROTECTION_REPORT_PROTECTION_BY_SEQUENCE = 0x01;
	public static final byte PROTECTION_REPORT_NO_OPERATION_POSSIBLE = 0x02;
	/* Values used for Protection Set command */
	public static final byte PROTECTION_SET_UNPROTECTED = 0x00;
	public static final byte PROTECTION_SET_PROTECTION_BY_SEQUENCE = 0x01;
	public static final byte PROTECTION_SET_NO_OPERATION_POSSIBLE = 0x02;

	/* Protection command class commands */
	public static final byte PROTECTION_VERSION_V2 = 0x02;
	public static final byte PROTECTION_EC_GET_V2 = 0x07;
	public static final byte PROTECTION_EC_REPORT_V2 = 0x08;
	public static final byte PROTECTION_EC_SET_V2 = 0x06;
	public static final byte PROTECTION_GET_V2 = 0x02;
	public static final byte PROTECTION_REPORT_V2 = 0x03;
	public static final byte PROTECTION_SET_V2 = 0x01;
	public static final byte PROTECTION_SUPPORTED_GET_V2 = 0x04;
	public static final byte PROTECTION_SUPPORTED_REPORT_V2 = 0x05;
	public static final byte PROTECTION_TIMEOUT_GET_V2 = 0x0A;
	public static final byte PROTECTION_TIMEOUT_REPORT_V2 = 0x0B;
	public static final byte PROTECTION_TIMEOUT_SET_V2 = 0x09;
	/* Values used for Protection Report command */
	public static final byte PROTECTION_REPORT_LEVEL_LOCAL_PROTECTION_STATE_MASK_V2 = 0x0F;
	public static final byte PROTECTION_REPORT_LEVEL_RESERVED_MASK_V2 = (byte) 0xF0;
	public static final byte PROTECTION_REPORT_LEVEL_RESERVED_SHIFT_V2 = 0x04;
	public static final byte PROTECTION_REPORT_LEVEL2_RF_PROTECTION_STATE_MASK_V2 = 0x0F;
	public static final byte PROTECTION_REPORT_LEVEL2_RESERVED_MASK_V2 = (byte) 0xF0;
	public static final byte PROTECTION_REPORT_LEVEL2_RESERVED_SHIFT_V2 = 0x04;
	/* Values used for Protection Set command */
	public static final byte PROTECTION_SET_LEVEL_LOCAL_PROTECTION_STATE_MASK_V2 = 0x0F;
	public static final byte PROTECTION_SET_LEVEL_RESERVED_MASK_V2 = (byte) 0xF0;
	public static final byte PROTECTION_SET_LEVEL_RESERVED_SHIFT_V2 = 0x04;
	public static final byte PROTECTION_SET_LEVEL2_RF_PROTECTION_STATE_MASK_V2 = 0x0F;
	public static final byte PROTECTION_SET_LEVEL2_RESERVED_MASK_V2 = (byte) 0xF0;
	public static final byte PROTECTION_SET_LEVEL2_RESERVED_SHIFT_V2 = 0x04;
	/* Values used for Protection Supported Report command */
	public static final byte PROTECTION_SUPPORTED_REPORT_LEVEL_TIMEOUT_BIT_MASK_V2 = 0x01;
	public static final byte PROTECTION_SUPPORTED_REPORT_LEVEL_EXCLUSIVE_CONTROL_BIT_MASK_V2 = 0x02;
	public static final byte PROTECTION_SUPPORTED_REPORT_LEVEL_RESERVED_MASK_V2 = (byte) 0xFC;
	public static final byte PROTECTION_SUPPORTED_REPORT_LEVEL_RESERVED_SHIFT_V2 = 0x02;

	/* Rate Tbl Config command class commands */
	public static final byte RATE_TBL_CONFIG_VERSION = 0x01;
	public static final byte RATE_TBL_REMOVE = 0x02;
	public static final byte RATE_TBL_SET = 0x01;
	/* Values used for Rate Tbl Remove command */
	public static final byte RATE_TBL_REMOVE_PROPERTIES1_RATE_PARAMETER_SET_IDS_MASK = 0x3F;
	public static final byte RATE_TBL_REMOVE_PROPERTIES1_RESERVED_MASK = (byte) 0xC0;
	public static final byte RATE_TBL_REMOVE_PROPERTIES1_RESERVED_SHIFT = 0x06;
	/* Values used for Rate Tbl Set command */
	public static final byte RATE_TBL_SET_PROPERTIES1_NUMBER_OF_RATE_CHAR_MASK = 0x1F;
	public static final byte RATE_TBL_SET_PROPERTIES1_RATE_TYPE_MASK = 0x60;
	public static final byte RATE_TBL_SET_PROPERTIES1_RATE_TYPE_SHIFT = 0x05;
	public static final byte RATE_TBL_SET_PROPERTIES1_RESERVED_BIT_MASK = (byte) 0x80;
	public static final byte RATE_TBL_SET_PROPERTIES2_CONSUMPTION_SCALE_MASK = 0x1F;
	public static final byte RATE_TBL_SET_PROPERTIES2_CONSUMPTION_PRECISION_MASK = (byte) 0xE0;
	public static final byte RATE_TBL_SET_PROPERTIES2_CONSUMPTION_PRECISION_SHIFT = 0x05;
	public static final byte RATE_TBL_SET_PROPERTIES3_MAX_DEMAND_SCALE_MASK = 0x1F;
	public static final byte RATE_TBL_SET_PROPERTIES3_MAX_DEMAND_PRECISION_MASK = (byte) 0xE0;
	public static final byte RATE_TBL_SET_PROPERTIES3_MAX_DEMAND_PRECISION_SHIFT = 0x05;

	/* Rate Tbl Monitor command class commands */
	public static final byte RATE_TBL_MONITOR_VERSION = 0x01;
	public static final byte RATE_TBL_ACTIVE_RATE_GET = 0x05;
	public static final byte RATE_TBL_ACTIVE_RATE_REPORT = 0x06;
	public static final byte RATE_TBL_CURRENT_DATA_GET = 0x07;
	public static final byte RATE_TBL_CURRENT_DATA_REPORT = 0x08;
	public static final byte RATE_TBL_GET = 0x03;
	public static final byte RATE_TBL_HISTORICAL_DATA_GET = 0x09;
	public static final byte RATE_TBL_HISTORICAL_DATA_REPORT = 0x0A;
	public static final byte RATE_TBL_REPORT = 0x04;
	public static final byte RATE_TBL_SUPPORTED_GET = 0x01;
	public static final byte RATE_TBL_SUPPORTED_REPORT = 0x02;
	/* Values used for Rate Tbl Report command */
	public static final byte RATE_TBL_REPORT_PROPERTIES1_NUMBER_OF_RATE_CHAR_MASK = 0x1F;
	public static final byte RATE_TBL_REPORT_PROPERTIES1_RATE_TYPE_MASK = 0x60;
	public static final byte RATE_TBL_REPORT_PROPERTIES1_RATE_TYPE_SHIFT = 0x05;
	public static final byte RATE_TBL_REPORT_PROPERTIES1_RESERVED_BIT_MASK = (byte) 0x80;
	public static final byte RATE_TBL_REPORT_PROPERTIES2_CONSUMPTION_SCALE_MASK = 0x1F;
	public static final byte RATE_TBL_REPORT_PROPERTIES2_CONSUMPTION_PRECISION_MASK = (byte) 0xE0;
	public static final byte RATE_TBL_REPORT_PROPERTIES2_CONSUMPTION_PRECISION_SHIFT = 0x05;
	public static final byte RATE_TBL_REPORT_PROPERTIES3_MAX_DEMAND_SCALE_MASK = 0x1F;
	public static final byte RATE_TBL_REPORT_PROPERTIES3_MAX_DEMAND_PRECISION_MASK = (byte) 0xE0;
	public static final byte RATE_TBL_REPORT_PROPERTIES3_MAX_DEMAND_PRECISION_SHIFT = 0x05;

	/* Remote Association Activate command class commands */
	public static final byte REMOTE_ASSOCIATION_ACTIVATE_VERSION = 0x01;
	public static final byte REMOTE_ASSOCIATION_ACTIVATE = 0x01;

	/* Remote Association command class commands */
	public static final byte REMOTE_ASSOCIATION_VERSION = 0x01;
	public static final byte REMOTE_ASSOCIATION_CONFIGURATION_GET = 0x02;
	public static final byte REMOTE_ASSOCIATION_CONFIGURATION_REPORT = 0x03;
	public static final byte REMOTE_ASSOCIATION_CONFIGURATION_SET = 0x01;

	/* Scene Activation command class commands */
	public static final byte SCENE_ACTIVATION_VERSION = 0x01;
	public static final byte SCENE_ACTIVATION_SET = 0x01;

	/* Scene Actuator Conf command class commands */
	public static final byte SCENE_ACTUATOR_CONF_VERSION = 0x01;
	public static final byte SCENE_ACTUATOR_CONF_GET = 0x02;
	public static final byte SCENE_ACTUATOR_CONF_REPORT = 0x03;
	public static final byte SCENE_ACTUATOR_CONF_SET = 0x01;
	/* Values used for Scene Actuator Conf Set command */
	public static final byte SCENE_ACTUATOR_CONF_SET_LEVEL2_RESERVED_MASK = 0x7F;
	public static final byte SCENE_ACTUATOR_CONF_SET_LEVEL2_OVERRIDE_BIT_MASK = (byte) 0x80;

	/* Scene Controller Conf command class commands */
	public static final byte SCENE_CONTROLLER_CONF_VERSION = 0x01;
	public static final byte SCENE_CONTROLLER_CONF_GET = 0x02;
	public static final byte SCENE_CONTROLLER_CONF_REPORT = 0x03;
	public static final byte SCENE_CONTROLLER_CONF_SET = 0x01;

	/* Schedule Entry Lock command class commands */
	public static final byte SCHEDULE_ENTRY_LOCK_VERSION = 0x01;
	public static final byte SCHEDULE_ENTRY_LOCK_ENABLE_ALL_SET = 0x02;
	public static final byte SCHEDULE_ENTRY_LOCK_ENABLE_SET = 0x01;
	public static final byte SCHEDULE_ENTRY_LOCK_WEEK_DAY_GET = 0x04;
	public static final byte SCHEDULE_ENTRY_LOCK_WEEK_DAY_REPORT = 0x05;
	public static final byte SCHEDULE_ENTRY_LOCK_WEEK_DAY_SET = 0x03;
	public static final byte SCHEDULE_ENTRY_LOCK_YEAR_DAY_GET = 0x07;
	public static final byte SCHEDULE_ENTRY_LOCK_YEAR_DAY_REPORT = 0x08;
	public static final byte SCHEDULE_ENTRY_LOCK_YEAR_DAY_SET = 0x06;
	public static final byte SCHEDULE_ENTRY_TYPE_SUPPORTED_GET = 0x09;
	public static final byte SCHEDULE_ENTRY_TYPE_SUPPORTED_REPORT = 0x0A;

	/* Schedule Entry Lock command class commands */
	public static final byte SCHEDULE_ENTRY_LOCK_VERSION_V2 = 0x02;
	public static final byte SCHEDULE_ENTRY_LOCK_ENABLE_ALL_SET_V2 = 0x02;
	public static final byte SCHEDULE_ENTRY_LOCK_ENABLE_SET_V2 = 0x01;
	public static final byte SCHEDULE_ENTRY_LOCK_TIME_OFFSET_GET_V2 = 0x0B;
	public static final byte SCHEDULE_ENTRY_LOCK_TIME_OFFSET_REPORT_V2 = 0x0C;
	public static final byte SCHEDULE_ENTRY_LOCK_TIME_OFFSET_SET_V2 = 0x0D;
	public static final byte SCHEDULE_ENTRY_LOCK_WEEK_DAY_GET_V2 = 0x04;
	public static final byte SCHEDULE_ENTRY_LOCK_WEEK_DAY_REPORT_V2 = 0x05;
	public static final byte SCHEDULE_ENTRY_LOCK_WEEK_DAY_SET_V2 = 0x03;
	public static final byte SCHEDULE_ENTRY_LOCK_YEAR_DAY_GET_V2 = 0x07;
	public static final byte SCHEDULE_ENTRY_LOCK_YEAR_DAY_REPORT_V2 = 0x08;
	public static final byte SCHEDULE_ENTRY_LOCK_YEAR_DAY_SET_V2 = 0x06;
	public static final byte SCHEDULE_ENTRY_TYPE_SUPPORTED_GET_V2 = 0x09;
	public static final byte SCHEDULE_ENTRY_TYPE_SUPPORTED_REPORT_V2 = 0x0A;
	/* Values used for Schedule Entry Lock Time Offset Report command */
	public static final byte SCHEDULE_ENTRY_LOCK_TIME_OFFSET_REPORT_LEVEL_HOUR_TZO_MASK_V2 = 0x7F;
	public static final byte SCHEDULE_ENTRY_LOCK_TIME_OFFSET_REPORT_LEVEL_SIGN_TZO_BIT_MASK_V2 = (byte) 0x80;
	public static final byte SCHEDULE_ENTRY_LOCK_TIME_OFFSET_REPORT_LEVEL2_MINUTE_OFFSET_DST_MASK_V2 = 0x7F;
	public static final byte SCHEDULE_ENTRY_LOCK_TIME_OFFSET_REPORT_LEVEL2_SIGN_OFFSET_DST_BIT_MASK_V2 = (byte) 0x80;
	/* Values used for Schedule Entry Lock Time Offset Set command */
	public static final byte SCHEDULE_ENTRY_LOCK_TIME_OFFSET_SET_LEVEL_HOUR_TZO_MASK_V2 = 0x7F;
	public static final byte SCHEDULE_ENTRY_LOCK_TIME_OFFSET_SET_LEVEL_SIGN_TZO_BIT_MASK_V2 = (byte) 0x80;
	public static final byte SCHEDULE_ENTRY_LOCK_TIME_OFFSET_SET_LEVEL2_MINUTE_OFFSET_DST_MASK_V2 = 0x7F;
	public static final byte SCHEDULE_ENTRY_LOCK_TIME_OFFSET_SET_LEVEL2_SIGN_OFFSET_DST_BIT_MASK_V2 = (byte) 0x80;

	/* Schedule Entry Lock command class commands */
	public static final byte SCHEDULE_ENTRY_LOCK_VERSION_V3 = 0x03;
	public static final byte SCHEDULE_ENTRY_LOCK_ENABLE_ALL_SET_V3 = 0x02;
	public static final byte SCHEDULE_ENTRY_LOCK_ENABLE_SET_V3 = 0x01;
	public static final byte SCHEDULE_ENTRY_LOCK_TIME_OFFSET_GET_V3 = 0x0B;
	public static final byte SCHEDULE_ENTRY_LOCK_TIME_OFFSET_REPORT_V3 = 0x0C;
	public static final byte SCHEDULE_ENTRY_LOCK_TIME_OFFSET_SET_V3 = 0x0D;
	public static final byte SCHEDULE_ENTRY_LOCK_WEEK_DAY_GET_V3 = 0x04;
	public static final byte SCHEDULE_ENTRY_LOCK_WEEK_DAY_REPORT_V3 = 0x05;
	public static final byte SCHEDULE_ENTRY_LOCK_WEEK_DAY_SET_V3 = 0x03;
	public static final byte SCHEDULE_ENTRY_LOCK_YEAR_DAY_GET_V3 = 0x07;
	public static final byte SCHEDULE_ENTRY_LOCK_YEAR_DAY_REPORT_V3 = 0x08;
	public static final byte SCHEDULE_ENTRY_LOCK_YEAR_DAY_SET_V3 = 0x06;
	public static final byte SCHEDULE_ENTRY_TYPE_SUPPORTED_GET_V3 = 0x09;
	public static final byte SCHEDULE_ENTRY_TYPE_SUPPORTED_REPORT_V3 = 0x0A;
	public static final byte SCHEDULE_ENTRY_LOCK_DAILY_REPEATING_GET_V3 = 0x0E;
	public static final byte SCHEDULE_ENTRY_LOCK_DAILY_REPEATING_REPORT_V3 = 0x0F;
	public static final byte SCHEDULE_ENTRY_LOCK_DAILY_REPEATING_SET_V3 = 0x10;
	/* Values used for Schedule Entry Lock Time Offset Report command */
	public static final byte SCHEDULE_ENTRY_LOCK_TIME_OFFSET_REPORT_LEVEL_HOUR_TZO_MASK_V3 = 0x7F;
	public static final byte SCHEDULE_ENTRY_LOCK_TIME_OFFSET_REPORT_LEVEL_SIGN_TZO_BIT_MASK_V3 = (byte) 0x80;
	public static final byte SCHEDULE_ENTRY_LOCK_TIME_OFFSET_REPORT_LEVEL2_MINUTE_OFFSET_DST_MASK_V3 = 0x7F;
	public static final byte SCHEDULE_ENTRY_LOCK_TIME_OFFSET_REPORT_LEVEL2_SIGN_OFFSET_DST_BIT_MASK_V3 = (byte) 0x80;
	/* Values used for Schedule Entry Lock Time Offset Set command */
	public static final byte SCHEDULE_ENTRY_LOCK_TIME_OFFSET_SET_LEVEL_HOUR_TZO_MASK_V3 = 0x7F;
	public static final byte SCHEDULE_ENTRY_LOCK_TIME_OFFSET_SET_LEVEL_SIGN_TZO_BIT_MASK_V3 = (byte) 0x80;
	public static final byte SCHEDULE_ENTRY_LOCK_TIME_OFFSET_SET_LEVEL2_MINUTE_OFFSET_DST_MASK_V3 = 0x7F;
	public static final byte SCHEDULE_ENTRY_LOCK_TIME_OFFSET_SET_LEVEL2_SIGN_OFFSET_DST_BIT_MASK_V3 = (byte) 0x80;

	/* Screen Attributes command class commands */
	public static final byte SCREEN_ATTRIBUTES_VERSION = 0x01;
	public static final byte SCREEN_ATTRIBUTES_GET = 0x01;
	public static final byte SCREEN_ATTRIBUTES_REPORT = 0x02;
	/* Values used for Screen Attributes Report command */
	public static final byte SCREEN_ATTRIBUTES_REPORT_PROPERTIES1_NUMBER_OF_LINES_MASK = 0x1F;
	public static final byte SCREEN_ATTRIBUTES_REPORT_PROPERTIES1_RESERVED_MASK = (byte) 0xE0;
	public static final byte SCREEN_ATTRIBUTES_REPORT_PROPERTIES1_RESERVED_SHIFT = 0x05;

	/* Screen Attributes command class commands */
	public static final byte SCREEN_ATTRIBUTES_VERSION_V2 = 0x02;
	public static final byte SCREEN_ATTRIBUTES_GET_V2 = 0x01;
	public static final byte SCREEN_ATTRIBUTES_REPORT_V2 = 0x03;
	/* Values used for Screen Attributes Report command */
	public static final byte SCREEN_ATTRIBUTES_REPORT_PROPERTIES1_NUMBER_OF_LINES_MASK_V2 = 0x1F;
	public static final byte SCREEN_ATTRIBUTES_REPORT_PROPERTIES1_ESCAPE_SEQUENCE_BIT_MASK_V2 = 0x20;
	public static final byte SCREEN_ATTRIBUTES_REPORT_PROPERTIES1_RESERVED_MASK_V2 = (byte) 0xC0;
	public static final byte SCREEN_ATTRIBUTES_REPORT_PROPERTIES1_RESERVED_SHIFT_V2 = 0x06;

	/* Screen Md command class commands */
	public static final byte SCREEN_MD_VERSION = 0x01;
	public static final byte SCREEN_MD_GET = 0x01;
	public static final byte SCREEN_MD_REPORT = 0x02;
	/* Values used for Screen Md Report command */
	public static final byte SCREEN_MD_REPORT_PROPERTIES1_CHAR_PRESENTATION_MASK = 0x07;
	public static final byte SCREEN_MD_REPORT_PROPERTIES1_SCREEN_SETTINGS_MASK = 0x38;
	public static final byte SCREEN_MD_REPORT_PROPERTIES1_SCREEN_SETTINGS_SHIFT = 0x03;
	public static final byte SCREEN_MD_REPORT_PROPERTIES1_RESERVED_BIT_MASK = 0x40;
	public static final byte SCREEN_MD_REPORT_PROPERTIES1_MORE_DATA_BIT_MASK = (byte) 0x80;

	/* Screen Md command class commands */
	public static final byte SCREEN_MD_VERSION_V2 = 0x02;
	public static final byte SCREEN_MD_GET_V2 = 0x01;
	public static final byte SCREEN_MD_REPORT_V2 = 0x03;
	/* Values used for Screen Md Report command */
	public static final byte SCREEN_MD_REPORT_PROPERTIES1_CHAR_PRESENTATION_MASK_V2 = 0x07;
	public static final byte SCREEN_MD_REPORT_PROPERTIES1_SCREEN_SETTINGS_MASK_V2 = 0x38;
	public static final byte SCREEN_MD_REPORT_PROPERTIES1_SCREEN_SETTINGS_SHIFT_V2 = 0x03;
	public static final byte SCREEN_MD_REPORT_PROPERTIES1_RESERVED_BIT_MASK_V2 = 0x40;
	public static final byte SCREEN_MD_REPORT_PROPERTIES1_MORE_DATA_BIT_MASK_V2 = (byte) 0x80;
	public static final byte SCREEN_MD_REPORT_PROPERTIES2_SCREEN_TIMEOUT_BIT_MASK_V2 = 0x01;
	public static final byte SCREEN_MD_REPORT_PROPERTIES2_RESERVED_MASK_V2 = (byte) 0xFE;
	public static final byte SCREEN_MD_REPORT_PROPERTIES2_RESERVED_SHIFT_V2 = 0x01;

	/* Security Panel Mode command class commands */
	public static final byte SECURITY_PANEL_MODE_VERSION = 0x01;
	public static final byte SECURITY_PANEL_MODE_GET = 0x03;
	public static final byte SECURITY_PANEL_MODE_REPORT = 0x04;
	public static final byte SECURITY_PANEL_MODE_SET = 0x05;
	public static final byte SECURITY_PANEL_MODE_SUPPORTED_GET = 0x01;
	public static final byte SECURITY_PANEL_MODE_SUPPORTED_REPORT = 0x02;

	/* Security Panel Zone Sensor command class commands */
	public static final byte SECURITY_PANEL_ZONE_SENSOR_VERSION = 0x01;
	public static final byte COMMAND_CLASS_SECURITY_PANEL_ZONE_SENSOR_INSTALLED_REPORT = 0x02;
	public static final byte SECURITY_PANEL_ZONE_SENSOR_TYPE_GET = 0x03;
	public static final byte SECURITY_PANEL_ZONE_SENSOR_TYPE_REPORT = 0x04;
	public static final byte SECURITY_PANEL_ZONE_SENSOR_INSTALLED_GET = 0x01;
	public static final byte SECURITY_PANEL_ZONE_SENSOR_STATE_GET = 0x05;
	public static final byte SECURITY_PANEL_ZONE_SENSOR_STATE_REPORT = 0x06;

	/* Security Panel Zone command class commands */
	public static final byte SECURITY_PANEL_ZONE_VERSION = 0x01;
	public static final byte SECURITY_PANEL_ZONE_NUMBER_SUPPORTED_GET = 0x01;
	public static final byte SECURITY_PANEL_ZONE_STATE_GET = 0x05;
	public static final byte SECURITY_PANEL_ZONE_STATE_REPORT = 0x06;
	public static final byte SECURITY_PANEL_ZONE_SUPPORTED_REPORT = 0x02;
	public static final byte SECURITY_PANEL_ZONE_TYPE_GET = 0x03;
	public static final byte SECURITY_PANEL_ZONE_TYPE_REPORT = 0x04;
	/* Values used for Security Panel Zone Supported Report command */
	public static final byte SECURITY_PANEL_ZONE_SUPPORTED_REPORT_PARAMETERS1_ZONES_SUPPORTED_MASK = 0x7F;
	public static final byte SECURITY_PANEL_ZONE_SUPPORTED_REPORT_PARAMETERS1_ZM_BIT_MASK = (byte) 0x80;

	/* Security command class commands */
	public static final byte SECURITY_VERSION = 0x01;
	public static final byte NETWORK_KEY_SET = 0x06;
	public static final byte NETWORK_KEY_VERIFY = 0x07;
	public static final byte SECURITY_COMMANDS_SUPPORTED_GET = 0x02;
	public static final byte SECURITY_COMMANDS_SUPPORTED_REPORT = 0x03;
	public static final byte SECURITY_MESSAGE_ENCAPSULATION = (byte) 0x81;
	public static final byte SECURITY_MESSAGE_ENCAPSULATION_NONCE_GET = (byte) 0xC1;
	public static final byte SECURITY_NONCE_GET = 0x40;
	public static final byte SECURITY_NONCE_REPORT = (byte) 0x80;
	public static final byte SECURITY_SCHEME_GET = 0x04;
	public static final byte SECURITY_SCHEME_INHERIT = 0x08;
	public static final byte SECURITY_SCHEME_REPORT = 0x05;
	/* Values used for Security Commands Supported Report command */
	public static final byte SECURITY_COMMANDS_SUPPORTED_REPORT_COMMAND_CLASS_MARK = (byte) 0xEF; /*
																									 * The
																									 * COMMAND_CLASS_MARK
																									 * is used to
																									 * indicate that all
																									 * preceding command
																									 * classes are
																									 * supported and all
																									 * following command
																									 * classes are
																									 * controlled.
																									 */
	/* Values used for Security Message Encapsulation command */
	public static final byte SECURITY_MESSAGE_ENCAPSULATION_PROPERTIES1_SEQUENCE_COUNTER_MASK = 0x0F;
	public static final byte SECURITY_MESSAGE_ENCAPSULATION_PROPERTIES1_SEQUENCED_BIT_MASK = 0x10;
	public static final byte SECURITY_MESSAGE_ENCAPSULATION_PROPERTIES1_SECOND_FRAME_BIT_MASK = 0x20;
	public static final byte SECURITY_MESSAGE_ENCAPSULATION_PROPERTIES1_RESERVED_MASK = (byte) 0xC0;
	public static final byte SECURITY_MESSAGE_ENCAPSULATION_PROPERTIES1_RESERVED_SHIFT = 0x06;
	/* Values used for Security Message Encapsulation Nonce Get command */
	public static final byte SECURITY_MESSAGE_ENCAPSULATION_NONCE_GET_PROPERTIES1_SEQUENCE_COUNTER_MASK = 0x0F;
	public static final byte SECURITY_MESSAGE_ENCAPSULATION_NONCE_GET_PROPERTIES1_SEQUENCED_BIT_MASK = 0x10;
	public static final byte SECURITY_MESSAGE_ENCAPSULATION_NONCE_GET_PROPERTIES1_SECOND_FRAME_BIT_MASK = 0x20;
	public static final byte SECURITY_MESSAGE_ENCAPSULATION_NONCE_GET_PROPERTIES1_RESERVED_MASK = (byte) 0xC0;
	public static final byte SECURITY_MESSAGE_ENCAPSULATION_NONCE_GET_PROPERTIES1_RESERVED_SHIFT = 0x06;

	/* Sensor Alarm command class commands */
	public static final byte SENSOR_ALARM_VERSION = 0x01;
	public static final byte SENSOR_ALARM_GET = 0x01;
	public static final byte SENSOR_ALARM_REPORT = 0x02;
	public static final byte SENSOR_ALARM_SUPPORTED_GET = 0x03;
	public static final byte SENSOR_ALARM_SUPPORTED_REPORT = 0x04;

	/* Sensor Binary command class commands */
	public static final byte SENSOR_BINARY_VERSION = 0x01;
	public static final byte SENSOR_BINARY_GET = 0x02;
	public static final byte SENSOR_BINARY_REPORT = 0x03;
	/* Values used for Sensor Binary Report command */
	public static final byte SENSOR_BINARY_REPORT_IDLE = 0x00;
	public static final byte SENSOR_BINARY_REPORT_DETECTED_AN_EVENT = (byte) 0xFF;

	/* Sensor Binary command class commands */
	public static final byte SENSOR_BINARY_VERSION_V2 = 0x02;
	public static final byte SENSOR_BINARY_GET_V2 = 0x02;
	public static final byte SENSOR_BINARY_REPORT_V2 = 0x03;
	public static final byte SENSOR_BINARY_SUPPORTED_GET_SENSOR_V2 = 0x01;
	public static final byte SENSOR_BINARY_SUPPORTED_SENSOR_REPORT_V2 = 0x04;
	/* Values used for Sensor Binary Report command */
	public static final byte SENSOR_BINARY_REPORT_IDLE_V2 = 0x00;
	public static final byte SENSOR_BINARY_REPORT_DETECTED_AN_EVENT_V2 = (byte) 0xFF;

	/* Sensor Configuration command class commands */
	public static final byte SENSOR_CONFIGURATION_VERSION = 0x01;
	public static final byte SENSOR_TRIGGER_LEVEL_GET = 0x02;
	public static final byte SENSOR_TRIGGER_LEVEL_REPORT = 0x03;
	public static final byte SENSOR_TRIGGER_LEVEL_SET = 0x01;
	/* Values used for Sensor Trigger Level Report command */
	public static final byte SENSOR_TRIGGER_LEVEL_REPORT_PROPERTIES1_SIZE_MASK = 0x07;
	public static final byte SENSOR_TRIGGER_LEVEL_REPORT_PROPERTIES1_SCALE_MASK = 0x18;
	public static final byte SENSOR_TRIGGER_LEVEL_REPORT_PROPERTIES1_SCALE_SHIFT = 0x03;
	public static final byte SENSOR_TRIGGER_LEVEL_REPORT_PROPERTIES1_PRECISION_MASK = (byte) 0xE0;
	public static final byte SENSOR_TRIGGER_LEVEL_REPORT_PROPERTIES1_PRECISION_SHIFT = 0x05;
	/* Values used for Sensor Trigger Level Set command */
	public static final byte SENSOR_TRIGGER_LEVEL_SET_PROPERTIES1_RESERVED_MASK = 0x3F;
	public static final byte SENSOR_TRIGGER_LEVEL_SET_PROPERTIES1_CURRENT_BIT_MASK = 0x40;
	public static final byte SENSOR_TRIGGER_LEVEL_SET_PROPERTIES1_DEFAULT_BIT_MASK = (byte) 0x80;
	public static final byte SENSOR_TRIGGER_LEVEL_SET_PROPERTIES2_SIZE_MASK = 0x07;
	public static final byte SENSOR_TRIGGER_LEVEL_SET_PROPERTIES2_SCALE_MASK = 0x18;
	public static final byte SENSOR_TRIGGER_LEVEL_SET_PROPERTIES2_SCALE_SHIFT = 0x03;
	public static final byte SENSOR_TRIGGER_LEVEL_SET_PROPERTIES2_PRECISION_MASK = (byte) 0xE0;
	public static final byte SENSOR_TRIGGER_LEVEL_SET_PROPERTIES2_PRECISION_SHIFT = 0x05;

	/* Sensor Multilevel command class commands */
	public static final byte SENSOR_MULTILEVEL_VERSION = 0x01;
	public static final byte SENSOR_MULTILEVEL_GET = 0x04;
	public static final byte SENSOR_MULTILEVEL_REPORT = 0x05;
	/* Values used for Sensor Multilevel Report command */
	public static final byte SENSOR_MULTILEVEL_REPORT_TEMPERATURE_VERSION_1 = 0x01;
	public static final byte SENSOR_MULTILEVEL_REPORT_GENERAL_PURPOSE_VALUE_VERSION_1 = 0x02;
	public static final byte SENSOR_MULTILEVEL_REPORT_LUMINANCE_VERSION_1 = 0x03;
	public static final byte SENSOR_MULTILEVEL_REPORT_LEVEL_SIZE_MASK = 0x07;
	public static final byte SENSOR_MULTILEVEL_REPORT_LEVEL_SCALE_MASK = 0x18;
	public static final byte SENSOR_MULTILEVEL_REPORT_LEVEL_SCALE_SHIFT = 0x03;
	public static final byte SENSOR_MULTILEVEL_REPORT_LEVEL_PRECISION_MASK = (byte) 0xE0;
	public static final byte SENSOR_MULTILEVEL_REPORT_LEVEL_PRECISION_SHIFT = 0x05;

	/* Sensor Multilevel command class commands */
	public static final byte SENSOR_MULTILEVEL_VERSION_V2 = 0x02;
	public static final byte SENSOR_MULTILEVEL_GET_V2 = 0x04;
	public static final byte SENSOR_MULTILEVEL_REPORT_V2 = 0x05;
	/* Values used for Sensor Multilevel Report command */
	public static final byte SENSOR_MULTILEVEL_REPORT_TEMPERATURE_VERSION_1_V2 = 0x01;
	public static final byte SENSOR_MULTILEVEL_REPORT_GENERAL_PURPOSE_VALUE_VERSION_1_V2 = 0x02;
	public static final byte SENSOR_MULTILEVEL_REPORT_LUMINANCE_VERSION_1_V2 = 0x03;
	public static final byte SENSOR_MULTILEVEL_REPORT_POWER_VERSION_2_V2 = 0x04;
	public static final byte SENSOR_MULTILEVEL_REPORT_RELATIVE_HUMIDITY_VERSION_2_V2 = 0x05;
	public static final byte SENSOR_MULTILEVEL_REPORT_VELOCITY_VERSION_2_V2 = 0x06;
	public static final byte SENSOR_MULTILEVEL_REPORT_DIRECTION_VERSION_2_V2 = 0x07;
	public static final byte SENSOR_MULTILEVEL_REPORT_ATMOSPHERIC_PRESSURE_VERSION_2_V2 = 0x08;
	public static final byte SENSOR_MULTILEVEL_REPORT_BAROMETRIC_PRESSURE_VERSION_2_V2 = 0x09;
	public static final byte SENSOR_MULTILEVEL_REPORT_SOLAR_RADIATION_VERSION_2_V2 = 0x0A;
	public static final byte SENSOR_MULTILEVEL_REPORT_DEW_POINT_VERSION_2_V2 = 0x0B;
	public static final byte SENSOR_MULTILEVEL_REPORT_RAIN_RATE_VERSION_2_V2 = 0x0C;
	public static final byte SENSOR_MULTILEVEL_REPORT_TIDE_LEVEL_VERSION_2_V2 = 0x0D;
	public static final byte SENSOR_MULTILEVEL_REPORT_LEVEL_SIZE_MASK_V2 = 0x07;
	public static final byte SENSOR_MULTILEVEL_REPORT_LEVEL_SCALE_MASK_V2 = 0x18;
	public static final byte SENSOR_MULTILEVEL_REPORT_LEVEL_SCALE_SHIFT_V2 = 0x03;
	public static final byte SENSOR_MULTILEVEL_REPORT_LEVEL_PRECISION_MASK_V2 = (byte) 0xE0;
	public static final byte SENSOR_MULTILEVEL_REPORT_LEVEL_PRECISION_SHIFT_V2 = 0x05;

	/* Sensor Multilevel command class commands */
	public static final byte SENSOR_MULTILEVEL_VERSION_V3 = 0x03;
	public static final byte SENSOR_MULTILEVEL_GET_V3 = 0x04;
	public static final byte SENSOR_MULTILEVEL_REPORT_V3 = 0x05;
	/* Values used for Sensor Multilevel Report command */
	public static final byte SENSOR_MULTILEVEL_REPORT_TEMPERATURE_VERSION_1_V3 = 0x01;
	public static final byte SENSOR_MULTILEVEL_REPORT_GENERAL_PURPOSE_VALUE_VERSION_1_V3 = 0x02;
	public static final byte SENSOR_MULTILEVEL_REPORT_LUMINANCE_VERSION_1_V3 = 0x03;
	public static final byte SENSOR_MULTILEVEL_REPORT_POWER_VERSION_2_V3 = 0x04;
	public static final byte SENSOR_MULTILEVEL_REPORT_RELATIVE_HUMIDITY_VERSION_2_V3 = 0x05;
	public static final byte SENSOR_MULTILEVEL_REPORT_VELOCITY_VERSION_2_V3 = 0x06;
	public static final byte SENSOR_MULTILEVEL_REPORT_DIRECTION_VERSION_2_V3 = 0x07;
	public static final byte SENSOR_MULTILEVEL_REPORT_ATMOSPHERIC_PRESSURE_VERSION_2_V3 = 0x08;
	public static final byte SENSOR_MULTILEVEL_REPORT_BAROMETRIC_PRESSURE_VERSION_2_V3 = 0x09;
	public static final byte SENSOR_MULTILEVEL_REPORT_SOLAR_RADIATION_VERSION_2_V3 = 0x0A;
	public static final byte SENSOR_MULTILEVEL_REPORT_DEW_POINT_VERSION_2_V3 = 0x0B;
	public static final byte SENSOR_MULTILEVEL_REPORT_RAIN_RATE_VERSION_2_V3 = 0x0C;
	public static final byte SENSOR_MULTILEVEL_REPORT_TIDE_LEVEL_VERSION_2_V3 = 0x0D;
	public static final byte SENSOR_MULTILEVEL_REPORT_WEIGHT_VERSION_3_V3 = 0x0E;
	public static final byte SENSOR_MULTILEVEL_REPORT_VOLTAGE_VERSION_3_V3 = 0x0F;
	public static final byte SENSOR_MULTILEVEL_REPORT_CURRENT_VERSION_3_V3 = 0x10;
	public static final byte SENSOR_MULTILEVEL_REPORT_CO2_LEVEL_VERSION_3_V3 = 0x11;
	public static final byte SENSOR_MULTILEVEL_REPORT_AIR_FLOW_VERSION_3_V3 = 0x12;
	public static final byte SENSOR_MULTILEVEL_REPORT_TANK_CAPACITY_VERSION_3_V3 = 0x13;
	public static final byte SENSOR_MULTILEVEL_REPORT_DISTANCE_VERSION_3_V3 = 0x14;
	public static final byte SENSOR_MULTILEVEL_REPORT_LEVEL_SIZE_MASK_V3 = 0x07;
	public static final byte SENSOR_MULTILEVEL_REPORT_LEVEL_SCALE_MASK_V3 = 0x18;
	public static final byte SENSOR_MULTILEVEL_REPORT_LEVEL_SCALE_SHIFT_V3 = 0x03;
	public static final byte SENSOR_MULTILEVEL_REPORT_LEVEL_PRECISION_MASK_V3 = (byte) 0xE0;
	public static final byte SENSOR_MULTILEVEL_REPORT_LEVEL_PRECISION_SHIFT_V3 = 0x05;

	/* Sensor Multilevel command class commands */
	public static final byte SENSOR_MULTILEVEL_VERSION_V4 = 0x04;
	public static final byte SENSOR_MULTILEVEL_GET_V4 = 0x04;
	public static final byte SENSOR_MULTILEVEL_REPORT_V4 = 0x05;
	/* Values used for Sensor Multilevel Report command */
	public static final byte SENSOR_MULTILEVEL_REPORT_TEMPERATURE_VERSION_1_V4 = 0x01;
	public static final byte SENSOR_MULTILEVEL_REPORT_GENERAL_PURPOSE_VALUE_VERSION_1_V4 = 0x02;
	public static final byte SENSOR_MULTILEVEL_REPORT_LUMINANCE_VERSION_1_V4 = 0x03;
	public static final byte SENSOR_MULTILEVEL_REPORT_POWER_VERSION_2_V4 = 0x04;
	public static final byte SENSOR_MULTILEVEL_REPORT_RELATIVE_HUMIDITY_VERSION_2_V4 = 0x05;
	public static final byte SENSOR_MULTILEVEL_REPORT_VELOCITY_VERSION_2_V4 = 0x06;
	public static final byte SENSOR_MULTILEVEL_REPORT_DIRECTION_VERSION_2_V4 = 0x07;
	public static final byte SENSOR_MULTILEVEL_REPORT_ATMOSPHERIC_PRESSURE_VERSION_2_V4 = 0x08;
	public static final byte SENSOR_MULTILEVEL_REPORT_BAROMETRIC_PRESSURE_VERSION_2_V4 = 0x09;
	public static final byte SENSOR_MULTILEVEL_REPORT_SOLAR_RADIATION_VERSION_2_V4 = 0x0A;
	public static final byte SENSOR_MULTILEVEL_REPORT_DEW_POINT_VERSION_2_V4 = 0x0B;
	public static final byte SENSOR_MULTILEVEL_REPORT_RAIN_RATE_VERSION_2_V4 = 0x0C;
	public static final byte SENSOR_MULTILEVEL_REPORT_TIDE_LEVEL_VERSION_2_V4 = 0x0D;
	public static final byte SENSOR_MULTILEVEL_REPORT_WEIGHT_VERSION_3_V4 = 0x0E;
	public static final byte SENSOR_MULTILEVEL_REPORT_VOLTAGE_VERSION_3_V4 = 0x0F;
	public static final byte SENSOR_MULTILEVEL_REPORT_CURRENT_VERSION_3_V4 = 0x10;
	public static final byte SENSOR_MULTILEVEL_REPORT_CO2_LEVEL_VERSION_3_V4 = 0x11;
	public static final byte SENSOR_MULTILEVEL_REPORT_AIR_FLOW_VERSION_3_V4 = 0x12;
	public static final byte SENSOR_MULTILEVEL_REPORT_TANK_CAPACITY_VERSION_3_V4 = 0x13;
	public static final byte SENSOR_MULTILEVEL_REPORT_DISTANCE_VERSION_3_V4 = 0x14;
	public static final byte SENSOR_MULTILEVEL_REPORT_ANGLE_POSITION_VERSION_4_V4 = 0x15;
	public static final byte SENSOR_MULTILEVEL_REPORT_LEVEL_SIZE_MASK_V4 = 0x07;
	public static final byte SENSOR_MULTILEVEL_REPORT_LEVEL_SCALE_MASK_V4 = 0x18;
	public static final byte SENSOR_MULTILEVEL_REPORT_LEVEL_SCALE_SHIFT_V4 = 0x03;
	public static final byte SENSOR_MULTILEVEL_REPORT_LEVEL_PRECISION_MASK_V4 = (byte) 0xE0;
	public static final byte SENSOR_MULTILEVEL_REPORT_LEVEL_PRECISION_SHIFT_V4 = 0x05;

	/* Sensor Multilevel command class commands */
	public static final byte SENSOR_MULTILEVEL_VERSION_V5 = 0x05;
	public static final byte SENSOR_MULTILEVEL_GET_V5 = 0x04;
	public static final byte SENSOR_MULTILEVEL_REPORT_V5 = 0x05;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SENSOR_V5 = 0x01;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SENSOR_REPORT_V5 = 0x02;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_V5 = 0x03;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_V5 = 0x06;
	/* Values used for Sensor Multilevel Get command */
	public static final byte SENSOR_MULTILEVEL_GET_TEMPERATURE_VERSION_1_V5 = 0x01;
	public static final byte SENSOR_MULTILEVEL_GET_GENERAL_PURPOSE_VALUE_VERSION_1_V5 = 0x02;
	public static final byte SENSOR_MULTILEVEL_GET_LUMINANCE_VERSION_1_V5 = 0x03;
	public static final byte SENSOR_MULTILEVEL_GET_POWER_VERSION_2_V5 = 0x04;
	public static final byte SENSOR_MULTILEVEL_GET_RELATIVE_HUMIDITY_VERSION_2_V5 = 0x05;
	public static final byte SENSOR_MULTILEVEL_GET_VELOCITY_VERSION_2_V5 = 0x06;
	public static final byte SENSOR_MULTILEVEL_GET_DIRECTION_VERSION_2_V5 = 0x07;
	public static final byte SENSOR_MULTILEVEL_GET_ATMOSPHERIC_PRESSURE_VERSION_2_V5 = 0x08;
	public static final byte SENSOR_MULTILEVEL_GET_BAROMETRIC_PRESSURE_VERSION_2_V5 = 0x09;
	public static final byte SENSOR_MULTILEVEL_GET_SOLAR_RADIATION_VERSION_2_V5 = 0x0A;
	public static final byte SENSOR_MULTILEVEL_GET_DEW_POINT_VERSION_2_V5 = 0x0B;
	public static final byte SENSOR_MULTILEVEL_GET_RAIN_RATE_VERSION_2_V5 = 0x0C;
	public static final byte SENSOR_MULTILEVEL_GET_TIDE_LEVEL_VERSION_2_V5 = 0x0D;
	public static final byte SENSOR_MULTILEVEL_GET_WEIGHT_VERSION_3_V5 = 0x0E;
	public static final byte SENSOR_MULTILEVEL_GET_VOLTAGE_VERSION_3_V5 = 0x0F;
	public static final byte SENSOR_MULTILEVEL_GET_CURRENT_VERSION_3_V5 = 0x10;
	public static final byte SENSOR_MULTILEVEL_GET_CO2_LEVEL_VERSION_3_V5 = 0x11;
	public static final byte SENSOR_MULTILEVEL_GET_AIR_FLOW_VERSION_3_V5 = 0x12;
	public static final byte SENSOR_MULTILEVEL_GET_TANK_CAPACITY_VERSION_3_V5 = 0x13;
	public static final byte SENSOR_MULTILEVEL_GET_DISTANCE_VERSION_3_V5 = 0x14;
	public static final byte SENSOR_MULTILEVEL_GET_ANGLE_POSITION_VERSION_4_V5 = 0x15;
	public static final byte SENSOR_MULTILEVEL_GET_ROTATION_V5_V5 = 0x16;
	public static final byte SENSOR_MULTILEVEL_GET_WATER_TEMPERATURE_V5_V5 = 0x17;
	public static final byte SENSOR_MULTILEVEL_GET_SOIL_TEMPERATURE_V5_V5 = 0x18;
	public static final byte SENSOR_MULTILEVEL_GET_SEISMIC_INTENSITY_V5_V5 = 0x19;
	public static final byte SENSOR_MULTILEVEL_GET_SEISMIC_MAGNITUDE_V5_V5 = 0x1A;
	public static final byte SENSOR_MULTILEVEL_GET_ULTRAVIOLET_V5_V5 = 0x1B;
	public static final byte SENSOR_MULTILEVEL_GET_ELECTRICAL_RESISTIVITY_V5_V5 = 0x1C;
	public static final byte SENSOR_MULTILEVEL_GET_ELECTRICAL_CONDUCTIVITY_V5_V5 = 0x1D;
	public static final byte SENSOR_MULTILEVEL_GET_LOUDNESS_V5_V5 = 0x1E;
	public static final byte SENSOR_MULTILEVEL_GET_MOISTURE_V5_V5 = 0x1F;
	public static final byte SENSOR_MULTILEVEL_GET_PROPERTIES1_RESERVED1_MASK_V5 = 0x07;
	public static final byte SENSOR_MULTILEVEL_GET_PROPERTIES1_SCALE_MASK_V5 = 0x18;
	public static final byte SENSOR_MULTILEVEL_GET_PROPERTIES1_SCALE_SHIFT_V5 = 0x03;
	public static final byte SENSOR_MULTILEVEL_GET_PROPERTIES1_RESERVED2_MASK_V5 = (byte) 0xE0;
	public static final byte SENSOR_MULTILEVEL_GET_PROPERTIES1_RESERVED2_SHIFT_V5 = 0x05;
	/* Values used for Sensor Multilevel Report command */
	public static final byte SENSOR_MULTILEVEL_REPORT_TEMPERATURE_VERSION_1_V5 = 0x01;
	public static final byte SENSOR_MULTILEVEL_REPORT_GENERAL_PURPOSE_VALUE_VERSION_1_V5 = 0x02;
	public static final byte SENSOR_MULTILEVEL_REPORT_LUMINANCE_VERSION_1_V5 = 0x03;
	public static final byte SENSOR_MULTILEVEL_REPORT_POWER_VERSION_2_V5 = 0x04;
	public static final byte SENSOR_MULTILEVEL_REPORT_RELATIVE_HUMIDITY_VERSION_2_V5 = 0x05;
	public static final byte SENSOR_MULTILEVEL_REPORT_VELOCITY_VERSION_2_V5 = 0x06;
	public static final byte SENSOR_MULTILEVEL_REPORT_DIRECTION_VERSION_2_V5 = 0x07;
	public static final byte SENSOR_MULTILEVEL_REPORT_ATMOSPHERIC_PRESSURE_VERSION_2_V5 = 0x08;
	public static final byte SENSOR_MULTILEVEL_REPORT_BAROMETRIC_PRESSURE_VERSION_2_V5 = 0x09;
	public static final byte SENSOR_MULTILEVEL_REPORT_SOLAR_RADIATION_VERSION_2_V5 = 0x0A;
	public static final byte SENSOR_MULTILEVEL_REPORT_DEW_POINT_VERSION_2_V5 = 0x0B;
	public static final byte SENSOR_MULTILEVEL_REPORT_RAIN_RATE_VERSION_2_V5 = 0x0C;
	public static final byte SENSOR_MULTILEVEL_REPORT_TIDE_LEVEL_VERSION_2_V5 = 0x0D;
	public static final byte SENSOR_MULTILEVEL_REPORT_WEIGHT_VERSION_3_V5 = 0x0E;
	public static final byte SENSOR_MULTILEVEL_REPORT_VOLTAGE_VERSION_3_V5 = 0x0F;
	public static final byte SENSOR_MULTILEVEL_REPORT_CURRENT_VERSION_3_V5 = 0x10;
	public static final byte SENSOR_MULTILEVEL_REPORT_CO2_LEVEL_VERSION_3_V5 = 0x11;
	public static final byte SENSOR_MULTILEVEL_REPORT_AIR_FLOW_VERSION_3_V5 = 0x12;
	public static final byte SENSOR_MULTILEVEL_REPORT_TANK_CAPACITY_VERSION_3_V5 = 0x13;
	public static final byte SENSOR_MULTILEVEL_REPORT_DISTANCE_VERSION_3_V5 = 0x14;
	public static final byte SENSOR_MULTILEVEL_REPORT_ANGLE_POSITION_VERSION_4_V5 = 0x15;
	public static final byte SENSOR_MULTILEVEL_REPORT_ROTATION_V5_V5 = 0x16;
	public static final byte SENSOR_MULTILEVEL_REPORT_WATER_TEMPERATURE_V5_V5 = 0x17;
	public static final byte SENSOR_MULTILEVEL_REPORT_SOIL_TEMPERATURE_V5_V5 = 0x18;
	public static final byte SENSOR_MULTILEVEL_REPORT_SEISMIC_INTENSITY_V5_V5 = 0x19;
	public static final byte SENSOR_MULTILEVEL_REPORT_SEISMIC_MAGNITUDE_V5_V5 = 0x1A;
	public static final byte SENSOR_MULTILEVEL_REPORT_ULTRAVIOLET_V5_V5 = 0x1B;
	public static final byte SENSOR_MULTILEVEL_REPORT_ELECTRICAL_RESISTIVITY_V5_V5 = 0x1C;
	public static final byte SENSOR_MULTILEVEL_REPORT_ELECTRICAL_CONDUCTIVITY_V5_V5 = 0x1D;
	public static final byte SENSOR_MULTILEVEL_REPORT_LOUDNESS_V5_V5 = 0x1E;
	public static final byte SENSOR_MULTILEVEL_REPORT_MOISTURE_V5_V5 = 0x1F;
	public static final byte SENSOR_MULTILEVEL_REPORT_LEVEL_SIZE_MASK_V5 = 0x07;
	public static final byte SENSOR_MULTILEVEL_REPORT_LEVEL_SCALE_MASK_V5 = 0x18;
	public static final byte SENSOR_MULTILEVEL_REPORT_LEVEL_SCALE_SHIFT_V5 = 0x03;
	public static final byte SENSOR_MULTILEVEL_REPORT_LEVEL_PRECISION_MASK_V5 = (byte) 0xE0;
	public static final byte SENSOR_MULTILEVEL_REPORT_LEVEL_PRECISION_SHIFT_V5 = 0x05;
	/* Values used for Sensor Multilevel Supported Get Scale command */
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_TEMPERATURE_VERSION_1_V5 = 0x01;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_GENERAL_PURPOSE_VALUE_VERSION_1_V5 = 0x02;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_LUMINANCE_VERSION_1_V5 = 0x03;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_POWER_VERSION_2_V5 = 0x04;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_RELATIVE_HUMIDITY_VERSION_2_V5 = 0x05;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_VELOCITY_VERSION_2_V5 = 0x06;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_DIRECTION_VERSION_2_V5 = 0x07;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_ATMOSPHERIC_PRESSURE_VERSION_2_V5 = 0x08;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_BAROMETRIC_PRESSURE_VERSION_2_V5 = 0x09;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_SOLAR_RADIATION_VERSION_2_V5 = 0x0A;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_DEW_POINT_VERSION_2_V5 = 0x0B;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_RAIN_RATE_VERSION_2_V5 = 0x0C;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_TIDE_LEVEL_VERSION_2_V5 = 0x0D;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_WEIGHT_VERSION_3_V5 = 0x0E;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_VOLTAGE_VERSION_3_V5 = 0x0F;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_CURRENT_VERSION_3_V5 = 0x10;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_CO2_LEVEL_VERSION_3_V5 = 0x11;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_AIR_FLOW_VERSION_3_V5 = 0x12;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_TANK_CAPACITY_VERSION_3_V5 = 0x13;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_DISTANCE_VERSION_3_V5 = 0x14;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_ANGLE_POSITION_VERSION_4_V5 = 0x15;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_ROTATION_V5_V5 = 0x16;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_WATER_TEMPERATURE_V5_V5 = 0x17;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_SOIL_TEMPERATURE_V5_V5 = 0x18;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_SEISMIC_INTENSITY_V5_V5 = 0x19;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_SEISMIC_MAGNITUDE_V5_V5 = 0x1A;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_ULTRAVIOLET_V5_V5 = 0x1B;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_ELECTRICAL_RESISTIVITY_V5_V5 = 0x1C;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_ELECTRICAL_CONDUCTIVITY_V5_V5 = 0x1D;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_LOUDNESS_V5_V5 = 0x1E;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_MOISTURE_V5_V5 = 0x1F;
	/* Values used for Sensor Multilevel Supported Scale Report command */
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_TEMPERATURE_VERSION_1_V5 = 0x01;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_GENERAL_PURPOSE_VALUE_VERSION_1_V5 = 0x02;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_LUMINANCE_VERSION_1_V5 = 0x03;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_POWER_VERSION_2_V5 = 0x04;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_RELATIVE_HUMIDITY_VERSION_2_V5 = 0x05;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_VELOCITY_VERSION_2_V5 = 0x06;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_DIRECTION_VERSION_2_V5 = 0x07;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_ATMOSPHERIC_PRESSURE_VERSION_2_V5 = 0x08;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_BAROMETRIC_PRESSURE_VERSION_2_V5 = 0x09;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_SOLAR_RADIATION_VERSION_2_V5 = 0x0A;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_DEW_POINT_VERSION_2_V5 = 0x0B;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_RAIN_RATE_VERSION_2_V5 = 0x0C;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_TIDE_LEVEL_VERSION_2_V5 = 0x0D;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_WEIGHT_VERSION_3_V5 = 0x0E;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_VOLTAGE_VERSION_3_V5 = 0x0F;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_CURRENT_VERSION_3_V5 = 0x10;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_CO2_LEVEL_VERSION_3_V5 = 0x11;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_AIR_FLOW_VERSION_3_V5 = 0x12;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_TANK_CAPACITY_VERSION_3_V5 = 0x13;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_DISTANCE_VERSION_3_V5 = 0x14;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_ANGLE_POSITION_VERSION_4_V5 = 0x15;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_ROTATION_V5_V5 = 0x16;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_WATER_TEMPERATURE_V5_V5 = 0x17;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_SOIL_TEMPERATURE_V5_V5 = 0x18;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_SEISMIC_INTENSITY_V5_V5 = 0x19;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_SEISMIC_MAGNITUDE_V5_V5 = 0x1A;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_ULTRAVIOLET_V5_V5 = 0x1B;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_ELECTRICAL_RESISTIVITY_V5_V5 = 0x1C;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_ELECTRICAL_CONDUCTIVITY_V5_V5 = 0x1D;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_LOUDNESS_V5_V5 = 0x1E;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_MOISTURE_V5_V5 = 0x1F;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_PROPERTIES1_SCALE_BIT_MASK_MASK_V5 = 0x0F;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_PROPERTIES1_RESERVED_MASK_V5 = (byte) 0xF0;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_PROPERTIES1_RESERVED_SHIFT_V5 = 0x04;

	/* Sensor Multilevel command class commands */
	public static final byte SENSOR_MULTILEVEL_VERSION_V6 = 0x06;
	public static final byte SENSOR_MULTILEVEL_GET_V6 = 0x04;
	public static final byte SENSOR_MULTILEVEL_REPORT_V6 = 0x05;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SENSOR_V6 = 0x01;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SENSOR_REPORT_V6 = 0x02;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_V6 = 0x03;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_V6 = 0x06;
	/* Values used for Sensor Multilevel Get command */
	public static final byte SENSOR_MULTILEVEL_GET_TEMPERATURE_VERSION_1_V6 = 0x01;
	public static final byte SENSOR_MULTILEVEL_GET_GENERAL_PURPOSE_VALUE_VERSION_1_V6 = 0x02;
	public static final byte SENSOR_MULTILEVEL_GET_LUMINANCE_VERSION_1_V6 = 0x03;
	public static final byte SENSOR_MULTILEVEL_GET_POWER_VERSION_2_V6 = 0x04;
	public static final byte SENSOR_MULTILEVEL_GET_RELATIVE_HUMIDITY_VERSION_2_V6 = 0x05;
	public static final byte SENSOR_MULTILEVEL_GET_VELOCITY_VERSION_2_V6 = 0x06;
	public static final byte SENSOR_MULTILEVEL_GET_DIRECTION_VERSION_2_V6 = 0x07;
	public static final byte SENSOR_MULTILEVEL_GET_ATMOSPHERIC_PRESSURE_VERSION_2_V6 = 0x08;
	public static final byte SENSOR_MULTILEVEL_GET_BAROMETRIC_PRESSURE_VERSION_2_V6 = 0x09;
	public static final byte SENSOR_MULTILEVEL_GET_SOLAR_RADIATION_VERSION_2_V6 = 0x0A;
	public static final byte SENSOR_MULTILEVEL_GET_DEW_POINT_VERSION_2_V6 = 0x0B;
	public static final byte SENSOR_MULTILEVEL_GET_RAIN_RATE_VERSION_2_V6 = 0x0C;
	public static final byte SENSOR_MULTILEVEL_GET_TIDE_LEVEL_VERSION_2_V6 = 0x0D;
	public static final byte SENSOR_MULTILEVEL_GET_WEIGHT_VERSION_3_V6 = 0x0E;
	public static final byte SENSOR_MULTILEVEL_GET_VOLTAGE_VERSION_3_V6 = 0x0F;
	public static final byte SENSOR_MULTILEVEL_GET_CURRENT_VERSION_3_V6 = 0x10;
	public static final byte SENSOR_MULTILEVEL_GET_CO2_LEVEL_VERSION_3_V6 = 0x11;
	public static final byte SENSOR_MULTILEVEL_GET_AIR_FLOW_VERSION_3_V6 = 0x12;
	public static final byte SENSOR_MULTILEVEL_GET_TANK_CAPACITY_VERSION_3_V6 = 0x13;
	public static final byte SENSOR_MULTILEVEL_GET_DISTANCE_VERSION_3_V6 = 0x14;
	public static final byte SENSOR_MULTILEVEL_GET_ANGLE_POSITION_VERSION_4_V6 = 0x15;
	public static final byte SENSOR_MULTILEVEL_GET_ROTATION_V5_V6 = 0x16;
	public static final byte SENSOR_MULTILEVEL_GET_WATER_TEMPERATURE_V5_V6 = 0x17;
	public static final byte SENSOR_MULTILEVEL_GET_SOIL_TEMPERATURE_V5_V6 = 0x18;
	public static final byte SENSOR_MULTILEVEL_GET_SEISMIC_INTENSITY_V5_V6 = 0x19;
	public static final byte SENSOR_MULTILEVEL_GET_SEISMIC_MAGNITUDE_V5_V6 = 0x1A;
	public static final byte SENSOR_MULTILEVEL_GET_ULTRAVIOLET_V5_V6 = 0x1B;
	public static final byte SENSOR_MULTILEVEL_GET_ELECTRICAL_RESISTIVITY_V5_V6 = 0x1C;
	public static final byte SENSOR_MULTILEVEL_GET_ELECTRICAL_CONDUCTIVITY_V5_V6 = 0x1D;
	public static final byte SENSOR_MULTILEVEL_GET_LOUDNESS_V5_V6 = 0x1E;
	public static final byte SENSOR_MULTILEVEL_GET_MOISTURE_V5_V6 = 0x1F;
	public static final byte SENSOR_MULTILEVEL_GET_FREQUENCY_V6_V6 = 0x20;
	public static final byte SENSOR_MULTILEVEL_GET_TIME_V6_V6 = 0x21;
	public static final byte SENSOR_MULTILEVEL_GET_TARGET_TEMPERATURE_V6_V6 = 0x22;
	public static final byte SENSOR_MULTILEVEL_GET_PROPERTIES1_RESERVED1_MASK_V6 = 0x07;
	public static final byte SENSOR_MULTILEVEL_GET_PROPERTIES1_SCALE_MASK_V6 = 0x18;
	public static final byte SENSOR_MULTILEVEL_GET_PROPERTIES1_SCALE_SHIFT_V6 = 0x03;
	public static final byte SENSOR_MULTILEVEL_GET_PROPERTIES1_RESERVED2_MASK_V6 = (byte) 0xE0;
	public static final byte SENSOR_MULTILEVEL_GET_PROPERTIES1_RESERVED2_SHIFT_V6 = 0x05;
	/* Values used for Sensor Multilevel Report command */
	public static final byte SENSOR_MULTILEVEL_REPORT_TEMPERATURE_VERSION_1_V6 = 0x01;
	public static final byte SENSOR_MULTILEVEL_REPORT_GENERAL_PURPOSE_VALUE_VERSION_1_V6 = 0x02;
	public static final byte SENSOR_MULTILEVEL_REPORT_LUMINANCE_VERSION_1_V6 = 0x03;
	public static final byte SENSOR_MULTILEVEL_REPORT_POWER_VERSION_2_V6 = 0x04;
	public static final byte SENSOR_MULTILEVEL_REPORT_RELATIVE_HUMIDITY_VERSION_2_V6 = 0x05;
	public static final byte SENSOR_MULTILEVEL_REPORT_VELOCITY_VERSION_2_V6 = 0x06;
	public static final byte SENSOR_MULTILEVEL_REPORT_DIRECTION_VERSION_2_V6 = 0x07;
	public static final byte SENSOR_MULTILEVEL_REPORT_ATMOSPHERIC_PRESSURE_VERSION_2_V6 = 0x08;
	public static final byte SENSOR_MULTILEVEL_REPORT_BAROMETRIC_PRESSURE_VERSION_2_V6 = 0x09;
	public static final byte SENSOR_MULTILEVEL_REPORT_SOLAR_RADIATION_VERSION_2_V6 = 0x0A;
	public static final byte SENSOR_MULTILEVEL_REPORT_DEW_POINT_VERSION_2_V6 = 0x0B;
	public static final byte SENSOR_MULTILEVEL_REPORT_RAIN_RATE_VERSION_2_V6 = 0x0C;
	public static final byte SENSOR_MULTILEVEL_REPORT_TIDE_LEVEL_VERSION_2_V6 = 0x0D;
	public static final byte SENSOR_MULTILEVEL_REPORT_WEIGHT_VERSION_3_V6 = 0x0E;
	public static final byte SENSOR_MULTILEVEL_REPORT_VOLTAGE_VERSION_3_V6 = 0x0F;
	public static final byte SENSOR_MULTILEVEL_REPORT_CURRENT_VERSION_3_V6 = 0x10;
	public static final byte SENSOR_MULTILEVEL_REPORT_CO2_LEVEL_VERSION_3_V6 = 0x11;
	public static final byte SENSOR_MULTILEVEL_REPORT_AIR_FLOW_VERSION_3_V6 = 0x12;
	public static final byte SENSOR_MULTILEVEL_REPORT_TANK_CAPACITY_VERSION_3_V6 = 0x13;
	public static final byte SENSOR_MULTILEVEL_REPORT_DISTANCE_VERSION_3_V6 = 0x14;
	public static final byte SENSOR_MULTILEVEL_REPORT_ANGLE_POSITION_VERSION_4_V6 = 0x15;
	public static final byte SENSOR_MULTILEVEL_REPORT_ROTATION_V5_V6 = 0x16;
	public static final byte SENSOR_MULTILEVEL_REPORT_WATER_TEMPERATURE_V5_V6 = 0x17;
	public static final byte SENSOR_MULTILEVEL_REPORT_SOIL_TEMPERATURE_V5_V6 = 0x18;
	public static final byte SENSOR_MULTILEVEL_REPORT_SEISMIC_INTENSITY_V5_V6 = 0x19;
	public static final byte SENSOR_MULTILEVEL_REPORT_SEISMIC_MAGNITUDE_V5_V6 = 0x1A;
	public static final byte SENSOR_MULTILEVEL_REPORT_ULTRAVIOLET_V5_V6 = 0x1B;
	public static final byte SENSOR_MULTILEVEL_REPORT_ELECTRICAL_RESISTIVITY_V5_V6 = 0x1C;
	public static final byte SENSOR_MULTILEVEL_REPORT_ELECTRICAL_CONDUCTIVITY_V5_V6 = 0x1D;
	public static final byte SENSOR_MULTILEVEL_REPORT_LOUDNESS_V5_V6 = 0x1E;
	public static final byte SENSOR_MULTILEVEL_REPORT_MOISTURE_V5_V6 = 0x1F;
	public static final byte SENSOR_MULTILEVEL_REPORT_FREQUENCY_V6_V6 = 0x20;
	public static final byte SENSOR_MULTILEVEL_REPORT_TIME_V6_V6 = 0x21;
	public static final byte SENSOR_MULTILEVEL_REPORT_TARGET_TEMPERATURE_V6_V6 = 0x22;
	public static final byte SENSOR_MULTILEVEL_REPORT_LEVEL_SIZE_MASK_V6 = 0x07;
	public static final byte SENSOR_MULTILEVEL_REPORT_LEVEL_SCALE_MASK_V6 = 0x18;
	public static final byte SENSOR_MULTILEVEL_REPORT_LEVEL_SCALE_SHIFT_V6 = 0x03;
	public static final byte SENSOR_MULTILEVEL_REPORT_LEVEL_PRECISION_MASK_V6 = (byte) 0xE0;
	public static final byte SENSOR_MULTILEVEL_REPORT_LEVEL_PRECISION_SHIFT_V6 = 0x05;
	/* Values used for Sensor Multilevel Supported Get Scale command */
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_TEMPERATURE_VERSION_1_V6 = 0x01;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_GENERAL_PURPOSE_VALUE_VERSION_1_V6 = 0x02;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_LUMINANCE_VERSION_1_V6 = 0x03;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_POWER_VERSION_2_V6 = 0x04;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_RELATIVE_HUMIDITY_VERSION_2_V6 = 0x05;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_VELOCITY_VERSION_2_V6 = 0x06;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_DIRECTION_VERSION_2_V6 = 0x07;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_ATMOSPHERIC_PRESSURE_VERSION_2_V6 = 0x08;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_BAROMETRIC_PRESSURE_VERSION_2_V6 = 0x09;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_SOLAR_RADIATION_VERSION_2_V6 = 0x0A;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_DEW_POINT_VERSION_2_V6 = 0x0B;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_RAIN_RATE_VERSION_2_V6 = 0x0C;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_TIDE_LEVEL_VERSION_2_V6 = 0x0D;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_WEIGHT_VERSION_3_V6 = 0x0E;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_VOLTAGE_VERSION_3_V6 = 0x0F;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_CURRENT_VERSION_3_V6 = 0x10;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_CO2_LEVEL_VERSION_3_V6 = 0x11;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_AIR_FLOW_VERSION_3_V6 = 0x12;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_TANK_CAPACITY_VERSION_3_V6 = 0x13;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_DISTANCE_VERSION_3_V6 = 0x14;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_ANGLE_POSITION_VERSION_4_V6 = 0x15;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_ROTATION_V5_V6 = 0x16;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_WATER_TEMPERATURE_V5_V6 = 0x17;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_SOIL_TEMPERATURE_V5_V6 = 0x18;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_SEISMIC_INTENSITY_V5_V6 = 0x19;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_SEISMIC_MAGNITUDE_V5_V6 = 0x1A;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_ULTRAVIOLET_V5_V6 = 0x1B;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_ELECTRICAL_RESISTIVITY_V5_V6 = 0x1C;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_ELECTRICAL_CONDUCTIVITY_V5_V6 = 0x1D;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_LOUDNESS_V5_V6 = 0x1E;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_MOISTURE_V5_V6 = 0x1F;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_FREQUENCY_V6_V6 = 0x20;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_TIME_V6_V6 = 0x21;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_TARGET_TEMPERATURE_V6_V6 = 0x22;
	/* Values used for Sensor Multilevel Supported Scale Report command */
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_TEMPERATURE_VERSION_1_V6 = 0x01;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_GENERAL_PURPOSE_VALUE_VERSION_1_V6 = 0x02;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_LUMINANCE_VERSION_1_V6 = 0x03;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_POWER_VERSION_2_V6 = 0x04;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_RELATIVE_HUMIDITY_VERSION_2_V6 = 0x05;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_VELOCITY_VERSION_2_V6 = 0x06;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_DIRECTION_VERSION_2_V6 = 0x07;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_ATMOSPHERIC_PRESSURE_VERSION_2_V6 = 0x08;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_BAROMETRIC_PRESSURE_VERSION_2_V6 = 0x09;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_SOLAR_RADIATION_VERSION_2_V6 = 0x0A;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_DEW_POINT_VERSION_2_V6 = 0x0B;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_RAIN_RATE_VERSION_2_V6 = 0x0C;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_TIDE_LEVEL_VERSION_2_V6 = 0x0D;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_WEIGHT_VERSION_3_V6 = 0x0E;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_VOLTAGE_VERSION_3_V6 = 0x0F;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_CURRENT_VERSION_3_V6 = 0x10;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_CO2_LEVEL_VERSION_3_V6 = 0x11;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_AIR_FLOW_VERSION_3_V6 = 0x12;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_TANK_CAPACITY_VERSION_3_V6 = 0x13;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_DISTANCE_VERSION_3_V6 = 0x14;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_ANGLE_POSITION_VERSION_4_V6 = 0x15;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_ROTATION_V5_V6 = 0x16;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_WATER_TEMPERATURE_V5_V6 = 0x17;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_SOIL_TEMPERATURE_V5_V6 = 0x18;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_SEISMIC_INTENSITY_V5_V6 = 0x19;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_SEISMIC_MAGNITUDE_V5_V6 = 0x1A;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_ULTRAVIOLET_V5_V6 = 0x1B;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_ELECTRICAL_RESISTIVITY_V5_V6 = 0x1C;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_ELECTRICAL_CONDUCTIVITY_V5_V6 = 0x1D;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_LOUDNESS_V5_V6 = 0x1E;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_MOISTURE_V5_V6 = 0x1F;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_FREQUENCY_V6_V6 = 0x20;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_TIME_V6_V6 = 0x21;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_TARGET_TEMPERATURE_V6_V6 = 0x22;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_PROPERTIES1_SCALE_BIT_MASK_MASK_V6 = 0x0F;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_PROPERTIES1_RESERVED_MASK_V6 = (byte) 0xF0;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_PROPERTIES1_RESERVED_SHIFT_V6 = 0x04;

	/* Sensor Multilevel command class commands */
	public static final byte SENSOR_MULTILEVEL_VERSION_V7 = 0x07;
	public static final byte SENSOR_MULTILEVEL_GET_V7 = 0x04;
	public static final byte SENSOR_MULTILEVEL_REPORT_V7 = 0x05;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SENSOR_V7 = 0x01;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SENSOR_REPORT_V7 = 0x02;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_V7 = 0x03;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_V7 = 0x06;
	/* Values used for Sensor Multilevel Get command */
	public static final byte SENSOR_MULTILEVEL_GET_TEMPERATURE_VERSION_1_V7 = 0x01;
	public static final byte SENSOR_MULTILEVEL_GET_GENERAL_PURPOSE_VALUE_VERSION_1_V7 = 0x02;
	public static final byte SENSOR_MULTILEVEL_GET_LUMINANCE_VERSION_1_V7 = 0x03;
	public static final byte SENSOR_MULTILEVEL_GET_POWER_VERSION_2_V7 = 0x04;
	public static final byte SENSOR_MULTILEVEL_GET_RELATIVE_HUMIDITY_VERSION_2_V7 = 0x05;
	public static final byte SENSOR_MULTILEVEL_GET_VELOCITY_VERSION_2_V7 = 0x06;
	public static final byte SENSOR_MULTILEVEL_GET_DIRECTION_VERSION_2_V7 = 0x07;
	public static final byte SENSOR_MULTILEVEL_GET_ATMOSPHERIC_PRESSURE_VERSION_2_V7 = 0x08;
	public static final byte SENSOR_MULTILEVEL_GET_BAROMETRIC_PRESSURE_VERSION_2_V7 = 0x09;
	public static final byte SENSOR_MULTILEVEL_GET_SOLAR_RADIATION_VERSION_2_V7 = 0x0A;
	public static final byte SENSOR_MULTILEVEL_GET_DEW_POINT_VERSION_2_V7 = 0x0B;
	public static final byte SENSOR_MULTILEVEL_GET_RAIN_RATE_VERSION_2_V7 = 0x0C;
	public static final byte SENSOR_MULTILEVEL_GET_TIDE_LEVEL_VERSION_2_V7 = 0x0D;
	public static final byte SENSOR_MULTILEVEL_GET_WEIGHT_VERSION_3_V7 = 0x0E;
	public static final byte SENSOR_MULTILEVEL_GET_VOLTAGE_VERSION_3_V7 = 0x0F;
	public static final byte SENSOR_MULTILEVEL_GET_CURRENT_VERSION_3_V7 = 0x10;
	public static final byte SENSOR_MULTILEVEL_GET_CO2_LEVEL_VERSION_3_V7 = 0x11;
	public static final byte SENSOR_MULTILEVEL_GET_AIR_FLOW_VERSION_3_V7 = 0x12;
	public static final byte SENSOR_MULTILEVEL_GET_TANK_CAPACITY_VERSION_3_V7 = 0x13;
	public static final byte SENSOR_MULTILEVEL_GET_DISTANCE_VERSION_3_V7 = 0x14;
	public static final byte SENSOR_MULTILEVEL_GET_ANGLE_POSITION_VERSION_4_V7 = 0x15;
	public static final byte SENSOR_MULTILEVEL_GET_ROTATION_V5_V7 = 0x16;
	public static final byte SENSOR_MULTILEVEL_GET_WATER_TEMPERATURE_V5_V7 = 0x17;
	public static final byte SENSOR_MULTILEVEL_GET_SOIL_TEMPERATURE_V5_V7 = 0x18;
	public static final byte SENSOR_MULTILEVEL_GET_SEISMIC_INTENSITY_V5_V7 = 0x19;
	public static final byte SENSOR_MULTILEVEL_GET_SEISMIC_MAGNITUDE_V5_V7 = 0x1A;
	public static final byte SENSOR_MULTILEVEL_GET_ULTRAVIOLET_V5_V7 = 0x1B;
	public static final byte SENSOR_MULTILEVEL_GET_ELECTRICAL_RESISTIVITY_V5_V7 = 0x1C;
	public static final byte SENSOR_MULTILEVEL_GET_ELECTRICAL_CONDUCTIVITY_V5_V7 = 0x1D;
	public static final byte SENSOR_MULTILEVEL_GET_LOUDNESS_V5_V7 = 0x1E;
	public static final byte SENSOR_MULTILEVEL_GET_MOISTURE_V5_V7 = 0x1F;
	public static final byte SENSOR_MULTILEVEL_GET_FREQUENCY_V6_V7 = 0x20;
	public static final byte SENSOR_MULTILEVEL_GET_TIME_V6_V7 = 0x21;
	public static final byte SENSOR_MULTILEVEL_GET_TARGET_TEMPERATURE_V6_V7 = 0x22;
	public static final byte SENSOR_MULTILEVEL_GET_PARTICULATE_MATTER_2_5_V7_V7 = 0x23;
	public static final byte SENSOR_MULTILEVEL_GET_FORMALDEHYDE_CH2O_LEVEL_V7_V7 = 0x24;
	public static final byte SENSOR_MULTILEVEL_GET_RADON_CONCENTRATION_V7_V7 = 0x25;
	public static final byte SENSOR_MULTILEVEL_GET_METHANE_DENSITY_CH4_V7_V7 = 0x26;
	public static final byte SENSOR_MULTILEVEL_GET_VOLATILE_ORGANIC_COMPOUND_V7_V7 = 0x27;
	public static final byte SENSOR_MULTILEVEL_GET_CARBON_MONOXIDE_CO_LEVEL_V7_V7 = 0x28;
	public static final byte SENSOR_MULTILEVEL_GET_SOIL_HUMIDITY_V7_V7 = 0x29;
	public static final byte SENSOR_MULTILEVEL_GET_SOIL_REACTIVITY_V7_V7 = 0x2A;
	public static final byte SENSOR_MULTILEVEL_GET_SOIL_SALINITY_V7_V7 = 0x2B;
	public static final byte SENSOR_MULTILEVEL_GET_HEART_RATE_V7_V7 = 0x2C;
	public static final byte SENSOR_MULTILEVEL_GET_BLOOD_PRESSURE_V7_V7 = 0x2D;
	public static final byte SENSOR_MULTILEVEL_GET_MUSCLE_MASS_V7_V7 = 0x2E;
	public static final byte SENSOR_MULTILEVEL_GET_FAT_MASS_V7_V7 = 0x2F;
	public static final byte SENSOR_MULTILEVEL_GET_BONE_MASS_V7_V7 = 0x30;
	public static final byte SENSOR_MULTILEVEL_GET_TOTAL_BODY_WATER_TBW_V7_V7 = 0x31;
	public static final byte SENSOR_MULTILEVEL_GET_BASIC_METABOLIC_RATE_BMR_V7_V7 = 0x32;
	public static final byte SENSOR_MULTILEVEL_GET_BODY_MASS_INDEX_BMI_V7_V7 = 0x33;
	public static final byte SENSOR_MULTILEVEL_GET_PROPERTIES1_RESERVED1_MASK_V7 = 0x07;
	public static final byte SENSOR_MULTILEVEL_GET_PROPERTIES1_SCALE_MASK_V7 = 0x18;
	public static final byte SENSOR_MULTILEVEL_GET_PROPERTIES1_SCALE_SHIFT_V7 = 0x03;
	public static final byte SENSOR_MULTILEVEL_GET_PROPERTIES1_RESERVED2_MASK_V7 = (byte) 0xE0;
	public static final byte SENSOR_MULTILEVEL_GET_PROPERTIES1_RESERVED2_SHIFT_V7 = 0x05;
	/* Values used for Sensor Multilevel Report command */
	public static final byte SENSOR_MULTILEVEL_REPORT_TEMPERATURE_VERSION_1_V7 = 0x01;
	public static final byte SENSOR_MULTILEVEL_REPORT_GENERAL_PURPOSE_VALUE_VERSION_1_V7 = 0x02;
	public static final byte SENSOR_MULTILEVEL_REPORT_LUMINANCE_VERSION_1_V7 = 0x03;
	public static final byte SENSOR_MULTILEVEL_REPORT_POWER_VERSION_2_V7 = 0x04;
	public static final byte SENSOR_MULTILEVEL_REPORT_RELATIVE_HUMIDITY_VERSION_2_V7 = 0x05;
	public static final byte SENSOR_MULTILEVEL_REPORT_VELOCITY_VERSION_2_V7 = 0x06;
	public static final byte SENSOR_MULTILEVEL_REPORT_DIRECTION_VERSION_2_V7 = 0x07;
	public static final byte SENSOR_MULTILEVEL_REPORT_ATMOSPHERIC_PRESSURE_VERSION_2_V7 = 0x08;
	public static final byte SENSOR_MULTILEVEL_REPORT_BAROMETRIC_PRESSURE_VERSION_2_V7 = 0x09;
	public static final byte SENSOR_MULTILEVEL_REPORT_SOLAR_RADIATION_VERSION_2_V7 = 0x0A;
	public static final byte SENSOR_MULTILEVEL_REPORT_DEW_POINT_VERSION_2_V7 = 0x0B;
	public static final byte SENSOR_MULTILEVEL_REPORT_RAIN_RATE_VERSION_2_V7 = 0x0C;
	public static final byte SENSOR_MULTILEVEL_REPORT_TIDE_LEVEL_VERSION_2_V7 = 0x0D;
	public static final byte SENSOR_MULTILEVEL_REPORT_WEIGHT_VERSION_3_V7 = 0x0E;
	public static final byte SENSOR_MULTILEVEL_REPORT_VOLTAGE_VERSION_3_V7 = 0x0F;
	public static final byte SENSOR_MULTILEVEL_REPORT_CURRENT_VERSION_3_V7 = 0x10;
	public static final byte SENSOR_MULTILEVEL_REPORT_CO2_LEVEL_VERSION_3_V7 = 0x11;
	public static final byte SENSOR_MULTILEVEL_REPORT_AIR_FLOW_VERSION_3_V7 = 0x12;
	public static final byte SENSOR_MULTILEVEL_REPORT_TANK_CAPACITY_VERSION_3_V7 = 0x13;
	public static final byte SENSOR_MULTILEVEL_REPORT_DISTANCE_VERSION_3_V7 = 0x14;
	public static final byte SENSOR_MULTILEVEL_REPORT_ANGLE_POSITION_VERSION_4_V7 = 0x15;
	public static final byte SENSOR_MULTILEVEL_REPORT_ROTATION_V5_V7 = 0x16;
	public static final byte SENSOR_MULTILEVEL_REPORT_WATER_TEMPERATURE_V5_V7 = 0x17;
	public static final byte SENSOR_MULTILEVEL_REPORT_SOIL_TEMPERATURE_V5_V7 = 0x18;
	public static final byte SENSOR_MULTILEVEL_REPORT_SEISMIC_INTENSITY_V5_V7 = 0x19;
	public static final byte SENSOR_MULTILEVEL_REPORT_SEISMIC_MAGNITUDE_V5_V7 = 0x1A;
	public static final byte SENSOR_MULTILEVEL_REPORT_ULTRAVIOLET_V5_V7 = 0x1B;
	public static final byte SENSOR_MULTILEVEL_REPORT_ELECTRICAL_RESISTIVITY_V5_V7 = 0x1C;
	public static final byte SENSOR_MULTILEVEL_REPORT_ELECTRICAL_CONDUCTIVITY_V5_V7 = 0x1D;
	public static final byte SENSOR_MULTILEVEL_REPORT_LOUDNESS_V5_V7 = 0x1E;
	public static final byte SENSOR_MULTILEVEL_REPORT_MOISTURE_V5_V7 = 0x1F;
	public static final byte SENSOR_MULTILEVEL_REPORT_FREQUENCY_V6_V7 = 0x20;
	public static final byte SENSOR_MULTILEVEL_REPORT_TIME_V6_V7 = 0x21;
	public static final byte SENSOR_MULTILEVEL_REPORT_TARGET_TEMPERATURE_V6_V7 = 0x22;
	public static final byte SENSOR_MULTILEVEL_REPORT_PARTICULATE_MATTER_2_5_V7_V7 = 0x23;
	public static final byte SENSOR_MULTILEVEL_REPORT_FORMALDEHYDE_CH2O_LEVEL_V7_V7 = 0x24;
	public static final byte SENSOR_MULTILEVEL_REPORT_RADON_CONCENTRATION_V7_V7 = 0x25;
	public static final byte SENSOR_MULTILEVEL_REPORT_METHANE_DENSITY_CH4_V7_V7 = 0x26;
	public static final byte SENSOR_MULTILEVEL_REPORT_VOLATILE_ORGANIC_COMPOUND_V7_V7 = 0x27;
	public static final byte SENSOR_MULTILEVEL_REPORT_CARBON_MONOXIDE_CO_LEVEL_V7_V7 = 0x28;
	public static final byte SENSOR_MULTILEVEL_REPORT_SOIL_HUMIDITY_V7_V7 = 0x29;
	public static final byte SENSOR_MULTILEVEL_REPORT_SOIL_REACTIVITY_V7_V7 = 0x2A;
	public static final byte SENSOR_MULTILEVEL_REPORT_SOIL_SALINITY_V7_V7 = 0x2B;
	public static final byte SENSOR_MULTILEVEL_REPORT_HEART_RATE_V7_V7 = 0x2C;
	public static final byte SENSOR_MULTILEVEL_REPORT_BLOOD_PRESSURE_V7_V7 = 0x2D;
	public static final byte SENSOR_MULTILEVEL_REPORT_MUSCLE_MASS_V7_V7 = 0x2E;
	public static final byte SENSOR_MULTILEVEL_REPORT_FAT_MASS_V7_V7 = 0x2F;
	public static final byte SENSOR_MULTILEVEL_REPORT_BONE_MASS_V7_V7 = 0x30;
	public static final byte SENSOR_MULTILEVEL_REPORT_TOTAL_BODY_WATER_TBW_V7_V7 = 0x31;
	public static final byte SENSOR_MULTILEVEL_REPORT_BASIC_METABOLIC_RATE_BMR_V7_V7 = 0x32;
	public static final byte SENSOR_MULTILEVEL_REPORT_BODY_MASS_INDEX_BMI_V7_V7 = 0x33;
	public static final byte SENSOR_MULTILEVEL_REPORT_LEVEL_SIZE_MASK_V7 = 0x07;
	public static final byte SENSOR_MULTILEVEL_REPORT_LEVEL_SCALE_MASK_V7 = 0x18;
	public static final byte SENSOR_MULTILEVEL_REPORT_LEVEL_SCALE_SHIFT_V7 = 0x03;
	public static final byte SENSOR_MULTILEVEL_REPORT_LEVEL_PRECISION_MASK_V7 = (byte) 0xE0;
	public static final byte SENSOR_MULTILEVEL_REPORT_LEVEL_PRECISION_SHIFT_V7 = 0x05;
	/* Values used for Sensor Multilevel Supported Get Scale command */
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_TEMPERATURE_VERSION_1_V7 = 0x01;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_GENERAL_PURPOSE_VALUE_VERSION_1_V7 = 0x02;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_LUMINANCE_VERSION_1_V7 = 0x03;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_POWER_VERSION_2_V7 = 0x04;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_RELATIVE_HUMIDITY_VERSION_2_V7 = 0x05;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_VELOCITY_VERSION_2_V7 = 0x06;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_DIRECTION_VERSION_2_V7 = 0x07;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_ATMOSPHERIC_PRESSURE_VERSION_2_V7 = 0x08;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_BAROMETRIC_PRESSURE_VERSION_2_V7 = 0x09;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_SOLAR_RADIATION_VERSION_2_V7 = 0x0A;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_DEW_POINT_VERSION_2_V7 = 0x0B;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_RAIN_RATE_VERSION_2_V7 = 0x0C;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_TIDE_LEVEL_VERSION_2_V7 = 0x0D;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_WEIGHT_VERSION_3_V7 = 0x0E;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_VOLTAGE_VERSION_3_V7 = 0x0F;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_CURRENT_VERSION_3_V7 = 0x10;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_CO2_LEVEL_VERSION_3_V7 = 0x11;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_AIR_FLOW_VERSION_3_V7 = 0x12;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_TANK_CAPACITY_VERSION_3_V7 = 0x13;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_DISTANCE_VERSION_3_V7 = 0x14;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_ANGLE_POSITION_VERSION_4_V7 = 0x15;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_ROTATION_V5_V7 = 0x16;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_WATER_TEMPERATURE_V5_V7 = 0x17;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_SOIL_TEMPERATURE_V5_V7 = 0x18;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_SEISMIC_INTENSITY_V5_V7 = 0x19;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_SEISMIC_MAGNITUDE_V5_V7 = 0x1A;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_ULTRAVIOLET_V5_V7 = 0x1B;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_ELECTRICAL_RESISTIVITY_V5_V7 = 0x1C;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_ELECTRICAL_CONDUCTIVITY_V5_V7 = 0x1D;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_LOUDNESS_V5_V7 = 0x1E;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_MOISTURE_V5_V7 = 0x1F;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_FREQUENCY_V6_V7 = 0x20;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_TIME_V6_V7 = 0x21;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_TARGET_TEMPERATURE_V6_V7 = 0x22;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_PARTICULATE_MATTER_2_5_V7_V7 = 0x23;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_FORMALDEHYDE_CH2O_LEVEL_V7_V7 = 0x24;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_RADON_CONCENTRATION_V7_V7 = 0x25;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_METHANE_DENSITY_CH4_V7_V7 = 0x26;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_VOLATILE_ORGANIC_COMPOUND_V7_V7 = 0x27;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_CARBON_MONOXIDE_CO_LEVEL_V7_V7 = 0x28;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_SOIL_HUMIDITY_V7_V7 = 0x29;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_SOIL_REACTIVITY_V7_V7 = 0x2A;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_SOIL_SALINITY_V7_V7 = 0x2B;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_HEART_RATE_V7_V7 = 0x2C;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_BLOOD_PRESSURE_V7_V7 = 0x2D;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_MUSCLE_MASS_V7_V7 = 0x2E;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_FAT_MASS_V7_V7 = 0x2F;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_BONE_MASS_V7_V7 = 0x30;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_TOTAL_BODY_WATER_TBW_V7_V7 = 0x31;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_BASIC_METABOLIC_RATE_BMR_V7_V7 = 0x32;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_BODY_MASS_INDEX_BMI_V7_V7 = 0x33;
	/* Values used for Sensor Multilevel Supported Scale Report command */
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_TEMPERATURE_VERSION_1_V7 = 0x01;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_GENERAL_PURPOSE_VALUE_VERSION_1_V7 = 0x02;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_LUMINANCE_VERSION_1_V7 = 0x03;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_POWER_VERSION_2_V7 = 0x04;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_RELATIVE_HUMIDITY_VERSION_2_V7 = 0x05;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_VELOCITY_VERSION_2_V7 = 0x06;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_DIRECTION_VERSION_2_V7 = 0x07;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_ATMOSPHERIC_PRESSURE_VERSION_2_V7 = 0x08;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_BAROMETRIC_PRESSURE_VERSION_2_V7 = 0x09;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_SOLAR_RADIATION_VERSION_2_V7 = 0x0A;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_DEW_POINT_VERSION_2_V7 = 0x0B;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_RAIN_RATE_VERSION_2_V7 = 0x0C;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_TIDE_LEVEL_VERSION_2_V7 = 0x0D;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_WEIGHT_VERSION_3_V7 = 0x0E;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_VOLTAGE_VERSION_3_V7 = 0x0F;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_CURRENT_VERSION_3_V7 = 0x10;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_CO2_LEVEL_VERSION_3_V7 = 0x11;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_AIR_FLOW_VERSION_3_V7 = 0x12;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_TANK_CAPACITY_VERSION_3_V7 = 0x13;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_DISTANCE_VERSION_3_V7 = 0x14;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_ANGLE_POSITION_VERSION_4_V7 = 0x15;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_ROTATION_V5_V7 = 0x16;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_WATER_TEMPERATURE_V5_V7 = 0x17;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_SOIL_TEMPERATURE_V5_V7 = 0x18;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_SEISMIC_INTENSITY_V5_V7 = 0x19;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_SEISMIC_MAGNITUDE_V5_V7 = 0x1A;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_ULTRAVIOLET_V5_V7 = 0x1B;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_ELECTRICAL_RESISTIVITY_V5_V7 = 0x1C;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_ELECTRICAL_CONDUCTIVITY_V5_V7 = 0x1D;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_LOUDNESS_V5_V7 = 0x1E;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_MOISTURE_V5_V7 = 0x1F;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_FREQUENCY_V6_V7 = 0x20;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_TIME_V6_V7 = 0x21;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_TARGET_TEMPERATURE_V6_V7 = 0x22;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_PARTICULATE_MATTER_2_5_V7_V7 = 0x23;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_FORMALDEHYDE_CH2O_LEVEL_V7_V7 = 0x24;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_RADON_CONCENTRATION_V7_V7 = 0x25;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_METHANE_DENSITY_CH4_V7_V7 = 0x26;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_VOLATILE_ORGANIC_COMPOUND_V7_V7 = 0x27;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_CARBON_MONOXIDE_CO_LEVEL_V7_V7 = 0x28;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_SOIL_HUMIDITY_V7_V7 = 0x29;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_SOIL_REACTIVITY_V7_V7 = 0x2A;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_SOIL_SALINITY_V7_V7 = 0x2B;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_HEART_RATE_V7_V7 = 0x2C;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_BLOOD_PRESSURE_V7_V7 = 0x2D;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_MUSCLE_MASS_V7_V7 = 0x2E;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_FAT_MASS_V7_V7 = 0x2F;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_BONE_MASS_V7_V7 = 0x30;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_TOTAL_BODY_WATER_TBW_V7_V7 = 0x31;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_BASIC_METABOLIC_RATE_BMR_V7_V7 = 0x32;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_BODY_MASS_INDEX_BMI_V7_V7 = 0x33;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_PROPERTIES1_SCALE_BIT_MASK_MASK_V7 = 0x0F;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_PROPERTIES1_RESERVED_MASK_V7 = (byte) 0xF0;
	public static final byte SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_PROPERTIES1_RESERVED_SHIFT_V7 = 0x04;

	/* Silence Alarm command class commands */
	public static final byte SILENCE_ALARM_VERSION = 0x01;
	public static final byte SENSOR_ALARM_SET = 0x01;

	/* Simple Av Control command class commands */
	public static final byte SIMPLE_AV_CONTROL_VERSION = 0x01;
	public static final byte SIMPLE_AV_CONTROL_GET = 0x02;
	public static final byte SIMPLE_AV_CONTROL_REPORT = 0x03;
	public static final byte SIMPLE_AV_CONTROL_SET = 0x01;
	public static final byte SIMPLE_AV_CONTROL_SUPPORTED_GET = 0x04;
	public static final byte SIMPLE_AV_CONTROL_SUPPORTED_REPORT = 0x05;
	/* Values used for Simple Av Control Set command */
	public static final byte SIMPLE_AV_CONTROL_SET_PROPERTIES1_KEY_ATTRIBUTES_MASK = 0x07;
	public static final byte SIMPLE_AV_CONTROL_SET_PROPERTIES1_RESERVED_MASK = (byte) 0xF8;
	public static final byte SIMPLE_AV_CONTROL_SET_PROPERTIES1_RESERVED_SHIFT = 0x03;

	/* Switch All command class commands */
	public static final byte SWITCH_ALL_VERSION = 0x01;
	public static final byte SWITCH_ALL_GET = 0x02;
	public static final byte SWITCH_ALL_OFF = 0x05;
	public static final byte SWITCH_ALL_ON = 0x04;
	public static final byte SWITCH_ALL_REPORT = 0x03;
	public static final byte SWITCH_ALL_SET = 0x01;
	/* Values used for Switch All Report command */
	public static final byte SWITCH_ALL_REPORT_EXCLUDED_FROM_THE_ALL_ON_ALL_OFF_FUNCTIONALITY = 0x00;
	public static final byte SWITCH_ALL_REPORT_EXCLUDED_FROM_THE_ALL_ON_FUNCTIONALITY_BUT_NOT_ALL_OFF = 0x01;
	public static final byte SWITCH_ALL_REPORT_EXCLUDED_FROM_THE_ALL_OFF_FUNCTIONALITY_BUT_NOT_ALL_ON = 0x02;
	public static final byte SWITCH_ALL_REPORT_INCLUDED_IN_THE_ALL_ON_ALL_OFF_FUNCTIONALITY = (byte) 0xFF;
	/* Values used for Switch All Set command */
	public static final byte SWITCH_ALL_SET_EXCLUDED_FROM_THE_ALL_ON_ALL_OFF_FUNCTIONALITY = 0x00;
	public static final byte SWITCH_ALL_SET_EXCLUDED_FROM_THE_ALL_ON_FUNCTIONALITY_BUT_NOT_ALL_OFF = 0x01;
	public static final byte SWITCH_ALL_SET_EXCLUDED_FROM_THE_ALL_OFF_FUNCTIONALITY_BUT_NOT_ALL_ON = 0x02;
	public static final byte SWITCH_ALL_SET_INCLUDED_IN_THE_ALL_ON_ALL_OFF_FUNCTIONALITY = (byte) 0xFF;

	/* Switch Binary command class commands */
	public static final byte SWITCH_BINARY_VERSION = 0x01;
	public static final byte SWITCH_BINARY_GET = 0x02;
	public static final byte SWITCH_BINARY_REPORT = 0x03;
	public static final byte SWITCH_BINARY_SET = 0x01;

	/* Switch Multilevel command class commands */
	public static final byte SWITCH_MULTILEVEL_VERSION = 0x01;
	public static final byte SWITCH_MULTILEVEL_GET = 0x02;
	public static final byte SWITCH_MULTILEVEL_REPORT = 0x03;
	public static final byte SWITCH_MULTILEVEL_SET = 0x01;
	public static final byte SWITCH_MULTILEVEL_START_LEVEL_CHANGE = 0x04;
	public static final byte SWITCH_MULTILEVEL_STOP_LEVEL_CHANGE = 0x05;
	/* Values used for Switch Multilevel Start Level Change command */
	public static final byte SWITCH_MULTILEVEL_START_LEVEL_CHANGE_LEVEL_RESERVED1_MASK = 0x1F;
	public static final byte SWITCH_MULTILEVEL_START_LEVEL_CHANGE_LEVEL_IGNORE_START_LEVEL_BIT_MASK = 0x20;
	public static final byte SWITCH_MULTILEVEL_START_LEVEL_CHANGE_LEVEL_UP_DOWN_BIT_MASK = 0x40;
	public static final byte SWITCH_MULTILEVEL_START_LEVEL_CHANGE_LEVEL_RESERVED2_BIT_MASK = (byte) 0x80;

	/* Switch Multilevel command class commands */
	public static final byte SWITCH_MULTILEVEL_VERSION_V2 = 0x02;
	public static final byte SWITCH_MULTILEVEL_GET_V2 = 0x02;
	public static final byte SWITCH_MULTILEVEL_REPORT_V2 = 0x03;
	public static final byte SWITCH_MULTILEVEL_SET_V2 = 0x01;
	public static final byte SWITCH_MULTILEVEL_START_LEVEL_CHANGE_V2 = 0x04;
	public static final byte SWITCH_MULTILEVEL_STOP_LEVEL_CHANGE_V2 = 0x05;
	/* Values used for Switch Multilevel Start Level Change command */
	public static final byte SWITCH_MULTILEVEL_START_LEVEL_CHANGE_PROPERTIES1_RESERVED1_MASK_V2 = 0x1F;
	public static final byte SWITCH_MULTILEVEL_START_LEVEL_CHANGE_PROPERTIES1_IGNORE_START_LEVEL_BIT_MASK_V2 = 0x20;
	public static final byte SWITCH_MULTILEVEL_START_LEVEL_CHANGE_PROPERTIES1_UP_DOWN_BIT_MASK_V2 = 0x40;
	public static final byte SWITCH_MULTILEVEL_START_LEVEL_CHANGE_PROPERTIES1_RESERVED2_BIT_MASK_V2 = (byte) 0x80;

	/* Switch Multilevel command class commands */
	public static final byte SWITCH_MULTILEVEL_VERSION_V3 = 0x03;
	public static final byte SWITCH_MULTILEVEL_GET_V3 = 0x02;
	public static final byte SWITCH_MULTILEVEL_REPORT_V3 = 0x03;
	public static final byte SWITCH_MULTILEVEL_SET_V3 = 0x01;
	public static final byte SWITCH_MULTILEVEL_START_LEVEL_CHANGE_V3 = 0x04;
	public static final byte SWITCH_MULTILEVEL_STOP_LEVEL_CHANGE_V3 = 0x05;
	public static final byte SWITCH_MULTILEVEL_SUPPORTED_GET_V3 = 0x06;
	public static final byte SWITCH_MULTILEVEL_SUPPORTED_REPORT_V3 = 0x07;
	/* Values used for Switch Multilevel Start Level Change command */
	public static final byte SWITCH_MULTILEVEL_START_LEVEL_CHANGE_PROPERTIES1_RESERVED_MASK_V3 = 0x07;
	public static final byte SWITCH_MULTILEVEL_START_LEVEL_CHANGE_PROPERTIES1_INC_DEC_MASK_V3 = 0x18;
	public static final byte SWITCH_MULTILEVEL_START_LEVEL_CHANGE_PROPERTIES1_INC_DEC_SHIFT_V3 = 0x03;
	public static final byte SWITCH_MULTILEVEL_START_LEVEL_CHANGE_INC_DEC_INCREMENT_V3 = 0x00;
	public static final byte SWITCH_MULTILEVEL_START_LEVEL_CHANGE_INC_DEC_DECREMENT_V3 = 0x01;
	public static final byte SWITCH_MULTILEVEL_START_LEVEL_CHANGE_INC_DEC_RESERVED_V3 = 0x02;
	public static final byte SWITCH_MULTILEVEL_START_LEVEL_CHANGE_INC_DEC_NONE_V3 = 0x03;
	public static final byte SWITCH_MULTILEVEL_START_LEVEL_CHANGE_PROPERTIES1_IGNORE_START_LEVEL_BIT_MASK_V3 = 0x20;
	public static final byte SWITCH_MULTILEVEL_START_LEVEL_CHANGE_PROPERTIES1_UP_DOWN_MASK_V3 = (byte) 0xC0;
	public static final byte SWITCH_MULTILEVEL_START_LEVEL_CHANGE_PROPERTIES1_UP_DOWN_SHIFT_V3 = 0x06;
	public static final byte SWITCH_MULTILEVEL_START_LEVEL_CHANGE_UP_DOWN_UP_V3 = 0x00;
	public static final byte SWITCH_MULTILEVEL_START_LEVEL_CHANGE_UP_DOWN_DOWN_V3 = 0x01;
	public static final byte SWITCH_MULTILEVEL_START_LEVEL_CHANGE_UP_DOWN_RESERVED_V3 = 0x02;
	public static final byte SWITCH_MULTILEVEL_START_LEVEL_CHANGE_UP_DOWN_NONE_V3 = 0x03;
	/* Values used for Switch Multilevel Supported Report command */
	public static final byte SWITCH_MULTILEVEL_SUPPORTED_REPORT_PROPERTIES1_PRIMARY_SWITCH_TYPE_MASK_V3 = 0x1F;
	public static final byte SWITCH_MULTILEVEL_SUPPORTED_REPORT_PROPERTIES1_RESERVED_MASK_V3 = (byte) 0xE0;
	public static final byte SWITCH_MULTILEVEL_SUPPORTED_REPORT_PROPERTIES1_RESERVED_SHIFT_V3 = 0x05;
	public static final byte SWITCH_MULTILEVEL_SUPPORTED_REPORT_PROPERTIES2_SECONDARY_SWITCH_TYPE_MASK_V3 = 0x1F;
	public static final byte SWITCH_MULTILEVEL_SUPPORTED_REPORT_PROPERTIES2_RESERVED_MASK_V3 = (byte) 0xE0;
	public static final byte SWITCH_MULTILEVEL_SUPPORTED_REPORT_PROPERTIES2_RESERVED_SHIFT_V3 = 0x05;

	/* Switch Toggle Binary command class commands */
	public static final byte SWITCH_TOGGLE_BINARY_VERSION = 0x01;
	public static final byte SWITCH_TOGGLE_BINARY_SET = 0x01; /* SWITCH_TOGGLE_BINARY_SET */
	public static final byte SWITCH_TOGGLE_BINARY_GET = 0x02;
	public static final byte SWITCH_TOGGLE_BINARY_REPORT = 0x03;

	/* Switch Toggle Multilevel command class commands */
	public static final byte SWITCH_TOGGLE_MULTILEVEL_VERSION = 0x01;
	public static final byte SWITCH_TOGGLE_MULTILEVEL_SET = 0x01; /* SWITCH_TOGGLE_MULTILEVEL_SET */
	public static final byte SWITCH_TOGGLE_MULTILEVEL_GET = 0x02;
	public static final byte SWITCH_TOGGLE_MULTILEVEL_REPORT = 0x03;
	public static final byte SWITCH_TOGGLE_MULTILEVEL_START_LEVEL_CHANGE = 0x04;
	public static final byte SWITCH_TOGGLE_MULTILEVEL_STOP_LEVEL_CHANGE = 0x05;
	/* Values used for Switch Toggle Multilevel Start Level Change command */
	public static final byte SWITCH_TOGGLE_MULTILEVEL_START_LEVEL_CHANGE_LEVEL_RESERVED1_MASK = 0x1F;
	public static final byte SWITCH_TOGGLE_MULTILEVEL_START_LEVEL_CHANGE_LEVEL_IGNORE_START_LEVEL_BIT_MASK = 0x20;
	public static final byte SWITCH_TOGGLE_MULTILEVEL_START_LEVEL_CHANGE_LEVEL_RESERVED2_BIT_MASK = 0x40;
	public static final byte SWITCH_TOGGLE_MULTILEVEL_START_LEVEL_CHANGE_LEVEL_ROLL_OVER_BIT_MASK = (byte) 0x80;

	/* Tariff Config command class commands */
	public static final byte TARIFF_CONFIG_VERSION = 0x01;
	public static final byte TARIFF_TBL_REMOVE = 0x03;
	public static final byte TARIFF_TBL_SET = 0x02;
	public static final byte TARIFF_TBL_SUPPLIER_SET = 0x01;
	/* Values used for Tariff Tbl Remove command */
	public static final byte TARIFF_TBL_REMOVE_PROPERTIES1_RATE_PARAMETER_SET_IDS_MASK = 0x3F;
	public static final byte TARIFF_TBL_REMOVE_PROPERTIES1_RESERVED_MASK = (byte) 0xC0;
	public static final byte TARIFF_TBL_REMOVE_PROPERTIES1_RESERVED_SHIFT = 0x06;
	/* Values used for Tariff Tbl Set command */
	public static final byte TARIFF_TBL_SET_PROPERTIES1_RESERVED_MASK = 0x1F;
	public static final byte TARIFF_TBL_SET_PROPERTIES1_TARIFF_PRECISION_MASK = (byte) 0xE0;
	public static final byte TARIFF_TBL_SET_PROPERTIES1_TARIFF_PRECISION_SHIFT = 0x05;
	/* Values used for Tariff Tbl Supplier Set command */
	public static final byte TARIFF_TBL_SUPPLIER_SET_PROPERTIES1_STANDING_CHARGE_PERIOD_MASK = 0x1F;
	public static final byte TARIFF_TBL_SUPPLIER_SET_PROPERTIES1_STANDING_CHARGE_PRECISION_MASK = (byte) 0xE0;
	public static final byte TARIFF_TBL_SUPPLIER_SET_PROPERTIES1_STANDING_CHARGE_PRECISION_SHIFT = 0x05;
	public static final byte TARIFF_TBL_SUPPLIER_SET_PROPERTIES2_NUMBER_OF_SUPPLIER_CHARACTERS_MASK = 0x1F;
	public static final byte TARIFF_TBL_SUPPLIER_SET_PROPERTIES2_RESERVED_MASK = (byte) 0xE0;
	public static final byte TARIFF_TBL_SUPPLIER_SET_PROPERTIES2_RESERVED_SHIFT = 0x05;

	/* Tariff Tbl Monitor command class commands */
	public static final byte TARIFF_TBL_MONITOR_VERSION = 0x01;
	public static final byte TARIFF_TBL_COST_GET = 0x05;
	public static final byte TARIFF_TBL_COST_REPORT = 0x06;
	public static final byte TARIFF_TBL_GET = 0x03;
	public static final byte TARIFF_TBL_REPORT = 0x04;
	public static final byte TARIFF_TBL_SUPPLIER_GET = 0x01;
	public static final byte TARIFF_TBL_SUPPLIER_REPORT = 0x02;
	/* Values used for Tariff Tbl Cost Report command */
	public static final byte TARIFF_TBL_COST_REPORT_PROPERTIES1_RATE_TYPE_MASK = 0x03;
	public static final byte TARIFF_TBL_COST_REPORT_PROPERTIES1_RESERVED_MASK = (byte) 0xFC;
	public static final byte TARIFF_TBL_COST_REPORT_PROPERTIES1_RESERVED_SHIFT = 0x02;
	public static final byte TARIFF_TBL_COST_REPORT_PROPERTIES2_RESERVED_MASK = 0x1F;
	public static final byte TARIFF_TBL_COST_REPORT_PROPERTIES2_COST_PRECISION_MASK = (byte) 0xE0;
	public static final byte TARIFF_TBL_COST_REPORT_PROPERTIES2_COST_PRECISION_SHIFT = 0x05;
	/* Values used for Tariff Tbl Report command */
	public static final byte TARIFF_TBL_REPORT_PROPERTIES1_RESERVED_MASK = 0x1F;
	public static final byte TARIFF_TBL_REPORT_PROPERTIES1_TARIFF_PRECISION_MASK = (byte) 0xE0;
	public static final byte TARIFF_TBL_REPORT_PROPERTIES1_TARIFF_PRECISION_SHIFT = 0x05;
	/* Values used for Tariff Tbl Supplier Report command */
	public static final byte TARIFF_TBL_SUPPLIER_REPORT_PROPERTIES1_STANDING_CHARGE_PERIOD_MASK = 0x1F;
	public static final byte TARIFF_TBL_SUPPLIER_REPORT_PROPERTIES1_STANDING_CHARGE_PRECISION_MASK = (byte) 0xE0;
	public static final byte TARIFF_TBL_SUPPLIER_REPORT_PROPERTIES1_STANDING_CHARGE_PRECISION_SHIFT = 0x05;
	public static final byte TARIFF_TBL_SUPPLIER_REPORT_PROPERTIES2_NUMBER_OF_SUPPLIER_CHARACTERS_MASK = 0x1F;
	public static final byte TARIFF_TBL_SUPPLIER_REPORT_PROPERTIES2_RESERVED_MASK = (byte) 0xE0;
	public static final byte TARIFF_TBL_SUPPLIER_REPORT_PROPERTIES2_RESERVED_SHIFT = 0x05;

	/* Thermostat Fan Mode command class commands */
	public static final byte THERMOSTAT_FAN_MODE_VERSION = 0x01;
	public static final byte THERMOSTAT_FAN_MODE_GET = 0x02;
	public static final byte THERMOSTAT_FAN_MODE_REPORT = 0x03;
	public static final byte THERMOSTAT_FAN_MODE_SET = 0x01;
	public static final byte THERMOSTAT_FAN_MODE_SUPPORTED_GET = 0x04;
	public static final byte THERMOSTAT_FAN_MODE_SUPPORTED_REPORT = 0x05;
	/* Values used for Thermostat Fan Mode Report command */
	public static final byte THERMOSTAT_FAN_MODE_REPORT_LEVEL_FAN_MODE_MASK = 0x0F;
	public static final byte THERMOSTAT_FAN_MODE_REPORT_FAN_MODE_AUTO_LOW = 0x00;
	public static final byte THERMOSTAT_FAN_MODE_REPORT_FAN_MODE_LOW = 0x01;
	public static final byte THERMOSTAT_FAN_MODE_REPORT_FAN_MODE_AUTO_HIGH = 0x02;
	public static final byte THERMOSTAT_FAN_MODE_REPORT_FAN_MODE_HIGH = 0x03;
	public static final byte THERMOSTAT_FAN_MODE_REPORT_LEVEL_RESERVED_MASK = (byte) 0xF0;
	public static final byte THERMOSTAT_FAN_MODE_REPORT_LEVEL_RESERVED_SHIFT = 0x04;
	/* Values used for Thermostat Fan Mode Set command */
	public static final byte THERMOSTAT_FAN_MODE_SET_LEVEL_FAN_MODE_MASK = 0x0F;
	public static final byte THERMOSTAT_FAN_MODE_SET_FAN_MODE_AUTO_LOW = 0x00;
	public static final byte THERMOSTAT_FAN_MODE_SET_FAN_MODE_LOW = 0x01;
	public static final byte THERMOSTAT_FAN_MODE_SET_FAN_MODE_AUTO_HIGH = 0x02;
	public static final byte THERMOSTAT_FAN_MODE_SET_FAN_MODE_HIGH = 0x03;
	public static final byte THERMOSTAT_FAN_MODE_SET_LEVEL_RESERVED_MASK = (byte) 0xF0;
	public static final byte THERMOSTAT_FAN_MODE_SET_LEVEL_RESERVED_SHIFT = 0x04;

	/* Thermostat Fan Mode command class commands */
	public static final byte THERMOSTAT_FAN_MODE_VERSION_V2 = 0x02;
	public static final byte THERMOSTAT_FAN_MODE_GET_V2 = 0x02;
	public static final byte THERMOSTAT_FAN_MODE_REPORT_V2 = 0x03;
	public static final byte THERMOSTAT_FAN_MODE_SET_V2 = 0x01;
	public static final byte THERMOSTAT_FAN_MODE_SUPPORTED_GET_V2 = 0x04;
	public static final byte THERMOSTAT_FAN_MODE_SUPPORTED_REPORT_V2 = 0x05;
	/* Values used for Thermostat Fan Mode Report command */
	public static final byte THERMOSTAT_FAN_MODE_REPORT_LEVEL_FAN_MODE_MASK_V2 = 0x0F;
	public static final byte THERMOSTAT_FAN_MODE_REPORT_FAN_MODE_AUTO_LOW_V2 = 0x00;
	public static final byte THERMOSTAT_FAN_MODE_REPORT_FAN_MODE_LOW_V2 = 0x01;
	public static final byte THERMOSTAT_FAN_MODE_REPORT_FAN_MODE_AUTO_HIGH_V2 = 0x02;
	public static final byte THERMOSTAT_FAN_MODE_REPORT_FAN_MODE_HIGH_V2 = 0x03;
	public static final byte THERMOSTAT_FAN_MODE_REPORT_FAN_MODE_AUTO_MEDIUM_V2 = 0x04;
	public static final byte THERMOSTAT_FAN_MODE_REPORT_FAN_MODE_MEDIUM_V2 = 0x05;
	public static final byte THERMOSTAT_FAN_MODE_REPORT_LEVEL_RESERVED_MASK_V2 = (byte) 0xF0;
	public static final byte THERMOSTAT_FAN_MODE_REPORT_LEVEL_RESERVED_SHIFT_V2 = 0x04;
	/* Values used for Thermostat Fan Mode Set command */
	public static final byte THERMOSTAT_FAN_MODE_SET_LEVEL_FAN_MODE_MASK_V2 = 0x0F;
	public static final byte THERMOSTAT_FAN_MODE_SET_FAN_MODE_AUTO_LOW_V2 = 0x00;
	public static final byte THERMOSTAT_FAN_MODE_SET_FAN_MODE_LOW_V2 = 0x01;
	public static final byte THERMOSTAT_FAN_MODE_SET_FAN_MODE_AUTO_HIGH_V2 = 0x02;
	public static final byte THERMOSTAT_FAN_MODE_SET_FAN_MODE_HIGH_V2 = 0x03;
	public static final byte THERMOSTAT_FAN_MODE_SET_FAN_MODE_AUTO_MEDIUM_V2 = 0x04;
	public static final byte THERMOSTAT_FAN_MODE_SET_FAN_MODE_MEDIUM_V2 = 0x05;
	public static final byte THERMOSTAT_FAN_MODE_SET_LEVEL_RESERVED_MASK_V2 = 0x70;
	public static final byte THERMOSTAT_FAN_MODE_SET_LEVEL_RESERVED_SHIFT_V2 = 0x04;
	public static final byte THERMOSTAT_FAN_MODE_SET_LEVEL_OFF_BIT_MASK_V2 = (byte) 0x80;

	/* Thermostat Fan Mode command class commands */
	public static final byte THERMOSTAT_FAN_MODE_VERSION_V3 = 0x03;
	public static final byte THERMOSTAT_FAN_MODE_GET_V3 = 0x02;
	public static final byte THERMOSTAT_FAN_MODE_REPORT_V3 = 0x03;
	public static final byte THERMOSTAT_FAN_MODE_SET_V3 = 0x01;
	public static final byte THERMOSTAT_FAN_MODE_SUPPORTED_GET_V3 = 0x04;
	public static final byte THERMOSTAT_FAN_MODE_SUPPORTED_REPORT_V3 = 0x05;
	/* Values used for Thermostat Fan Mode Report command */
	public static final byte THERMOSTAT_FAN_MODE_REPORT_PROPERTIES1_FAN_MODE_MASK_V3 = 0x0F;
	public static final byte THERMOSTAT_FAN_MODE_REPORT_FAN_MODE_AUTO_LOW_V3 = 0x00;
	public static final byte THERMOSTAT_FAN_MODE_REPORT_FAN_MODE_LOW_V3 = 0x01;
	public static final byte THERMOSTAT_FAN_MODE_REPORT_FAN_MODE_AUTO_HIGH_V3 = 0x02;
	public static final byte THERMOSTAT_FAN_MODE_REPORT_FAN_MODE_HIGH_V3 = 0x03;
	public static final byte THERMOSTAT_FAN_MODE_REPORT_FAN_MODE_AUTO_MEDIUM_V3 = 0x04;
	public static final byte THERMOSTAT_FAN_MODE_REPORT_FAN_MODE_MEDIUM_V3 = 0x05;
	public static final byte THERMOSTAT_FAN_MODE_REPORT_FAN_MODE_CIRCULATION_V3 = 0x06;
	public static final byte THERMOSTAT_FAN_MODE_REPORT_FAN_MODE_HUMIDITY_V3 = 0x07;
	public static final byte THERMOSTAT_FAN_MODE_REPORT_PROPERTIES1_RESERVED_MASK_V3 = 0x70;
	public static final byte THERMOSTAT_FAN_MODE_REPORT_PROPERTIES1_RESERVED_SHIFT_V3 = 0x04;
	public static final byte THERMOSTAT_FAN_MODE_REPORT_PROPERTIES1_OFF_BIT_MASK_V3 = (byte) 0x80;
	/* Values used for Thermostat Fan Mode Set command */
	public static final byte THERMOSTAT_FAN_MODE_SET_PROPERTIES1_FAN_MODE_MASK_V3 = 0x0F;
	public static final byte THERMOSTAT_FAN_MODE_SET_FAN_MODE_AUTO_LOW_V3 = 0x00;
	public static final byte THERMOSTAT_FAN_MODE_SET_FAN_MODE_LOW_V3 = 0x01;
	public static final byte THERMOSTAT_FAN_MODE_SET_FAN_MODE_AUTO_HIGH_V3 = 0x02;
	public static final byte THERMOSTAT_FAN_MODE_SET_FAN_MODE_HIGH_V3 = 0x03;
	public static final byte THERMOSTAT_FAN_MODE_SET_FAN_MODE_AUTO_MEDIUM_V3 = 0x04;
	public static final byte THERMOSTAT_FAN_MODE_SET_FAN_MODE_MEDIUM_V3 = 0x05;
	public static final byte THERMOSTAT_FAN_MODE_SET_FAN_MODE_CIRCULATION_V3 = 0x06;
	public static final byte THERMOSTAT_FAN_MODE_SET_FAN_MODE_HUMIDITY_V3 = 0x07;
	public static final byte THERMOSTAT_FAN_MODE_SET_PROPERTIES1_RESERVED_MASK_V3 = 0x70;
	public static final byte THERMOSTAT_FAN_MODE_SET_PROPERTIES1_RESERVED_SHIFT_V3 = 0x04;
	public static final byte THERMOSTAT_FAN_MODE_SET_PROPERTIES1_OFF_BIT_MASK_V3 = (byte) 0x80;

	/* Thermostat Fan Mode command class commands */
	public static final byte THERMOSTAT_FAN_MODE_VERSION_V4 = 0x04;
	public static final byte THERMOSTAT_FAN_MODE_GET_V4 = 0x02;
	public static final byte THERMOSTAT_FAN_MODE_REPORT_V4 = 0x03;
	public static final byte THERMOSTAT_FAN_MODE_SET_V4 = 0x01;
	public static final byte THERMOSTAT_FAN_MODE_SUPPORTED_GET_V4 = 0x04;
	public static final byte THERMOSTAT_FAN_MODE_SUPPORTED_REPORT_V4 = 0x05;
	/* Values used for Thermostat Fan Mode Report command */
	public static final byte THERMOSTAT_FAN_MODE_REPORT_PROPERTIES1_FAN_MODE_MASK_V4 = 0x0F;
	public static final byte THERMOSTAT_FAN_MODE_REPORT_FAN_MODE_AUTO_LOW_V4 = 0x00;
	public static final byte THERMOSTAT_FAN_MODE_REPORT_FAN_MODE_LOW_V4 = 0x01;
	public static final byte THERMOSTAT_FAN_MODE_REPORT_FAN_MODE_AUTO_HIGH_V4 = 0x02;
	public static final byte THERMOSTAT_FAN_MODE_REPORT_FAN_MODE_HIGH_V4 = 0x03;
	public static final byte THERMOSTAT_FAN_MODE_REPORT_FAN_MODE_AUTO_MEDIUM_V4 = 0x04;
	public static final byte THERMOSTAT_FAN_MODE_REPORT_FAN_MODE_MEDIUM_V4 = 0x05;
	public static final byte THERMOSTAT_FAN_MODE_REPORT_FAN_MODE_CIRCULATION_V4 = 0x06;
	public static final byte THERMOSTAT_FAN_MODE_REPORT_FAN_MODE_HUMIDITY_V4 = 0x07;
	public static final byte THERMOSTAT_FAN_MODE_REPORT_FAN_MODE_LEFT_RIGHT_V4 = 0x08;
	public static final byte THERMOSTAT_FAN_MODE_REPORT_FAN_MODE_UP_DOWN_V4 = 0x09;
	public static final byte THERMOSTAT_FAN_MODE_REPORT_FAN_MODE_QUIET_V4 = 0x0A;
	public static final byte THERMOSTAT_FAN_MODE_REPORT_FAN_MODE_RESERVEDB_V4 = 0x0B;
	public static final byte THERMOSTAT_FAN_MODE_REPORT_FAN_MODE_RESERVEDC_V4 = 0x0C;
	public static final byte THERMOSTAT_FAN_MODE_REPORT_FAN_MODE_RESERVEDD_V4 = 0x0D;
	public static final byte THERMOSTAT_FAN_MODE_REPORT_FAN_MODE_RESERVEDE_V4 = 0x0E;
	public static final byte THERMOSTAT_FAN_MODE_REPORT_FAN_MODE_RESERVEDF_V4 = 0x0F;
	public static final byte THERMOSTAT_FAN_MODE_REPORT_PROPERTIES1_RESERVED_MASK_V4 = 0x70;
	public static final byte THERMOSTAT_FAN_MODE_REPORT_PROPERTIES1_RESERVED_SHIFT_V4 = 0x04;
	public static final byte THERMOSTAT_FAN_MODE_REPORT_PROPERTIES1_OFF_BIT_MASK_V4 = (byte) 0x80;
	/* Values used for Thermostat Fan Mode Set command */
	public static final byte THERMOSTAT_FAN_MODE_SET_PROPERTIES1_FAN_MODE_MASK_V4 = 0x0F;
	public static final byte THERMOSTAT_FAN_MODE_SET_FAN_MODE_AUTO_LOW_V4 = 0x00;
	public static final byte THERMOSTAT_FAN_MODE_SET_FAN_MODE_LOW_V4 = 0x01;
	public static final byte THERMOSTAT_FAN_MODE_SET_FAN_MODE_AUTO_HIGH_V4 = 0x02;
	public static final byte THERMOSTAT_FAN_MODE_SET_FAN_MODE_HIGH_V4 = 0x03;
	public static final byte THERMOSTAT_FAN_MODE_SET_FAN_MODE_AUTO_MEDIUM_V4 = 0x04;
	public static final byte THERMOSTAT_FAN_MODE_SET_FAN_MODE_MEDIUM_V4 = 0x05;
	public static final byte THERMOSTAT_FAN_MODE_SET_FAN_MODE_CIRCULATION_V4 = 0x06;
	public static final byte THERMOSTAT_FAN_MODE_SET_FAN_MODE_HUMIDITY_V4 = 0x07;
	public static final byte THERMOSTAT_FAN_MODE_SET_FAN_MODE_LEFT_RIGHT_V4 = 0x08;
	public static final byte THERMOSTAT_FAN_MODE_SET_FAN_MODE_UP_DOWN_V4 = 0x09;
	public static final byte THERMOSTAT_FAN_MODE_SET_FAN_MODE_QUIET_V4 = 0x0A;
	public static final byte THERMOSTAT_FAN_MODE_SET_FAN_MODE_RESERVEDB_V4 = 0x0B;
	public static final byte THERMOSTAT_FAN_MODE_SET_FAN_MODE_RESERVEDC_V4 = 0x0C;
	public static final byte THERMOSTAT_FAN_MODE_SET_FAN_MODE_RESERVEDD_V4 = 0x0D;
	public static final byte THERMOSTAT_FAN_MODE_SET_FAN_MODE_RESERVEDE_V4 = 0x0E;
	public static final byte THERMOSTAT_FAN_MODE_SET_FAN_MODE_RESERVEDF_V4 = 0x0F;
	public static final byte THERMOSTAT_FAN_MODE_SET_PROPERTIES1_RESERVED_MASK_V4 = 0x70;
	public static final byte THERMOSTAT_FAN_MODE_SET_PROPERTIES1_RESERVED_SHIFT_V4 = 0x04;
	public static final byte THERMOSTAT_FAN_MODE_SET_PROPERTIES1_OFF_BIT_MASK_V4 = (byte) 0x80;

	/* Thermostat Fan State command class commands */
	public static final byte THERMOSTAT_FAN_STATE_VERSION = 0x01;
	public static final byte THERMOSTAT_FAN_STATE_GET = 0x02;
	public static final byte THERMOSTAT_FAN_STATE_REPORT = 0x03;
	/* Values used for Thermostat Fan State Report command */
	public static final byte THERMOSTAT_FAN_STATE_REPORT_LEVEL_FAN_OPERATING_STATE_MASK = 0x0F;
	public static final byte THERMOSTAT_FAN_STATE_REPORT_FAN_OPERATING_STATE_IDLE = 0x00;
	public static final byte THERMOSTAT_FAN_STATE_REPORT_FAN_OPERATING_STATE_RUNNING = 0x01;
	public static final byte THERMOSTAT_FAN_STATE_REPORT_LEVEL_RESERVED_MASK = (byte) 0xF0;
	public static final byte THERMOSTAT_FAN_STATE_REPORT_LEVEL_RESERVED_SHIFT = 0x04;

	/* Thermostat Fan State command class commands */
	public static final byte THERMOSTAT_FAN_STATE_VERSION_V2 = 0x02;
	public static final byte THERMOSTAT_FAN_STATE_GET_V2 = 0x02;
	public static final byte THERMOSTAT_FAN_STATE_REPORT_V2 = 0x03;
	/* Values used for Thermostat Fan State Report command */
	public static final byte THERMOSTAT_FAN_STATE_REPORT_LEVEL_FAN_OPERATING_STATE_MASK_V2 = 0x0F;
	public static final byte THERMOSTAT_FAN_STATE_REPORT_FAN_OPERATING_STATE_IDLE_V2 = 0x00;
	public static final byte THERMOSTAT_FAN_STATE_REPORT_FAN_OPERATING_STATE_RUNNING_V2 = 0x01;
	public static final byte THERMOSTAT_FAN_STATE_REPORT_FAN_OPERATING_STATE_RUNNING_HIGH_V2 = 0x02;
	public static final byte THERMOSTAT_FAN_STATE_REPORT_FAN_OPERATING_STATE_RUNNING_MEDIUM_V2 = 0x03;
	public static final byte THERMOSTAT_FAN_STATE_REPORT_FAN_OPERATING_STATE_CIRCULATION_V2 = 0x04;
	public static final byte THERMOSTAT_FAN_STATE_REPORT_FAN_OPERATING_STATE_HUMIDITY_CIRCULATION_V2 = 0x05;
	public static final byte THERMOSTAT_FAN_STATE_REPORT_FAN_OPERATING_STATE_RIGHT_LEFT_CIRCULATION_V2 = 0x06;
	public static final byte THERMOSTAT_FAN_STATE_REPORT_FAN_OPERATING_STATE_UP_DOWN_CIRCULATION_V2 = 0x07;
	public static final byte THERMOSTAT_FAN_STATE_REPORT_FAN_OPERATING_STATE_QUIET_CIRCULATION_V2 = 0x08;
	public static final byte THERMOSTAT_FAN_STATE_REPORT_LEVEL_RESERVED_MASK_V2 = (byte) 0xF0;
	public static final byte THERMOSTAT_FAN_STATE_REPORT_LEVEL_RESERVED_SHIFT_V2 = 0x04;

	/* Thermostat Heating command class commands */
	public static final byte THERMOSTAT_HEATING_VERSION = 0x01;
	public static final byte THERMOSTAT_HEATING_STATUS_REPORT = 0x0D;
	public static final byte THERMOSTAT_HEATING_MODE_GET = 0x02;
	public static final byte THERMOSTAT_HEATING_MODE_REPORT = 0x03;
	public static final byte THERMOSTAT_HEATING_MODE_SET = 0x01;
	public static final byte THERMOSTAT_HEATING_RELAY_STATUS_GET = 0x09;
	public static final byte THERMOSTAT_HEATING_RELAY_STATUS_REPORT = 0x0A;
	public static final byte THERMOSTAT_HEATING_SETPOINT_GET = 0x05;
	public static final byte THERMOSTAT_HEATING_SETPOINT_REPORT = 0x06;
	public static final byte THERMOSTAT_HEATING_SETPOINT_SET = 0x04;
	public static final byte THERMOSTAT_HEATING_STATUS_GET = 0x0C;
	public static final byte THERMOSTAT_HEATING_STATUS_SET = 0x0B;
	public static final byte THERMOSTAT_HEATING_TIMED_OFF_SET = 0x11;
	/* Values used for Thermostat Heating Status Report command */
	public static final byte THERMOSTAT_HEATING_STATUS_REPORT_HEATING = 0x00;
	public static final byte THERMOSTAT_HEATING_STATUS_REPORT_COOLING = 0x01;
	/* Values used for Thermostat Heating Mode Report command */
	public static final byte THERMOSTAT_HEATING_MODE_REPORT_OFF = 0x00;
	public static final byte THERMOSTAT_HEATING_MODE_REPORT_OFF_TIMED = 0x01;
	public static final byte THERMOSTAT_HEATING_MODE_REPORT_OFF_3_HOURS = 0x02;
	public static final byte THERMOSTAT_HEATING_MODE_REPORT_ANTI_FREEZE = 0x03;
	public static final byte THERMOSTAT_HEATING_MODE_REPORT_MANUAL = 0x04;
	public static final byte THERMOSTAT_HEATING_MODE_REPORT_TEMPORARY_MANUAL = 0x05;
	public static final byte THERMOSTAT_HEATING_MODE_REPORT_AUTOMATIC = 0x06;
	public static final byte THERMOSTAT_HEATING_MODE_REPORT_MANUAL_TIMED = 0x07;
	/* Values used for Thermostat Heating Mode Set command */
	public static final byte THERMOSTAT_HEATING_MODE_SET_OFF = 0x00;
	public static final byte THERMOSTAT_HEATING_MODE_SET_OFF_TIMED = 0x01;
	public static final byte THERMOSTAT_HEATING_MODE_SET_OFF_3_HOURS = 0x02;
	public static final byte THERMOSTAT_HEATING_MODE_SET_ANTI_FREEZE = 0x03;
	public static final byte THERMOSTAT_HEATING_MODE_SET_MANUAL = 0x04;
	public static final byte THERMOSTAT_HEATING_MODE_SET_TEMPORARY_MANUAL = 0x05;
	public static final byte THERMOSTAT_HEATING_MODE_SET_AUTOMATIC = 0x06;
	public static final byte THERMOSTAT_HEATING_MODE_SET_MANUAL_TIMED = 0x07;
	/* Values used for Thermostat Heating Relay Status Report command */
	public static final byte THERMOSTAT_HEATING_RELAY_STATUS_REPORT_OFF = 0x00;
	public static final byte THERMOSTAT_HEATING_RELAY_STATUS_REPORT_ON = 0x01;
	/* Values used for Thermostat Heating Setpobyte Report command */
	public static final byte THERMOSTAT_HEATING_SETPOINT_REPORT_PROPERTIES1_SIZE_MASK = 0x07;
	public static final byte THERMOSTAT_HEATING_SETPOINT_REPORT_PROPERTIES1_SCALE_MASK = 0x18;
	public static final byte THERMOSTAT_HEATING_SETPOINT_REPORT_PROPERTIES1_SCALE_SHIFT = 0x03;
	public static final byte THERMOSTAT_HEATING_SETPOINT_REPORT_PROPERTIES1_PRECISION_MASK = (byte) 0xE0;
	public static final byte THERMOSTAT_HEATING_SETPOINT_REPORT_PROPERTIES1_PRECISION_SHIFT = 0x05;
	/* Values used for Thermostat Heating Setpobyte Set command */
	public static final byte THERMOSTAT_HEATING_SETPOINT_SET_PROPERTIES1_SIZE_MASK = 0x07;
	public static final byte THERMOSTAT_HEATING_SETPOINT_SET_PROPERTIES1_SCALE_MASK = 0x18;
	public static final byte THERMOSTAT_HEATING_SETPOINT_SET_PROPERTIES1_SCALE_SHIFT = 0x03;
	public static final byte THERMOSTAT_HEATING_SETPOINT_SET_PROPERTIES1_PRECISION_MASK = (byte) 0xE0;
	public static final byte THERMOSTAT_HEATING_SETPOINT_SET_PROPERTIES1_PRECISION_SHIFT = 0x05;
	/* Values used for Thermostat Heating Status Set command */
	public static final byte THERMOSTAT_HEATING_STATUS_SET_HEATING = 0x00;
	public static final byte THERMOSTAT_HEATING_STATUS_SET_COOLING = 0x01;

	/* Thermostat Mode command class commands */
	public static final byte THERMOSTAT_MODE_VERSION = 0x01;
	public static final byte THERMOSTAT_MODE_GET = 0x02;
	public static final byte THERMOSTAT_MODE_REPORT = 0x03;
	public static final byte THERMOSTAT_MODE_SET = 0x01;
	public static final byte THERMOSTAT_MODE_SUPPORTED_GET = 0x04;
	public static final byte THERMOSTAT_MODE_SUPPORTED_REPORT = 0x05;
	/* Values used for Thermostat Mode Report command */
	public static final byte THERMOSTAT_MODE_REPORT_LEVEL_MODE_MASK = 0x1F;
	public static final byte THERMOSTAT_MODE_REPORT_MODE_OFF = 0x00;
	public static final byte THERMOSTAT_MODE_REPORT_MODE_HEAT = 0x01;
	public static final byte THERMOSTAT_MODE_REPORT_MODE_COOL = 0x02;
	public static final byte THERMOSTAT_MODE_REPORT_MODE_AUTO = 0x03;
	public static final byte THERMOSTAT_MODE_REPORT_MODE_AUXILIARY_HEAT = 0x04;
	public static final byte THERMOSTAT_MODE_REPORT_MODE_RESUME = 0x05;
	public static final byte THERMOSTAT_MODE_REPORT_MODE_FAN_ONLY = 0x06;
	public static final byte THERMOSTAT_MODE_REPORT_MODE_FURNACE = 0x07;
	public static final byte THERMOSTAT_MODE_REPORT_MODE_DRY_AIR = 0x08;
	public static final byte THERMOSTAT_MODE_REPORT_MODE_MOIST_AIR = 0x09;
	public static final byte THERMOSTAT_MODE_REPORT_MODE_AUTO_CHANGEOVER = 0x0A;
	public static final byte THERMOSTAT_MODE_REPORT_LEVEL_RESERVED_MASK = (byte) 0xE0;
	public static final byte THERMOSTAT_MODE_REPORT_LEVEL_RESERVED_SHIFT = 0x05;
	/* Values used for Thermostat Mode Set command */
	public static final byte THERMOSTAT_MODE_SET_LEVEL_MODE_MASK = 0x1F;
	public static final byte THERMOSTAT_MODE_SET_MODE_OFF = 0x00;
	public static final byte THERMOSTAT_MODE_SET_MODE_HEAT = 0x01;
	public static final byte THERMOSTAT_MODE_SET_MODE_COOL = 0x02;
	public static final byte THERMOSTAT_MODE_SET_MODE_AUTO = 0x03;
	public static final byte THERMOSTAT_MODE_SET_MODE_AUXILIARY_HEAT = 0x04;
	public static final byte THERMOSTAT_MODE_SET_MODE_RESUME = 0x05;
	public static final byte THERMOSTAT_MODE_SET_MODE_FAN_ONLY = 0x06;
	public static final byte THERMOSTAT_MODE_SET_MODE_FURNACE = 0x07;
	public static final byte THERMOSTAT_MODE_SET_MODE_DRY_AIR = 0x08;
	public static final byte THERMOSTAT_MODE_SET_MODE_MOIST_AIR = 0x09;
	public static final byte THERMOSTAT_MODE_SET_MODE_AUTO_CHANGEOVER = 0x0A;
	public static final byte THERMOSTAT_MODE_SET_LEVEL_RESERVED_MASK = (byte) 0xE0;
	public static final byte THERMOSTAT_MODE_SET_LEVEL_RESERVED_SHIFT = 0x05;

	/* Thermostat Mode command class commands */
	public static final byte THERMOSTAT_MODE_VERSION_V2 = 0x02;
	public static final byte THERMOSTAT_MODE_GET_V2 = 0x02;
	public static final byte THERMOSTAT_MODE_REPORT_V2 = 0x03;
	public static final byte THERMOSTAT_MODE_SET_V2 = 0x01;
	public static final byte THERMOSTAT_MODE_SUPPORTED_GET_V2 = 0x04;
	public static final byte THERMOSTAT_MODE_SUPPORTED_REPORT_V2 = 0x05;
	/* Values used for Thermostat Mode Report command */
	public static final byte THERMOSTAT_MODE_REPORT_LEVEL_MODE_MASK_V2 = 0x1F;
	public static final byte THERMOSTAT_MODE_REPORT_MODE_OFF_V2 = 0x00;
	public static final byte THERMOSTAT_MODE_REPORT_MODE_HEAT_V2 = 0x01;
	public static final byte THERMOSTAT_MODE_REPORT_MODE_COOL_V2 = 0x02;
	public static final byte THERMOSTAT_MODE_REPORT_MODE_AUTO_V2 = 0x03;
	public static final byte THERMOSTAT_MODE_REPORT_MODE_AUXILIARY_HEAT_V2 = 0x04;
	public static final byte THERMOSTAT_MODE_REPORT_MODE_RESUME_V2 = 0x05;
	public static final byte THERMOSTAT_MODE_REPORT_MODE_FAN_ONLY_V2 = 0x06;
	public static final byte THERMOSTAT_MODE_REPORT_MODE_FURNACE_V2 = 0x07;
	public static final byte THERMOSTAT_MODE_REPORT_MODE_DRY_AIR_V2 = 0x08;
	public static final byte THERMOSTAT_MODE_REPORT_MODE_MOIST_AIR_V2 = 0x09;
	public static final byte THERMOSTAT_MODE_REPORT_MODE_AUTO_CHANGEOVER_V2 = 0x0A;
	public static final byte THERMOSTAT_MODE_REPORT_MODE_ENERGY_SAVE_HEAT_V2 = 0x0B;
	public static final byte THERMOSTAT_MODE_REPORT_MODE_ENERGY_SAVE_COOL_V2 = 0x0C;
	public static final byte THERMOSTAT_MODE_REPORT_MODE_AWAY_V2 = 0x0D;
	public static final byte THERMOSTAT_MODE_REPORT_LEVEL_RESERVED_MASK_V2 = (byte) 0xE0;
	public static final byte THERMOSTAT_MODE_REPORT_LEVEL_RESERVED_SHIFT_V2 = 0x05;
	/* Values used for Thermostat Mode Set command */
	public static final byte THERMOSTAT_MODE_SET_LEVEL_MODE_MASK_V2 = 0x1F;
	public static final byte THERMOSTAT_MODE_SET_MODE_OFF_V2 = 0x00;
	public static final byte THERMOSTAT_MODE_SET_MODE_HEAT_V2 = 0x01;
	public static final byte THERMOSTAT_MODE_SET_MODE_COOL_V2 = 0x02;
	public static final byte THERMOSTAT_MODE_SET_MODE_AUTO_V2 = 0x03;
	public static final byte THERMOSTAT_MODE_SET_MODE_AUXILIARY_HEAT_V2 = 0x04;
	public static final byte THERMOSTAT_MODE_SET_MODE_RESUME_V2 = 0x05;
	public static final byte THERMOSTAT_MODE_SET_MODE_FAN_ONLY_V2 = 0x06;
	public static final byte THERMOSTAT_MODE_SET_MODE_FURNACE_V2 = 0x07;
	public static final byte THERMOSTAT_MODE_SET_MODE_DRY_AIR_V2 = 0x08;
	public static final byte THERMOSTAT_MODE_SET_MODE_MOIST_AIR_V2 = 0x09;
	public static final byte THERMOSTAT_MODE_SET_MODE_AUTO_CHANGEOVER_V2 = 0x0A;
	public static final byte THERMOSTAT_MODE_SET_MODE_ENERGY_SAVE_HEAT_V2 = 0x0B;
	public static final byte THERMOSTAT_MODE_SET_MODE_ENERGY_SAVE_COOL_V2 = 0x0C;
	public static final byte THERMOSTAT_MODE_SET_MODE_AWAY_V2 = 0x0D;
	public static final byte THERMOSTAT_MODE_SET_LEVEL_RESERVED_MASK_V2 = (byte) 0xE0;
	public static final byte THERMOSTAT_MODE_SET_LEVEL_RESERVED_SHIFT_V2 = 0x05;

	/* Thermostat Mode command class commands */
	public static final byte THERMOSTAT_MODE_VERSION_V3 = 0x03;
	public static final byte THERMOSTAT_MODE_GET_V3 = 0x02;
	public static final byte THERMOSTAT_MODE_REPORT_V3 = 0x03;
	public static final byte THERMOSTAT_MODE_SET_V3 = 0x01;
	public static final byte THERMOSTAT_MODE_SUPPORTED_GET_V3 = 0x04;
	public static final byte THERMOSTAT_MODE_SUPPORTED_REPORT_V3 = 0x05;
	/* Values used for Thermostat Mode Report command */
	public static final byte THERMOSTAT_MODE_REPORT_LEVEL_MODE_MASK_V3 = 0x1F;
	public static final byte THERMOSTAT_MODE_REPORT_MODE_OFF_V3 = 0x00;
	public static final byte THERMOSTAT_MODE_REPORT_MODE_HEAT_V3 = 0x01;
	public static final byte THERMOSTAT_MODE_REPORT_MODE_COOL_V3 = 0x02;
	public static final byte THERMOSTAT_MODE_REPORT_MODE_AUTO_V3 = 0x03;
	public static final byte THERMOSTAT_MODE_REPORT_MODE_AUXILIARY_HEAT_V3 = 0x04;
	public static final byte THERMOSTAT_MODE_REPORT_MODE_RESUME_V3 = 0x05;
	public static final byte THERMOSTAT_MODE_REPORT_MODE_FAN_ONLY_V3 = 0x06;
	public static final byte THERMOSTAT_MODE_REPORT_MODE_FURNACE_V3 = 0x07;
	public static final byte THERMOSTAT_MODE_REPORT_MODE_DRY_AIR_V3 = 0x08;
	public static final byte THERMOSTAT_MODE_REPORT_MODE_MOIST_AIR_V3 = 0x09;
	public static final byte THERMOSTAT_MODE_REPORT_MODE_AUTO_CHANGEOVER_V3 = 0x0A;
	public static final byte THERMOSTAT_MODE_REPORT_MODE_ENERGY_SAVE_HEAT_V3 = 0x0B;
	public static final byte THERMOSTAT_MODE_REPORT_MODE_ENERGY_SAVE_COOL_V3 = 0x0C;
	public static final byte THERMOSTAT_MODE_REPORT_MODE_AWAY_V3 = 0x0D;
	public static final byte THERMOSTAT_MODE_REPORT_MODE_RESERVED_V3 = 0x0E;
	public static final byte THERMOSTAT_MODE_REPORT_MODE_FULL_POWER_V3 = 0x0F;
	public static final byte THERMOSTAT_MODE_REPORT_MODE_RESERVED0_V3 = 0x10;
	public static final byte THERMOSTAT_MODE_REPORT_MODE_RESERVED1_V3 = 0x11;
	public static final byte THERMOSTAT_MODE_REPORT_MODE_RESERVED2_V3 = 0x12;
	public static final byte THERMOSTAT_MODE_REPORT_MODE_RESERVED3_V3 = 0x13;
	public static final byte THERMOSTAT_MODE_REPORT_MODE_RESERVED4_V3 = 0x14;
	public static final byte THERMOSTAT_MODE_REPORT_MODE_RESERVED5_V3 = 0x15;
	public static final byte THERMOSTAT_MODE_REPORT_MODE_RESERVED6_V3 = 0x16;
	public static final byte THERMOSTAT_MODE_REPORT_MODE_RESERVED7_V3 = 0x17;
	public static final byte THERMOSTAT_MODE_REPORT_MODE_RESERVED8_V3 = 0x18;
	public static final byte THERMOSTAT_MODE_REPORT_MODE_RESERVED9_V3 = 0x19;
	public static final byte THERMOSTAT_MODE_REPORT_MODE_RESERVEDA_V3 = 0x1A;
	public static final byte THERMOSTAT_MODE_REPORT_MODE_RESERVEDB_V3 = 0x1B;
	public static final byte THERMOSTAT_MODE_REPORT_MODE_RESERVEDC_V3 = 0x1C;
	public static final byte THERMOSTAT_MODE_REPORT_MODE_RESERVEDD_V3 = 0x1D;
	public static final byte THERMOSTAT_MODE_REPORT_MODE_RESERVEDE_V3 = 0x1E;
	public static final byte THERMOSTAT_MODE_REPORT_MODE_MANUFACTURER_SPECIFC_V3 = 0x1F;
	public static final byte THERMOSTAT_MODE_REPORT_LEVEL_NO_OF_MANUFACTURER_DATA_FIELDS_MASK_V3 = (byte) 0xE0;
	public static final byte THERMOSTAT_MODE_REPORT_LEVEL_NO_OF_MANUFACTURER_DATA_FIELDS_SHIFT_V3 = 0x05;
	/* Values used for Thermostat Mode Set command */
	public static final byte THERMOSTAT_MODE_SET_LEVEL_MODE_MASK_V3 = 0x1F;
	public static final byte THERMOSTAT_MODE_SET_MODE_OFF_V3 = 0x00;
	public static final byte THERMOSTAT_MODE_SET_MODE_HEAT_V3 = 0x01;
	public static final byte THERMOSTAT_MODE_SET_MODE_COOL_V3 = 0x02;
	public static final byte THERMOSTAT_MODE_SET_MODE_AUTO_V3 = 0x03;
	public static final byte THERMOSTAT_MODE_SET_MODE_AUXILIARY_HEAT_V3 = 0x04;
	public static final byte THERMOSTAT_MODE_SET_MODE_RESUME_V3 = 0x05;
	public static final byte THERMOSTAT_MODE_SET_MODE_FAN_ONLY_V3 = 0x06;
	public static final byte THERMOSTAT_MODE_SET_MODE_FURNACE_V3 = 0x07;
	public static final byte THERMOSTAT_MODE_SET_MODE_DRY_AIR_V3 = 0x08;
	public static final byte THERMOSTAT_MODE_SET_MODE_MOIST_AIR_V3 = 0x09;
	public static final byte THERMOSTAT_MODE_SET_MODE_AUTO_CHANGEOVER_V3 = 0x0A;
	public static final byte THERMOSTAT_MODE_SET_MODE_ENERGY_SAVE_HEAT_V3 = 0x0B;
	public static final byte THERMOSTAT_MODE_SET_MODE_ENERGY_SAVE_COOL_V3 = 0x0C;
	public static final byte THERMOSTAT_MODE_SET_MODE_AWAY_V3 = 0x0D;
	public static final byte THERMOSTAT_MODE_SET_MODE_RESERVED_V3 = 0x0E;
	public static final byte THERMOSTAT_MODE_SET_MODE_FULL_POWER_V3 = 0x0F;
	public static final byte THERMOSTAT_MODE_SET_MODE_RESERVED0_V3 = 0x10;
	public static final byte THERMOSTAT_MODE_SET_MODE_RESERVED1_V3 = 0x11;
	public static final byte THERMOSTAT_MODE_SET_MODE_RESERVED2_V3 = 0x12;
	public static final byte THERMOSTAT_MODE_SET_MODE_RESERVED3_V3 = 0x13;
	public static final byte THERMOSTAT_MODE_SET_MODE_RESERVED4_V3 = 0x14;
	public static final byte THERMOSTAT_MODE_SET_MODE_RESERVED5_V3 = 0x15;
	public static final byte THERMOSTAT_MODE_SET_MODE_RESERVED6_V3 = 0x16;
	public static final byte THERMOSTAT_MODE_SET_MODE_RESERVED7_V3 = 0x17;
	public static final byte THERMOSTAT_MODE_SET_MODE_RESERVED8_V3 = 0x18;
	public static final byte THERMOSTAT_MODE_SET_MODE_RESERVED9_V3 = 0x19;
	public static final byte THERMOSTAT_MODE_SET_MODE_RESERVEDA_V3 = 0x1A;
	public static final byte THERMOSTAT_MODE_SET_MODE_RESERVEDB_V3 = 0x1B;
	public static final byte THERMOSTAT_MODE_SET_MODE_RESERVEDC_V3 = 0x1C;
	public static final byte THERMOSTAT_MODE_SET_MODE_RESERVEDD_V3 = 0x1D;
	public static final byte THERMOSTAT_MODE_SET_MODE_RESERVEDE_V3 = 0x1E;
	public static final byte THERMOSTAT_MODE_SET_MODE_MANUFACTURER_SPECIFC_V3 = 0x1F;
	public static final byte THERMOSTAT_MODE_SET_LEVEL_NO_OF_MANUFACTURER_DATA_FIELDS_MASK_V3 = (byte) 0xE0;
	public static final byte THERMOSTAT_MODE_SET_LEVEL_NO_OF_MANUFACTURER_DATA_FIELDS_SHIFT_V3 = 0x05;

	/* Thermostat Operating State command class commands */
	public static final byte THERMOSTAT_OPERATING_STATE_VERSION = 0x01;
	public static final byte THERMOSTAT_OPERATING_STATE_GET = 0x02;
	public static final byte THERMOSTAT_OPERATING_STATE_REPORT = 0x03;
	/* Values used for Thermostat Operating State Report command */
	public static final byte THERMOSTAT_OPERATING_STATE_REPORT_LEVEL_OPERATING_STATE_MASK = 0x0F;
	public static final byte THERMOSTAT_OPERATING_STATE_REPORT_OPERATING_STATE_IDLE = 0x00;
	public static final byte THERMOSTAT_OPERATING_STATE_REPORT_OPERATING_STATE_HEATING = 0x01;
	public static final byte THERMOSTAT_OPERATING_STATE_REPORT_OPERATING_STATE_COOLING = 0x02;
	public static final byte THERMOSTAT_OPERATING_STATE_REPORT_OPERATING_STATE_FAN_ONLY = 0x03;
	public static final byte THERMOSTAT_OPERATING_STATE_REPORT_OPERATING_STATE_PENDING_HEAT = 0x04;
	public static final byte THERMOSTAT_OPERATING_STATE_REPORT_OPERATING_STATE_PENDING_COOL = 0x05;
	public static final byte THERMOSTAT_OPERATING_STATE_REPORT_OPERATING_STATE_VENT_ECONOMIZER = 0x06;
	public static final byte THERMOSTAT_OPERATING_STATE_REPORT_LEVEL_RESERVED_MASK = (byte) 0xF0;
	public static final byte THERMOSTAT_OPERATING_STATE_REPORT_LEVEL_RESERVED_SHIFT = 0x04;

	/* Thermostat Operating State command class commands */
	public static final byte THERMOSTAT_OPERATING_STATE_VERSION_V2 = 0x02;
	public static final byte THERMOSTAT_OPERATING_STATE_GET_V2 = 0x02;
	public static final byte THERMOSTAT_OPERATING_STATE_REPORT_V2 = 0x03;
	public static final byte THERMOSTAT_OPERATING_STATE_LOGGING_SUPPORTED_GET_V2 = 0x01;
	public static final byte THERMOSTAT_OPERATING_LOGGING_SUPPORTED_REPORT_V2 = 0x04;
	public static final byte THERMOSTAT_OPERATING_STATE_LOGGING_GET_V2 = 0x05;
	public static final byte THERMOSTAT_OPERATING_STATE_LOGGING_REPORT_V2 = 0x06;
	/* Values used for Thermostat Operating State Report command */
	public static final byte THERMOSTAT_OPERATING_STATE_REPORT_PROPERTIES1_OPERATING_STATE_MASK_V2 = 0x0F;
	public static final byte THERMOSTAT_OPERATING_STATE_REPORT_OPERATING_STATE_IDLE_V2 = 0x00;
	public static final byte THERMOSTAT_OPERATING_STATE_REPORT_OPERATING_STATE_HEATING_V2 = 0x01;
	public static final byte THERMOSTAT_OPERATING_STATE_REPORT_OPERATING_STATE_COOLING_V2 = 0x02;
	public static final byte THERMOSTAT_OPERATING_STATE_REPORT_OPERATING_STATE_FAN_ONLY_V2 = 0x03;
	public static final byte THERMOSTAT_OPERATING_STATE_REPORT_OPERATING_STATE_PENDING_HEAT_V2 = 0x04;
	public static final byte THERMOSTAT_OPERATING_STATE_REPORT_OPERATING_STATE_PENDING_COOL_V2 = 0x05;
	public static final byte THERMOSTAT_OPERATING_STATE_REPORT_OPERATING_STATE_VENT_ECONOMIZER_V2 = 0x06;
	public static final byte THERMOSTAT_OPERATING_STATE_REPORT_OPERATING_STATE_AUX_HEATING_V2 = 0x07;
	public static final byte THERMOSTAT_OPERATING_STATE_REPORT_OPERATING_STATE_2ND_STAGE_HEATING_V2 = 0x08;
	public static final byte THERMOSTAT_OPERATING_STATE_REPORT_OPERATING_STATE_2ND_STAGE_COOLING_V2 = 0x09;
	public static final byte THERMOSTAT_OPERATING_STATE_REPORT_PROPERTIES1_RESERVED_MASK_V2 = (byte) 0xF0;
	public static final byte THERMOSTAT_OPERATING_STATE_REPORT_PROPERTIES1_RESERVED_SHIFT_V2 = 0x04;

	/* Thermostat Setback command class commands */
	public static final byte THERMOSTAT_SETBACK_VERSION = 0x01;
	public static final byte THERMOSTAT_SETBACK_GET = 0x02;
	public static final byte THERMOSTAT_SETBACK_REPORT = 0x03;
	public static final byte THERMOSTAT_SETBACK_SET = 0x01;
	/* Values used for Thermostat Setback Report command */
	public static final byte THERMOSTAT_SETBACK_REPORT_PROPERTIES1_SETBACK_TYPE_MASK = 0x03;
	public static final byte THERMOSTAT_SETBACK_REPORT_SETBACK_TYPE_NO_OVERRIDE = 0x00;
	public static final byte THERMOSTAT_SETBACK_REPORT_SETBACK_TYPE_TEMPORARY_OVERRIDE = 0x01;
	public static final byte THERMOSTAT_SETBACK_REPORT_SETBACK_TYPE_PERMANENT_OVERRIDE = 0x02;
	public static final byte THERMOSTAT_SETBACK_REPORT_SETBACK_TYPE_RESERVED = 0x03;
	public static final byte THERMOSTAT_SETBACK_REPORT_PROPERTIES1_RESERVED_MASK = (byte) 0xFC;
	public static final byte THERMOSTAT_SETBACK_REPORT_PROPERTIES1_RESERVED_SHIFT = 0x02;
	/* Values used for Thermostat Setback Set command */
	public static final byte THERMOSTAT_SETBACK_SET_PROPERTIES1_SETBACK_TYPE_MASK = 0x03;
	public static final byte THERMOSTAT_SETBACK_SET_SETBACK_TYPE_NO_OVERRIDE = 0x00;
	public static final byte THERMOSTAT_SETBACK_SET_SETBACK_TYPE_TEMPORARY_OVERRIDE = 0x01;
	public static final byte THERMOSTAT_SETBACK_SET_SETBACK_TYPE_PERMANENT_OVERRIDE = 0x02;
	public static final byte THERMOSTAT_SETBACK_SET_SETBACK_TYPE_RESERVED = 0x03;
	public static final byte THERMOSTAT_SETBACK_SET_PROPERTIES1_RESERVED_MASK = (byte) 0xFC;
	public static final byte THERMOSTAT_SETBACK_SET_PROPERTIES1_RESERVED_SHIFT = 0x02;

	/* Thermostat Setpobyte command class commands */
	public static final byte THERMOSTAT_SETPOINT_VERSION = 0x01;
	public static final byte THERMOSTAT_SETPOINT_GET = 0x02;
	public static final byte THERMOSTAT_SETPOINT_REPORT = 0x03;
	public static final byte THERMOSTAT_SETPOINT_SET = 0x01;
	public static final byte THERMOSTAT_SETPOINT_SUPPORTED_GET = 0x04;
	public static final byte THERMOSTAT_SETPOINT_SUPPORTED_REPORT = 0x05;
	/* Values used for Thermostat Setpobyte Get command */
	public static final byte THERMOSTAT_SETPOINT_GET_LEVEL_SETPOINT_TYPE_MASK = 0x0F;
	public static final byte THERMOSTAT_SETPOINT_GET_SETPOINT_TYPE_NOT_SUPPORTED = 0x00;
	public static final byte THERMOSTAT_SETPOINT_GET_SETPOINT_TYPE_HEATING_1 = 0x01;
	public static final byte THERMOSTAT_SETPOINT_GET_SETPOINT_TYPE_COOLING_1 = 0x02;
	public static final byte THERMOSTAT_SETPOINT_GET_SETPOINT_TYPE_NOT_SUPPORTED1 = 0x03;
	public static final byte THERMOSTAT_SETPOINT_GET_SETPOINT_TYPE_NOT_SUPPORTED2 = 0x04;
	public static final byte THERMOSTAT_SETPOINT_GET_SETPOINT_TYPE_NOT_SUPPORTED3 = 0x05;
	public static final byte THERMOSTAT_SETPOINT_GET_SETPOINT_TYPE_NOT_SUPPORTED4 = 0x06;
	public static final byte THERMOSTAT_SETPOINT_GET_SETPOINT_TYPE_FURNACE = 0x07;
	public static final byte THERMOSTAT_SETPOINT_GET_SETPOINT_TYPE_DRY_AIR = 0x08;
	public static final byte THERMOSTAT_SETPOINT_GET_SETPOINT_TYPE_MOIST_AIR = 0x09;
	public static final byte THERMOSTAT_SETPOINT_GET_SETPOINT_TYPE_AUTO_CHANGEOVER = 0x0A;
	public static final byte THERMOSTAT_SETPOINT_GET_LEVEL_RESERVED_MASK = (byte) 0xF0;
	public static final byte THERMOSTAT_SETPOINT_GET_LEVEL_RESERVED_SHIFT = 0x04;
	/* Values used for Thermostat Setpobyte Report command */
	public static final byte THERMOSTAT_SETPOINT_REPORT_LEVEL_SETPOINT_TYPE_MASK = 0x0F;
	public static final byte THERMOSTAT_SETPOINT_REPORT_SETPOINT_TYPE_NOT_SUPPORTED = 0x00;
	public static final byte THERMOSTAT_SETPOINT_REPORT_SETPOINT_TYPE_HEATING_1 = 0x01;
	public static final byte THERMOSTAT_SETPOINT_REPORT_SETPOINT_TYPE_COOLING_1 = 0x02;
	public static final byte THERMOSTAT_SETPOINT_REPORT_SETPOINT_TYPE_NOT_SUPPORTED1 = 0x03;
	public static final byte THERMOSTAT_SETPOINT_REPORT_SETPOINT_TYPE_NOT_SUPPORTED2 = 0x04;
	public static final byte THERMOSTAT_SETPOINT_REPORT_SETPOINT_TYPE_NOT_SUPPORTED3 = 0x05;
	public static final byte THERMOSTAT_SETPOINT_REPORT_SETPOINT_TYPE_NOT_SUPPORTED4 = 0x06;
	public static final byte THERMOSTAT_SETPOINT_REPORT_SETPOINT_TYPE_FURNACE = 0x07;
	public static final byte THERMOSTAT_SETPOINT_REPORT_SETPOINT_TYPE_DRY_AIR = 0x08;
	public static final byte THERMOSTAT_SETPOINT_REPORT_SETPOINT_TYPE_MOIST_AIR = 0x09;
	public static final byte THERMOSTAT_SETPOINT_REPORT_SETPOINT_TYPE_AUTO_CHANGEOVER = 0x0A;
	public static final byte THERMOSTAT_SETPOINT_REPORT_LEVEL_RESERVED_MASK = (byte) 0xF0;
	public static final byte THERMOSTAT_SETPOINT_REPORT_LEVEL_RESERVED_SHIFT = 0x04;
	public static final byte THERMOSTAT_SETPOINT_REPORT_LEVEL2_SIZE_MASK = 0x07;
	public static final byte THERMOSTAT_SETPOINT_REPORT_LEVEL2_SCALE_MASK = 0x18;
	public static final byte THERMOSTAT_SETPOINT_REPORT_LEVEL2_SCALE_SHIFT = 0x03;
	public static final byte THERMOSTAT_SETPOINT_REPORT_LEVEL2_PRECISION_MASK = (byte) 0xE0;
	public static final byte THERMOSTAT_SETPOINT_REPORT_LEVEL2_PRECISION_SHIFT = 0x05;
	/* Values used for Thermostat Setpobyte Set command */
	public static final byte THERMOSTAT_SETPOINT_SET_LEVEL_SETPOINT_TYPE_MASK = 0x0F;
	public static final byte THERMOSTAT_SETPOINT_SET_SETPOINT_TYPE_NOT_SUPPORTED = 0x00;
	public static final byte THERMOSTAT_SETPOINT_SET_SETPOINT_TYPE_HEATING_1 = 0x01;
	public static final byte THERMOSTAT_SETPOINT_SET_SETPOINT_TYPE_COOLING_1 = 0x02;
	public static final byte THERMOSTAT_SETPOINT_SET_SETPOINT_TYPE_NOT_SUPPORTED1 = 0x03;
	public static final byte THERMOSTAT_SETPOINT_SET_SETPOINT_TYPE_NOT_SUPPORTED2 = 0x04;
	public static final byte THERMOSTAT_SETPOINT_SET_SETPOINT_TYPE_NOT_SUPPORTED3 = 0x05;
	public static final byte THERMOSTAT_SETPOINT_SET_SETPOINT_TYPE_NOT_SUPPORTED4 = 0x06;
	public static final byte THERMOSTAT_SETPOINT_SET_SETPOINT_TYPE_FURNACE = 0x07;
	public static final byte THERMOSTAT_SETPOINT_SET_SETPOINT_TYPE_DRY_AIR = 0x08;
	public static final byte THERMOSTAT_SETPOINT_SET_SETPOINT_TYPE_MOIST_AIR = 0x09;
	public static final byte THERMOSTAT_SETPOINT_SET_SETPOINT_TYPE_AUTO_CHANGEOVER = 0x0A;
	public static final byte THERMOSTAT_SETPOINT_SET_LEVEL_RESERVED_MASK = (byte) 0xF0;
	public static final byte THERMOSTAT_SETPOINT_SET_LEVEL_RESERVED_SHIFT = 0x04;
	public static final byte THERMOSTAT_SETPOINT_SET_LEVEL2_SIZE_MASK = 0x07;
	public static final byte THERMOSTAT_SETPOINT_SET_LEVEL2_SCALE_MASK = 0x18;
	public static final byte THERMOSTAT_SETPOINT_SET_LEVEL2_SCALE_SHIFT = 0x03;
	public static final byte THERMOSTAT_SETPOINT_SET_LEVEL2_PRECISION_MASK = (byte) 0xE0;
	public static final byte THERMOSTAT_SETPOINT_SET_LEVEL2_PRECISION_SHIFT = 0x05;

	/* Thermostat Setpobyte command class commands */
	public static final byte THERMOSTAT_SETPOINT_VERSION_V2 = 0x02;
	public static final byte THERMOSTAT_SETPOINT_GET_V2 = 0x02;
	public static final byte THERMOSTAT_SETPOINT_REPORT_V2 = 0x03;
	public static final byte THERMOSTAT_SETPOINT_SET_V2 = 0x01;
	public static final byte THERMOSTAT_SETPOINT_SUPPORTED_GET_V2 = 0x04;
	public static final byte THERMOSTAT_SETPOINT_SUPPORTED_REPORT_V2 = 0x05;
	/* Values used for Thermostat Setpobyte Get command */
	public static final byte THERMOSTAT_SETPOINT_GET_LEVEL_SETPOINT_TYPE_MASK_V2 = 0x0F;
	public static final byte THERMOSTAT_SETPOINT_GET_SETPOINT_TYPE_NOT_SUPPORTED_V2 = 0x00;
	public static final byte THERMOSTAT_SETPOINT_GET_SETPOINT_TYPE_HEATING_1_V2 = 0x01;
	public static final byte THERMOSTAT_SETPOINT_GET_SETPOINT_TYPE_COOLING_1_V2 = 0x02;
	public static final byte THERMOSTAT_SETPOINT_GET_SETPOINT_TYPE_NOT_SUPPORTED1_V2 = 0x03;
	public static final byte THERMOSTAT_SETPOINT_GET_SETPOINT_TYPE_NOT_SUPPORTED2_V2 = 0x04;
	public static final byte THERMOSTAT_SETPOINT_GET_SETPOINT_TYPE_NOT_SUPPORTED3_V2 = 0x05;
	public static final byte THERMOSTAT_SETPOINT_GET_SETPOINT_TYPE_NOT_SUPPORTED4_V2 = 0x06;
	public static final byte THERMOSTAT_SETPOINT_GET_SETPOINT_TYPE_FURNACE_V2 = 0x07;
	public static final byte THERMOSTAT_SETPOINT_GET_SETPOINT_TYPE_DRY_AIR_V2 = 0x08;
	public static final byte THERMOSTAT_SETPOINT_GET_SETPOINT_TYPE_MOIST_AIR_V2 = 0x09;
	public static final byte THERMOSTAT_SETPOINT_GET_SETPOINT_TYPE_AUTO_CHANGEOVER_V2 = 0x0A;
	public static final byte THERMOSTAT_SETPOINT_GET_SETPOINT_TYPE_ENERGY_SAVE_HEATING_V2 = 0x0B;
	public static final byte THERMOSTAT_SETPOINT_GET_SETPOINT_TYPE_ENERGY_SAVE_COOLING_V2 = 0x0C;
	public static final byte THERMOSTAT_SETPOINT_GET_SETPOINT_TYPE_AWAY_HEATING_V2 = 0x0D;
	public static final byte THERMOSTAT_SETPOINT_GET_LEVEL_RESERVED_MASK_V2 = (byte) 0xF0;
	public static final byte THERMOSTAT_SETPOINT_GET_LEVEL_RESERVED_SHIFT_V2 = 0x04;
	/* Values used for Thermostat Setpobyte Report command */
	public static final byte THERMOSTAT_SETPOINT_REPORT_LEVEL_SETPOINT_TYPE_MASK_V2 = 0x0F;
	public static final byte THERMOSTAT_SETPOINT_REPORT_SETPOINT_TYPE_NOT_SUPPORTED_V2 = 0x00;
	public static final byte THERMOSTAT_SETPOINT_REPORT_SETPOINT_TYPE_HEATING_1_V2 = 0x01;
	public static final byte THERMOSTAT_SETPOINT_REPORT_SETPOINT_TYPE_COOLING_1_V2 = 0x02;
	public static final byte THERMOSTAT_SETPOINT_REPORT_SETPOINT_TYPE_NOT_SUPPORTED1_V2 = 0x03;
	public static final byte THERMOSTAT_SETPOINT_REPORT_SETPOINT_TYPE_NOT_SUPPORTED2_V2 = 0x04;
	public static final byte THERMOSTAT_SETPOINT_REPORT_SETPOINT_TYPE_NOT_SUPPORTED3_V2 = 0x05;
	public static final byte THERMOSTAT_SETPOINT_REPORT_SETPOINT_TYPE_NOT_SUPPORTED4_V2 = 0x06;
	public static final byte THERMOSTAT_SETPOINT_REPORT_SETPOINT_TYPE_FURNACE_V2 = 0x07;
	public static final byte THERMOSTAT_SETPOINT_REPORT_SETPOINT_TYPE_DRY_AIR_V2 = 0x08;
	public static final byte THERMOSTAT_SETPOINT_REPORT_SETPOINT_TYPE_MOIST_AIR_V2 = 0x09;
	public static final byte THERMOSTAT_SETPOINT_REPORT_SETPOINT_TYPE_AUTO_CHANGEOVER_V2 = 0x0A;
	public static final byte THERMOSTAT_SETPOINT_REPORT_SETPOINT_TYPE_ENERGY_SAVE_HEATING_V2 = 0x0B;
	public static final byte THERMOSTAT_SETPOINT_REPORT_SETPOINT_TYPE_ENERGY_SAVE_COOLING_V2 = 0x0C;
	public static final byte THERMOSTAT_SETPOINT_REPORT_SETPOINT_TYPE_AWAY_HEATING_V2 = 0x0D;
	public static final byte THERMOSTAT_SETPOINT_REPORT_LEVEL_RESERVED_MASK_V2 = (byte) 0xF0;
	public static final byte THERMOSTAT_SETPOINT_REPORT_LEVEL_RESERVED_SHIFT_V2 = 0x04;
	public static final byte THERMOSTAT_SETPOINT_REPORT_LEVEL2_SIZE_MASK_V2 = 0x07;
	public static final byte THERMOSTAT_SETPOINT_REPORT_LEVEL2_SCALE_MASK_V2 = 0x18;
	public static final byte THERMOSTAT_SETPOINT_REPORT_LEVEL2_SCALE_SHIFT_V2 = 0x03;
	public static final byte THERMOSTAT_SETPOINT_REPORT_LEVEL2_PRECISION_MASK_V2 = (byte) 0xE0;
	public static final byte THERMOSTAT_SETPOINT_REPORT_LEVEL2_PRECISION_SHIFT_V2 = 0x05;
	/* Values used for Thermostat Setpobyte Set command */
	public static final byte THERMOSTAT_SETPOINT_SET_LEVEL_SETPOINT_TYPE_MASK_V2 = 0x0F;
	public static final byte THERMOSTAT_SETPOINT_SET_SETPOINT_TYPE_NOT_SUPPORTED_V2 = 0x00;
	public static final byte THERMOSTAT_SETPOINT_SET_SETPOINT_TYPE_HEATING_1_V2 = 0x01;
	public static final byte THERMOSTAT_SETPOINT_SET_SETPOINT_TYPE_COOLING_1_V2 = 0x02;
	public static final byte THERMOSTAT_SETPOINT_SET_SETPOINT_TYPE_NOT_SUPPORTED1_V2 = 0x03;
	public static final byte THERMOSTAT_SETPOINT_SET_SETPOINT_TYPE_NOT_SUPPORTED2_V2 = 0x04;
	public static final byte THERMOSTAT_SETPOINT_SET_SETPOINT_TYPE_NOT_SUPPORTED3_V2 = 0x05;
	public static final byte THERMOSTAT_SETPOINT_SET_SETPOINT_TYPE_NOT_SUPPORTED4_V2 = 0x06;
	public static final byte THERMOSTAT_SETPOINT_SET_SETPOINT_TYPE_FURNACE_V2 = 0x07;
	public static final byte THERMOSTAT_SETPOINT_SET_SETPOINT_TYPE_DRY_AIR_V2 = 0x08;
	public static final byte THERMOSTAT_SETPOINT_SET_SETPOINT_TYPE_MOIST_AIR_V2 = 0x09;
	public static final byte THERMOSTAT_SETPOINT_SET_SETPOINT_TYPE_AUTO_CHANGEOVER_V2 = 0x0A;
	public static final byte THERMOSTAT_SETPOINT_SET_SETPOINT_TYPE_ENERGY_SAVE_HEATING_V2 = 0x0B;
	public static final byte THERMOSTAT_SETPOINT_SET_SETPOINT_TYPE_ENERGY_SAVE_COOLING_V2 = 0x0C;
	public static final byte THERMOSTAT_SETPOINT_SET_SETPOINT_TYPE_AWAY_HEATING_V2 = 0x0D;
	public static final byte THERMOSTAT_SETPOINT_SET_LEVEL_RESERVED_MASK_V2 = (byte) 0xF0;
	public static final byte THERMOSTAT_SETPOINT_SET_LEVEL_RESERVED_SHIFT_V2 = 0x04;
	public static final byte THERMOSTAT_SETPOINT_SET_LEVEL2_SIZE_MASK_V2 = 0x07;
	public static final byte THERMOSTAT_SETPOINT_SET_LEVEL2_SCALE_MASK_V2 = 0x18;
	public static final byte THERMOSTAT_SETPOINT_SET_LEVEL2_SCALE_SHIFT_V2 = 0x03;
	public static final byte THERMOSTAT_SETPOINT_SET_LEVEL2_PRECISION_MASK_V2 = (byte) 0xE0;
	public static final byte THERMOSTAT_SETPOINT_SET_LEVEL2_PRECISION_SHIFT_V2 = 0x05;

	/* Thermostat Setpobyte command class commands */
	public static final byte THERMOSTAT_SETPOINT_VERSION_V3 = 0x03;
	public static final byte THERMOSTAT_SETPOINT_GET_V3 = 0x02;
	public static final byte THERMOSTAT_SETPOINT_REPORT_V3 = 0x03;
	public static final byte THERMOSTAT_SETPOINT_SET_V3 = 0x01;
	public static final byte THERMOSTAT_SETPOINT_SUPPORTED_GET_V3 = 0x04;
	public static final byte THERMOSTAT_SETPOINT_SUPPORTED_REPORT_V3 = 0x05;
	public static final byte THERMOSTAT_SETPOINT_CAPABILITIES_GET_V3 = 0x09;
	public static final byte THERMOSTAT_SETPOINT_CAPABILITIES_REPORT_V3 = 0x0A;
	/* Values used for Thermostat Setpobyte Get command */
	public static final byte THERMOSTAT_SETPOINT_GET_LEVEL_SETPOINT_TYPE_MASK_V3 = 0x0F;
	public static final byte THERMOSTAT_SETPOINT_GET_SETPOINT_TYPE_NOT_SUPPORTED_V3 = 0x00;
	public static final byte THERMOSTAT_SETPOINT_GET_SETPOINT_TYPE_HEATING_1_V3 = 0x01;
	public static final byte THERMOSTAT_SETPOINT_GET_SETPOINT_TYPE_COOLING_1_V3 = 0x02;
	public static final byte THERMOSTAT_SETPOINT_GET_SETPOINT_TYPE_NOT_SUPPORTED1_V3 = 0x03;
	public static final byte THERMOSTAT_SETPOINT_GET_SETPOINT_TYPE_NOT_SUPPORTED2_V3 = 0x04;
	public static final byte THERMOSTAT_SETPOINT_GET_SETPOINT_TYPE_NOT_SUPPORTED3_V3 = 0x05;
	public static final byte THERMOSTAT_SETPOINT_GET_SETPOINT_TYPE_NOT_SUPPORTED4_V3 = 0x06;
	public static final byte THERMOSTAT_SETPOINT_GET_SETPOINT_TYPE_FURNACE_V3 = 0x07;
	public static final byte THERMOSTAT_SETPOINT_GET_SETPOINT_TYPE_DRY_AIR_V3 = 0x08;
	public static final byte THERMOSTAT_SETPOINT_GET_SETPOINT_TYPE_MOIST_AIR_V3 = 0x09;
	public static final byte THERMOSTAT_SETPOINT_GET_SETPOINT_TYPE_AUTO_CHANGEOVER_V3 = 0x0A;
	public static final byte THERMOSTAT_SETPOINT_GET_SETPOINT_TYPE_ENERGY_SAVE_HEATING_V3 = 0x0B;
	public static final byte THERMOSTAT_SETPOINT_GET_SETPOINT_TYPE_ENERGY_SAVE_COOLING_V3 = 0x0C;
	public static final byte THERMOSTAT_SETPOINT_GET_SETPOINT_TYPE_AWAY_HEATING_V3 = 0x0D;
	public static final byte THERMOSTAT_SETPOINT_GET_SETPOINT_TYPE_AWAY_COOLING_V3 = 0x0E;
	public static final byte THERMOSTAT_SETPOINT_GET_SETPOINT_TYPE_FULL_POWER_V3 = 0x0F;
	public static final byte THERMOSTAT_SETPOINT_GET_LEVEL_RESERVED_MASK_V3 = (byte) 0xF0;
	public static final byte THERMOSTAT_SETPOINT_GET_LEVEL_RESERVED_SHIFT_V3 = 0x04;
	/* Values used for Thermostat Setpobyte Report command */
	public static final byte THERMOSTAT_SETPOINT_REPORT_LEVEL_SETPOINT_TYPE_MASK_V3 = 0x0F;
	public static final byte THERMOSTAT_SETPOINT_REPORT_SETPOINT_TYPE_NOT_SUPPORTED_V3 = 0x00;
	public static final byte THERMOSTAT_SETPOINT_REPORT_SETPOINT_TYPE_HEATING_1_V3 = 0x01;
	public static final byte THERMOSTAT_SETPOINT_REPORT_SETPOINT_TYPE_COOLING_1_V3 = 0x02;
	public static final byte THERMOSTAT_SETPOINT_REPORT_SETPOINT_TYPE_NOT_SUPPORTED1_V3 = 0x03;
	public static final byte THERMOSTAT_SETPOINT_REPORT_SETPOINT_TYPE_NOT_SUPPORTED2_V3 = 0x04;
	public static final byte THERMOSTAT_SETPOINT_REPORT_SETPOINT_TYPE_NOT_SUPPORTED3_V3 = 0x05;
	public static final byte THERMOSTAT_SETPOINT_REPORT_SETPOINT_TYPE_NOT_SUPPORTED4_V3 = 0x06;
	public static final byte THERMOSTAT_SETPOINT_REPORT_SETPOINT_TYPE_FURNACE_V3 = 0x07;
	public static final byte THERMOSTAT_SETPOINT_REPORT_SETPOINT_TYPE_DRY_AIR_V3 = 0x08;
	public static final byte THERMOSTAT_SETPOINT_REPORT_SETPOINT_TYPE_MOIST_AIR_V3 = 0x09;
	public static final byte THERMOSTAT_SETPOINT_REPORT_SETPOINT_TYPE_AUTO_CHANGEOVER_V3 = 0x0A;
	public static final byte THERMOSTAT_SETPOINT_REPORT_SETPOINT_TYPE_ENERGY_SAVE_HEATING_V3 = 0x0B;
	public static final byte THERMOSTAT_SETPOINT_REPORT_SETPOINT_TYPE_ENERGY_SAVE_COOLING_V3 = 0x0C;
	public static final byte THERMOSTAT_SETPOINT_REPORT_SETPOINT_TYPE_AWAY_HEATING_V3 = 0x0D;
	public static final byte THERMOSTAT_SETPOINT_REPORT_SETPOINT_TYPE_AWAY_COOLING_V3 = 0x0E;
	public static final byte THERMOSTAT_SETPOINT_REPORT_SETPOINT_TYPE_FULL_POWER_V3 = 0x0F;
	public static final byte THERMOSTAT_SETPOINT_REPORT_LEVEL_RESERVED_MASK_V3 = (byte) 0xF0;
	public static final byte THERMOSTAT_SETPOINT_REPORT_LEVEL_RESERVED_SHIFT_V3 = 0x04;
	public static final byte THERMOSTAT_SETPOINT_REPORT_LEVEL2_SIZE_MASK_V3 = 0x07;
	public static final byte THERMOSTAT_SETPOINT_REPORT_LEVEL2_SCALE_MASK_V3 = 0x18;
	public static final byte THERMOSTAT_SETPOINT_REPORT_LEVEL2_SCALE_SHIFT_V3 = 0x03;
	public static final byte THERMOSTAT_SETPOINT_REPORT_LEVEL2_PRECISION_MASK_V3 = (byte) 0xE0;
	public static final byte THERMOSTAT_SETPOINT_REPORT_LEVEL2_PRECISION_SHIFT_V3 = 0x05;
	/* Values used for Thermostat Setpobyte Set command */
	public static final byte THERMOSTAT_SETPOINT_SET_LEVEL_SETPOINT_TYPE_MASK_V3 = 0x0F;
	public static final byte THERMOSTAT_SETPOINT_SET_SETPOINT_TYPE_NOT_SUPPORTED_V3 = 0x00;
	public static final byte THERMOSTAT_SETPOINT_SET_SETPOINT_TYPE_HEATING_1_V3 = 0x01;
	public static final byte THERMOSTAT_SETPOINT_SET_SETPOINT_TYPE_COOLING_1_V3 = 0x02;
	public static final byte THERMOSTAT_SETPOINT_SET_SETPOINT_TYPE_NOT_SUPPORTED1_V3 = 0x03;
	public static final byte THERMOSTAT_SETPOINT_SET_SETPOINT_TYPE_NOT_SUPPORTED2_V3 = 0x04;
	public static final byte THERMOSTAT_SETPOINT_SET_SETPOINT_TYPE_NOT_SUPPORTED3_V3 = 0x05;
	public static final byte THERMOSTAT_SETPOINT_SET_SETPOINT_TYPE_NOT_SUPPORTED4_V3 = 0x06;
	public static final byte THERMOSTAT_SETPOINT_SET_SETPOINT_TYPE_FURNACE_V3 = 0x07;
	public static final byte THERMOSTAT_SETPOINT_SET_SETPOINT_TYPE_DRY_AIR_V3 = 0x08;
	public static final byte THERMOSTAT_SETPOINT_SET_SETPOINT_TYPE_MOIST_AIR_V3 = 0x09;
	public static final byte THERMOSTAT_SETPOINT_SET_SETPOINT_TYPE_AUTO_CHANGEOVER_V3 = 0x0A;
	public static final byte THERMOSTAT_SETPOINT_SET_SETPOINT_TYPE_ENERGY_SAVE_HEATING_V3 = 0x0B;
	public static final byte THERMOSTAT_SETPOINT_SET_SETPOINT_TYPE_ENERGY_SAVE_COOLING_V3 = 0x0C;
	public static final byte THERMOSTAT_SETPOINT_SET_SETPOINT_TYPE_AWAY_HEATING_V3 = 0x0D;
	public static final byte THERMOSTAT_SETPOINT_SET_SETPOINT_TYPE_AWAY_COOLING_V3 = 0x0E;
	public static final byte THERMOSTAT_SETPOINT_SET_SETPOINT_TYPE_FULL_POWER_V3 = 0x0F;
	public static final byte THERMOSTAT_SETPOINT_SET_LEVEL_RESERVED_MASK_V3 = (byte) 0xF0;
	public static final byte THERMOSTAT_SETPOINT_SET_LEVEL_RESERVED_SHIFT_V3 = 0x04;
	public static final byte THERMOSTAT_SETPOINT_SET_LEVEL2_SIZE_MASK_V3 = 0x07;
	public static final byte THERMOSTAT_SETPOINT_SET_LEVEL2_SCALE_MASK_V3 = 0x18;
	public static final byte THERMOSTAT_SETPOINT_SET_LEVEL2_SCALE_SHIFT_V3 = 0x03;
	public static final byte THERMOSTAT_SETPOINT_SET_LEVEL2_PRECISION_MASK_V3 =(byte) 0xE0;
	public static final byte THERMOSTAT_SETPOINT_SET_LEVEL2_PRECISION_SHIFT_V3 = 0x05;
	/* Values used for Thermostat Setpobyte Capabilities Get command */
	public static final byte THERMOSTAT_SETPOINT_CAPABILITIES_GET_PROPERTIES1_SETPOINT_TYPE_MASK_V3 = 0x0F;
	public static final byte THERMOSTAT_SETPOINT_CAPABILITIES_GET_SETPOINT_TYPE_NOT_SUPPORTED_V3 = 0x00;
	public static final byte THERMOSTAT_SETPOINT_CAPABILITIES_GET_SETPOINT_TYPE_HEATING_1_V3 = 0x01;
	public static final byte THERMOSTAT_SETPOINT_CAPABILITIES_GET_SETPOINT_TYPE_COOLING_1_V3 = 0x02;
	public static final byte THERMOSTAT_SETPOINT_CAPABILITIES_GET_SETPOINT_TYPE_NOT_SUPPORTED1_V3 = 0x03;
	public static final byte THERMOSTAT_SETPOINT_CAPABILITIES_GET_SETPOINT_TYPE_NOT_SUPPORTED2_V3 = 0x04;
	public static final byte THERMOSTAT_SETPOINT_CAPABILITIES_GET_SETPOINT_TYPE_NOT_SUPPORTED3_V3 = 0x05;
	public static final byte THERMOSTAT_SETPOINT_CAPABILITIES_GET_SETPOINT_TYPE_NOT_SUPPORTED4_V3 = 0x06;
	public static final byte THERMOSTAT_SETPOINT_CAPABILITIES_GET_SETPOINT_TYPE_FURNACE_V3 = 0x07;
	public static final byte THERMOSTAT_SETPOINT_CAPABILITIES_GET_SETPOINT_TYPE_DRY_AIR_V3 = 0x08;
	public static final byte THERMOSTAT_SETPOINT_CAPABILITIES_GET_SETPOINT_TYPE_MOIST_AIR_V3 = 0x09;
	public static final byte THERMOSTAT_SETPOINT_CAPABILITIES_GET_SETPOINT_TYPE_AUTO_CHANGEOVER_V3 = 0x0A;
	public static final byte THERMOSTAT_SETPOINT_CAPABILITIES_GET_SETPOINT_TYPE_ENERGY_SAVE_HEATING_V3 = 0x0B;
	public static final byte THERMOSTAT_SETPOINT_CAPABILITIES_GET_SETPOINT_TYPE_ENERGY_SAVE_COOLING_V3 = 0x0C;
	public static final byte THERMOSTAT_SETPOINT_CAPABILITIES_GET_SETPOINT_TYPE_AWAY_HEATING_V3 = 0x0D;
	public static final byte THERMOSTAT_SETPOINT_CAPABILITIES_GET_SETPOINT_TYPE_AWAY_COOLING_V3 = 0x0E;
	public static final byte THERMOSTAT_SETPOINT_CAPABILITIES_GET_SETPOINT_TYPE_FULL_POWER_V3 = 0x0F;
	public static final byte THERMOSTAT_SETPOINT_CAPABILITIES_GET_PROPERTIES1_RESERVED_MASK_V3 =(byte) 0xF0;
	public static final byte THERMOSTAT_SETPOINT_CAPABILITIES_GET_PROPERTIES1_RESERVED_SHIFT_V3 = 0x04;
	/* Values used for Thermostat Setpobyte Capabilities Report command */
	public static final byte THERMOSTAT_SETPOINT_CAPABILITIES_REPORT_PROPERTIES1_SETPOINT_TYPE_MASK_V3 = 0x0F;
	public static final byte THERMOSTAT_SETPOINT_CAPABILITIES_REPORT_SETPOINT_TYPE_NOT_SUPPORTED_V3 = 0x00;
	public static final byte THERMOSTAT_SETPOINT_CAPABILITIES_REPORT_SETPOINT_TYPE_HEATING_1_V3 = 0x01;
	public static final byte THERMOSTAT_SETPOINT_CAPABILITIES_REPORT_SETPOINT_TYPE_COOLING_1_V3 = 0x02;
	public static final byte THERMOSTAT_SETPOINT_CAPABILITIES_REPORT_SETPOINT_TYPE_NOT_SUPPORTED1_V3 = 0x03;
	public static final byte THERMOSTAT_SETPOINT_CAPABILITIES_REPORT_SETPOINT_TYPE_NOT_SUPPORTED2_V3 = 0x04;
	public static final byte THERMOSTAT_SETPOINT_CAPABILITIES_REPORT_SETPOINT_TYPE_NOT_SUPPORTED3_V3 = 0x05;
	public static final byte THERMOSTAT_SETPOINT_CAPABILITIES_REPORT_SETPOINT_TYPE_NOT_SUPPORTED4_V3 = 0x06;
	public static final byte THERMOSTAT_SETPOINT_CAPABILITIES_REPORT_SETPOINT_TYPE_FURNACE_V3 = 0x07;
	public static final byte THERMOSTAT_SETPOINT_CAPABILITIES_REPORT_SETPOINT_TYPE_DRY_AIR_V3 = 0x08;
	public static final byte THERMOSTAT_SETPOINT_CAPABILITIES_REPORT_SETPOINT_TYPE_MOIST_AIR_V3 = 0x09;
	public static final byte THERMOSTAT_SETPOINT_CAPABILITIES_REPORT_SETPOINT_TYPE_AUTO_CHANGEOVER_V3 = 0x0A;
	public static final byte THERMOSTAT_SETPOINT_CAPABILITIES_REPORT_SETPOINT_TYPE_ENERGY_SAVE_HEATING_V3 = 0x0B;
	public static final byte THERMOSTAT_SETPOINT_CAPABILITIES_REPORT_SETPOINT_TYPE_ENERGY_SAVE_COOLING_V3 = 0x0C;
	public static final byte THERMOSTAT_SETPOINT_CAPABILITIES_REPORT_SETPOINT_TYPE_AWAY_HEATING_V3 = 0x0D;
	public static final byte THERMOSTAT_SETPOINT_CAPABILITIES_REPORT_SETPOINT_TYPE_AWAY_COOLING_V3 = 0x0E;
	public static final byte THERMOSTAT_SETPOINT_CAPABILITIES_REPORT_SETPOINT_TYPE_FULL_POWER_V3 = 0x0F;
	public static final byte THERMOSTAT_SETPOINT_CAPABILITIES_REPORT_PROPERTIES1_RESERVED_MASK_V3 = (byte) 0xF0;
	public static final byte THERMOSTAT_SETPOINT_CAPABILITIES_REPORT_PROPERTIES1_RESERVED_SHIFT_V3 = 0x04;
	public static final byte THERMOSTAT_SETPOINT_CAPABILITIES_REPORT_PROPERTIES2_SIZE_MASK_V3 = 0x07;
	public static final byte THERMOSTAT_SETPOINT_CAPABILITIES_REPORT_PROPERTIES2_SCALE_MASK_V3 = 0x18;
	public static final byte THERMOSTAT_SETPOINT_CAPABILITIES_REPORT_PROPERTIES2_SCALE_SHIFT_V3 = 0x03;
	public static final byte THERMOSTAT_SETPOINT_CAPABILITIES_REPORT_PROPERTIES2_PRECISION_MASK_V3 = (byte) 0xE0;
	public static final byte THERMOSTAT_SETPOINT_CAPABILITIES_REPORT_PROPERTIES2_PRECISION_SHIFT_V3 = 0x05;
	public static final byte THERMOSTAT_SETPOINT_CAPABILITIES_REPORT_PROPERTIES3_SIZE_MASK_V3 = 0x07;
	public static final byte THERMOSTAT_SETPOINT_CAPABILITIES_REPORT_PROPERTIES3_SCALE_MASK_V3 = 0x18;
	public static final byte THERMOSTAT_SETPOINT_CAPABILITIES_REPORT_PROPERTIES3_SCALE_SHIFT_V3 = 0x03;
	public static final byte THERMOSTAT_SETPOINT_CAPABILITIES_REPORT_PROPERTIES3_PRECISION_MASK_V3 = (byte) 0xE0;
	public static final byte THERMOSTAT_SETPOINT_CAPABILITIES_REPORT_PROPERTIES3_PRECISION_SHIFT_V3 = 0x05;

	/* Time Parameters command class commands */
	public static final byte TIME_PARAMETERS_VERSION = 0x01;
	public static final byte TIME_PARAMETERS_GET = 0x02;
	public static final byte TIME_PARAMETERS_REPORT = 0x03;
	public static final byte TIME_PARAMETERS_SET = 0x01;

	/* Time command class commands */
	public static final byte TIME_VERSION = 0x01;
	public static final byte DATE_GET = 0x03;
	public static final byte DATE_REPORT = 0x04;
	public static final byte TIME_GET = 0x01;
	public static final byte TIME_REPORT = 0x02;
	/* Values used for Time Report command */
	public static final byte TIME_REPORT_HOUR_LOCAL_TIME_HOUR_LOCAL_TIME_MASK = 0x1F;
	public static final byte TIME_REPORT_HOUR_LOCAL_TIME_RESERVED_MASK = 0x60;
	public static final byte TIME_REPORT_HOUR_LOCAL_TIME_RESERVED_SHIFT = 0x05;
	public static final byte TIME_REPORT_HOUR_LOCAL_TIME_RTC_FAILURE_BIT_MASK = (byte) 0x80;

	/* Time command class commands */
	public static final byte TIME_VERSION_V2 = 0x02;
	public static final byte DATE_GET_V2 = 0x03;
	public static final byte DATE_REPORT_V2 = 0x04;
	public static final byte TIME_GET_V2 = 0x01;
	public static final byte TIME_OFFSET_GET_V2 = 0x06;
	public static final byte TIME_OFFSET_REPORT_V2 = 0x07;
	public static final byte TIME_OFFSET_SET_V2 = 0x05;
	public static final byte TIME_REPORT_V2 = 0x02;
	/* Values used for Time Offset Report command */
	public static final byte TIME_OFFSET_REPORT_LEVEL_HOUR_TZO_MASK_V2 = 0x7F;
	public static final byte TIME_OFFSET_REPORT_LEVEL_SIGN_TZO_BIT_MASK_V2 = (byte) 0x80;
	public static final byte TIME_OFFSET_REPORT_LEVEL2_MINUTE_OFFSET_DST_MASK_V2 = 0x7F;
	public static final byte TIME_OFFSET_REPORT_LEVEL2_SIGN_OFFSET_DST_BIT_MASK_V2 = (byte) 0x80;
	/* Values used for Time Offset Set command */
	public static final byte TIME_OFFSET_SET_LEVEL_HOUR_TZO_MASK_V2 = 0x7F;
	public static final byte TIME_OFFSET_SET_LEVEL_SIGN_TZO_BIT_MASK_V2 =(byte) 0x80;
	public static final byte TIME_OFFSET_SET_LEVEL2_MINUTE_OFFSET_DST_MASK_V2 = 0x7F;
	public static final byte TIME_OFFSET_SET_LEVEL2_SIGN_OFFSET_DST_BIT_MASK_V2 = (byte) 0x80;
	/* Values used for Time Report command */
	public static final byte TIME_REPORT_HOUR_LOCAL_TIME_HOUR_LOCAL_TIME_MASK_V2 = 0x1F;
	public static final byte TIME_REPORT_HOUR_LOCAL_TIME_RESERVED_MASK_V2 = 0x60;
	public static final byte TIME_REPORT_HOUR_LOCAL_TIME_RESERVED_SHIFT_V2 = 0x05;
	public static final byte TIME_REPORT_HOUR_LOCAL_TIME_RTC_FAILURE_BIT_MASK_V2 =(byte) 0x80;

	/* Transport Service command class commands */
	public static final byte TRANSPORT_SERVICE_VERSION = 0x01;
	public static final byte COMMAND_FIRST_FRAGMENT = (byte) 0xC0;
	public static final byte COMMAND_FRAGMENT_COMPLETE = (byte) 0xE8;
	public static final byte COMMAND_FRAGMENT_REQUEST = (byte) 0xC8;
	public static final byte COMMAND_FRAGMENT_WAIT = (byte) 0xF0;
	public static final byte COMMAND_SUBSEQUENT_FRAGMENT = (byte) 0xE0;
	/* Values used for Command First Fragment command */
	public static final byte COMMAND_FIRST_FRAGMENT_MASK = (byte) 0xF8;
	public static final byte COMMAND_FIRST_FRAGMENT_DATAGRAM_SIZE_1_MASK = 0x07;
	public static final byte COMMAND_FIRST_FRAGMENT_PROPERTIES2_SEQUENCE_NO_MASK = 0x0F;
	public static final byte COMMAND_FIRST_FRAGMENT_PROPERTIES2_RESERVED_MASK = (byte) 0xF0;
	public static final byte COMMAND_FIRST_FRAGMENT_PROPERTIES2_RESERVED_SHIFT = 0x04;
	/* Values used for Command Fragment Complete command */
	public static final byte COMMAND_FRAGMENT_COMPLETE_MASK = (byte) 0xF8;
	public static final byte COMMAND_FRAGMENT_COMPLETE_RESERVED_MASK = 0x07;
	public static final byte COMMAND_FRAGMENT_COMPLETE_PROPERTIES2_SEQUENCE_NO_MASK = 0x0F;
	public static final byte COMMAND_FRAGMENT_COMPLETE_PROPERTIES2_RESERVED_MASK = (byte) 0xF0;
	public static final byte COMMAND_FRAGMENT_COMPLETE_PROPERTIES2_RESERVED_SHIFT = 0x04;
	/* Values used for Command Fragment Request command */
	public static final byte COMMAND_FRAGMENT_REQUEST_MASK = (byte) 0xF8;
	public static final byte COMMAND_FRAGMENT_REQUEST_RESERVED_MASK = 0x07;
	public static final byte COMMAND_FRAGMENT_REQUEST_PROPERTIES2_SEQUENCE_NO_MASK = 0x0F;
	public static final byte COMMAND_FRAGMENT_REQUEST_PROPERTIES2_RESERVED_MASK = (byte) 0xF0;
	public static final byte COMMAND_FRAGMENT_REQUEST_PROPERTIES2_RESERVED_SHIFT = 0x04;
	/* Values used for Command Fragment Wait command */
	public static final byte COMMAND_FRAGMENT_WAIT_MASK = (byte) 0xF8;
	public static final byte COMMAND_FRAGMENT_WAIT_RESERVED_MASK = 0x07;
	/* Values used for Command Subsequent Fragment command */
	public static final byte COMMAND_SUBSEQUENT_FRAGMENT_MASK = (byte) 0xF8;
	public static final byte COMMAND_SUBSEQUENT_FRAGMENT_DATAGRAM_SIZE_1_MASK = 0x07;
	public static final byte COMMAND_SUBSEQUENT_FRAGMENT_PROPERTIES2_DATAGRAM_OFFSET_1_MASK = 0x07;
	public static final byte COMMAND_SUBSEQUENT_FRAGMENT_PROPERTIES2_SEQUENCE_NO_MASK = 0x78;
	public static final byte COMMAND_SUBSEQUENT_FRAGMENT_PROPERTIES2_SEQUENCE_NO_SHIFT = 0x03;
	public static final byte COMMAND_SUBSEQUENT_FRAGMENT_PROPERTIES2_RESERVED_BIT_MASK = (byte) 0x80;

	/* Transport Service command class commands */
	public static final byte TRANSPORT_SERVICE_VERSION_V2 = 0x02;
	public static final byte COMMAND_FIRST_FRAGMENT_V2 = (byte) 0xC0;
	public static final byte COMMAND_FRAGMENT_COMPLETE_V2 = (byte) 0xE8;
	public static final byte COMMAND_FRAGMENT_REQUEST_V2 = (byte) 0xC8;
	public static final byte COMMAND_FRAGMENT_WAIT_V2 = (byte) 0xF0;
	public static final byte COMMAND_SUBSEQUENT_FRAGMENT_V2 = (byte)0xE0;
	/* Values used for Command First Fragment command */
	public static final byte COMMAND_FIRST_FRAGMENT_MASK_V2 = (byte) 0xF8;
	public static final byte COMMAND_FIRST_FRAGMENT_DATAGRAM_SIZE_1_MASK_V2 = 0x07;
	public static final byte COMMAND_FIRST_FRAGMENT_PROPERTIES2_RESERVED_MASK_V2 = 0x0F;
	public static final byte COMMAND_FIRST_FRAGMENT_PROPERTIES2_SESSION_ID_MASK_V2 = (byte) 0xF0;
	public static final byte COMMAND_FIRST_FRAGMENT_PROPERTIES2_SESSION_ID_SHIFT_V2 = 0x04;
	/* Values used for Command Fragment Complete command */
	public static final byte COMMAND_FRAGMENT_COMPLETE_MASK_V2 = (byte) 0xF8;
	public static final byte COMMAND_FRAGMENT_COMPLETE_RESERVED_MASK_V2 = 0x07;
	public static final byte COMMAND_FRAGMENT_COMPLETE_PROPERTIES2_RESERVED_MASK_V2 = 0x0F;
	public static final byte COMMAND_FRAGMENT_COMPLETE_PROPERTIES2_SESSION_ID_MASK_V2 = (byte) 0xF0;
	public static final byte COMMAND_FRAGMENT_COMPLETE_PROPERTIES2_SESSION_ID_SHIFT_V2 = 0x04;
	/* Values used for Command Fragment Request command */
	public static final byte COMMAND_FRAGMENT_REQUEST_MASK_V2 = (byte) 0xF8;
	public static final byte COMMAND_FRAGMENT_REQUEST_RESERVED_MASK_V2 = 0x07;
	public static final byte COMMAND_FRAGMENT_REQUEST_PROPERTIES2_RESERVED_MASK_V2 = 0x0F;
	public static final byte COMMAND_FRAGMENT_REQUEST_PROPERTIES2_SESSION_ID_MASK_V2 = (byte) 0xF0;
	public static final byte COMMAND_FRAGMENT_REQUEST_PROPERTIES2_SESSION_ID_SHIFT_V2 = 0x04;
	/* Values used for Command Fragment Wait command */
	public static final byte COMMAND_FRAGMENT_WAIT_MASK_V2 = (byte) 0xF8;
	public static final byte COMMAND_FRAGMENT_WAIT_RESERVED_MASK_V2 = 0x07;
	/* Values used for Command Subsequent Fragment command */
	public static final byte COMMAND_SUBSEQUENT_FRAGMENT_MASK_V2 = (byte) 0xF8;
	public static final byte COMMAND_SUBSEQUENT_FRAGMENT_DATAGRAM_SIZE_1_MASK_V2 = 0x07;
	public static final byte COMMAND_SUBSEQUENT_FRAGMENT_PROPERTIES2_DATAGRAM_OFFSET_1_MASK_V2 = 0x07;
	public static final byte COMMAND_SUBSEQUENT_FRAGMENT_PROPERTIES2_RESERVED_BIT_MASK_V2 = 0x08;
	public static final byte COMMAND_SUBSEQUENT_FRAGMENT_PROPERTIES2_SESSION_ID_MASK_V2 = (byte) 0xF0;
	public static final byte COMMAND_SUBSEQUENT_FRAGMENT_PROPERTIES2_SESSION_ID_SHIFT_V2 = 0x04;

	/* User Code command class commands */
	public static final byte USER_CODE_VERSION = 0x01;
	public static final byte USER_CODE_GET = 0x02;
	public static final byte USER_CODE_REPORT = 0x03;
	public static final byte USER_CODE_SET = 0x01;
	public static final byte USERS_NUMBER_GET = 0x04;
	public static final byte USERS_NUMBER_REPORT = 0x05;
	/* Values used for User Code Report command */
	public static final byte USER_CODE_REPORT_AVAILABLE_NOT_SET = 0x00;
	public static final byte USER_CODE_REPORT_OCCUPIED = 0x01;
	public static final byte USER_CODE_REPORT_RESERVED_BY_ADMINISTRATOR = 0x02;
	public static final byte USER_CODE_REPORT_STATUS_NOT_AVAILABLE = (byte) 0xFE;
	/* Values used for User Code Set command */
	public static final byte USER_CODE_SET_AVAILABLE_NOT_SET = 0x00;
	public static final byte USER_CODE_SET_OCCUPIED = 0x01;
	public static final byte USER_CODE_SET_RESERVED_BY_ADMINISTRATOR = 0x02;
	public static final byte USER_CODE_SET_STATUS_NOT_AVAILABLE = (byte) 0xFE;

	/* Version command class commands */
	public static final byte VERSION_VERSION = 0x01;
	public static final byte VERSION_COMMAND_CLASS_GET = 0x13;
	public static final byte VERSION_COMMAND_CLASS_REPORT = 0x14;
	public static final byte VERSION_GET = 0x11;
	public static final byte VERSION_REPORT = 0x12;

	/* Version command class commands */
	public static final byte VERSION_VERSION_V2 = 0x02;
	public static final byte VERSION_COMMAND_CLASS_GET_V2 = 0x13;
	public static final byte VERSION_COMMAND_CLASS_REPORT_V2 = 0x14;
	public static final byte VERSION_GET_V2 = 0x11;
	public static final byte VERSION_REPORT_V2 = 0x12;

	/* Wake Up command class commands */
	public static final byte WAKE_UP_VERSION = 0x01;
	public static final byte WAKE_UP_INTERVAL_GET = 0x05;
	public static final byte WAKE_UP_INTERVAL_REPORT = 0x06;
	public static final byte WAKE_UP_INTERVAL_SET = 0x04;
	public static final byte WAKE_UP_NO_MORE_INFORMATION = 0x08;
	public static final byte WAKE_UP_NOTIFICATION = 0x07;

	/* Wake Up command class commands */
	public static final byte WAKE_UP_VERSION_V2 = 0x02;
	public static final byte WAKE_UP_INTERVAL_CAPABILITIES_GET_V2 = 0x09;
	public static final byte WAKE_UP_INTERVAL_CAPABILITIES_REPORT_V2 = 0x0A;
	public static final byte WAKE_UP_INTERVAL_GET_V2 = 0x05;
	public static final byte WAKE_UP_INTERVAL_REPORT_V2 = 0x06;
	public static final byte WAKE_UP_INTERVAL_SET_V2 = 0x04;
	public static final byte WAKE_UP_NO_MORE_INFORMATION_V2 = 0x08;
	public static final byte WAKE_UP_NOTIFICATION_V2 = 0x07;

	/* Zip 6lowpan command class commands */
	public static final byte ZIP_6LOWPAN_VERSION = 0x01;
	public static final byte LOWPAN_FIRST_FRAGMENT = (byte) 0xC0;
	public static final byte LOWPAN_SUBSEQUENT_FRAGMENT = (byte) 0xE0;
	/* Values used for Lowpan First Fragment command */
	public static final byte LOWPAN_FIRST_FRAGMENT_MASK = (byte) 0xF8;
	public static final byte LOWPAN_FIRST_FRAGMENT_DATAGRAM_SIZE_1_MASK = 0x07;
	/* Values used for Lowpan Subsequent Fragment command */
	public static final byte LOWPAN_SUBSEQUENT_FRAGMENT_MASK = (byte) 0xF8;
	public static final byte LOWPAN_SUBSEQUENT_FRAGMENT_DATAGRAM_SIZE_1_MASK = 0x07;

	/* Zip command class commands */
	public static final byte ZIP_VERSION = 0x01;
	public static final byte COMMAND_ZIP_PACKET = 0x02;
	/* Values used for Command Zip Packet command */
	public static final byte COMMAND_ZIP_PACKET_PROPERTIES1_RESERVED_MASK = 0x03;
	public static final byte COMMAND_ZIP_PACKET_PROPERTIES1_NACK_OPTION_ERROR_BIT_MASK = 0x04;
	public static final byte COMMAND_ZIP_PACKET_PROPERTIES1_NACK_QUEUE_FULL_BIT_MASK = 0x08;
	public static final byte COMMAND_ZIP_PACKET_PROPERTIES1_NACK_WAITING_BIT_MASK = 0x10;
	public static final byte COMMAND_ZIP_PACKET_PROPERTIES1_NACK_RESPONSE_BIT_MASK = 0x20;
	public static final byte COMMAND_ZIP_PACKET_PROPERTIES1_ACK_RESPONSE_BIT_MASK = 0x40;
	public static final byte COMMAND_ZIP_PACKET_PROPERTIES1_ACK_REQUEST_BIT_MASK = (byte) 0x80;
	public static final byte COMMAND_ZIP_PACKET_PROPERTIES2_RESERVED_MASK = 0x1F;
	public static final byte COMMAND_ZIP_PACKET_PROPERTIES2_MORE_INFORMATION_BIT_MASK = 0x20;
	public static final byte COMMAND_ZIP_PACKET_PROPERTIES2_Z_WAVE_CMD_INCLUDED_BIT_MASK = 0x40;
	public static final byte COMMAND_ZIP_PACKET_PROPERTIES2_HEADER_EXT_INCLUDED_BIT_MASK = (byte) 0x80;
	public static final byte COMMAND_ZIP_PACKET_PROPERTIES3_SOURCE_END_POINT_MASK = 0x7F;
	public static final byte COMMAND_ZIP_PACKET_PROPERTIES3_RES_BIT_MASK = (byte) 0x80;
	public static final byte COMMAND_ZIP_PACKET_PROPERTIES4_DESTINATION_END_POINT_MASK = 0x7F;
	public static final byte COMMAND_ZIP_PACKET_PROPERTIES4_BIT_ADDRESS_BIT_MASK = (byte) 0x80;

	/* Zip command class commands */
	public static final byte ZIP_VERSION_V2 = 0x02;
	public static final byte COMMAND_ZIP_PACKET_V2 = 0x02;
	/* Values used for Command Zip Packet command */
	public static final byte COMMAND_ZIP_PACKET_PROPERTIES1_RESERVED_MASK_V2 = 0x03;
	public static final byte COMMAND_ZIP_PACKET_PROPERTIES1_NACK_OPTION_ERROR_BIT_MASK_V2 = 0x04;
	public static final byte COMMAND_ZIP_PACKET_PROPERTIES1_NACK_QUEUE_FULL_BIT_MASK_V2 = 0x08;
	public static final byte COMMAND_ZIP_PACKET_PROPERTIES1_NACK_WAITING_BIT_MASK_V2 = 0x10;
	public static final byte COMMAND_ZIP_PACKET_PROPERTIES1_NACK_RESPONSE_BIT_MASK_V2 = 0x20;
	public static final byte COMMAND_ZIP_PACKET_PROPERTIES1_ACK_RESPONSE_BIT_MASK_V2 = 0x40;
	public static final byte COMMAND_ZIP_PACKET_PROPERTIES1_ACK_REQUEST_BIT_MASK_V2 = (byte) 0x80;
	public static final byte COMMAND_ZIP_PACKET_PROPERTIES2_RESERVED_MASK_V2 = 0x0F;
	public static final byte COMMAND_ZIP_PACKET_PROPERTIES2_SECURE_ORIGIN_BIT_MASK_V2 = 0x10;
	public static final byte COMMAND_ZIP_PACKET_PROPERTIES2_MORE_INFORMATION_BIT_MASK_V2 = 0x20;
	public static final byte COMMAND_ZIP_PACKET_PROPERTIES2_Z_WAVE_CMD_INCLUDED_BIT_MASK_V2 = 0x40;
	public static final byte COMMAND_ZIP_PACKET_PROPERTIES2_HEADER_EXT_INCLUDED_BIT_MASK_V2 = (byte) 0x80;
	public static final byte COMMAND_ZIP_PACKET_PROPERTIES3_SOURCE_END_POINT_MASK_V2 = 0x7F;
	public static final byte COMMAND_ZIP_PACKET_PROPERTIES3_RES_BIT_MASK_V2 = (byte) 0x80;
	public static final byte COMMAND_ZIP_PACKET_PROPERTIES4_DESTINATION_END_POINT_MASK_V2 = 0x7F;
	public static final byte COMMAND_ZIP_PACKET_PROPERTIES4_BIT_ADDRESS_BIT_MASK_V2 = (byte) 0x80;

	/* Application Capability command class commands */
	public static final byte APPLICATION_CAPABILITY_VERSION = 0x01;
	public static final byte COMMAND_COMMAND_CLASS_NOT_SUPPORTED = 0x01;
	/* Values used for Command Command Class Not Supported command */
	public static final byte COMMAND_COMMAND_CLASS_NOT_SUPPORTED_PROPERTIES1_RESERVED_MASK = 0x7F;
	public static final byte COMMAND_COMMAND_CLASS_NOT_SUPPORTED_PROPERTIES1_DYNAMIC_BIT_MASK = (byte) 0x80;

	/* Switch Color command class commands */
	public static final byte SWITCH_COLOR_VERSION = 0x01;
	public static final byte SWITCH_COLOR_SUPPORTED_GET = 0x01;
	public static final byte SWITCH_COLOR_SUPPORTED_REPORT = 0x02;
	public static final byte SWITCH_COLOR_GET = 0x03;
	public static final byte SWITCH_COLOR_REPORT = 0x04;
	public static final byte SWITCH_COLOR_SET = 0x05;
	public static final byte SWITCH_COLOR_START_LEVEL_CHANGE = 0x06;
	public static final byte SWITCH_COLOR_STOP_LEVEL_CHANGE = 0x07;
	/* Values used for Switch Color Set command */
	public static final byte SWITCH_COLOR_SET_PROPERTIES1_COLOR_COMPONENT_COUNT_MASK = 0x1F;
	public static final byte SWITCH_COLOR_SET_PROPERTIES1_RESERVED_MASK = (byte) 0xE0;
	public static final byte SWITCH_COLOR_SET_PROPERTIES1_RESERVED_SHIFT = 0x05;
	/* Values used for Switch Color Start Level Change command */
	public static final byte SWITCH_COLOR_START_LEVEL_CHANGE_PROPERTIES1_RES1_MASK = 0x1F;
	public static final byte SWITCH_COLOR_START_LEVEL_CHANGE_PROPERTIES1_IGNORE_START_STATE_BIT_MASK = 0x20;
	public static final byte SWITCH_COLOR_START_LEVEL_CHANGE_PROPERTIES1_UP_DOWN_BIT_MASK = 0x40;
	public static final byte SWITCH_COLOR_START_LEVEL_CHANGE_PROPERTIES1_RES2_BIT_MASK = (byte) 0x80;

	/* Switch Color command class commands */
	public static final byte SWITCH_COLOR_VERSION_V2 = 0x02;
	public static final byte SWITCH_COLOR_SUPPORTED_GET_V2 = 0x01;
	public static final byte SWITCH_COLOR_SUPPORTED_REPORT_V2 = 0x02;
	public static final byte SWITCH_COLOR_GET_V2 = 0x03;
	public static final byte SWITCH_COLOR_REPORT_V2 = 0x04;
	public static final byte SWITCH_COLOR_SET_V2 = 0x05;
	public static final byte SWITCH_COLOR_START_LEVEL_CHANGE_V2 = 0x06;
	public static final byte SWITCH_COLOR_STOP_LEVEL_CHANGE_V2 = 0x07;
	/* Values used for Switch Color Set command */
	public static final byte SWITCH_COLOR_SET_PROPERTIES1_COLOR_COMPONENT_COUNT_MASK_V2 = 0x1F;
	public static final byte SWITCH_COLOR_SET_PROPERTIES1_RESERVED_MASK_V2 = (byte) 0xE0;
	public static final byte SWITCH_COLOR_SET_PROPERTIES1_RESERVED_SHIFT_V2 = 0x05;
	/* Values used for Switch Color Start Level Change command */
	public static final byte SWITCH_COLOR_START_LEVEL_CHANGE_PROPERTIES1_RES1_MASK_V2 = 0x1F;
	public static final byte SWITCH_COLOR_START_LEVEL_CHANGE_PROPERTIES1_IGNORE_START_STATE_BIT_MASK_V2 = 0x20;
	public static final byte SWITCH_COLOR_START_LEVEL_CHANGE_PROPERTIES1_UP_DOWN_BIT_MASK_V2 = 0x40;
	public static final byte SWITCH_COLOR_START_LEVEL_CHANGE_PROPERTIES1_RES2_BIT_MASK_V2 = (byte) 0x80;

	/* Schedule command class commands */
	public static final byte SCHEDULE_VERSION = 0x01;
	public static final byte SCHEDULE_SUPPORTED_GET = 0x01;
	public static final byte SCHEDULE_SUPPORTED_REPORT = 0x02;
	public static final byte COMMAND_SCHEDULE_SET = 0x03;
	public static final byte COMMAND_SCHEDULE_GET = 0x04;
	public static final byte COMMAND_SCHEDULE_REPORT = 0x05;
	public static final byte SCHEDULE_REMOVE = 0x06;
	public static final byte SCHEDULE_STATE_SET = 0x07;
	public static final byte SCHEDULE_STATE_GET = 0x08;
	public static final byte SCHEDULE_STATE_REPORT = 0x09;
	/* Values used for Schedule Supported Report command */
	public static final byte SCHEDULE_SUPPORTED_REPORT_PROPERTIES1_START_TIME_SUPPORT_MASK = 0x3F;
	public static final byte SCHEDULE_SUPPORTED_REPORT_PROPERTIES1_FALLBACK_SUPPORT_BIT_MASK = 0x40;
	public static final byte SCHEDULE_SUPPORTED_REPORT_PROPERTIES1_SUPPORT_ENABLE_DISABLE_BIT_MASK = (byte) 0x80;
	public static final byte SCHEDULE_SUPPORTED_REPORT_PROPERTIES3_SUPPORTED_OVERRIDE_TYPES_MASK = 0x7F;
	public static final byte SCHEDULE_SUPPORTED_REPORT_PROPERTIES3_OVERRIDE_SUPPORT_BIT_MASK = (byte) 0x80;
	/* Values used for Command Schedule Set command */
	public static final byte COMMAND_SCHEDULE_SET_PROPERTIES1_START_MONTH_MASK = 0x0F;
	public static final byte COMMAND_SCHEDULE_SET_PROPERTIES1_RESERVED1_MASK = (byte) 0xF0;
	public static final byte COMMAND_SCHEDULE_SET_PROPERTIES1_RESERVED1_SHIFT = 0x04;
	public static final byte COMMAND_SCHEDULE_SET_PROPERTIES2_START_DAY_OF_MONTH_MASK = 0x1F;
	public static final byte COMMAND_SCHEDULE_SET_PROPERTIES2_RESERVED2_MASK = (byte) 0xE0;
	public static final byte COMMAND_SCHEDULE_SET_PROPERTIES2_RESERVED2_SHIFT = 0x05;
	public static final byte COMMAND_SCHEDULE_SET_PROPERTIES3_START_WEEKDAY_MASK = 0x7F;
	public static final byte COMMAND_SCHEDULE_SET_PROPERTIES3_RES_BIT_MASK = (byte) 0x80;
	public static final byte COMMAND_SCHEDULE_SET_PROPERTIES4_START_HOUR_MASK = 0x1F;
	public static final byte COMMAND_SCHEDULE_SET_PROPERTIES4_DURATION_TYPE_MASK = (byte) 0xE0;
	public static final byte COMMAND_SCHEDULE_SET_PROPERTIES4_DURATION_TYPE_SHIFT = 0x05;
	public static final byte COMMAND_SCHEDULE_SET_PROPERTIES5_START_MINUTE_MASK = 0x3F;
	public static final byte COMMAND_SCHEDULE_SET_PROPERTIES5_RESERVED3_MASK = (byte) 0xC0;
	public static final byte COMMAND_SCHEDULE_SET_PROPERTIES5_RESERVED3_SHIFT = 0x06;
	/* Values used for Command Schedule Report command */
	public static final byte COMMAND_SCHEDULE_REPORT_PROPERTIES1_START_MONTH_MASK = 0x0F;
	public static final byte COMMAND_SCHEDULE_REPORT_PROPERTIES1_ACTIVE_ID_MASK = (byte) 0xF0;
	public static final byte COMMAND_SCHEDULE_REPORT_PROPERTIES1_ACTIVE_ID_SHIFT = 0x04;
	public static final byte COMMAND_SCHEDULE_REPORT_PROPERTIES2_START_DAY_OF_MONTH_MASK = 0x1F;
	public static final byte COMMAND_SCHEDULE_REPORT_PROPERTIES2_RESERVED2_MASK = (byte) 0xE0;
	public static final byte COMMAND_SCHEDULE_REPORT_PROPERTIES2_RESERVED2_SHIFT = 0x05;
	public static final byte COMMAND_SCHEDULE_REPORT_PROPERTIES3_START_WEEKDAY_MASK = 0x7F;
	public static final byte COMMAND_SCHEDULE_REPORT_PROPERTIES3_RES_BIT_MASK = (byte) 0x80;
	public static final byte COMMAND_SCHEDULE_REPORT_PROPERTIES4_START_HOUR_MASK = 0x1F;
	public static final byte COMMAND_SCHEDULE_REPORT_PROPERTIES4_DURATION_TYPE_MASK = (byte) 0xE0;
	public static final byte COMMAND_SCHEDULE_REPORT_PROPERTIES4_DURATION_TYPE_SHIFT = 0x05;
	public static final byte COMMAND_SCHEDULE_REPORT_PROPERTIES5_START_MINUTE_MASK = 0x3F;
	public static final byte COMMAND_SCHEDULE_REPORT_PROPERTIES5_RESERVED3_MASK = (byte) 0xC0;
	public static final byte COMMAND_SCHEDULE_REPORT_PROPERTIES5_RESERVED3_SHIFT = 0x06;
	/* Values used for Schedule State Report command */
	public static final byte SCHEDULE_STATE_REPORT_PROPERTIES1_OVERRIDE_BIT_MASK = 0x01;
	public static final byte SCHEDULE_STATE_REPORT_PROPERTIES1_REPORTS_TO_FOLLOW_MASK = (byte) 0xFE;
	public static final byte SCHEDULE_STATE_REPORT_PROPERTIES1_REPORTS_TO_FOLLOW_SHIFT = 0x01;
	public static final byte SCHEDULE_STATE_REPORT_PROPERTIES2_ACTIVE_ID_1_MASK = 0x0F;
	public static final byte SCHEDULE_STATE_REPORT_PROPERTIES2_ACTIVE_ID_2_MASK = (byte) 0xF0;
	public static final byte SCHEDULE_STATE_REPORT_PROPERTIES2_ACTIVE_ID_2_SHIFT = 0x04;
	public static final byte SCHEDULE_STATE_REPORT_PROPERTIES3_ACTIVE_ID_3_MASK = 0x0F;
	public static final byte SCHEDULE_STATE_REPORT_PROPERTIES3_ACTIVE_ID_N_MASK = (byte) 0xF0;
	public static final byte SCHEDULE_STATE_REPORT_PROPERTIES3_ACTIVE_ID_N_SHIFT = 0x04;

	/* Network Management Primary command class commands */
	public static final byte NETWORK_MANAGEMENT_PRIMARY_VERSION = 0x01;
	public static final byte CONTROLLER_CHANGE = 0x01;
	public static final byte CONTROLLER_CHANGE_STATUS = 0x02;
	/* Values used for Controller Change Status command */
	public static final byte CONTROLLER_CHANGE_STATUS_PROPERTIES1_CAPABILITY_MASK = 0x7F;
	public static final byte CONTROLLER_CHANGE_STATUS_PROPERTIES1_LISTENING_BIT_MASK = (byte) 0x80;
	public static final byte CONTROLLER_CHANGE_STATUS_PROPERTIES2_SECURITY_MASK = 0x7F;
	public static final byte CONTROLLER_CHANGE_STATUS_PROPERTIES2_OPT_BIT_MASK = (byte) 0x80;

	/* Zip Nd command class commands */
	public static final byte ZIP_ND_VERSION = 0x01;
	public static final byte ZIP_NODE_SOLICITATION = 0x03;
	public static final byte ZIP_INV_NODE_SOLICITATION = 0x04;
	public static final byte ZIP_NODE_ADVERTISEMENT = 0x01;
	/* Values used for Zip Inv Node Solicitation command */
	public static final byte ZIP_INV_NODE_SOLICITATION_PROPERTIES1_RESERVED1_MASK = 0x03;
	public static final byte ZIP_INV_NODE_SOLICITATION_PROPERTIES1_LOCAL_BIT_MASK = 0x04;
	public static final byte ZIP_INV_NODE_SOLICITATION_PROPERTIES1_RESERVED2_MASK = (byte) 0xF8;
	public static final byte ZIP_INV_NODE_SOLICITATION_PROPERTIES1_RESERVED2_SHIFT = 0x03;
	/* Values used for Zip Node Advertisement command */
	public static final byte ZIP_NODE_ADVERTISEMENT_PROPERTIES1_VALIDITY_MASK = 0x03;
	public static final byte ZIP_NODE_ADVERTISEMENT_VALIDITY_INFORMATION_OK = 0x00;
	public static final byte ZIP_NODE_ADVERTISEMENT_VALIDITY_INFORMATION_OBSOLETE = 0x01;
	public static final byte ZIP_NODE_ADVERTISEMENT_VALIDITY_INFORMATION_NOT_FOUND = 0x02;
	public static final byte ZIP_NODE_ADVERTISEMENT_PROPERTIES1_LOCAL_BIT_MASK = 0x04;
	public static final byte ZIP_NODE_ADVERTISEMENT_PROPERTIES1_RESERVED_MASK = (byte) 0xF8;
	public static final byte ZIP_NODE_ADVERTISEMENT_PROPERTIES1_RESERVED_SHIFT = 0x03;

	/* Association Grp Info command class commands */
	public static final byte ASSOCIATION_GRP_INFO_VERSION = 0x01;
	public static final byte ASSOCIATION_GROUP_NAME_GET = 0x01;
	public static final byte ASSOCIATION_GROUP_NAME_REPORT = 0x02;
	public static final byte ASSOCIATION_GROUP_INFO_GET = 0x03;
	public static final byte ASSOCIATION_GROUP_INFO_REPORT = 0x04;
	public static final byte ASSOCIATION_GROUP_COMMAND_LIST_GET = 0x05;
	public static final byte ASSOCIATION_GROUP_COMMAND_LIST_REPORT = 0x06;
	/* Values used for Association Group Info Get command */
	public static final byte ASSOCIATION_GROUP_INFO_GET_PROPERTIES1_RESERVED_MASK = 0x3F;
	public static final byte ASSOCIATION_GROUP_INFO_GET_PROPERTIES1_LIST_MODE_BIT_MASK = 0x40;
	public static final byte ASSOCIATION_GROUP_INFO_GET_PROPERTIES1_REFRESH_CACHE_BIT_MASK = (byte) 0x80;
	/* Values used for Association Group Info Report command */
	public static final byte ASSOCIATION_GROUP_INFO_REPORT_PROPERTIES1_GROUP_COUNT_MASK = 0x3F;
	public static final byte ASSOCIATION_GROUP_INFO_REPORT_PROPERTIES1_DYNAMIC_INFO_BIT_MASK = 0x40;
	public static final byte ASSOCIATION_GROUP_INFO_REPORT_PROPERTIES1_LIST_MODE_BIT_MASK = (byte) 0x80;
	public static final byte ASSOCIATION_GROUP_INFO_REPORT_PROFILE_GENERAL = 0x00;
	public static final byte ASSOCIATION_GROUP_INFO_REPORT_PROFILE_CONTROL = 0x20;
	public static final byte ASSOCIATION_GROUP_INFO_REPORT_PROFILE_SENSOR = 0x31;
	public static final byte ASSOCIATION_GROUP_INFO_REPORT_PROFILE_NOTIFICATION = 0x71;
	public static final byte ASSOCIATION_GROUP_INFO_REPORT_PROFILE_GENERAL_NA = 0x00;
	public static final byte ASSOCIATION_GROUP_INFO_REPORT_PROFILE_GENERAL_LIFELINE = 0x01;
	public static final byte ASSOCIATION_GROUP_INFO_REPORT_PROFILE_CONTROL_KEY01 = 0x01;
	public static final byte ASSOCIATION_GROUP_INFO_REPORT_PROFILE_CONTROL_KEY02 = 0x02;
	public static final byte ASSOCIATION_GROUP_INFO_REPORT_PROFILE_CONTROL_KEY03 = 0x03;
	public static final byte ASSOCIATION_GROUP_INFO_REPORT_PROFILE_CONTROL_KEY04 = 0x04;
	public static final byte ASSOCIATION_GROUP_INFO_REPORT_PROFILE_CONTROL_KEY05 = 0x05;
	public static final byte ASSOCIATION_GROUP_INFO_REPORT_PROFILE_CONTROL_KEY06 = 0x06;
	public static final byte ASSOCIATION_GROUP_INFO_REPORT_PROFILE_CONTROL_KEY07 = 0x07;
	public static final byte ASSOCIATION_GROUP_INFO_REPORT_PROFILE_CONTROL_KEY08 = 0x08;
	public static final byte ASSOCIATION_GROUP_INFO_REPORT_PROFILE_CONTROL_KEY09 = 0x09;
	public static final byte ASSOCIATION_GROUP_INFO_REPORT_PROFILE_CONTROL_KEY10 = 0x0A;
	public static final byte ASSOCIATION_GROUP_INFO_REPORT_PROFILE_CONTROL_KEY11 = 0x0B;
	public static final byte ASSOCIATION_GROUP_INFO_REPORT_PROFILE_CONTROL_KEY12 = 0x0C;
	public static final byte ASSOCIATION_GROUP_INFO_REPORT_PROFILE_CONTROL_KEY13 = 0x0D;
	public static final byte ASSOCIATION_GROUP_INFO_REPORT_PROFILE_CONTROL_KEY14 = 0x0E;
	public static final byte ASSOCIATION_GROUP_INFO_REPORT_PROFILE_CONTROL_KEY15 = 0x0F;
	public static final byte ASSOCIATION_GROUP_INFO_REPORT_PROFILE_CONTROL_KEY16 = 0x10;
	public static final byte ASSOCIATION_GROUP_INFO_REPORT_PROFILE_CONTROL_KEY17 = 0x11;
	public static final byte ASSOCIATION_GROUP_INFO_REPORT_PROFILE_CONTROL_KEY18 = 0x12;
	public static final byte ASSOCIATION_GROUP_INFO_REPORT_PROFILE_CONTROL_KEY19 = 0x13;
	public static final byte ASSOCIATION_GROUP_INFO_REPORT_PROFILE_CONTROL_KEY20 = 0x14;
	public static final byte ASSOCIATION_GROUP_INFO_REPORT_PROFILE_CONTROL_KEY21 = 0x15;
	public static final byte ASSOCIATION_GROUP_INFO_REPORT_PROFILE_CONTROL_KEY22 = 0x16;
	public static final byte ASSOCIATION_GROUP_INFO_REPORT_PROFILE_CONTROL_KEY23 = 0x17;
	public static final byte ASSOCIATION_GROUP_INFO_REPORT_PROFILE_CONTROL_KEY24 = 0x18;
	public static final byte ASSOCIATION_GROUP_INFO_REPORT_PROFILE_CONTROL_KEY25 = 0x19;
	public static final byte ASSOCIATION_GROUP_INFO_REPORT_PROFILE_CONTROL_KEY26 = 0x1A;
	public static final byte ASSOCIATION_GROUP_INFO_REPORT_PROFILE_CONTROL_KEY27 = 0x1B;
	public static final byte ASSOCIATION_GROUP_INFO_REPORT_PROFILE_CONTROL_KEY28 = 0x1C;
	public static final byte ASSOCIATION_GROUP_INFO_REPORT_PROFILE_CONTROL_KEY29 = 0x1D;
	public static final byte ASSOCIATION_GROUP_INFO_REPORT_PROFILE_CONTROL_KEY30 = 0x1E;
	public static final byte ASSOCIATION_GROUP_INFO_REPORT_PROFILE_CONTROL_KEY31 = 0x1F;
	public static final byte ASSOCIATION_GROUP_INFO_REPORT_PROFILE_CONTROL_KEY32 = 0x20;
	/* Values used for Association Group Command List Get command */
	public static final byte ASSOCIATION_GROUP_COMMAND_LIST_GET_PROPERTIES1_RESERVED_MASK = 0x7F;
	public static final byte ASSOCIATION_GROUP_COMMAND_LIST_GET_PROPERTIES1_ALLOW_CACHE_BIT_MASK = (byte) 0x80;

	/* Device Reset Locally command class commands */
	public static final byte DEVICE_RESET_LOCALLY_VERSION = 0x01;
	public static final byte DEVICE_RESET_LOCALLY_NOTIFICATION = 0x01;

	/* Central Scene command class commands */
	public static final byte CENTRAL_SCENE_VERSION = 0x01;
	public static final byte CENTRAL_SCENE_SUPPORTED_GET = 0x01;
	public static final byte CENTRAL_SCENE_SUPPORTED_REPORT = 0x02;
	public static final byte CENTRAL_SCENE_NOTIFICATION = 0x03;
	/* Values used for Central Scene Notification command */
	public static final byte CENTRAL_SCENE_NOTIFICATION_PROPERTIES1_KEY_ATTRIBUTES_MASK = 0x07;
	public static final byte CENTRAL_SCENE_NOTIFICATION_PROPERTIES1_RESERVED_MASK = (byte) 0xF8;
	public static final byte CENTRAL_SCENE_NOTIFICATION_PROPERTIES1_RESERVED_SHIFT = 0x03;

	/* Ip Association command class commands */
	public static final byte IP_ASSOCIATION_VERSION = 0x01;
	public static final byte IP_ASSOCIATION_SET = 0x01;
	public static final byte IP_ASSOCIATION_GET = 0x02;
	public static final byte IP_ASSOCIATION_REPORT = 0x03;
	public static final byte IP_ASSOCIATION_REMOVE = 0x04;
	/* Values used for Ip Association Set command */
	public static final byte IP_ASSOCIATION_SET_PROPERTIES1_RESOURCE_NAME_LENGTH_MASK = 0x3F;
	public static final byte IP_ASSOCIATION_SET_PROPERTIES1_RESERVED_MASK = (byte) 0xC0;
	public static final byte IP_ASSOCIATION_SET_PROPERTIES1_RESERVED_SHIFT = 0x06;
	/* Values used for Ip Association Report command */
	public static final byte IP_ASSOCIATION_REPORT_PROPERTIES1_RESOURCE_NAME_LENGTH_MASK = 0x3F;
	public static final byte IP_ASSOCIATION_REPORT_PROPERTIES1_RESERVED_MASK = (byte) 0xC0;
	public static final byte IP_ASSOCIATION_REPORT_PROPERTIES1_RESERVED_SHIFT = 0x06;
	/* Values used for Ip Association Remove command */
	public static final byte IP_ASSOCIATION_REMOVE_PROPERTIES1_RESOURCE_NAME_LENGTH_MASK = 0x3F;
	public static final byte IP_ASSOCIATION_REMOVE_PROPERTIES1_RESERVED_MASK = (byte) 0xC0;
	public static final byte IP_ASSOCIATION_REMOVE_PROPERTIES1_RESERVED_SHIFT = 0x06;

	/* Antitheft command class commands */
	public static final byte ANTITHEFT_VERSION = 0x01;
	public static final byte ANTITHEFT_SET = 0x01;
	public static final byte ANTITHEFT_GET = 0x02;
	public static final byte ANTITHEFT_REPORT = 0x03;
	/* Values used for Antitheft Set command */
	public static final byte ANTITHEFT_SET_PROPERTIES1_NUMBER_OF_MAGIC_CODE_BYTES_MASK = 0x7F;
	public static final byte ANTITHEFT_SET_PROPERTIES1_ENABLE_BIT_MASK = (byte) 0x80;

	/* Antitheft command class commands */
	public static final byte ANTITHEFT_VERSION_V2 = 0x02;
	public static final byte ANTITHEFT_SET_V2 = 0x01;
	public static final byte ANTITHEFT_GET_V2 = 0x02;
	public static final byte ANTITHEFT_REPORT_V2 = 0x03;
	/* Values used for Antitheft Set command */
	public static final byte ANTITHEFT_SET_PROPERTIES1_NUMBER_OF_MAGIC_CODE_BYTES_MASK_V2 = 0x7F;
	public static final byte ANTITHEFT_SET_PROPERTIES1_ENABLE_BIT_MASK_V2 = (byte) 0x80;

	/* Zwaveplus Info command class commands */
	public static final byte ZWAVEPLUS_INFO_VERSION = 0x01;
	public static final byte ZWAVEPLUS_INFO_GET = 0x01;
	public static final byte ZWAVEPLUS_INFO_REPORT = 0x02;
	/* Values used for Zwaveplus Info Report command */
	public static final byte ZWAVEPLUS_INFO_REPORT_ROLE_TYPE_CONTROLLER_CENTRAL_STATIC = 0x00;
	public static final byte ZWAVEPLUS_INFO_REPORT_ROLE_TYPE_CONTROLLER_SUB_STATIC = 0x01;
	public static final byte ZWAVEPLUS_INFO_REPORT_ROLE_TYPE_CONTROLLER_PORTABLE = 0x02;
	public static final byte ZWAVEPLUS_INFO_REPORT_ROLE_TYPE_CONTROLLER_PORTABLE_REPORTING = 0x03;
	public static final byte ZWAVEPLUS_INFO_REPORT_ROLE_TYPE_SLAVE_PORTABLE = 0x04;
	public static final byte ZWAVEPLUS_INFO_REPORT_ROLE_TYPE_SLAVE_ALWAYS_ON = 0x05;
	public static final byte ZWAVEPLUS_INFO_REPORT_ROLE_TYPE_SLAVE_SLEEPING_REPORTING = 0x06;
	public static final byte ZWAVEPLUS_INFO_REPORT_ROLE_TYPE_SLAVE_SLEEPING_LISTENING = 0x07;
	public static final byte ZWAVEPLUS_INFO_REPORT_NODE_TYPE_ZWAVEPLUS_NODE = 0x00;
	public static final byte ZWAVEPLUS_INFO_REPORT_NODE_TYPE_ZWAVEPLUS_FOR_IP_ROUTER = 0x01;
	public static final byte ZWAVEPLUS_INFO_REPORT_NODE_TYPE_ZWAVEPLUS_FOR_IP_GATEWAY = 0x02;
	public static final byte ZWAVEPLUS_INFO_REPORT_NODE_TYPE_ZWAVEPLUS_FOR_IP_CLIENT_IP_NODE = 0x03;
	public static final byte ZWAVEPLUS_INFO_REPORT_NODE_TYPE_ZWAVEPLUS_FOR_IP_CLIENT_ZWAVE_NODE = 0x04;

	/* Zwaveplus Info command class commands */
	public static final byte ZWAVEPLUS_INFO_VERSION_V2 = 0x02;
	public static final byte ZWAVEPLUS_INFO_GET_V2 = 0x01;
	public static final byte ZWAVEPLUS_INFO_REPORT_V2 = 0x02;
	/* Values used for Zwaveplus Info Report command */
	public static final byte ZWAVEPLUS_INFO_REPORT_ROLE_TYPE_CONTROLLER_CENTRAL_STATIC_V2 = 0x00;
	public static final byte ZWAVEPLUS_INFO_REPORT_ROLE_TYPE_CONTROLLER_SUB_STATIC_V2 = 0x01;
	public static final byte ZWAVEPLUS_INFO_REPORT_ROLE_TYPE_CONTROLLER_PORTABLE_V2 = 0x02;
	public static final byte ZWAVEPLUS_INFO_REPORT_ROLE_TYPE_CONTROLLER_PORTABLE_REPORTING_V2 = 0x03;
	public static final byte ZWAVEPLUS_INFO_REPORT_ROLE_TYPE_SLAVE_PORTABLE_V2 = 0x04;
	public static final byte ZWAVEPLUS_INFO_REPORT_ROLE_TYPE_SLAVE_ALWAYS_ON_V2 = 0x05;
	public static final byte ZWAVEPLUS_INFO_REPORT_ROLE_TYPE_SLAVE_SLEEPING_REPORTING_V2 = 0x06;
	public static final byte ZWAVEPLUS_INFO_REPORT_ROLE_TYPE_SLAVE_SLEEPING_LISTENING_V2 = 0x07;
	public static final byte ZWAVEPLUS_INFO_REPORT_NODE_TYPE_ZWAVEPLUS_NODE_V2 = 0x00;
	public static final byte ZWAVEPLUS_INFO_REPORT_NODE_TYPE_ZWAVEPLUS_FOR_IP_GATEWAY_V2 = 0x02;

	/* Zip Gateway command class commands */
	public static final byte ZIP_GATEWAY_VERSION = 0x01;
	public static final byte GATEWAY_MODE_SET = 0x01;
	public static final byte GATEWAY_MODE_GET = 0x02;
	public static final byte GATEWAY_MODE_REPORT = 0x03;
	public static final byte GATEWAY_PEER_SET = 0x04;
	public static final byte GATEWAY_PEER_GET = 0x05;
	public static final byte GATEWAY_PEER_REPORT = 0x06;
	public static final byte GATEWAY_LOCK_SET = 0x07;
	public static final byte UNSOLICITED_DESTINATION_SET = 0x08;
	public static final byte UNSOLICITED_DESTINATION_GET = 0x09;
	public static final byte UNSOLICITED_DESTINATION_REPORT = 0x0A;
	public static final byte COMMAND_APPLICATION_NODE_INFO_SET = 0x0B;
	public static final byte COMMAND_APPLICATION_NODE_INFO_GET = 0x0C;
	public static final byte COMMAND_APPLICATION_NODE_INFO_REPORT = 0x0D;
	/* Values used for Gateway Mode Set command */
	public static final byte GATEWAY_MODE_SET_STAND_ALONE = 0x01;
	public static final byte GATEWAY_MODE_SET_PORTAL = 0x02;
	/* Values used for Gateway Mode Report command */
	public static final byte GATEWAY_MODE_REPORT_STAND_ALONE = 0x01;
	public static final byte GATEWAY_MODE_REPORT_PORTAL = 0x02;
	/* Values used for Gateway Peer Set command */
	public static final byte GATEWAY_PEER_SET_PROPERTIES1_PEER_NAME_LENGTH_MASK = 0x3F;
	public static final byte GATEWAY_PEER_SET_PROPERTIES1_RESERVED_MASK = (byte) 0xC0;
	public static final byte GATEWAY_PEER_SET_PROPERTIES1_RESERVED_SHIFT = 0x06;
	/* Values used for Gateway Peer Report command */
	public static final byte GATEWAY_PEER_REPORT_PROPERTIES1_PEER_NAME_LENGTH_MASK = 0x3F;
	public static final byte GATEWAY_PEER_REPORT_PROPERTIES1_RESERVED_MASK = (byte) 0xC0;
	public static final byte GATEWAY_PEER_REPORT_PROPERTIES1_RESERVED_SHIFT = 0x06;
	/* Values used for Gateway Lock Set command */
	public static final byte GATEWAY_LOCK_SET_PROPERTIES1_LOCK_BIT_MASK = 0x01;
	public static final byte GATEWAY_LOCK_SET_PROPERTIES1_SHOW_BIT_MASK = 0x02;
	public static final byte GATEWAY_LOCK_SET_PROPERTIES1_RESERVED_MASK = (byte) 0xFC;
	public static final byte GATEWAY_LOCK_SET_PROPERTIES1_RESERVED_SHIFT = 0x02;
	/* Values used for Command Application Node Info Set command */
	public static final int COMMAND_APPLICATION_NODE_INFO_SET_SECURITY_SCHEME_0_MARK = 0xF100;
	/* Values used for Command Application Node Info Report command */
	public static final int COMMAND_APPLICATION_NODE_INFO_REPORT_SECURITY_SCHEME_0_MARK = 0xF100;

	/* Zip Portal command class commands */
	public static final byte ZIP_PORTAL_VERSION = 0x01;
	public static final byte GATEWAY_CONFIGURATION_SET = 0x01;
	public static final byte GATEWAY_CONFIGURATION_STATUS = 0x02;
	public static final byte GATEWAY_CONFIGURATION_GET = 0x03;
	public static final byte GATEWAY_CONFIGURATION_REPORT = 0x04;

	/* Appliance command class commands */
	public static final byte APPLIANCE_VERSION = 0x01;
	public static final byte APPLIANCE_TYPE_GET = 0x01;
	public static final byte APPLIANCE_TYPE_REPORT = 0x02;
	public static final byte APPLIANCE_PROGRAM_SUPPORTED_GET = 0x03;
	public static final byte APPLIANCE_PROGRAM_SUPPORTED_REPORT = 0x04;
	public static final byte APPLIANCE_SET = 0x05;
	public static final byte APPLIANCE_GET = 0x06;
	public static final byte APPLIANCE_REPORT = 0x07;
	/* Values used for Appliance Type Report command */
	public static final byte APPLIANCE_TYPE_REPORT_PROPERTIES1_APPLIANCE_TYPE_MASK = 0x3F;
	public static final byte APPLIANCE_TYPE_REPORT_APPLIANCE_TYPE_RESERVED = 0x00;
	public static final byte APPLIANCE_TYPE_REPORT_APPLIANCE_TYPE_REFRIGERATOR = 0x01;
	public static final byte APPLIANCE_TYPE_REPORT_APPLIANCE_TYPE_FREEZER = 0x02;
	public static final byte APPLIANCE_TYPE_REPORT_APPLIANCE_TYPE_MICROWAVE_OVEN = 0x03;
	public static final byte APPLIANCE_TYPE_REPORT_APPLIANCE_TYPE_LIGHT_WAVE_OVEN = 0x04;
	public static final byte APPLIANCE_TYPE_REPORT_APPLIANCE_TYPE_OVEN = 0x05;
	public static final byte APPLIANCE_TYPE_REPORT_APPLIANCE_TYPE_DISHWASHER = 0x06;
	public static final byte APPLIANCE_TYPE_REPORT_APPLIANCE_TYPE_WASHING_MACHINE = 0x07;
	public static final byte APPLIANCE_TYPE_REPORT_APPLIANCE_TYPE_DRYING_MACHINE = 0x08;
	public static final byte APPLIANCE_TYPE_REPORT_APPLIANCE_TYPE_DRYING_CABINET = 0x09;
	public static final byte APPLIANCE_TYPE_REPORT_APPLIANCE_TYPE_COMBO_WASHER_DRYER = 0x0A;
	public static final byte APPLIANCE_TYPE_REPORT_APPLIANCE_TYPE_ROBOVAC = 0x0B;
	public static final byte APPLIANCE_TYPE_REPORT_PROPERTIES1_RESERVED_MASK = (byte) 0xC0;
	public static final byte APPLIANCE_TYPE_REPORT_PROPERTIES1_RESERVED_SHIFT = 0x06;
	/* Values used for Appliance Set command */
	public static final byte APPLIANCE_SET_PROPERTIES1_APPLIANCE_MODE_MASK = 0x0F;
	public static final byte APPLIANCE_SET_APPLIANCE_MODE_OFF = 0x00;
	public static final byte APPLIANCE_SET_APPLIANCE_MODE_ON = 0x01;
	public static final byte APPLIANCE_SET_APPLIANCE_MODE_ECO = 0x02;
	public static final byte APPLIANCE_SET_APPLIANCE_MODE_AWAY = 0x03;
	public static final byte APPLIANCE_SET_APPLIANCE_MODE_START = 0x04;
	public static final byte APPLIANCE_SET_APPLIANCE_MODE_STOP = 0x05;
	public static final byte APPLIANCE_SET_APPLIANCE_MODE_CANCEL = 0x06;
	public static final byte APPLIANCE_SET_APPLIANCE_MODE_CHARGE = 0x07;
	public static final byte APPLIANCE_SET_PROPERTIES1_NO_OF_MANUFACTURER_DATA_FIELDS_MASK = (byte) 0xF0;
	public static final byte APPLIANCE_SET_PROPERTIES1_NO_OF_MANUFACTURER_DATA_FIELDS_SHIFT = 0x04;
	/* Values used for Appliance Report command */
	public static final byte APPLIANCE_REPORT_PROPERTIES1_APPLIANCE_MODE_MASK = 0x0F;
	public static final byte APPLIANCE_REPORT_APPLIANCE_MODE_OFF = 0x00;
	public static final byte APPLIANCE_REPORT_APPLIANCE_MODE_ON = 0x01;
	public static final byte APPLIANCE_REPORT_APPLIANCE_MODE_ECO = 0x02;
	public static final byte APPLIANCE_REPORT_APPLIANCE_MODE_AWAY = 0x03;
	public static final byte APPLIANCE_REPORT_APPLIANCE_MODE_START = 0x04;
	public static final byte APPLIANCE_REPORT_APPLIANCE_MODE_STOP = 0x05;
	public static final byte APPLIANCE_REPORT_APPLIANCE_MODE_CANCEL = 0x06;
	public static final byte APPLIANCE_REPORT_APPLIANCE_MODE_CHARGE = 0x07;
	public static final byte APPLIANCE_REPORT_PROPERTIES1_NO_OF_MANUFACTURER_DATA_FIELDS_MASK = (byte) 0xF0;
	public static final byte APPLIANCE_REPORT_PROPERTIES1_NO_OF_MANUFACTURER_DATA_FIELDS_SHIFT = 0x04;

	/* Dmx command class commands */
	public static final byte DMX_VERSION = 0x01;
	public static final byte DMX_ADDRESS_SET = 0x01;
	public static final byte DMX_ADDRESS_GET = 0x02;
	public static final byte DMX_ADDRESS_REPORT = 0x03;
	public static final byte DMX_CAPABILITY_GET = 0x04;
	public static final byte DMX_CAPABILITY_REPORT = 0x05;
	public static final byte DMX_DATA_40 = 0x06;
	/* Values used for Dmx Address Set command */
	public static final byte DMX_ADDRESS_SET_PROPERTIES1_PAGE_ID_MASK = 0x0F;
	public static final byte DMX_ADDRESS_SET_PROPERTIES1_RESERVED_MASK = (byte) 0xF0;
	public static final byte DMX_ADDRESS_SET_PROPERTIES1_RESERVED_SHIFT = 0x04;
	/* Values used for Dmx Address Report command */
	public static final byte DMX_ADDRESS_REPORT_PROPERTIES1_PAGE_ID_MASK = 0x0F;
	public static final byte DMX_ADDRESS_REPORT_PROPERTIES1_RESERVED_MASK = (byte) 0xF0;
	public static final byte DMX_ADDRESS_REPORT_PROPERTIES1_RESERVED_SHIFT = 0x04;
	/* Values used for Dmx Data 40 command */
	public static final byte DMX_DATA_40_PROPERTIES1_PAGE_MASK = 0x0F;
	public static final byte DMX_DATA_40_PROPERTIES1_SEQUENCE_NO_MASK = 0x30;
	public static final byte DMX_DATA_40_PROPERTIES1_SEQUENCE_NO_SHIFT = 0x04;
	public static final byte DMX_DATA_40_PROPERTIES1_RESERVED_MASK = (byte) 0xC0;
	public static final byte DMX_DATA_40_PROPERTIES1_RESERVED_SHIFT = 0x06;

	/* Barrier Operator command class commands */
	public static final byte BARRIER_OPERATOR_VERSION = 0x01;
	public static final byte BARRIER_OPERATOR_SET = 0x01;
	public static final byte BARRIER_OPERATOR_GET = 0x02;
	public static final byte BARRIER_OPERATOR_REPORT = 0x03;
	public static final byte BARRIER_OPERATOR_SIGNAL_SUPPORTED_GET = 0x04;
	public static final byte BARRIER_OPERATOR_SIGNAL_SUPPORTED_REPORT = 0x05;
	public static final byte BARRIER_OPERATOR_SIGNAL_SET = 0x06;
	public static final byte BARRIER_OPERATOR_SIGNAL_GET = 0x07;
	public static final byte BARRIER_OPERATOR_SIGNAL_REPORT = 0x08;
	/* Values used for Barrier Operator Set command */
	public static final byte BARRIER_OPERATOR_SET_CLOSE = 0x00;
	public static final byte BARRIER_OPERATOR_SET_OPEN = (byte) 0xFF;
	/* Values used for Barrier Operator Report command */
	public static final byte BARRIER_OPERATOR_REPORT_CLOSED = 0x00;
	public static final byte BARRIER_OPERATOR_REPORT_UNKNOWN_POSITION_MOVING_TO_CLOSE = (byte) 0xFC;
	public static final byte BARRIER_OPERATOR_REPORT_UNKNOWN_POSITION_STOPPED = (byte) 0xFD;
	public static final byte BARRIER_OPERATOR_REPORT_UNKNOWN_POSITION_MOVING_TO_OPEN = (byte) 0xFE;
	public static final byte BARRIER_OPERATOR_REPORT_OPEN = (byte) 0xFF;
	/* Values used for Barrier Operator Signal Set command */
	public static final byte BARRIER_OPERATOR_SIGNAL_SET_NOT_SUPPORTED = 0x00;
	public static final byte BARRIER_OPERATOR_SIGNAL_SET_AUDIBLE_NOTIFICATION = 0x01;
	public static final byte BARRIER_OPERATOR_SIGNAL_SET_VISUAL_NOTIFICATION = 0x02;
	public static final byte BARRIER_OPERATOR_SIGNAL_SET_OFF = 0x00;
	public static final byte BARRIER_OPERATOR_SIGNAL_SET_ON =(byte) 0xFF;
	/* Values used for Barrier Operator Signal Get command */
	public static final byte BARRIER_OPERATOR_SIGNAL_GET_NOT_SUPPORTED = 0x00;
	public static final byte BARRIER_OPERATOR_SIGNAL_GET_AUDIBLE_NOTIFICATION = 0x01;
	public static final byte BARRIER_OPERATOR_SIGNAL_GET_VISUAL_NOTIFICATION = 0x02;
	/* Values used for Barrier Operator Signal Report command */
	public static final byte BARRIER_OPERATOR_SIGNAL_REPORT_NOT_SUPPORTED = 0x00;
	public static final byte BARRIER_OPERATOR_SIGNAL_REPORT_AUDIBLE_NOTIFICATION = 0x01;
	public static final byte BARRIER_OPERATOR_SIGNAL_REPORT_VISUAL_NOTIFICATION = 0x02;
	public static final byte BARRIER_OPERATOR_SIGNAL_REPORT_OFF = 0x00;
	public static final byte BARRIER_OPERATOR_SIGNAL_REPORT_ON = (byte) 0xFF;

	/* Max. frame size to allow routing over 4 hops */
	public static final byte META_DATA_MAX_DATA_SIZE = 48;
}
