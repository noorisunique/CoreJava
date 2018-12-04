
public class MaxElementArray {

	public static void main(String[] args) {
		int arr[] = { 1,889, 2, 3, 4, 50, 6, 7, 8, 9 };
		int max = 0;
		int min = arr[0];
		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[min];
			}
		}
		System.out.println(max);
		System.out.println(min);
		
	}

}
