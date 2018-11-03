import java.util.ArrayList;
import java.util.List;

public class TrabajoSerie extends Trabajo {

	private List<Programa> trabajos;

	public TrabajoSerie() {
		trabajos = new ArrayList<>();
	}

	public TrabajoSerie(Programa a, Programa b) {
		trabajos = new ArrayList<>();
		trabajos.add(a);
		trabajos.add(b);
	}

	@Override
	public void run() {
		for (Programa programa : trabajos) {
			Thread t = new Thread(programa);
			t.start();
			try {
				t.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

	@Override
	public void addTrabajo(Programa p) {
		trabajos.add(p);
	}

}
