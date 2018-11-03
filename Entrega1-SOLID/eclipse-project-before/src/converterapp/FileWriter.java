package converterapp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class FileWriter implements Writer {
	private PrintStream out;

	public FileWriter(File output) throws FileNotFoundException {
		out = new PrintStream(output);
	}

	@Override
	public void write(String toWrite) {
		out.print(toWrite);
	}

	@Override
	public void closeWriteWork() {
		out.close();
	}
}
