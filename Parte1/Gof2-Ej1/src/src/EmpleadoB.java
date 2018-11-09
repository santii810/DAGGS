package src;

public class EmpleadoB implements Empleado {
	private int salarioBase = 1100;

	@Override
	public int getSalario() {
		return salarioBase;
	}
}
