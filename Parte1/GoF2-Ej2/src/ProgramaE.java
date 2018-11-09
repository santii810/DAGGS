
public class ProgramaE extends Programa {

	@Override
	public void run() {
		System.out.println("[INICIO] Programa E");
		super.setChanged();
		super.notifyObservers("INICIO");
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
		}
		System.out.println("[FIN] Programa E");		
		super.setChanged();
		super.notifyObservers("FIN");
	}

}
