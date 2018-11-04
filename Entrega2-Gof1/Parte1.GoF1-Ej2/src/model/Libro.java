package model;

public class Libro {
	private String isbn;
	private Autor autor;
	private String titulo;

	public Libro(String titulo, String isbn, Autor autor) {
		this.titulo = titulo;
		this.isbn = isbn;
		this.autor = autor;
	}

	public String getIsbn() {
		return isbn;
	}

	public Autor getAutor() {
		return autor;
	}

	public String getTitulo() {
		return titulo;
	}

	@Override
	public String toString() {
		return "Libro [isbn=" + isbn + ", autor=" + autor + ", titulo=" + titulo + "]";
	}

	public String toXML() {
		return "<libro><author>" + this.autor.toString() + "</author><isbn>" + this.isbn + "</isbn><titulo>"
				+ this.titulo + "</titulo></libro>";
	}

}
