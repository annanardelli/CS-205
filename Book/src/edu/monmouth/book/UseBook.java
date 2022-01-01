package edu.monmouth.book;

public class UseBook {

	public static void main(String[] args) {
		Book b1 = null;
		Book b2 = null;
		try {
			b1 = new Book("Lord of the Flies", BookTypes.HARDBACK, 90, 8.99);
			System.out.println(b1);
			b2 = new Book(null, BookTypes.SOFTBACK, 287, 15.40);
			System.out.println(b2);
		} catch(BookException e) {
			System.err.println(e.getMessage());
		}
		try {
			b1.setNumberOfPages(-9);
		} catch(BookException e) {
			System.err.println(e.getMessage());
		}
	}
}
