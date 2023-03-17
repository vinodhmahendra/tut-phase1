package abstraction;

public class Main {

	public static void main(String[] args) {
		Book myNovel = new Novel("To Kill a Mockingbird", "Harper Lee", 1960, "Southern Gothic");

		System.out.println("Title : " + myNovel.getTitle());
		System.out.println("Author : " +myNovel.getAuthor());
		System.out.println("Publication Year : " +myNovel.getPublicationYear());
		System.out.println("Genre: " +myNovel.getGenre());
	}

}
