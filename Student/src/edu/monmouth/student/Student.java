package edu.monmouth.student;

public class Student implements Comparable<Student> {
	private static String campus;
	private String name;
	private int age;
	private static int minimumAge;
	
	public Student(int age, String name) throws StudentException {
		setAge(age);
		setName(name);
	}

	public static void setCampus(String campus) {
		Student.campus = campus;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws StudentException {
		if(age > minimumAge) {
			this.age = age;
			return;
		}
		throw new StudentException("Invalid age passed in");
	}

	public static int getMinimumAge() {
		return minimumAge;
	}

	public static void setMinimumAge(int minimumAge) {
		Student.minimumAge = minimumAge;
	}

	@Override
	public String toString() {
		return "Student [campus=" + campus + ", name=" + name + ", age=" + age + "]";
	}
	
	@Override
	public int hashCode() {
		System.out.println("In hashCode...");
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + minimumAge;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
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
