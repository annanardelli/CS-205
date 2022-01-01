package edu.monmouth.cardStack;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class StackMain {
	public static void main (String[] args) {
		
		Properties properties = new Properties();
		String propertyFileName = args[0];
		
		try {
			properties.load(new FileInputStream(propertyFileName));
		} catch (IOException e) {
			System.err.println("Cannot load file");
			e.printStackTrace();
			System.exit(-1);
		}
		
		String stackSize = properties.getProperty("STACKSIZE");
		int stackSizeInt = Integer.parseInt(stackSize);
		
		ArrayStack stack = new ArrayStack(stackSizeInt);
		System.out.println(stack);
	}
}
