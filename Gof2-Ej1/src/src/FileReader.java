package src;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader implements Reader {
	private Scanner scanner;

	public FileReader(File input) throws FileNotFoundException {
		scanner = new Scanner(input);
	}

	@Override
	public String read() {
		if (scanner.hasNextLine())
			return scanner.nextLine();
		return null;
	}

}
