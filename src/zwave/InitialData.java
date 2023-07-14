package zwave;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

public class InitialData {
	private List<Byte> ids = new ArrayList<>();
	private int chipType;
	private int chipVersion;

	public InitialData(SerialAPIMessage message) {
		byte[] frame = message.getBytes();
		final byte capabilities = frame[5];

		int nbNodes = frame[6];

		int index = 7;
		if (nbNodes > 0) {
			byte[] bNodes = new byte[nbNodes];

			for (int i = 0; i < nbNodes; i++) {
				byte b = frame[index];
				bNodes[i] = b;
				index++;
			}
			BitSet bits = BitSet.valueOf(bNodes);
			for (int i = 0; i < bits.length(); i++) {
				if (bits.get(i)) {
					ids.add((byte) (i + 1));
				}
			}

		}
		this.chipType = frame[index];
		index++;
		this.chipVersion = frame[index];
	}

	public List<Byte> getNodeIds() {
		return ids;
	}

	public int getChipType() {
		return chipType;
	}

	public int getChipVersion() {
		return chipVersion;
	}

	public static final String getChipName(int code) {
		switch (code) {
		case 0:
			return "Not specified";
		case 1:
			return "ZW010x chip type (100 series)";
		case 2:
			return "ZW020x chip type (200 series)";
		case 3:
			return "ZW030x chip type (300 series)";
		case 4:
			return "ZW040x chip type (400 series)";
		case 5:
			return "ZW050x chip type (500 series)";
		case 6:
			return "ZW060x chip type (600 series)";
		case 7:
			return "ZW070x chip type (700 series)";
		case 8:
			return "ZW080x chip type (800 series)";
		case 19:
			return "ZGM130S chip type (700 series). Example: ZGM130S_BRD4202A, ZGM130S_BRD4207A\"";
		case 20:
			return "EFR32ZG14 chip type (700 series). Example: ZG14_BRD4201A, ZG14_BRD4206A";
		case 32:
			return "Any chip type";
		case 33:
			return "EFR32ZG14 Radio Board";
		case 34:
			return "EFR32RZ13 QFN32 Radio Board";
		case 35:
			return "EFR32ZG13L Radio Board";
		case 36:
			return "EFR32ZG13S Radio Board";
		case 37:
			return "ZGM130S Radio Board";
		case 38:
			return "ZGM130S Radio Board";
		case 39:
			return "EFR32RZ13 868-915 MHz 13 dBm Radio Board";
		case 40:
			return "EFR32ZG14 Z-Wave Long Range Radio Board";
		case 41:
			return "ZGM130S Z-Wave Long Range Radio Board";
		case 42:
			return "EFR32ZG14 915 MHz 20 dBm Radio Board";
		case 43:
			return "EFR32RZ13 915 MHz 20 dBm Radio Board";
		case 44:
			return "EFR32ZG23 868-915 MHz 14 dBm Radio Board";
		case 45:
			return "EFR32ZG23 868-915 MHz 14 dBm Radio Board";
		case 46:
			return "ZGM230S Radio Board";
		case 47:
			return "ZGM230S Radio Board";
		case 48:
			return "ZGM230 +14 dBm Dev Kit Board";
		case 49:
			return "EFR32ZG23 868-915 MHz 20 dBm Radio Board";
		case 50:
			return "EFR32xG28 868/915 MHz +14 dBm + 2.4 GHz +10 dBm Radio Board";
		case 51:
			return "EFR32xG28 868/915 MHz +20 dBm + 2.4 GHz +10 dBm Radio Board";

		default:
			return "Unknown";
		}
	}

	public String getChipTypeName() {
		return getChipName(getChipType());
	}
}
