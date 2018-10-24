package src;

public class EmpleadoC implements Empleado {
	private int salarioBase = 900;

	@Override
	public int getSalario() {
		return salarioBase;
	}

}
