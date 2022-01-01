package edu.monmouth.lab2;

public class Rectangle implements Shape, Comparable<Rectangle>{
	private int width, height;
	private String name;
	
	public Rectangle(String name, int width, int height) {
		setWidth(width);
		setHeight(height);
		setName(name);
	}

	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", name=" + name + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rectangle other = (Rectangle) obj;
		if (height != other.height)
			return false;
		if (width != other.width)
			return false;
		return name.equals(other.name);
	}

	@Override
	public int compareTo(Rectangle o) {
		final int EQUALS = 0;
		final int LESSTHAN = -1;
		final int GREATERTHAN = 1;
		
		if (this.height == o.height && this.width == o.width) {
			return EQUALS;
		}
		if (this.height + this.width > o.height + o.width) {
			return LESSTHAN;
		}
		if (this.height + this.width < o.height + o.width) {
			return GREATERTHAN;
		}
		return EQUALS;
	}

	@Override
	public double area() {
		return width * height;
	}
}