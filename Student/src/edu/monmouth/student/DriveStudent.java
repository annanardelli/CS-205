package edu.monmouth.student;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import edu.monmouth.nov29.Student;

public class DriveStudent {
	
	public static void main(String[] args) {
		if(args.length != StudentConstants.REQUIREDPARAMETERS) {
			System.err.println("Supply name of properties file");
			System.exit(StudentConstants.INVALIDPARAMETERS);
		}
		
		final String PROPERTYFILENAME = args[StudentConstants.PROPERTYOFFSET];
		
		Properties props = new Properties();
		try {
			props.load(new FileInputStream(PROPERTYFILENAME));
		} catch (IOException e) {
			System.err.println("Cannot load " + PROPERTYFILENAME);
			e.printStackTrace();
			System.exit(StudentConstants.INVALIDPROPERTYFILE);
		}
		
		props.list(System.out);
		
		String campusName = props.getProperty("campus");
		if(campusName == null) {
			campusName = StudentConstants.DEFAULTCAMPUS;
		}
		
		String minAgeAsString = props.getProperty("minimumAge");
		if(minAgeAsString == null) {
			minAgeAsString = "0";
		}
		
		int minAge = 0;
		try {
		minAge = Integer.parseInt(minAgeAsString);
		} catch (NumberFormatException e) {
			System.err.println("Cannot set minimumAge");
			minAge = StudentConstants.DEFAULTMINAGE;
		}
		
		Student.setMinimumAge(minAge);
		Student.setCampus(campusName);
		
		try {
			Student student1 = new Student(18, "Joe");
		} catch (StudentException e) {
			System.err.println("Cannot create a Student");
			e.printStackTrace();
		}
	
	}
}