import java.util.ArrayList;
import java.util.List;

import App.Operation;

public class Division extends Operation {
	private List<String> parameterNames;

	public Division() {
		parameterNames = new ArrayList<>();
		parameterNames.add("Dividend");
		parameterNames.add("Divider");
	}

	@Override
	public String execute(List<String> parameters) {
		float dividend = Float.parseFloat(parameters.get(0));
		float divider = Float.parseFloat(parameters.get(1));

		return Float.toString(dividend / divider);
	}

	@Override
	public String getName() {
		return "Division";
	}

	@Override
	public List<String> getParameterNames() {
		return parameterNames;
	}

}
