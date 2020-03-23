package com.sapient;

//https://www.careercup.com/page?pid=sapient-corporation-interview-questions
import java.util.HashMap;
import java.util.Map;

public class FrequencyEx2 {
	public static void main(String[] args) {
		String s1 = "ccc";

		isUniversalLuckyString(s1);
	}

	private static void isUniversalLuckyString(String s1) {
		Map<Character, Integer> map = new HashMap<>();
		boolean uv = true;
		for (int i = 0; i < s1.length(); i++) {
			Character character = s1.charAt(i);
			if (map.get(character) == null) {
				map.put(character, 0);
			}
			if (map.get(character) > 2) {
				uv = false;
				break;
			}
			map.put(character, map.get(character) + 1);
		}
		System.out.println(s1 + (uv ? " Valid" : " Invalid"));
	}

}
