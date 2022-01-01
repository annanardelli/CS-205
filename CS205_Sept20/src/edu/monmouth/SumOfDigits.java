package edu.monmouth;

import java.util.Scanner;

public class SumOfDigits {

	public static void main (String[] args) {
		final int value = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer:");
		int in = input.nextInt();
		
		if (in < value) {
			System.out.println("Error. Enter a value greater than " + value);
			in = input.nextInt();
		}
		
		int count = 0;
		int temp = in;
		
		while (temp > 0) {
			count += temp % 10;
			temp = temp/10;
		}
		System.out.println(count);
		input.close();
	}

}