package greek.com;

import java.util.Arrays;

public class EvenGreaterthanOddPosition {

	public static void assign(int a[], int n) {
		int p = 0, q = n - 1;
		Arrays.sort(a);
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
		int arr[] = { 1, 3, 2, 2, 5 };
		int n = arr.length;
		assign(arr, n);
	}
}
