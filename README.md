# zwave-java-toolbox
Java library and tools to control Z-Wave devices via a USB Z-Wave Controller.
A MQTT bridge compatible with Home Assistant is provided.
The code is compatible with Silicon Labs ZW0700 series chip  (Z-Stick 7 from Aeotec).

## The MQTT Z-Wave bridge
The MQTT bridge provided will expose Z-Wave switches as 2 topics.

**zwavebridge/node_3/switch/state** for the state of the switch on node 3

**zwavebridge/node_3/switch/set** to toggle ON or OFF the switch on node 3

Home Assistant auto-discovery is published as :
**homeassistant/switch/zwavebridge/node_zwavebridge_3/config**

**Usage** :
```
MQTTBridge for Z-Wave

Usage : java -jar zwave-mqqt.jar [OPTIONS] SERIAL_PORT BROKER_URL

MQTT broker url can be tcp://HOST:PORT or ssl://HOST:PORT

Options
--verbose            increase verbosity
--password=PASSWORD  broker password

Examples
Windows : java -jar zwave-mqqt.jar COM5 tcp://192.168.1.8:1883
Linux :   java -jar zwave-mqqt.jar /dev/ttyUSB0 tcp://192.168.1.8:1883
```
In the case of using a Z-Wave controller on serial port COM5 with a [Mosquitto](https://mosquitto.org/) MQTT broker installed on a server 192.168.1.8 :
```
java -jar zwave-mqqt.jar COM5 tcp://192.168.1.8:1883
```
The bridge is a single class program, it's easy to tweak it for your needs.

## The Z-Wave simple toolbox
As example of use of the libray, we provide a minimalistic tool to get and set values.

With a Z-Wave USB key connected as COM5, you can run the toolbox to list your devices using
```
java -jar zwave-toolbox.jar COM5
```

**Usage :**
```
Z-Wave tools

Usage : java -jar zwave-toolbox.jar [OPTIONS] SERIAL_PORT

Options
--listen            do not exit and print received Z-Wave messages
--log-file=FILE     log all the messages in a file
--get-NODEID            basic get on node NODEID
--set-NODEID=VALUE      basic set VALUE on node NODEID

Examples
Windows : java -jar zwave-mqqt.jar COM5
          java -jar zwave-mqqt.jar COM5 --get-3
Linux :   java -jar zwave-toolbox.jar /dev/ttyUSB0 
```

## The Java API
See **ZWaveSerialAPI** for implemented features.
All you to need to send and receive commands is implemented.

Z-Wave "magic constants" are provided in **ZWaveValues**.

To build your own jar, see **JarPackager**.


