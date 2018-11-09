package Operations;

import java.util.ArrayList;
import java.util.List;

import App.Operation;

public class SquareRoot extends Operation {
	private List<String> parameterNames;

	public SquareRoot() {
		parameterNames = new ArrayList<>();
		parameterNames.add("Number");
	}

	@Override
	public String execute(List<String> parameters) {
		// TODO preguntar porque no hace update
		this.setProgress(0);
		String strNumber = parameters.get(0);
		this.setProgress(5);
		float num = Float.parseFloat(strNumber);
		this.setProgress(15);
		double result = Math.sqrt(num);
		this.setProgress(90);
		String toret = Double.toString(result);
		this.setProgress(100);
		return toret;
	}

	@Override
	public String getName() {
		return "SquareRoot";
	}

	@Override
	public List<String> getParameterNames() {
		return parameterNames;
	}

}
