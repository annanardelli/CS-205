package edu.monmouth.cs205;

public class Rectangle implements Shape{

	private int width, length;
	
	public Rectangle (int length, int width) {
		this.width = width;
		this.length = length;
	}

	@Override
	public double area() {
		return length * width;
	}
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", length=" + length + "]";
	}
	
	
}
