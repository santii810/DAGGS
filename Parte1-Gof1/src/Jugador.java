
import java.util.LinkedList;
import java.util.List;

public abstract class Jugador {

	protected List<Artillero> artilleros = new LinkedList<Artillero>();
	protected List<Zapador> zapadores = new LinkedList<Zapador>();
	protected String tipo;
	protected FactoriaSoldado factoria;

	public Jugador(String tipo) {
		this.tipo = tipo;

		// creamos el ejercito inicial (todos de la misma raza, no se pueden mezclar!)

		// [PUNTO DE REFACTORIZACION]
		if (tipo.equals("Harkonen")) {
			factoria = new FactoriaHarkonen();
		} else if (tipo.equals("Atreides")) {
			factoria = new FactoriaArtreides();
		}
		artilleros.add(factoria.crearArtillero());
		artilleros.add(factoria.crearArtillero());
		zapadores.add(factoria.crearZapador());
		zapadores.add(factoria.crearZapador());
	}

	public abstract void jugar();
}
