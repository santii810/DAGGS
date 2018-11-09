package src;

public class Quinquenio implements Empleado {

	private int salarioBase;

	public Quinquenio(Empleado empleado) {
		this.salarioBase = empleado.getSalario();
	}

	@Override
	public int getSalario() {
		return salarioBase + 20;
	}

}

