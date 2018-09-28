package converterapp;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class FileWriter implements Writer {
	private PrintStream out;

	public FileWriter(String fileName) throws FileNotFoundException {
		out = new PrintStream(fileName);
	}

	@Override
	public void write(String toWrite) {
		out.print(toWrite);
	}

	public void closeWriting() {
		out.close();

	}
}
