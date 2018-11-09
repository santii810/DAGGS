package converterapp;

public interface Transformer {
	public String getHeader();

	public String getFooter();

	public String transform(String toTransform);
}
