package src;

public class Trienio extends Complemento {

	private int salarioBase;

	public Trienio(Empleado empleado) {
		this.salarioBase = empleado.getSalario();
	}

	@Override
	public int getSalario() {
		return salarioBase + 10;
	}

}
