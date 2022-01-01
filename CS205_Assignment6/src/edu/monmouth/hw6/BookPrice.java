package edu.monmouth.hw6;
import java.util.Comparator;

import edu.monmouth.book.*;

public class BookPrice implements Comparator<Book> {

	public int compare(Book b1, Book b2) {
		final int EQUALS = 0;
		final int LESSTHAN = -1;
		final int GREATERTHAN = 1;
		
		if (b1.getPrice() == (b2.getPrice())) {
			return EQUALS;
		}
		if (b1.getPrice() < (b2.getPrice())) {
			return LESSTHAN;
		}
		if (b1.getPrice() > (b2.getPrice())) {
			return GREATERTHAN;
		}
		return EQUALS;
	}
}
