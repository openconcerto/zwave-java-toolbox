# zwave-java-toolbox
Java library and tools to control Z-Wave devices via a USB Z-Wave Controller.

A MQTT bridge compatible with [Home Assistant](https://www.home-assistant.io/) is provided. Unlike [
Z-Wave JS](https://github.com/zwave-js), it is much more simple to use and **stable**.

The code is compatible with Silicon Labs ZW0700 series chip  (Z-Stick 7 from Aeotec, 7.19 firmware) and requires Java 8 or newer.


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

To build your own jar, see **JarPackager**. For development, all you need is included, [Eclipse](https://eclipse.org) configuration files are provided.


## Useful links and resources

* [Z-Wave PC Controller 5.54 for Windows](https://code.organic/pc_controller-5.54.zip) : to configure your devices and update the firmware 
* [Z-Wave Zniffer for Windows](https://code.organic/zniffer-4.64.zip) : to display logs of Z-Wave communication done with Z-Wave PC Controller
* [Serial API programming guide](https://code.organic/INS12350.pdf)  version 23 : partial but useful to understant the serial API
* [Firmware 7.19.2 for Aeotec Z-Stick 7](https://code.organic/zwave_ncp_serial_api_controller_BRD4206A_7.19.2.gbl) : use Z-Wave PC Controller / Settings / OTW Firmware Update

## Contributing

Feel free to report bugs on the Issues topic. Code contribution are welcome.

Things that could be interesting to add :

* add / remove nodes
* firmware update
* backup/restore of the USB controller


## History
After years using Fibaro products, I had to replace my Home Center because of a broken update. The recovery key didn't work, I had to find a reliable alternative.

The Home Center is using a watchdog I was not able to disable, I built my own linux box with a USB Z-Wave controller (Z-Stick 7 from Aeotec), with open source code only in order to avoid previous issues. I tested a lot of platform, the best were [OpenHAL](https://www.openhab.org/) and [Home Assistant](https://www.home-assistant.io/).

Technically they are badly written and the UI is a mess. Do we really need thousands of line of code, hundred of dependencies for an automation system? Of course, not.
It's funny to see that openHAL is using technologies for (big) cloud services for home automation...

So... seeing that openHAL Z-Wave was only working with old controllers, I switched to Home Assistant... which required a MQTT broker and a third party bridge to Z-Wave ([zwave-js](https://github.com/zwave-js)). What an efficient way to send and receive less than a hundred of bytes to a serial port!

Unfortunately, it was not reliable, [zwave-js](https://github.com/zwave-js) randomly declared some nodes as "dead". A lot of users have this problem, every answers pointed to an harware bug. I decided to investigate.

Some hundreds line of code later, it was clear that **the hardware was working well, it was just software bugs**.
The Z-Wave MQTT bridge I wrote is **running for months without a single failure**.

It's difficult to blame the team of zwave-js and openHAL, even if technical choices are bad, the Z-Wave protocol is not open, it's difficult to obtain documentation.
What's more, the Z-Wave protocol has a lot of revisions, thousands of magic values. The protocol is not simple (by design). 

Silicon Labs, the company behind the serial protocol is not very cooperative.
To upgrade the USB controler or control it with a basic GUI requires to create an account and to download [Simplicity Studio](https://www.silabs.com/developers/simplicity-studio).










