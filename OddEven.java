package edu.monmouth.gettingStarted;

public class OddEven {
	private int[] values;
	
	public OddEven(int[] values) {
		this.values = values;
	}
	
	public int numberOfOdds() {
		int count = 0;
		for (int i: values) {
			if (i %2 != 0) {
				count++;
			}
		}
		return count;
	}
	
	public int numberOfEvens() {
		int count = 0;
		for (int i: values) {
			if (i %2 == 0) {
				count++;
			}
		}
		return count;
	}
	
}
