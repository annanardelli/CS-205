package edu.monmouth.nov29;

public class Student implements Comparable<Student> {
	private int minimumAge = StudentConstants.MINIMUMAGE;
	private String name;
	private int age;
	
	public Student(int age, String name) throws StudentException{
			setAge(age);
			setName(name);
	}

	
	public void setName(String name) throws StudentException {
		if(name == null || name.length() < 1) {
			throw new StudentException("Cannot set name to null value.");
		}
		else {
			this.name = name;
		}
	}
	
	public void setAge(int age) throws StudentException {
		if(age < minimumAge || age > StudentConstants.MAXIMUMAGE) {
			throw new StudentException("Invalid age entry: " + age);
		}
		else {
			this.age = age;
		}
	}
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return "Name: " + name + ", Age: " + age;
	}

	@Override
	public boolean equals(Object o) {
		if (o == null) {
			return false;
		}
		if(!(o instanceof Student)) {
			return false;
		}
		Student other = (Student) o;
		if (this.age == other.age && this.name.equals(other.name)) {
			return true;
		}
		return false;
	}
	
	@Override
	public int compareTo(Student o) {
		final int EQUALS = 0;
		final int LESSTHAN = -1;
		final int GREATERTHAN = 1;
		
		if (this.age == o.age && this.name.equals(o.name)) {
			return EQUALS;
		}
		if (this.name.compareTo(o.name) < 0) {
			return LESSTHAN;
		}
		if (this.name.compareTo(o.name) > 0) {
			return GREATERTHAN;
		}
		return EQUALS;
	}
}
