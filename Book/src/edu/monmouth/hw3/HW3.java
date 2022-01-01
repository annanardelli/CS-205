package edu.monmouth.hw3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import edu.monmouth.book.Book;
import edu.monmouth.book.BookException;
import edu.monmouth.book.BookTypes;

public class HW3 {
	public static void main (String[] args) {
		try {
			PrintStream newIO = new PrintStream(HW3Constants.OUTFILE);
			System.setOut(newIO);
			System.setErr(newIO);
			} catch (FileNotFoundException e) {
				System.err.println("Cannot redirect STDERR or STDOUT ");
				e.printStackTrace();
				System.exit(HW3Constants.BOOKFAILURE);
			}
		
		List<String> arrayList = new ArrayList<String>();
		List<String> linkedList = new LinkedList<String>();
		
		File stringFile = new File(HW3Constants.STRINGFILENAME);
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader(stringFile));
			String readerLine = reader.readLine();
			while(readerLine != null) {
				arrayList.add(readerLine);
				linkedList.add(readerLine);
				readerLine = reader.readLine();
			}
			reader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.err.println("Can't find file");
			System.exit(HW3Constants.FILENOTFOUNDERROR);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.err.println("Can't read file");
			System.exit(HW3Constants.FILEREADERROR);
		}
		
		List<Book> bookArrayList = new ArrayList<Book>();
		List<Book> bookLinkedList = new LinkedList<Book>();
		
		File bookFile = new File(HW3Constants.BOOKFILENAME);
		List<String> lines = new ArrayList<String>();
		
		try {
			BufferedReader reader2 = new BufferedReader(new FileReader(bookFile));
			String readLine = reader2.readLine();
			while (readLine != null) {
				lines.add(readLine);
				readLine = reader2.readLine();
			}
			reader2.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.err.println("Can't find file");
			System.exit(HW3Constants.FILENOTFOUNDERROR);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.err.println("Can't read file");
			System.exit(HW3Constants.FILEREADERROR);
		}
		
		for(String line: lines) {
			String[] params = new String[HW3Constants.NUMOFPARAMS];
			params = line.split(",");
			BookTypes type = BookTypes.valueOf(params[HW3Constants.TYPE]);
			int numOfPages = Integer.parseInt(params[HW3Constants.NUMOFPAGES]);
			double price = Double.parseDouble(params[HW3Constants.PRICE]);
			try {
				Book newBook = new Book(params[HW3Constants.TITLE], type,
						numOfPages, price);
				bookArrayList.add(newBook);
				bookLinkedList.add(newBook);
			} catch (BookException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.err.println("Cannot add book. One or more parameters is invalid.");
			}
		}
		
		System.out.println("\nArrayList Methods:");
		System.out.println("isEmpty: " + bookArrayList.isEmpty());
		System.out.println("Removing second book from list: " + bookArrayList.remove(1));
		System.out.println("Size of string arrayList: " + arrayList.size());
		String newString = "CS 205";
		System.out.println("Adding string to arrayList: " + newString + ": " + arrayList.add(newString));
		System.out.println("Iterating through bookArrayList:");
		Iterator<Book> bookIterator = bookArrayList.iterator();
		while(bookIterator.hasNext()) {
			System.out.println(bookIterator.next());
		}
		System.out.println("Iterating through bookArrayList backwards: ");
		ListIterator<Book> listBookIterator = bookArrayList.listIterator(bookArrayList.size());
		while(listBookIterator.hasPrevious()) {
			System.out.println(listBookIterator.previous());
		}
		
		System.out.println("\nLinked List Methods:");
		String linkedString = "Howard Hall";
		System.out.println("Adding string to linkedList: " + linkedString + ": " + linkedList.add(linkedString));
		System.out.println("Iterating through bookLinkedList backwards:");
		ListIterator<Book> linkedListIterator = bookLinkedList.listIterator(bookLinkedList.size());
		while(linkedListIterator.hasPrevious()) {
			System.out.println(linkedListIterator.previous());
		}
		System.out.println("Iterating through linkedList:");
		Iterator<String> stringIterator = linkedList.iterator();
		while(stringIterator.hasNext()) {
			System.out.println(stringIterator.next());
		}
	}

}
