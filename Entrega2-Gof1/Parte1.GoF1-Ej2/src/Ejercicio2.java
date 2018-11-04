import java.io.File;
import java.io.FileNotFoundException;

import IO.FileReader;
import IO.FileWriter;

public class Ejercicio2 {
	private static String INPUT_FILE_NAME = "libros.txt";
	private static String OUTPUT_FILE_NAME = "libros.xml";

	public static void main(String[] args) {
		try {
			FileReader reader = new FileReader(new File(INPUT_FILE_NAME));
			FileWriter writer = new FileWriter(new File(OUTPUT_FILE_NAME));

			BibliotecaBuilder xmlLibrary = new XMLBibliotecaBuilder(writer);
			LibrosTransformer librosXML = new LibrosTransformer(reader, xmlLibrary);
			librosXML.parse();

			((XMLBibliotecaBuilder)xmlLibrary).write();
			
			
			// necesario para refrescar el fichero
			reader = new FileReader(new File(INPUT_FILE_NAME));
			BibliotecaBuilder memoryLibrary = new MemoriaBibliotecaBuilder();
			LibrosTransformer librosMemory = new LibrosTransformer(reader, memoryLibrary);
			librosMemory.parse();

			System.out.println(memoryLibrary.toString());

		} catch (FileNotFoundException e) {
			System.out.println("Error al cargar el fichero. " + e.getMessage());
		}
	}

}
