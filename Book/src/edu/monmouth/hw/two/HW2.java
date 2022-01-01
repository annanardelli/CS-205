package edu.monmouth.hw.two;

import java.io.FileNotFoundException;
import java.io.PrintStream;

import edu.monmouth.book.*;

public class HW2 {

	public static void main(String[] args) {
		try {
			PrintStream newIO = new PrintStream(HW2Constants.OUTFILE);
			System.setOut(newIO);
			System.setErr(newIO);
			} catch (FileNotFoundException e) {
				System.err.println("Cannot redirect STDERR or STDOUT ");
				e.printStackTrace();
				System.exit(HW2Constants.BOOKFAILURE);
			}
		
		ListNode list = new ListNode();
		
		Book book1 = null;
		Book book2 = null;
		Book book3 = null;
		Book book4 = null;
		
		try {
			book1 = new Book("To Kill a Mockingbird", BookTypes.HARDBACK, 88, 25.75);
			book2 = new Book("For Whom the Bell Tolls", BookTypes.SOFTBACK, 129, 15);
			book3 = new Book("Undaunted Courage", BookTypes.HARDBACK, 239, 32.50);
			book4 = new Book("Goodnight Moon", BookTypes.HARDBACK, 12, 12.50);
		} catch(BookException e) {
			System.err.println("Cannot create all books");
			System.exit(HW2Constants.BOOKFAILURE);
		}
		
		
		list.insert(book1);
		list.insert(book2);
		list.insert(book3);

		System.out.println("First: " + list.first());
		System.out.println("Removed first: " + list.removeFirst());
		System.out.println("Last: " + list.last());
		System.out.println("Entire list: \n" + list);
		
		System.out.println("After inserting 3 books: \n" + list);
		
		 list.insertEnd(book4);
		 
		System.out.println("After adding fourth book: \n" + list);
		
		System.out.println("First: " + list.first());
		System.out.println("Last: " + list.last());

		System.out.println("Removed first: " + list.removeFirst());
		System.out.println("Entire list: \n" + list);
		
	}
	
}