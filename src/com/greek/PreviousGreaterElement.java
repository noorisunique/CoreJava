package com.greek;

class PreviousGreaterElement {
	static void prevGreater(int arr[], int n) {
		// Previous greater for
		// first element never
		// exists, so we print -1.
		System.out.print("-1, ");

		// Let us process
		// remaining elements.
		for (int i = 1; i < n; i++) {

			// Find first element on
			// left side that is
			// greater than arr[i].
			int j;
			for (j = i - 1; j >= 0; j--) {
				if (arr[i] < arr[j]) {
					System.out.print(arr[j] + ", ");
					break;
				}
			}

			// If all elements on
			// left are smaller.
			if (j == -1)
				System.out.print("-1, ");
		}
	}

	// Driver Code
	public static void main(String[] args) {
		int arr[] = { 10, 4, 2, 20, 40, 12, 30 };
		int n = arr.length;
		prevGreater(arr, n);
	}
}