package com.array;

public class LargestSumContiguousSubarrayMath {

	public static void main(String[] args) {
		int[] array = { -2, -3, 4, -1, -2, 1, 5, -3 };

		int max = array[0];
		int val = array[0];

		for (int i = 0; i < array.length; i++) {

			val = Math.max(array[i], val + array[i]);
			max = Math.max(val, max);
		}
		System.out.println(max);

	}

}
