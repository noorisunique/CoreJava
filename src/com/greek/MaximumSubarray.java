package com.greek;

public class MaximumSubarray {

	// Kadane's alogrithem
	public static int maxSubArray(int[] nums) {
		int max_curr = nums[0];
		int max_global = nums[0];
		for (int i = 1; i < nums.length; i++) {
			max_curr = Math.max(nums[i], max_curr + nums[i]);
			if (max_curr > max_global) {
				max_global = max_curr;
			}
		}
		return max_global;
	}

	// Complexity=o(n)
	public static void main(String[] args) {
		int a[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(maxSubArray(a));
	}

}
