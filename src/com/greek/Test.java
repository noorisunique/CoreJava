package com.greek;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static int[] getUniqueCharacterSubstring(int a[], int targer) {

		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < a.length; i++)
			map.put(a[i], i);

		for (int i = 0; i < a.length; i++) {
			int findValue = targer - a[i];
			if (map.containsKey(findValue) && map.get(findValue) != i) {
				return new int[] { i, map.get(findValue) };
			}
		}

		throw new IllegalArgumentException("Not found");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 3,2, 11, 15 ,7};
		int b[] = getUniqueCharacterSubstring(a, 9);
		System.out.println(b[0] + "  " + b[1]);
	}

}
