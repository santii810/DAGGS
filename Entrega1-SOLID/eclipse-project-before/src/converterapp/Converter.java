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
		writer.write(transformer.getHeader());
		while ((transformingText = reader.read()) != null) {
			writer.write(transformer.transform(transformingText));
		}
		writer.write(transformer.getFooter());
		writer.closeWriteWork();

	}
}
