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

		return Double.toString(Math.sqrt(Float.parseFloat(parameters.get(0))));
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
