package com.greek;

public class SegregatePositiveAndNegative {
	public static void main(String[] args) {
		int a[] = { -2, 4, -5, -6, 2, 6, 7, -4, -2 };
		int l = 0;
		int r = a.length - 1;
		while (l < r) {

			while (a[l] < 0 && l < r) {
				l++;
			}
			while (a[r] > 0 && l < r) {
				r--;
			}

			if (l < r) {
				int t = a[l];
				a[l] = a[r];
				a[r] = t;
				l++;
				r--;
			}

		}

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
