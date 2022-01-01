package edu.monmouth.fibonacci;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {
	static int counter = 0;
	public static long[] fib(int n) {
		counter++;
		if (n <= 1) {
			long[] answer = {n, 0};
			return answer;
		} else {
			long[] temp = fib(n-1);
			long[] answer = {temp[0] + temp[1], temp[0]};
			return answer;
		}
	}
	public static int getCounter() {
		return counter;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number for Fibonacci sequence ");
		int n = scanner.nextInt();
		
		long[] answer = fib(n);
		System.out.println("Was called " + getCounter() + " times " + Arrays.toString(answer));
		scanner.close();
	}
}
