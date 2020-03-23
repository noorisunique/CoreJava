package com.sapient;

import java.util.ArrayList;
import java.util.List;

public class ReturnOddNumberFromarray {
	public static List<Integer> oddNumbers(int l, int r) {
		// Write your code here
		List<Integer> list = new ArrayList<>();
		for (int i = l; i <= r; i++) {
			if (i % 2 == 1) {
				list.add(i);
			}
		}

		return list;
	}

	public static void main(String[] args) {
		System.out.println(oddNumbers(1, 7));
	}
}
