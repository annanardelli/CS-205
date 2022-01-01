package edu.monmouth.hw6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;
import edu.monmouth.book.*;

public class HW6 {

	public static void main(String[] args) {
		if(args.length != HW6Constants.ARGSLENGTH) {
			System.err.println("Incorrect number of command line arguments.");
			System.exit(HW6Constants.ARGSERROR);
		}
		
		String log_file_name = HW6Constants.LOGFILENAME;
		
		PrintStream newIO;
		try {
			newIO = new PrintStream(log_file_name);
			System.setErr(newIO);
			System.setOut(newIO);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println("Can't find log file.");
			e.printStackTrace();
			System.exit(HW6Constants.LOGFILEERROR);
		}
		
		Set<Book> tree = new TreeSet<Book>();
		Set<Book> treePrice=new TreeSet<Book>(new BookPrice());
		String propsFile = args[HW6Constants.FILEOFFSET];
		
		File file = new File(propsFile);
		ArrayList<String> lines = new ArrayList<String>();
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String readLine = reader.readLine();
			while (readLine != null) {
				lines.add(readLine);
				readLine = reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println("IO Exception");
			e.printStackTrace();
			System.exit(HW6Constants.BOOKFILENOTFOUND);
		}
		
		for(String line: lines) {
			String[] params = new String[HW6Constants.NUMOFPARAMS];
			params = line.split(",");
			String title = params[HW6Constants.TITLE];
			BookTypes type = BookTypes.valueOf(params[HW6Constants.TYPE]);
			int numOfPages = Integer.parseInt(params[HW6Constants.NUMOFPAGES]);
			double price = Double.parseDouble(params[HW6Constants.PRICE]);
			try {
				Book newBook = new Book(title, type, numOfPages, price);
				treePrice.add(newBook);
				tree.add(newBook);
			} catch (BookException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
		System.out.println("Original Ordering:\n" +tree.toString());
		System.out.println("\ntreePrice:\n" + treePrice.toString());
		
}
}
