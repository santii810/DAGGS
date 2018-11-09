package App;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

import Logger.Logger;

public abstract class Application implements Observer {
	private List<Operation> operations;

	@Override
	public void update(Observable observable, Object arg) {
		Operation observado = (Operation) observable;
		try {
			Logger.getInstance().log(
					"Program " + observado.getName() + " is in " + observado.getProgress() + "% progress.",
					Logger.INFO);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public abstract List<Operation> createOperations();

	public void run() throws IOException {
		while (true) {

			operations = createOperations();
			int selectedOption = readMenuOption();

			if (selectedOption == operations.size()) {
				Logger.getInstance().log("Good Bye, Thanks.", Logger.INFO);
				System.exit(-1);
			}

			Logger.getInstance().log("Insert parameters in one line:", Logger.INFO);
			String toPrint = "";
			for (String parameterName : operations.get(selectedOption).getParameterNames()) {
				toPrint += parameterName + "\t";
			}
			Logger.getInstance().log(toPrint, Logger.INFO);

			String[] readedParameters = new BufferedReader(new InputStreamReader(System.in)).readLine().split(" ");
			if (readedParameters.length == operations.get(selectedOption).getParameterNames().size()) {
				Logger.getInstance()
						.log("The result of operation is: "
								+ operations.get(selectedOption).execute(Arrays.asList(readedParameters)) + "\n",
								Logger.INFO);
			} else {
				Logger.getInstance().log("Incorrect number of parameters", Logger.INFO);
			}
		}

	}

	private int readMenuOption() throws IOException, FileNotFoundException {
		int selectedOption = 0;
		boolean isValidNumber = false;
		String line;

		while (!isValidNumber) {
			// Show menu
			Logger.getInstance().log("Choose an operation: ", Logger.INFO);
			for (int i = 0; i < operations.size(); i++) {
				Logger.getInstance().log(i + ". " + operations.get(i).getName(), Logger.INFO);
			}
			Logger.getInstance().log(operations.size() + ". Salir", Logger.INFO);

			line = new BufferedReader(new InputStreamReader(System.in)).readLine();

			// Manage selected option
			try {
				selectedOption = Integer.parseInt(line);

				if (selectedOption > operations.size()) {
					Logger.getInstance().log("Incorrect number range", Logger.INFO);
				} else {
					isValidNumber = true;
				}
			} catch (NumberFormatException nfe) {
				Logger.getInstance().log("Incorrect format input", Logger.INFO);
			}
		}
		return selectedOption;
	}
}
