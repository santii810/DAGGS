import java.util.ArrayList;
import java.util.List;

public class TrabajoParalelo extends Trabajo {

	private List<Programa> trabajos;

	public TrabajoParalelo() {
		trabajos = new ArrayList<>();
	}

	@Override
	public void run() {
		List<Thread> threads = new ArrayList<>();
		for (Programa programa : trabajos) {
			threads.add(new Thread(programa));
		}
		for (Thread t : threads) {
			t.start();
		}
		for (Thread t : threads) {
			try {
				t.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void addTrabajo(Programa p) {
		this.trabajos.add(p);
	}

}
