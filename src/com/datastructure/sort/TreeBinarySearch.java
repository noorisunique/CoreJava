package com.datastructure.sort;

public class TreeBinarySearch {

	public static int binarySearch(int A[], int n, int data) {

		int l = 0, r = n - 1;

		while (l < r) {
			int mid = (l + r) / 2;
			if (data == A[mid]) {
				return mid;
			} else if (data > A[mid]) {
				l = mid + 1;
			} else if (data < A[mid]) {
				r = mid - 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 5, 6, 7 };
		System.out.println(binarySearch(a, a.length, 4));
	}

}
