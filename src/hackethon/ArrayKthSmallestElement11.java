package hackethon;

public class ArrayKthSmallestElement11 {
	public static void main(String[] args) {
		int a[] = { 10, 5, 4, 3, 1, 7, 88, 4, -1 };
		int smallest = a[0];
		for (int val : a) {
			if (val < smallest) {
				smallest = val;
			}
		}
		System.out.println(smallest);
	}
}
