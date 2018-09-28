package converterapp;

public class Converter {
	private Reader reader;
	private Transformer transformer;
	private Writer writer;

	public Converter(Reader reader, Transformer transformer, Writer writer) {
		this.reader = reader;
		this.transformer = transformer;
		this.writer = writer;
	}

	public void convert() {
		String transformingText;
		while ((transformingText = reader.read()) != null) {
			transformingText = transformer.transform(transformingText);
			writer.write(transformingText);
		}
		

	}
}
