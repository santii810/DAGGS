import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {
	private Scanner scanner;

	public FileReader(File input) throws FileNotFoundException {
		scanner = new Scanner(input);
	}

	public String read() {
		if (scanner.hasNextLine())
			return scanner.nextLine();
		return null;
	}
}
