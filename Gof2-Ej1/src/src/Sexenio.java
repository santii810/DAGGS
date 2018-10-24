package src;

public class Sexenio implements Empleado {
	private int salarioBase;

	public Sexenio(Empleado empleado) {
		this.salarioBase = empleado.getSalario();
	}

	@Override
	public int getSalario() {
		return salarioBase + 50;
	}

}