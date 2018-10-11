package converterapp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class ConverterApp {

	public static void main(String args[]) {
		File input = FilesUI.getInputFile();
//		File output = FilesUI.getOutputFile();
		try {
			Reader reader = new FileReader(input);
//			Writer writer = new FileWriter(output);
			Writer writer = new ScreenWriter();
			Transformer transformer = new TABtoXMLTransformer();
			Converter converter = new Converter(reader, transformer, writer);
			converter.convert();
		} catch (FileNotFoundException e) {
			System.out.println("Fichero de origen o destino no encontrado. \n" + e.getMessage());
		}
	}
}
