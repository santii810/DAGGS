package Operations;
import java.util.List;

import App.Operation;
import Calculator.LicenseManager;

public class PayOperation extends Operation {

	private Operation operation;
	private LicenseManager license = new LicenseManager();

	public PayOperation(SquareRoot squareRoot) {
		this.operation = squareRoot;
	}

	@Override
	public String execute(List<String> parameters) {
		if (license.isFullVersion())
			return this.operation.execute(parameters);
		return "This operations need full version";
	}

	@Override
	public String getName() {
		return this.operation.getName();
	}

	@Override
	public List<String> getParameterNames() {
		return this.operation.getParameterNames();
	}

}
