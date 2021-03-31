package hackethon;

public class ArrayKthLargestElement12 {
	public static void main(String[] args) {
		int a[] = { 10, 5, 4, 3, 1, 7, 88, 4, -1 };
		int largest = a[0];
		for (int val : a) {
			if (val > largest) {
				largest = val;
			}
		}
		System.out.println(largest);
	}
}
