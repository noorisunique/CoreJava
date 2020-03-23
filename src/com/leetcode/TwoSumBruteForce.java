package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSumBruteForce {
	// Approach 1: Brute Force
	public static int[] twosum(int nums[], int target) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j] == target - nums[i]) {
					return new int[] { i, j };
				}
			}
		}
		throw new IllegalArgumentException("No two sum solution");
	}

	// Approach 2: Two-pass Hash Table
	public static int[] twosum1(int nums[], int target) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (map.containsKey(complement) && map.get(complement) != i) {
				return new int[] { i, map.get(complement) };
			}
		}

		throw new IllegalArgumentException("No two solution");
	}

	public static void main(String[] args) {
		int a[] = { 2, 7, 11, 15 };
		int b[] = twosum1(a, 9);
		for (int i : b) {
			System.out.println(i);
		}

	}

}
