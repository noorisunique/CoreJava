package com.greek;

import java.util.*;
//https://www.baeldung.com/java-longest-substring-without-repeated-characters
public class LengthOfLongestSubstringBruteForceApproach {
	// Optimized Approach
	static String getUniqueCharacterSubstring(String input) {
		Map<Character, Integer> visited = new HashMap<>();
		String output = "";
		for (int start = 0, end = 0; end < input.length(); end++) {
			char currChar = input.charAt(end);
			if (visited.containsKey(currChar)) {
				start = Math.max(visited.get(currChar) + 1, start);
			}
			if (output.length() < end - start + 1) {
				output = input.substring(start, end + 1);
			}
			visited.put(currChar, end);
		}
		return output;
	}

	static String getUniqueCharacterSubstringBruteForce(String input) {
		String output = "";
		for (int start = 0; start < input.length(); start++) {
			Set<Character> visited = new HashSet<>();
			int end = start;
			for (; end < input.length(); end++) {
				char currChar = input.charAt(end);
				if (visited.contains(currChar)) {
					break;
				} else {
					visited.add(currChar);
				}
			}
			if (output.length() < end - start + 1) {
				output = input.substring(start, end);
			}
		}
		return output;
	}

	public static void main(String[] args) {
		//System.out.println(getUniqueCharacterSubstringBruteForce("JKLABCDEFDFF"));
		System.out.println(getUniqueCharacterSubstring("ABCD"));
	}
}
