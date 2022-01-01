package edu.monmouth.lab2;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
	public static void main (String[] args) {
		
		//Check for correct number of command line args
		if(args.length != 1) {
			System.err.println("Incorrect number of command line arguments:" + args.length);
			System.exit(ShapeConstants.INCORRECTNUMOFARGS);
		}
		
		String log_file_name = args[ShapeConstants.LOG_FILE_OFFSET];
		
		//Re-direct STERR and STOUT
		try {
			PrintStream newIO = new PrintStream(log_file_name);
			System.setErr(newIO);
			System.setOut(newIO);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.err.println("Can't find log file.");
			System.exit(ShapeConstants.NOLOGFILE);
		}
		
		Circle c1 = new Circle("c1", 1);
		Circle c2 = new Circle("c2", 2);
		Circle c3 = new Circle("c3", 3);
		Circle c4 = new Circle("c4", 4);
		Circle c5 = new Circle("c5", 5);
		Rectangle r1 = new Rectangle("r1", 1, 1);
		Rectangle r2 = new Rectangle("r2", 2, 2);
		Rectangle r3 = new Rectangle("r3", 3, 3);
		Rectangle r4 = new Rectangle("r4", 4, 4);
		Rectangle r5 = new Rectangle("r5", 5, 5);
		
		//Circles
		List<Circle> circles = new LinkedList<Circle>();
		circles.add(c1);
		circles.add(c2);
		circles.add(c3);
		circles.add(c4);
		circles.add(c5);
		
		System.out.println("Enhanced For-Loop:");
		for (Circle circle : circles) {
			System.out.println(circle);
		}
		
		System.out.println("\nIterator:");
		Iterator<Circle> iter = circles.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println("\nLinkedList methods:");
		for(int i = 0; i < circles.size(); i++) {
			System.out.println(circles.get(i));
		}
		
		Collections.sort(circles);
		System.out.println("\nCircles Sorted Largest to Smallest:");
		for (Circle circle : circles) {
			System.out.println(circle);
		}
		
		//Rectangles
		List<Rectangle> rectangles = new LinkedList<Rectangle>();
		rectangles.add(r1);
		rectangles.add(r2);
		rectangles.add(r3);
		rectangles.add(r4);
		rectangles.add(r5);
		
		System.out.println("\nEnhanced For-Loop:");
		for (Rectangle rectangle : rectangles) {
			System.out.println(rectangle);
		}
		
		System.out.println("\nIterator:");
		Iterator<Rectangle> iter2 = rectangles.iterator();
		while(iter2.hasNext()) {
			System.out.println(iter2.next());
		}
		
		System.out.println("\nLinkedList methods:");
		for(int i = 0; i < rectangles.size(); i++) {
			System.out.println(rectangles.get(i));
		}
		
		Collections.sort(rectangles);
		System.out.println("\nRectangles Sorted Largest to Smallest:");
		for (Rectangle rectangle : rectangles) {
			System.out.println(rectangle);
		}

		//Binary search
		Circle findThisCircle = new Circle("cX", 98);
		Rectangle findThisRectangle = new Rectangle("r4", 4, 4);
		
		System.out.println("\nBinary Search:");
		System.out.println("Circle found at this index [or (-(insertion point) - 1) if not found]: "
				+ Collections.binarySearch(circles, findThisCircle));
		System.out.println("Rectangle found at this index [or (-(insertion point) - 1) if not found]: "
				+ Collections.binarySearch(rectangles, findThisRectangle));
	}
}
