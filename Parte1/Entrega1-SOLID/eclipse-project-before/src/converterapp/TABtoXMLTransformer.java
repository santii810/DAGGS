package converterapp;

public class TABtoXMLTransformer implements Transformer {
	private static final String PRODUCTS_OPEN_TAG = "<products>";
	private static final String PRODUCTS_CLOSE_TAG = "</products>";
	private static final String PRODUCT_OPEN_TAG = "<product>";
	private static final String PRODUCT_CLOASE_TAG = "</product>";
	private static final String NAME_OPEN_TAG = "<name>";
	private static final String NAME_CLOSE_TAG = "</name>";
	private static final String PRICE_OPEN_TAG = "<price>";
	private static final String PRICE_CLOSE_TAG = "</price>";

	@Override
	public String getHeader() {
		
		return PRODUCTS_OPEN_TAG;
	}

	@Override
	public String getFooter() {
		return PRODUCTS_CLOSE_TAG;
	}

	@Override
	public String transform(String toTransform) {
		String[] elements = toTransform.split("\t");
		StringBuilder toret = new StringBuilder(PRODUCT_OPEN_TAG);
		toret.append(NAME_OPEN_TAG);
		toret.append(elements[0]);
		toret.append(NAME_CLOSE_TAG);
		toret.append(PRICE_OPEN_TAG);
		toret.append(elements[1]);
		toret.append(PRICE_CLOSE_TAG);
		toret.append(PRODUCT_CLOASE_TAG);
		return toret.toString();
	}

}
