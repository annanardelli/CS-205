package edu.monmouth.TOH;

public class TOH {

	public static void main(String[] args) {
		int n = 3;
		moveDisks(n, "A", "B", "C");
	}
	
	static void moveDisks(int n, char fromPeg, char toPeg, char auxPeg) {
		if (n==1) {
			System.out.println("move disk " + n + " from " + fromPeg + " to " + toPeg);
		} else {
			moveDisks(n-1, fromPeg, auxPeg, toPeg);
			System.out.println("move disk " + n + " from " + fromPeg + " to " + toPeg);
			moveDisks(n-1, auxPeg, toPeg, fromPeg);
		}
	}
}
