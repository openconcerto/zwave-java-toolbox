package zwave;

public class Capabilites {
	int applicationVerion;
	int applicationRevision;

	public Capabilites(SerialAPIMessage m) {
		applicationVerion = m.getByte(4);
		applicationRevision = m.getByte(5);
	}

	public String getFirmwareVersion() {
		return applicationVerion + "." + applicationRevision;
	}

}
