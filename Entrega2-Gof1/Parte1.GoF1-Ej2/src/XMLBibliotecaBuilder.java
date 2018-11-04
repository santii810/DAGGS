import java.util.ArrayList;
import java.util.List;

import IO.FileWriter;
import model.Autor;
import model.Biblioteca;
import model.Libro;

public class XMLBibliotecaBuilder implements BibliotecaBuilder {

	private List<String> library;
	private FileWriter writer;

	public XMLBibliotecaBuilder(FileWriter writer) {
		this.library = new ArrayList<>();
		this.writer = writer;
	}

	@Override
	public void addLibro(String titulo, String autor, String isbn) {
		this.library.add(new Libro(titulo, isbn, new Autor(autor)).toXML());
	}

	public void write() {
		for (String string : library) {
			this.writer.write(string);
		}
		this.writer.closeWriteWork();
	}

}
