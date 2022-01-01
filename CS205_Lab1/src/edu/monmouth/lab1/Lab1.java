package edu.monmouth.lab1;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Lab1 {
	
	public static void main(String[] args) {
		try {
			PrintStream newIO = new PrintStream(Lab1Constants.LOGFILENAME);
			System.setOut(newIO);
			System.setErr(newIO);
			} catch (FileNotFoundException e) {
				System.err.println("Cannot redirect STDERR or STDOUT ");
				e.printStackTrace();
				System.exit(Lab1Constants.REDIRECTFAILURE);
			}
		Student students[] = new Student[]{
				new Student(100,18,"John"),
				new Student(101,19,"Jane"),
				new Student(102,20,"Larry"),
				new Student(103,20,"Karen"),
				new Student(104,21,"Karl")};
		System.out.println("Number of elements in Student: " + students.length);
		
		System.out.println("Students:");
		for (Student student : students) {
			System.out.println(student.toString());
		}
		
		System.out.println("\nStudents under 20:");
		for (Student student : students) {
			if (student.getAge() < 20) {
				System.out.println(student.toString());
			}
		}
		
		Student[] newStudents = new Student[Lab1Constants.NEWSTUDENTS];
		int position = 0;
		for (int i = 0; i < students.length; i++) {
			if (students[i].getName() == "Larry" || students[i].getName() == "Karen" || students[i].getName() == "Karl") {
				System.arraycopy(students, i, newStudents, position, Lab1Constants.ARRAYCOPYLENGTH);
				position++;
			}
		}
		
		System.out.println("\nNew Students:");
		for (Student student : newStudents) {
			System.out.println(student.toString());
		}
		
		
	}
	}
