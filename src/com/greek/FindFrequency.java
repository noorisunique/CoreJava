package com.greek;

public class FindFrequency {

	public static void findFrequency(int a[], int n, int k) {
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] == k)
				count++;
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 1, 2, 1, 2 };
		findFrequency(a, a.length, 2);
	}
}
