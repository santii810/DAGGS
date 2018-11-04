import model.Autor;
import model.Biblioteca;
import model.Libro;

public class MemoriaBibliotecaBuilder implements BibliotecaBuilder {
	private Biblioteca library;

	public MemoriaBibliotecaBuilder() {
		this.library = new Biblioteca();
	}

	@Override
	public void addLibro(String titulo, String autor, String isbn) {
		this.library.addLibro(new Libro(titulo, isbn, new Autor(autor)));
	}

	@Override
	public String toString() {
		return library.toString();
	}
	
	
}
