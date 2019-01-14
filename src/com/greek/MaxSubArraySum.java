package com.greek;

public class MaxSubArraySum {
	public static void main(String[] args) {
		int[] a = { -2, -3, 4, -1, -2, 1, 5, -3 };
		System.out.println("Maximum contiguous sum is " + maxSubArraySum(a));
	}

	static int maxSubArraySum(int a[]) {
		int size = a.length;
		int start = 0, end = 0, s = 0;
		int max_so_far = a[0], total = 0;

		for (int i = 0; i < size; i++) {
			total = total + a[i];
			if (max_so_far < total) {
				max_so_far = total;
				start = s;
				end = i;
			}
			if (total < 0) {
				total = 0;
				s = i + 1;
			}
		}
		System.out.println(start + " " + end);
		return max_so_far;
	}
}

// https://www.youtube.com/watch?v=kekmCQXYwQ0
