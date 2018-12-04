import java.util.Arrays;

public class MaxThirdElementArray {

	public static void main(String[] args) {
		int arr[] = { 1,889, 2, 3, 4, 50, 6, 7, 8, 9 };
		Arrays.sort(arr);
		System.out.println(arr[arr.length-3]);		
	}
}
