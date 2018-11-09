package model;

public class Autor {
	private String nombre;

	public Autor(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public String toString() {
		return nombre;
	}

}
