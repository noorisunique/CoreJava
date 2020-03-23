package com.sapient;

public class PrimeNumber {
	public static void main(String[] args) {
		boolean isPrimeNumber = true;
		int number = 95;
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrimeNumber = false;
				break;
			}
		}

		if (isPrimeNumber) {
			System.out.println("It is prime a number  " + number);
		} else {
			System.out.println("It is not a prime number  " + number);
		}
	}
}
