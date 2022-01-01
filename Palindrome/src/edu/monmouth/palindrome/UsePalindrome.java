package edu.monmouth.palindrome;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;
import java.util.Stack;

public class UsePalindrome {

	public static void main (String[] args) {
		Properties properties = new Properties();
		if(args.length != 1) {
			System.err.println("Incorrect number of command line arguments:" + args.length);
			System.exit(PalindromeConstants.INCORRECTNUMOFARGS);
		}
		
		String propertyFileName = args[PalindromeConstants.PROPERTIESOFFSET];
		
		try {
			properties.load(new FileInputStream(propertyFileName));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println("Cannot load properties file");
			e.printStackTrace();
			System.exit(PalindromeConstants.PROPERTIESFAILURE);
		}
		
		String logFileName = properties.getProperty(PalindromeConstants.LOGFILENAME);
		
		try {
			PrintStream newIO = new PrintStream(logFileName);
			System.setErr(newIO);
			System.setOut(newIO);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println("Cannot find log file");
			e.printStackTrace();
			System.exit(PalindromeConstants.OUTPUTREDIRECTERROR);
		}
		
		String words = properties.getProperty("words");
		String wordsArray[] = null;
		
		wordsArray = words.split(",");
		
		for(String word : wordsArray) {
			Palindrome newWord = new Palindrome(word);
			System.out.println(newWord.toString() + " is a palindrome: " + newWord.isPalindrome());
		}
		
	}
}
