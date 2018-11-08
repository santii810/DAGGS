package Logger;

import java.io.File;
import java.io.FileNotFoundException;

public abstract class Logger {
	public static final int DEBUG = 0;
	public static final int INFO = 1;
	public static final int ERROR = 2;
	private static final String DEFAULT_LOG_FILE = "output.log";

	private static Logger singleton;
	private Logger next;
	private int threshold;

	public Logger(Logger next, int threshold) {
		this.threshold = threshold;
		this.next = next;
	}

	public static Logger getInstance() throws FileNotFoundException {
		if (singleton == null) {
			// TODO cuando hago un DEBUG y cuando un ERROR?
			singleton = new ConsoleLogger(new FileLogger(null, DEBUG, new File(DEFAULT_LOG_FILE)), INFO);
//			singleton = new ConsoleLogger(new FileLogger(new FileLogger(null, ERROR, new File(DEFAULT_LOG_FILE)), DEBUG,
//					new File(DEFAULT_LOG_FILE)), INFO);
		}

		return singleton;
	}

	public void log(String message, int priority) {
		if (priority >= this.threshold) {
			_log(message, priority);
		}
		if (this.next != null) {
			this.next.log(message, priority);
		}
	}

	protected abstract void _log(String message, int priority);

}
