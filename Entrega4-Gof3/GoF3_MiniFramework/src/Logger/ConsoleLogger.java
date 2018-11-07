package Logger;

public class ConsoleLogger extends Logger {

	public ConsoleLogger(FileLogger next, int threshold) {
		super(next, threshold);
	}

	@Override
	protected void _log(String message, int priority) {
		System.out.println(message);
	}

}
