package edu.monmouth.lab2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Properties;
import java.util.Stack;

public class Lab2Assignment {
	
	public static void reverse(String[] arrayToReverse) {
		// using a Stack reverse the elements in the array
		Stack<String> stack = new Stack<String>();
		for (String string: arrayToReverse) {
			stack.push(string);
		}
		for (int i = 0; i < arrayToReverse.length; i++) {
				arrayToReverse[i] = stack.pop();
			}
		}
	
	public static void main(String args[]) {
		// verify only 1 command line argument is present
		Properties properties = new Properties();
		
		if(args.length != Lab2AssignmentConstants.REQUIRED_PARAMETERS) {
			System.err.println("Supply name of property file");
			System.exit(Lab2AssignmentConstants.INCORRECTPARAMS);
		}
		
		// load properties file name from command line argument
		String propertyFileName = args[Lab2AssignmentConstants.PROPERTYOFFSET];
		
		// open property file
		try {
			properties.load(new FileInputStream(propertyFileName));
		} catch (IOException e) {
			System.err.println("Cannot load file");
			e.printStackTrace();
			System.exit(Lab2AssignmentConstants.PROPERTYFILEFAILED);
		}
		
		// get value for log_file_name property
		
		String logFileName = properties.getProperty(Lab2AssignmentConstants.LOGFILENAME);
		
		//redirect stderr & stdout
		
		try {
			PrintStream newIO = new PrintStream(logFileName);
			System.setOut(newIO);
			System.setErr(newIO);
			} catch (FileNotFoundException e) {
				System.err.println("Cannot redirect STDERR or STDOUT ");
				e.printStackTrace();
				System.exit(Lab2AssignmentConstants.REDIRECTFAILURE);
			}
		properties.list(System.out);
		// obtain the value for the languages property
		
		String language = properties.getProperty("log_file_name");
		
		String languages[] = null;
		// split the languages property value on comma and populate languages array
		languages = language.split("-");
		// print out the number of elements in the array and the language names
		System.out.println("\nArray Length: " + languages.length);
		System.out.println(Arrays.toString(languages));
		// invoke the reverse method to reverse the order of Strings
		reverse(languages);
		// print out the array of languages names-needs to be reverse
		System.out.println(Arrays.toString(languages));
		
	}

}
