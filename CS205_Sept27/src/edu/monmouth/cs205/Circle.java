package edu.monmouth.cs205;

public class Circle implements Shape {

	private int radius;
	
	public Circle (int radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return (Math.PI * Math.pow(radius, 2));
	}
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	
}
