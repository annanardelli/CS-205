package edu.monmouth.nov29;

import java.util.Comparator;

public class StudentAge implements Comparator<Student> {
	
	public int compare (Student s1, Student s2) {
		final int EQUALS = 0;
		final int LESSTHAN = -1;
		final int GREATERTHAN = 1;
		
		if (s1.getAge() == s2.getAge()) {
			return EQUALS;
		}
		if (s1.getAge() > s2.getAge()) {
			return LESSTHAN;
		}
		if (s1.getAge() < s2.getAge()) {
			return GREATERTHAN;
		}
		return EQUALS;
	}
}
