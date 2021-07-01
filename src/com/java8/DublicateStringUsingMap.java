package com.java8;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class DublicateStringUsingMap {
	private static void findWords(String s) {
		String[] words = s.split(" ");
		Map<String, Integer> map = new LinkedHashMap<>();
		Arrays.stream(words).forEach(e -> map.put(e, map.getOrDefault(e, 0) + 1));

		System.out.println(map);

	}

	public static void main(String[] args) {
		String value = "This is testing Program Program Program testing Program";

		findWords(value);
	}

}
