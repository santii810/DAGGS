
public class Cliente {

	public static void main(String[] args) {

		Programa a = new ProgramaA();
		Programa b = new ProgramaB();
		Programa c = new ProgramaC();
		Programa d = new ProgramaD();
		Programa e = new ProgramaE();
		Programa f = new ProgramaF();
		

		TrabajoSerie d_f = new TrabajoSerie(d, f);
		TrabajoParalelo b_c_d_f = new TrabajoParalelo();
		b_c_d_f.addTrabajo(b);
		b_c_d_f.addTrabajo(c);
		b_c_d_f.addTrabajo(d_f);
		Notifyer notifyer = new Notifyer(a,b,c,d,e,f);
		
		TrabajoSerie fin = new TrabajoSerie();
		fin.addTrabajo(a);
		fin.addTrabajo(b_c_d_f);
		fin.addTrabajo(e);

		fin.run();

	}

}
