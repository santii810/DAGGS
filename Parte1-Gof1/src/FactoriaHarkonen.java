
public class FactoriaHarkonen implements FactoriaSoldado {

	@Override
	public Artillero crearArtillero() {
		return new ArtilleroHarkonen();
	}

	@Override
	public Zapador crearZapador() {
		return new ZapadorHarkonen();
	}

}
