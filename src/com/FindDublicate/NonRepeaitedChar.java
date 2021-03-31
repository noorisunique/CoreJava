package com.FindDublicate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NonRepeaitedChar {

	public static char getFirstNonRepeatedChar(String str) {

		// Map<Character, Integer> map = new HashMap<>(); //error
		Map<Character, Integer> map = new LinkedHashMap<>();

		for (Character ch : str.toCharArray()) {
			if (map.get(ch) != null) {
				map.put(ch, 1 + map.get(ch));
			} else {
				map.put(ch, 1);
			}

		}

		System.out.println("Full Map--  " + map);

		for (Map.Entry<Character, Integer> value : map.entrySet()) {
			if (value.getValue() == 1) {
				return value.getKey();
			}
		}
		throw new RuntimeException("Did not find none repeated char");
	}

	public static char firstNonRepeatingChar(String word) {
		Set<Character> repeating = new HashSet<>();
		List<Character> nonRepeating = new ArrayList<>();
		for (int i = 0; i < word.length(); i++) {
			char letter = word.charAt(i);
			if (repeating.contains(letter)) {
				continue;
			}
			if (nonRepeating.contains(letter)) {
				nonRepeating.remove((Character) letter);
				repeating.add(letter);
			} else {
				nonRepeating.add(letter);
			}
		}
		return nonRepeating.get(0);
	}

	public static char firstNonRepeatedCharacter(String word) {
		HashMap<Character, Integer> scoreboard = new HashMap<>();
		// build table [char -> count]
		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			if (scoreboard.containsKey(c)) {
				scoreboard.put(c, scoreboard.get(c) + 1);
			} else {
				scoreboard.put(c, 1);
			}
		}
		// since HashMap doesn't maintain order, going through string again
		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			if (scoreboard.get(c) == 1) {
				return c;
			}
		}
		throw new RuntimeException("Undefined behaviour");
	}

	@Test
	public void getFirstNonRepeatedChar() {
		assertEquals('b', NonRepeaitedChar.getFirstNonRepeatedChar("abcdefghija"));
		assertEquals('h', NonRepeaitedChar.getFirstNonRepeatedChar("hello"));
		assertEquals('J', NonRepeaitedChar.getFirstNonRepeatedChar("Java"));
		assertEquals('i', NonRepeaitedChar.getFirstNonRepeatedChar("simplest"));
	}

	@Test
	public void testFirstNonRepeatingChar() {
		assertEquals('b', NonRepeaitedChar.firstNonRepeatingChar("abcdefghija"));
		assertEquals('h', NonRepeaitedChar.firstNonRepeatingChar("hello"));
		assertEquals('J', NonRepeaitedChar.firstNonRepeatingChar("Java"));
		assertEquals('i', NonRepeaitedChar.firstNonRepeatingChar("simplest"));
	}

	@Test
	public void testGetFirstNonRepeatedChar() {
		assertEquals('b', NonRepeaitedChar.getFirstNonRepeatedChar("abcdefghija"));
		assertEquals('h', NonRepeaitedChar.getFirstNonRepeatedChar("hello"));
		assertEquals('J', NonRepeaitedChar.getFirstNonRepeatedChar("Java"));
		assertEquals('i', NonRepeaitedChar.getFirstNonRepeatedChar("simplest"));
	}
}
