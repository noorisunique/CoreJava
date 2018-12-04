package com.greek;

public class MaxSubArraySum {
	public static void main(String[] args) {
		int[] a = { -2, -3, 4, -1, -2, 1, 5, -3 };
		System.out.println("Maximum contiguous sum is " + maxSubArraySum(a));
	}

	static int maxSubArraySum(int a[]) {
		int size = a.length;
		int start = 0, end = 0, s = 0;
		int max_so_far = a[0], max_ending_here = 0;

		for (int i = 0; i < size; i++) {
			max_ending_here = max_ending_here + a[i];
			if (max_so_far < max_ending_here) {
				max_so_far = max_ending_here;
				start=s;end=i;
			}
			if (max_ending_here < 0) {
				max_ending_here = 0;
				s = i + 1;
			}
		}
		System.out.println(start +" "+end);
		return max_so_far;
	}
}

//https://www.youtube.com/watch?v=kekmCQXYwQ0
