package edu.monmouth.nov29;

import java.util.Comparator;

public class StudentName implements Comparator<Student> {
	
	public int compare(Student s1, Student s2) {
		final int EQUALS = 0;
		final int LESSTHAN = -1;
		final int GREATERTHAN = 1;
		
		if (s1.getName().equals(s2.getName())) {
			return EQUALS;
		}
		if (s1.getName().compareTo(s2.getName()) > 0) {
			return LESSTHAN;
		}
		if (s1.getName().compareTo(s2.getName()) < 0) {
			return GREATERTHAN;
		}
		return EQUALS;
	}
	
}
