package edu.monmouth.trees;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;

public class TreeApp {
	   public static void main(String[] args) {
	       // verify there is 1 and only 1 command line argument
	       if(args.length != TreesConstants.NUMOFARGS) {
	    	   System.err.println("Incorrect number of command line arguments.");
	    	   System.exit(TreesConstants.INCORRECTARGS);
	       }
	       
	       // load the properties file using command line argument
	       String propertyFileName = args[TreesConstants.PROPERTYOFFSET];
	       Properties properties = new Properties();
	       
	       try {
			properties.load(new FileInputStream(propertyFileName));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.err.println("Cannot find properties file.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.err.println("IO error.");
		}
	       
	       // list all properties to System.out
	       properties.list(System.out);
	       
	       // obtain the value of log_file_name property
	       String logFileName = properties.getProperty(TreesConstants.LOGFILENAME);
	       
	       // redirect stdout & stderr to the value of log_file_name
	       try {
			PrintStream newIO = new PrintStream(logFileName);
			System.setErr(newIO);
			System.setOut(newIO);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println("Cannot find log file.");
			e.printStackTrace();
			System.exit(TreesConstants.LOGFAILURE);
		}
	       
		// obtain the value of node_values property
	    String nodeValues = properties.getProperty(TreesConstants.NODEVALUES);
	    
		// create an instance of the Tree class
		Tree tree = new Tree();
		
		// parse the key / value pairs of node_values and insert into tree
	  String[] propValues = nodeValues.split(";");
	  
	  for(String propValue: propValues) {
		 String[] splitValues = propValue.split(",");
		 int key = Integer.parseInt(splitValues[TreesConstants.KEYOFFSET]);
		 double value = Double.parseDouble(splitValues[TreesConstants.VALUEOFFSET]);
		 tree.insert(key, value);
	  }
	  
	  System.out.println(tree.min());
	  System.out.println(tree.max());
	  System.out.println(tree.find(10));
	  
	      	// print out the keys using inorder
		tree.traverse(2);
		}
}
