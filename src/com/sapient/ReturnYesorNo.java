package com.sapient;

import java.util.ArrayList;
import java.util.List;

public class ReturnYesorNo {
	public static String findNumber(List<Integer> arr, int k) {
		// Write your code here
		System.out.println(arr.contains(k));
		if (arr.contains(k))
			return "YES";
		else
			return "NO";
	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(findNumber(list, 3));

	}
}
