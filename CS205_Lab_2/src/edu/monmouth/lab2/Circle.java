package edu.monmouth.lab2;

public class Circle implements Shape, Comparable<Circle>{
	private int radius;
	private String name;

	public Circle(String name, int radius) {
		setRadius(radius);
		setName(name);
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Circle [radius=" + radius + " name=" + name + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle other = (Circle) obj;
		if (radius != other.radius) {
			return false;
		}
		return (this.name.equals(other.name));
	}

	@Override
	public int compareTo(Circle otherCircle) {
		final int EQUALS = 0;
		final int LESSTHAN = -1;
		final int GREATERTHAN = 1;
		
		if (this.radius == otherCircle.radius) {
			return EQUALS;
		}
		if (this.radius > otherCircle.radius) {
			return LESSTHAN;
		}
		if (this.radius < otherCircle.radius) {
			return GREATERTHAN;
		}
		return EQUALS;
	}

	@Override
	public double area() {
		return Math.PI * (radius*radius);
	}
	

}
