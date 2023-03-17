package abstraction;

public class Novel extends Book {

	

	private String genre;

	//constructors are not inherited
	public Novel(String title, String author, int publicationYear, String genre) {
		super(title, author, publicationYear); //invoke a constructor in Book class
		this.genre = genre;
	}
	
	@Override
	public String getGenre() {
		return genre;
	}
	
}
