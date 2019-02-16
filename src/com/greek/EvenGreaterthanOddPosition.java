package com.greek;

import java.util.Arrays;

public class EvenGreaterthanOddPosition {

	public static void assign(int a[], int n) {
		int p = 0, q = n - 1;
		Arrays.sort(a);// 2,2,3,5,10
		int ans[] = new int[n];
		for (int i = 0; i < a.length; i++) {
			if ((i + 1) % 2 == 0) {
				ans[i] = a[q--];
			} else {
				ans[i] = a[p++];
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(ans[i]);
		}
	}

	public static void main(String[] args) {
		int arr[] = { 10, 3, 2, 2, 5 };
		int n = arr.length;
		assign(arr, n);
	}
}
