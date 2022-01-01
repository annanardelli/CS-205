package edu.monmouth.book;

public class Book implements Comparable<Book>{
	private int numberOfPages;
	private BookTypes bookType;
	private String title;
	private double price;
	
	public Book (String title, BookTypes bookType, int numberOfPages, double price) throws BookException {
		setTitle(title);
		setBookType(bookType);
		setNumberOfPages(numberOfPages);
		setPrice(price);
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) throws BookException {
		if(numberOfPages < 1) {
			throw new BookException("Invalid page count: " + numberOfPages);
		}
		else {
			this.numberOfPages = numberOfPages;
		}
	}

	public BookTypes getBookType() {
		return bookType;
	}

	public void setBookType(BookTypes bookType) {
		this.bookType = bookType;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) throws BookException {
		if(title == null || title.length() < BookConstants.MINTITLELEN) {
			throw new BookException("Invalid Title");
		}
		else {
			this.title = title;
		}
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) throws BookException {
		if(price < 0) {
			throw new BookException("Invalid Price: " + price);
		}
		else {
			this.price = price;
		}
	}

	@Override
	public String toString() {
		return "Book [numberOfPages=" + numberOfPages + ", bookType=" + bookType + ", title=" + title + ", price="
				+ price + "]";
	}
	
	@Override
	public int compareTo(Book otherBook) {
	final int BEFORE = -1; final int EQUAL = 0; final int AFTER = 1;
	if (this == otherBook) {
	            return EQUAL;
	      }
	System.out.println("In Book's compareTo");
	if (this.numberOfPages < otherBook.numberOfPages) {
	            return BEFORE;
	      }
	if (this.numberOfPages > otherBook.numberOfPages) { return AFTER;
	}
	if (this.price < otherBook.price) {
	            return BEFORE;
	      }
	if (this.price > otherBook.price) {
	            return AFTER;
	      }
	return this.title.compareTo(otherBook.title);
	}
	
}
