package converterapp;

import java.io.File;

public class FilesUI {
	private String origin;
	private String destination;

	public FilesUI(String origin, String destination) {
		this.origin = origin;
		this.destination = destination;
	}

	public File getOriginFile() {
		return new File(origin);
	}

	public File getDestinationFile() {
		return new File(destination);
	}
}
