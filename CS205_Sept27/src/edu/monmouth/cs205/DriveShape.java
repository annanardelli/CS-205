package edu.monmouth.cs205;

public class DriveShape {

	public static void main (String[] args) {
		final int MAX = 3;
		//Circle circle;
		Rectangle rectangle;
		//Shape shape1;
		
		//circle = new Circle(5);
		rectangle = new Rectangle(10, 20);
		//shape1 = circle; //circle IS A shape
		
		Shape shapes[];
		shapes = new Shape[MAX];
		shapes[0] = rectangle;
		shapes[1] = new Circle(3);
		shapes[2] = new Rectangle(2, 7);
		
		System.out.println(shapes[2]);
	}
}
