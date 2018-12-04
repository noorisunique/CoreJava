package com.greek;

import java.util.Arrays;

public class Demo {
	public static void move(int a[], int n) {
		Arrays.sort(a);
		int count = 0;
		int temp[] = new int[n];
		for (int i = 0, j = n - 1; i <= n / 2 || j > n / 2; i++, j--) {
			if (count < n) {
				temp[count] = a[i];
				count++;
			}
			if (count < n) {
				temp[count] = a[i];
				count++;
			}
		}

		// Modifying original array
		for (int i = 0; i < n; i++)
			a[i] = temp[i];
	}

	public static void main(String[] args) {
		int a[] = { 5, 8, 1, 4, 2, 9, 3, 7, 6 };
		int n = a.length;
		move(a, n);
		for (int i = 0; i < n; i++)
			System.out.print(a[i] + " ");
	}
}