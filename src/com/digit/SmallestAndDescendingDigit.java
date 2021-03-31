package com.digit;

import java.util.Arrays;

public class SmallestAndDescendingDigit {
	public static void main(String[] args) {
		int num = 4376192;

		int len = Integer.toString(num).length();
		int arr[] = new int[len];

		for (int i = 0; i < len; i++) {
			arr[i] = num % 10;
			num = num / 10;
		}
		Arrays.sort(arr);
		int number = 0;
		for (int i = 0; i < len; i++) {
			number = (number * 10) + arr[i];
		}
		System.out.println("Ascending order  " + number);

		int count = 0;
		int arr1[] = new int[len];

		for (int i = len - 1; i >= 0; i--) {
			arr1[count++] = arr[i];
		}
		int number1 = 0;
		for (int i = 0; i < len; i++) {
			number1 = (number1 * 10) + arr1[i];
		}
		System.out.println("Descending order " + number1);
	}
}
