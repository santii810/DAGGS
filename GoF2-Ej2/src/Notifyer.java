import java.util.Observable;
import java.util.Observer;

public class Notifyer implements Observer {
	private int activeThreads = 0;

	public Notifyer(Programa a, Programa b, Programa c, Programa d, Programa e, Programa f) {
		a.addObserver(this);
		b.addObserver(this);
		c.addObserver(this);
		d.addObserver(this);
		e.addObserver(this);
		f.addObserver(this);
	}

	@Override
	public void update(Observable arg0, Object arg1) {

		if (((String) arg1).equals("INICIO"))
			activeThreads++;
		else {
			activeThreads--;
		}
		System.out.println("\tActive threads: " + activeThreads);
	}
}
