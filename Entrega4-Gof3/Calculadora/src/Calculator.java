import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import App.Application;
import App.Operation;

public class Calculator extends Application {

	@Override
	public List<Operation> createOperations() {
		List<Operation> toret = new ArrayList<>();

		Operation sum = new Sum();
		Operation division = new Division();
		Operation protectedSR = new ProtectedOperation(new SquareRoot());

		sum.addObserver(this);
		division.addObserver(this);
		protectedSR.addObserver(this);

		toret.add(sum);
		toret.add(division);
		toret.add(protectedSR);
		
		return toret;
	}

	public static void main(String args[]) {
		try {
			new Calculator().run();
		} catch (IOException e) {
			// TODO preguntar donde deberia controlar esta execepcion
			System.out.println("Error writting log file");
			e.printStackTrace();
		}
	}

}
