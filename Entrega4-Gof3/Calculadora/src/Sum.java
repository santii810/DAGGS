import java.util.ArrayList;
import java.util.List;

import App.Operation;

public class Sum extends Operation {

	private List<String> parameterNames;

	public Sum() {
		parameterNames = new ArrayList<String>();
		parameterNames.add("addingUpA");
		parameterNames.add("addingUpB");
	}

	@Override
	public String execute(List<String> parameters) {
		float result = 0;
		for (String string : parameters) {
			result += Float.parseFloat(string);
		}
		return Float.toString(result);
	}

	@Override
	public String getName() {
		return "Suma";
	}

	@Override
	public List<String> getParameterNames() {
		return parameterNames;
	}

}
