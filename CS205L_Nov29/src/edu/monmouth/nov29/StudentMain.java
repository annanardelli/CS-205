package edu.monmouth.nov29;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class StudentMain {
	public static void main (String[] args) {
		LinkedList<Student> list = new LinkedList<Student>();
		
		try {
			list.add(new Student(19, "Joe"));
		} catch (StudentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			list.add(new Student(190, "Jane"));
		} catch (StudentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			list.add(new Student(20, "Sally"));
		} catch (StudentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			list.add(new Student(91, null));
		} catch (StudentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			list.add(new Student(22, ""));
		} catch (StudentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			list.add(new Student(23, "Joe"));
		} catch (StudentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			list.add(new Student(150, "John"));
		} catch (StudentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			list.add(new Student(19, "Steve"));
		} catch (StudentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			list.add(new Student(23, "Jay"));
		} catch (StudentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			list.add(new Student(21, "Mary"));
		} catch (StudentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			list.add(new Student(30, "Mike"));
		} catch (StudentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			list.add(new Student(28, "Dot"));
		} catch (StudentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Collections.sort(list);
		Iterator<Student> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println("\n\nSorted by Age:\n");
		Collections.sort(list, new StudentAge());
		Iterator<Student> iter2 = list.iterator();
		while(iter2.hasNext()) {
			System.out.println(iter2.next());
		}
		System.out.println("\n\nSorted Reverse Alphabetically:\n");
		Collections.sort(list, new StudentName());
		Iterator<Student> iter3 = list.iterator();
		while(iter3.hasNext()) {
			System.out.println(iter3.next());
			}
		}
	}
