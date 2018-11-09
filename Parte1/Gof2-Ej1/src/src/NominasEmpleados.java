package src;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class NominasEmpleados {
	public static void main(String args[]) {
		try {
			Reader reader = new FileReader(new File("empleados.txt"));
			String line;

			while ((line = reader.read()) != null) {
				String[] data = line.split("\t");
				Empleado empleado = crearEmpledoBase(data);
				if (data[3].equals("SI"))
					empleado = new Gestion(empleado);
				
				int antiguedad = Integer.parseInt(data [2]);
				empleado = añadirTrienios(empleado, antiguedad);
				empleado = añadirQuinquenios(empleado, antiguedad);
				empleado = añadirSexsenios(empleado, antiguedad);

				System.out.print(data[0] + " ");
				System.out.println(empleado.getSalario() + "€");
			}

		} catch (FileNotFoundException e) {
			System.out.println("Error leyendo fichero");
			e.printStackTrace();
		}
	}

	private static Empleado añadirSexsenios(Empleado empleado, int antiguedad) {
		for (int i = 0; i < antiguedad / 6; i++) {
			empleado = new Sexenio(empleado);
		}
		return empleado;
	}

	private static Empleado añadirQuinquenios(Empleado empleado, int antiguedad) {
		for (int i = 0; i < antiguedad / 5; i++) {
			empleado = new Quinquenio(empleado);
		}
		return empleado;
	}

	private static Empleado añadirTrienios(Empleado empleado, int antiguedad) {
		for (int i = 0; i < antiguedad / 3; i++) {
			empleado = new Trienio(empleado);
		}
		return empleado;
	}

	private static Empleado crearEmpledoBase(String[] data) {
		Empleado toret = null;
		switch (data[1]) {
		case "A":
			toret = new EmpleadoA();
			break;
		case "B":
			toret = new EmpleadoB();
			break;
		case "C":
			toret = new EmpleadoC();
			break;

		default:
			break;
		}

		return toret;
	}

}
