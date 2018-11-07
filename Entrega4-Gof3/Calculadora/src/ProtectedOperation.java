import java.util.List;

import App.Operation;

public class ProtectedOperation extends Operation {

	private Operation operation;

	public ProtectedOperation(SquareRoot squareRoot) {
		this.operation = squareRoot;
	}

	@Override
	public String execute(List<String> parameters) {
		return this.operation.execute(parameters);
	}

	@Override
	public String getName() {
		return this.operation.getName();
	}

	@Override
	public List<String> getParameterNames() {
		// TODO preguntar si se redirige el metodo de esta forma
		return this.operation.getParameterNames();
	}

}
