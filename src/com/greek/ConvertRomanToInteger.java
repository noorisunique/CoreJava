package com.greek;

import java.util.HashMap;
import java.util.Map;

public class ConvertRomanToInteger {
	public static int ConvertRomanToInteger(String str) {
		Map<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		int l = str.length() - 1;

		int result = map.get(str.charAt(l));
		for (int i = l; i > 0; i--) {

			if (map.get(str.charAt(i)) > map.get(str.charAt(i - 1))) {
				result = result - map.get(str.charAt(i - 1));

			} else {
				result = result + map.get(str.charAt(i - 1));
			}
		}
		return result;
	}

	public static void main(String[] args) {
		String s = "XLVIII";
		System.out.println(ConvertRomanToInteger(s));
	}
}
