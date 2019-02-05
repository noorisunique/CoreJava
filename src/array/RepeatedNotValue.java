package com.array;

import java.util.Arrays;

public class RepeatedNotValue {

	public static void main(String[] args) {
		int a[] = { 10, 20, 1, 2, 3, 1, 2, 3, 4, 5, 20 };
		int j = 0;
		int temp[] = new int[a.length];
		Arrays.sort(a);
		for (int i = 0; i < a.length - 1; i++) {

			if (a[i] == a[i + 1]) {
				temp[j++] = a[i];
			}
		}
		for (int i = 0; i <j; i++) {
			System.out.println(temp[i]);
		}

	}
}
