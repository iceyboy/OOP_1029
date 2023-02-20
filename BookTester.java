package part02;

import java.util.ArrayList;

public class BookTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Book> data = new ArrayList<Book>();
		
		ArrayList<Book> dataNull = new ArrayList<Book>();
		
		dataNull = null;
		
		ArrayList<Book> dataEmpty = new ArrayList<Book>();

		Book book1 = new Book("The Hunger Games", "Suzanne Collins", "140713208", BookType.FICTION, 1,
				"First in the ground-breaking HUNGER GAMES trilogy", 8.90);
		
		Book book2 = new Book("Java, the Complete Reference", "Herbert Schildt", "126046341", BookType.REFERENCE, 12,
				"The definitive guide to Java programming", 32.20);
		
		System.out.println(book1);
		
		System.out.println(book2);

		data.add(book1);
		
		data.add(book2);

		displaySummary(data);
		
		displaySummary(dataNull);
		
		displaySummary(dataEmpty);
		

	}

	public static void displaySummary(ArrayList<Book> books) {

		if (books != null) {

			if (books.size() > 0) {

				for (int index = 0; index < books.size(); index++) {

					Book book = books.get(index);

					System.out.println(book.getTitle() + ": " + book.getSummary());

				}

			} else {

				System.out.println("No Books Available.");

			}

		} else {

			System.out.println("No Books Available.");

		}

	}

}
