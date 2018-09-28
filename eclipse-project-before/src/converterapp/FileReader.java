package converterapp;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader implements Reader {
	private Scanner scanner;

	public FileReader(String fileName) throws FileNotFoundException {
		scanner = new Scanner(fileName);
	}

	@Override
	public String read() {
		if (scanner.hasNextLine())
			return scanner.nextLine();
		return null;
	}

}
