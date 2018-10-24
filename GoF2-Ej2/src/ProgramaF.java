
public class ProgramaF extends Programa {

	@Override
	public void run() {
		System.out.println("[INICIO] Programa F");
		super.setChanged();
		super.notifyObservers("INICIO");
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
		}
		System.out.println("[FIN] Programa F");		
		super.setChanged();
		super.notifyObservers("FIN");
	}

}
