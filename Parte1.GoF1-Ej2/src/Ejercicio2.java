import java.io.File;
import java.io.FileNotFoundException;

public class Ejercicio2 {
	private static String INPUT_FILE_NAME = "libros.txt";
	private static String OUTPUT_FILE_NAME = "libros.xml";

	public static void main(String[] args) {
		try {
			FileReader reader = new FileReader(new File(INPUT_FILE_NAME));
			Writer writer = new FileWriter(OUTPUT_FILE_NAME);
			

		} catch (FileNotFoundException e) {
			System.out.println("Error al cargar el fichero. " + e.getMessage());
		}
	}

}
