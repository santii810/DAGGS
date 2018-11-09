package model;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
	private List<Libro> libros;

	public Biblioteca() {
		this.libros = new ArrayList<>();
	}

	public List<Libro> getLibros() {
		return libros;
	}

	public void addLibro(Libro libro) {
		libros.add(libro);
	}

	@Override
	public String toString() {
		StringBuilder toret = new StringBuilder();
		for (Libro libro : libros) {
			toret.append(libro);
			toret.append("\n");
		}
		return toret.toString();
	}

}
