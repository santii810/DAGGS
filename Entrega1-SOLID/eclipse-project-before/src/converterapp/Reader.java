package converterapp;

public interface Reader {
	/**
	 * Read from origin
	 * @return One line or null if the origin has finished
	 */
	public String read();
}
