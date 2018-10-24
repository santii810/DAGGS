package src;

public class Gestion extends Complemento {
	private int salarioBase;

	public Gestion(Empleado empleado) {
		this.salarioBase = empleado.getSalario();
	}

	@Override
	public int getSalario() {
		return salarioBase + 15;
	}

}
