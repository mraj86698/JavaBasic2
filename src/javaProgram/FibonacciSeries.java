package javaProgram;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String args[]) {

		int number, firstTerm = 0, secondTerm = 1;
		// Take input from the user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how may fibonnaci numbers to print");
		number = sc.nextInt();
		// Declare and Initialize the number of terms

		System.out.println("Fibonacci Series till " + number + " terms:");
		// Print the fibonacci series
		for (int i = 1; i < number; i++) {
			System.out.print(firstTerm + ", ");

			int nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}
	}

}
