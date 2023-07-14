package zwave;

public class Receiver implements Runnable {

	private final ZWaveSerialAPI api;
	private State state = State.IDLE_STATE;
	private boolean interrupted;
	private final String name;

	enum State {
		IDLE_STATE, LEN_STATE, DATA_STATE, CHECKSUM_STATE,
	}

	public Receiver(ZWaveSerialAPI api, String name) {
		this.api = api;
		this.name = name;
	}

	@Override
	public void run() {
		if (this.interrupted) {
			return;
		}

		this.state = State.IDLE_STATE;
		final byte[] buffer = new byte[1024];
		int byteReceived;
		byte[] data = new byte[0];
		int counter = 0;

		while (!this.isInterrupted()) {

			byteReceived = api.readBytes(buffer, 1);
			if (byteReceived == 0) {
				// TimeOut
				state = State.IDLE_STATE;
				if (this.isInterrupted()) {
					break;
				}
			} else {
				byte b = buffer[0];
				if (state == State.IDLE_STATE) {
					if (b == ZWaveAPIConstants.SOF) {
						state = State.LEN_STATE;
					}
				} else if (state == State.LEN_STATE) {
					counter = b;
					if (counter < 0) {
						state = State.IDLE_STATE;
					} else {
						state = State.DATA_STATE;
						data = new byte[counter + 2];
						data[0] = ZWaveAPIConstants.SOF;
						data[1] = b;

					}

				} else if (state == State.DATA_STATE) {
					if (counter > 2) {
						final int index = data.length - counter;
						data[index] = b;
						counter--;
					} else {
						final int index = data.length - counter;
						data[index] = b;
						state = State.CHECKSUM_STATE;
					}

				} else if (state == State.CHECKSUM_STATE) {
					data[data.length - 1] = b;
					byte crc = Utilities.crc(data);
					if (crc != b) {
						System.err.println("Receiver Thread : BAD CRC : " + Utilities.asHex(data) + " computed:"
								+ String.format("0x%02X", crc) + " read:" + String.format("0x%02X", b));

						api.log("<< DATA BAD CRC" + new SerialAPIMessage(data).getCommandName() + " "
								+ Utilities.asHexWithSpace(data));

						// Bad CRC
						api.sendNAK();

					} else {
						api.log("<< DATA " + new SerialAPIMessage(data).getSummary());
						api.sendACK();
						api.addMessage(new SerialAPIMessage(data));

					}
					data = null;
					state = State.IDLE_STATE;

				}
			}

		}
	}

	private synchronized boolean isInterrupted() {
		return this.interrupted;
	}

	public synchronized void interrupt() {
		this.interrupted = true;
	}

	public State getState() {
		return this.state;
	}

	@Override
	public String toString() {
		return super.toString() + " [" + name + "] state: " + this.state + " interrupted:" + this.interrupted;
	}

}
