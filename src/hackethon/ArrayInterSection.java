package hackethon;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class ArrayInterSection {

	// Function to find intersection
	static void intersection(int a[], int b[], int n, int m) {
		int i = 0, j = 0;

		while (i < n && j < m) {

			if (a[i] > b[j]) {
				j++;
			}

			else if (b[j] > a[i]) {
				i++;
			} else {
				// when both are equal
				System.out.print(a[i] + " ");
				i++;
				j++;
			}
		}
	}

	static void printUnion(int[] a, int[] b, int n, int m) {
		Map<Integer, Integer> mp = new HashMap<Integer, Integer>();

		// Inserting array elements in mp
		for (int i = 0; i < n; i++) {
			mp.put(a[i], i);
		}
		for (int i = 0; i < m; i++) {
			mp.put(b[i], i);
		}

		System.out.println("\n\nThe union set of both arrays is :");
		for (Map.Entry mapElement : mp.entrySet()) {
			System.out.print(mapElement.getKey() + " ");

			// mp will contain only distinct
			// elements from array a and b
		}
	}

	// Driver Code
	public static void main(String[] args) {
		int a[] = { 1, 3, 2, 3, 4, 5, 5, 6 };
		int b[] = { 3, 3, 5 };

		int n = a.length;
		int m = b.length;

		// sort
		Arrays.sort(a);
		Arrays.sort(b);

		
		// Function call
		intersection(a, b, n, m);
		
		printUnion(a, b, n, m);
	}
}