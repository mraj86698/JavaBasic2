package javaProgram;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		int i, number, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number To Check a Perfect Number: ");
		number = sc.nextInt();

		for (i = 1; i < number; i++) {
			if (number % i == 0)
				;
			sum += i;
		}
		if (sum == number) {
			System.out.format("%d is Perfect Number", number);
		} else {
			System.out.format("%d is Not a Perfect Number", number);
		}

	}

}
