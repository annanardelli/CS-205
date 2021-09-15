package edu.monmouth.gettingStarted;

public class OddEvenMain {

	public static void main(String[] args) {
		int data[] = {20,21,22,33,1,3,5};
		
		OddEven oddEven = new OddEven(data);

		int numberOfEvens = oddEven.numberOfEvens();
		System.out.println("Number of even numbers: " + numberOfEvens);
		
		int numberOfOdds = oddEven.numberOfOdds();
		System.out.println("Number of odd numbers: " + numberOfOdds);
	}
}
