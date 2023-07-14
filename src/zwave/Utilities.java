package zwave;

public class Utilities {

	private static final char[] HEX_CHARS = "0123456789ABCDEF".toCharArray();

	public static String asHex(byte[] buf) {
		char[] chars = new char[2 * buf.length];
		for (int i = 0; i < buf.length; ++i) {
			chars[2 * i] = HEX_CHARS[(buf[i] & 0xF0) >>> 4];
			chars[2 * i + 1] = HEX_CHARS[buf[i] & 0x0F];
		}
		return new String(chars);
	}

	public static String asHexWithSpace(byte[] buf) {
		final char[] chars = new char[3 * buf.length];
		for (int i = 0; i < buf.length; ++i) {
			chars[3 * i] = HEX_CHARS[(buf[i] & 0xF0) >>> 4];
			chars[3 * i + 1] = HEX_CHARS[buf[i] & 0x0F];
			chars[3 * i + 2] = ' ';
		}
		return new String(chars).trim();
	}

	public static String asHex(byte b) {
		final char[] chars = new char[2];
		chars[0] = HEX_CHARS[(b & 0xF0) >>> 4];
		chars[1] = HEX_CHARS[b & 0x0F];
		return new String(chars);
	}

	public static byte crc(byte[] frame) {
		byte bChecksum = (byte) 0xFF;
		for (int i = 1; i < frame.length - 1; i++) {
			bChecksum ^= (frame[i] & 0xFF);
		}
		return bChecksum;
	}

}
