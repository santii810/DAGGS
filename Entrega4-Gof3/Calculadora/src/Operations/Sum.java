package Operations;

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
		this.setProgress(0);
		for (String string : parameters) {
			result += Float.parseFloat(string);
			this.setProgress(this.getProgress() + 100 / parameters.size());
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
