package hackethon;

import java.util.Arrays;

//https://www.geeksforgeeks.org/closest-numbers-list-unsorted-integers/
//https://www.hackerrank.com/challenges/closest-numbers/problem

public class ClosestNumbersUnsortedIntegers {

	// Complete the closestNumbers function below.
	static int[] closestNumbers(int[] arr) {

		int n = arr.length;

		Arrays.sort(arr);
		int minDiff = arr[1] - arr[0];

		StringBuilder stringb = new StringBuilder();

		for (int i = 2; i < n; i++) {
			minDiff = Math.min(minDiff, arr[i] - arr[i - 1]);
		}
		for (int i = 1; i < n; i++) {
			if (arr[i] - arr[i - 1] == minDiff) {
				stringb.append(arr[i - 1]);
				stringb.append(arr[i]);

			}
		}
		System.out.println(stringb);
		int newArray[] = new int[stringb.length()];
		for (int i = 0; i < newArray.length; i++) {
			newArray[i]=stringb.charAt(i);
		}
		return newArray;
	}

	public static void printMinDiffPairs(int A[], int n) {

		if (n < 1) {
			return;
		}
		Arrays.sort(A);
		int minDiff = A[1] - A[0];
		for (int i = 2; i < n; i++) {
			minDiff = Math.min(minDiff, A[i] - A[i - 1]);
		}

		for (int i = 1; i < n; i++) {
			if (A[i] - A[i - 1] == minDiff) {
				System.out.println("(" + A[i - 1] + "," + A[i] + ")");
			}
		}
	}

	public static void main(String[] args) {
		int a[] = { 10, 50, 12, 100 };
		printMinDiffPairs(a, a.length);
		int b[] = { 2, 3, 4, 5, 6, 7 };
		printMinDiffPairs(b, b.length);

		int c[] = { 5, 4, 3, 2 };
		closestNumbers(c);
	}

}
