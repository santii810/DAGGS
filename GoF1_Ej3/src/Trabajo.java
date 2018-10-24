public abstract class Trabajo extends Programa implements Runnable {

	@Override
	public abstract void run();

	public abstract void addTrabajo(Programa p);

}
