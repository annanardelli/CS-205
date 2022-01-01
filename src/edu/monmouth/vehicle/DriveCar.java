package edu.monmouth.vehicle;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

public class DriveCar {
	public static void main (String[] args) {
		int minEngineSize = 0;
		
		try {
			minEngineSize = Integer.parseInt(args[0]);
		}
		catch (NumberFormatException e){
			System.err.println(args[0] + "is not a valid minimum engine size");
		}
		catch (ArrayIndexOutOfBoundsException e){
			System.err.println("One Command Line Required");
			System.exit(-1);
		}
		
		System.out.println(minEngineSize);
		//Car constructor doesn't work properly because no exception handling
		Car car = new Car(CarColors.GRAY, 110);
		car.setCarColor(CarColors.GRAY);
		try {
			car.setEngineSize(8);
		} catch (EngineSizeException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		//MODIFY STANDARD OUT/STANDARD IN
		final String LOGFILENAME="CarOutput.txt";
		File output = new File(LOGFILENAME);
		  try {
			  PrintStream st = new PrintStream(output);
			  System.setOut(st);System.setErr(st); }
		  catch(FileNotFoundException ioe) {
		  System.err.println("Cannot redirect stderr and stdout " + ioe.getMessage());
		  ioe.printStackTrace(); System.exit(-1);}
	
	List list1 = new List();
	Car c1 = new Car(CarColors.BLUE, 110);
	Car c2 = new Car(CarColors.GRAY, 120);
	Car c3 = new Car(CarColors.RED, 130);
	
	Set<Car> carTreeSet = new TreeSet<Car>();
	carTreeSet.add(c1);
	carTreeSet.add(c2);
	carTreeSet.add(c3);
	
	Iterator<Car> carIterator = carTreeSet.iterator();
	while (carIterator.hasNext()) {
		System.out.println(carIterator.next());
	}
	
	if (c1.equals(c2)) {
		System.out.println("Cars are equal");
	}
	else {
		System.out.println("Cars are not equal");
	}
	list1.insert(c1);
	list1.insert(c2);
	list1.insert(c3);
	
	java.util.List<Car> list = new LinkedList<Car>();
	list.add(c1);
	list.add(c2);
	list.add(c3);
	
	
	System.out.println("Contains car1? " + list.contains(c1));
	ListIterator <Car> iterator = list.listIterator();
	while(iterator.hasNext()) {
		Car thisCar = iterator.next();
		System.out.println(thisCar);
		if(thisCar.getEngineSize()<200) {
			if(iterator.hasPrevious()) {
				Car previousCar = iterator.previous();
				System.out.println("Previous Car = " + previousCar);
				break;
			}
		}
		
	}
	
	System.out.println(list);
	
	try {
	BufferedReader reader = new BufferedReader(new FileReader("car.txt"));
	String text;
	while((text = reader.readLine()) != null) {
		System.out.println(text);
		String[] result = text.split(",");
		
		Car newCar = new Car();
		try {
			newCar.setEngineSize(Integer.parseInt(result[0]));
		} catch (NumberFormatException e) {
			e.printStackTrace();
			System.err.println("Cannot make an int from " + result[0]);
		} catch (EngineSizeException e) {
			e.printStackTrace();
			System.err.println("Cannot set engine size to " + result[0]);
		}
		newCar.setCarColor(CarColors.valueOf(result[1]));
	}
	reader.close();
	} catch (FileNotFoundException e){
		e.printStackTrace();
		System.exit(-1);
	} catch (IOException e) {
		e.printStackTrace();
		System.exit(-2);
	}
	
}
}

