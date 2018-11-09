package Logger;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class FileLogger extends Logger {

	private PrintStream printStream;

	public FileLogger(Logger next, int threshold, File file) throws FileNotFoundException {
		super(next, threshold);
		this.printStream = new PrintStream(new FileOutputStream(file));
	}

	@Override
	protected void _log(String message, int priority) {
		this.printStream.print(message);
	}

}
