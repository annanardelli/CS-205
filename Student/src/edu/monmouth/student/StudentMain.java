package edu.monmouth.student;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class StudentMain {
	public static void main(String[] args) {
		Student.setCampus("West Long Branch");
		Student.setMinimumAge(16);
		
		List<Student> listOfStudents = new LinkedList<Student>();
		try {
			listOfStudents.add(new Student(18, "Joe"));
		} catch (StudentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			listOfStudents.add(new Student(19, "Jane"));
		} catch (StudentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			listOfStudents.add(new Student(20, "Anna"));
		} catch (StudentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			listOfStudents.add(new Student(19, "Jim"));
		} catch (StudentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			listOfStudents.add(new Student(25, "Marisa"));
		} catch (StudentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			listOfStudents.add(new Student(23, "Ava"));
		} catch (StudentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Object studentArray[] = listOfStudents.toArray();
		studentArray = listOfStudents.toArray();
		Arrays.sort(studentArray);
		
		for(Object s: studentArray) {
			System.out.println(s);
		}
		
		Set<Student> set = new HashSet<>(listOfStudents);
		System.out.println(set.toString());
		try {
			System.out.println(set.contains(new Student(20, "Anna")));
		} catch (StudentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
