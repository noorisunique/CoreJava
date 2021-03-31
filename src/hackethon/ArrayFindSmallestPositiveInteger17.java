package hackethon;
//https://www.geeksforgeeks.org/find-smallest-value-represented-sum-subset-given-array/

public class ArrayFindSmallestPositiveInteger17 {

	int findSmallest(int arr[], int n) {
		int res = 1; // Initialize result

		// Traverse the array and increment 'res' if arr[i] is
		// smaller than or equal to 'res'.
		for (int i = 0; i < n && arr[i] <= res; i++)
			res = res + arr[i];

		return res;
	}

	// Driver program to test above functions
	public static void main(String[] args) {
		ArrayFindSmallestPositiveInteger17 small = new ArrayFindSmallestPositiveInteger17();
		int arr1[] = { 1, 3, 4, 5 };
		int n1 = arr1.length;
		System.out.println(small.findSmallest(arr1, n1));

		int arr2[] = { 1, 2, 6, 10, 11, 15 };
		int n2 = arr2.length;
		System.out.println(small.findSmallest(arr2, n2));

		int arr3[] = { 1, 1, 1, 1 };
		int n3 = arr3.length;
		System.out.println(small.findSmallest(arr3, n3));

		int arr4[] = { 1, 1, 3, 4 };
		int n4 = arr4.length;
		System.out.println(small.findSmallest(arr4, n4));

	}
}