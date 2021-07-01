package com.array;

public class NthLargestNumberWithUnSortedArray {
	public static void main(String[] args) {
		int ar[] = { 45, 3000, 2, 50, 80, 70, 50, 70, 122, 888, };
		int high = ar[0];
		int shigh = ar[0];
		// tow poiter
		for (int i = 0; i < ar.length; i++) {

			if (ar[i] > high) {
				shigh = high;
				high = ar[i];
			} else if (ar[i] > shigh && ar[i] != high) {

				shigh = ar[i];
			}

		}
		System.out.println(shigh);

	}
}
