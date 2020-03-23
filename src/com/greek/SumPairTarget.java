package com.greek;

import java.util.HashMap;
import java.util.Map;

public class SumPairTarget {

	public static int[] twoSumUsingMap(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}
		for (int i = 0; i < nums.length; i++) {
			int findValue = target - nums[i];
			if (map.containsKey(findValue) && map.get(findValue) != i) {
				return new int[] { i, map.get(findValue) };
			}
		}
		throw new IllegalArgumentException("No Pair Found");
	}
	// O(n2)
	// To reduce Complexity we use hashMap

	public static int[] twoSumUsingForLoop(int[] nums, int target) {
		int arr[] = new int[2];
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j] == (target - nums[i])) {
					return new int[] { i, j };
				}
			}
		}
		throw new IllegalArgumentException("No Pair Found");

	}

	public static void main(String[] args) {
		int arr[] = { 2, 7, 11, 15 };
		int a[] = twoSumUsingMap(arr, 9);// twoSum(arr, 9);
		System.out.println(a[0] + "  " + a[1]);

	}

}
