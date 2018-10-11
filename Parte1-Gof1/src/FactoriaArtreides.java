
public class FactoriaArtreides implements FactoriaSoldado {
	@Override
	public Zapador crearZapador() {
		return new ZapadorAtreides();
	}

	@Override
	public Artillero crearArtillero() {
		return new ArtilleroAtreides();
	}
}
