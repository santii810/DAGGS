package IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class FileWriter {
	private PrintStream out;

	public FileWriter(File output) throws FileNotFoundException {
		out = new PrintStream(output);
	}

	public void write(String toWrite) {
		out.print(toWrite);
	}

	public void closeWriteWork() {
		out.close();
	}
}
