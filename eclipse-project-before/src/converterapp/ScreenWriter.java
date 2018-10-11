package converterapp;

public class ScreenWriter implements Writer {

	@Override
	public void write(String toWrite) {
		System.out.println(toWrite);
	}

	@Override
	public void closeWriteWork() {
		// Not necessary
	}

}
