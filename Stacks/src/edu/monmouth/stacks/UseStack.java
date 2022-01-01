package edu.monmouth.stacks;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Properties;
import java.util.Stack;

public class UseStack {

	public static void main(String[] args) {
		
		Properties properties = new Properties();
		
		if(args.length != StacksConstants.NUMBEROFARGUMENTS) {
			System.err.println("Supply name of property file");
			System.exit(StacksConstants.INCORRECTARGUMENTS);
		}
		String propertyFileName = args[StacksConstants.PROPERTYOFFSET];
		
		try {
			properties.load(new FileInputStream(propertyFileName));
		} catch (IOException e) {
			System.err.println("Cannot load file");
			e.printStackTrace();
			System.exit(StacksConstants.PROPERTYFILEFAILED);
		}
		
		properties.list(System.out);
		String minValue = properties.getProperty("minValue");
		
		if (minValue == null) {
			System.err.println("Cannot load minValue");
			System.exit(StacksConstants.MINVALUEFAILED);
		}
		
		System.out.println("minValue from props file: " + minValue);
		
		int minValueInt = 0;
		try {
			minValueInt = Integer.parseInt(minValue);
		} catch(NumberFormatException e) {
			System.err.println("Cannot make an int from " + minValue);
			e.printStackTrace();
			System.exit(StacksConstants.NOTANINT);
		}
		System.out.println("minValue as int: " + minValueInt);
		
		Deque<String> queue = new LinkedList<String>();
		queue.push("West Long Branch");
		queue.push("Ocean");
		queue.push("Long Branch");
		
		System.out.println(queue.pop());
		System.out.println(queue.size());
		System.out.println(queue.pop());
		
		System.out.println(queue.peek());
		System.out.println(queue.peek());
		
		System.out.println(queue.isEmpty());
		
		System.out.println(queue.remove());
	}

}
