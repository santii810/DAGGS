package Operations;

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
		float progressIncrement = Math.round(100 / (dividend / divider));
		int cocient = 0;
		this.setProgress(0);
		while (dividend > divider) {
			dividend -= divider;
			cocient++;
			this.setProgress(this.getProgress() + progressIncrement);
		}
		this.setProgress(100);
		return Integer.toString(cocient);
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
