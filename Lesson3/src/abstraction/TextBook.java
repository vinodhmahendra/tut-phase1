package abstraction;

public class TextBook extends Book{

	private String subject;
	
	public TextBook(String title, String author, int publicationYear, String subject) {
		super(title, author, publicationYear);
		this.subject = subject;
	}

	@Override
	public String getGenre() {
		return "Textbook";
	}
}
