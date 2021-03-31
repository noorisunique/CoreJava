package com.thread;

import java.util.Scanner;

//thread to print prime numbers 
class part1 extends Thread {
	public synchronized void run() {
		int i = 0;
		int num = 0;
		String primeNumbers = "";

		for (i = 1; i <= 100; i++) {
			int counter = 0;
			for (num = i; num >= 1; num--) {

				// condition to check if the number is prime
				if (i % num == 0) {

					// increment counter
					counter = counter + 1;
				}
			}

			if (counter == 2) {
				primeNumbers = primeNumbers + i + " ";
			}
		}

		System.out.println("\nPrime numbers from 0 to 100 : \n" + primeNumbers);

		System.out.println();
	}
}

//thread to print palidrome numbers 
class part2 extends Thread {
	public synchronized void run() {
		int n, b, rev = 0;
		int N = 1000;

		System.out.println("Palindrome numbers from 10 to 1000 : ");

		for (int i = 10; i <= N; i++) {
			n = i;
			while (n > 0) {

				// Find reverse of n
				b = n % 10;
				rev = rev * 10 + b;
				n = n / 10;
			}

			// If n and rev are same, n is palidrome number
			if (rev == i) {
				System.out.print(i + " ");
			}
			rev = 0;
		}
	}
}

public class FindPrimeandPalindrome {

	public static void main(String[] args) {
		part1 t1 = new part1();
		part2 t2 = new part2();

		Thread m1 = new Thread(t1);
		Thread m3 = new Thread(t2);
		Scanner sc = new Scanner(System.in);

		// start() method starts the execution of thread.
		m1.start();
		m3.start();

		try {

			// join() method waits for the thread to die
			m1.join();
			m3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}