package com.sapient;
//https://www.careercup.com/page?pid=sapient-corporation-interview-questions
import java.util.HashMap;
import java.util.Map;

public class FrequencyEx {
	public static void main(String[] args) {
		String s1 = "aabbcc";
		String s2 = "baccdddd";
		String s3 = "aabbccc";
		String s4 = "aabbc";
		String s5 = "aabbcccc";

		isUniversalLuckyString(s1);
		isUniversalLuckyString(s2);
		isUniversalLuckyString(s3);
		isUniversalLuckyString(s4);
		isUniversalLuckyString(s5);
	}

	private static void isUniversalLuckyString(String s1) {
		boolean isUniversalLuckyString = true;
		Map<Character, Integer> lucky = new HashMap<Character, Integer>();
		for (int index = 0; index < s1.length(); index++) {
			char character = s1.charAt(index);
			if (lucky.get(character) == null)
				lucky.put(character, 0);
			if (lucky.get(character) > 2) {
				isUniversalLuckyString = false;
				break;
			}
			lucky.put(character, lucky.get(character) + 1);
		}

		if (isUniversalLuckyString) {
			boolean flag = true;
			for (Character ch : lucky.keySet()) {
				if ((lucky.get(ch) == 1 || lucky.get(ch) == 3) && !flag) {
					isUniversalLuckyString = false;
					break;
				} else if (lucky.get(ch) == 1 || lucky.get(ch) == 3)
					flag = false;
			}
		}
		System.out.println(s1 + (isUniversalLuckyString ? " is a valid universal lucky string"
				: " is not a valid universal lucky string"));
	}
}
