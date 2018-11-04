import java.io.FileNotFoundException;

import IO.FileReader;
import model.Autor;

public class LibrosTransformer {
	private FileReader reader;
	private BibliotecaBuilder builder;

	LibrosTransformer(FileReader reader, BibliotecaBuilder builder) throws FileNotFoundException {
		this.reader =reader;
		this.builder = builder;
	}

	public void parse() {
		String line;
		while ((line = this.reader.read()) != null) {
			String[] attbs = line.split("\t");
			if (attbs.length != 3) {
				throw new IllegalArgumentException("Incorrect number os arguments");
			}

			builder.addLibro(attbs[0], attbs[1], attbs[2]);
		}
	}
}
