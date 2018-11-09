package src;

public class EmpleadoA implements Empleado {
	private int salarioBase = 1300;

	@Override
	public int getSalario() {
		return salarioBase;
	}

}
