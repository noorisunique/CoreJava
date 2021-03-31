package com.String;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;

class AnagramCheck {

	/*
	 * One way to find if two Strings are anagram in Java. This method assumes both
	 * arguments are not null and in lowercase.
	 *
	 * @return true, if both String are anagram
	 */
	public static boolean isAnagram(String word, String anagram) {
		if (word.length() != anagram.length()) {
			return false;
		}

		char[] chars = word.toCharArray();

		for (char c : chars) {
			int index = anagram.indexOf(c);
			if (index != -1) {
				anagram = anagram.substring(0, index) + anagram.substring(index + 1, anagram.length());
			} else {
				return false;
			}
		}

		return anagram.isEmpty();
	}

	/*
	 * Another way to check if two Strings are anagram or not in Java This method
	 * assumes that both word and anagram are not null and lowercase
	 * 
	 * @return true, if both Strings are anagram.
	 */
	public static boolean iAnagram(String word, String anagram) {
		char[] charFromWord = word.toCharArray();
		char[] charFromAnagram = anagram.toCharArray();
		Arrays.sort(charFromWord);
		Arrays.sort(charFromAnagram);

		return Arrays.equals(charFromWord, charFromAnagram);
	}

	public static boolean checkAnagram(String first, String second) {
		char[] characters = first.toCharArray();
		StringBuilder sbSecond = new StringBuilder(second);

		for (char ch : characters) {
			int index = sbSecond.indexOf("" + ch);
			if (index != -1) {
				sbSecond.deleteCharAt(index);
			} else {
				return false;
			}
		}

		return sbSecond.length() == 0 ? true : false;
	}
}

public class StringAnagramTest {

	@Test
	public void testIsAnagram() {
		assertTrue(AnagramCheck.isAnagram("word", "wrdo"));
		assertTrue(AnagramCheck.isAnagram("mary", "army"));
		assertTrue(AnagramCheck.isAnagram("stop", "tops"));
		assertTrue(AnagramCheck.isAnagram("boat", "btoa"));
		assertFalse(AnagramCheck.isAnagram("pure", "in"));
		assertFalse(AnagramCheck.isAnagram("fill", "fil"));
		assertFalse(AnagramCheck.isAnagram("b", "bbb"));
		assertFalse(AnagramCheck.isAnagram("ccc", "ccccccc"));
		assertTrue(AnagramCheck.isAnagram("a", "a"));
		assertFalse(AnagramCheck.isAnagram("sleep", "slep"));

	}

	@Test
	public void testIAnagram() {
		assertTrue(AnagramCheck.iAnagram("word", "wrdo"));
		assertTrue(AnagramCheck.iAnagram("boat", "btoa"));
		assertFalse(AnagramCheck.iAnagram("pure", "in"));
		assertFalse(AnagramCheck.iAnagram("fill", "fil"));
		assertTrue(AnagramCheck.iAnagram("a", "a"));
		assertFalse(AnagramCheck.iAnagram("b", "bbb"));
		assertFalse(AnagramCheck.iAnagram("ccc", "ccccccc"));
		assertFalse(AnagramCheck.iAnagram("sleep", "slep"));

	}

	@Test
	public void testcheckAnagram() {
		assertTrue(AnagramCheck.checkAnagram("word", "wrdo"));
		assertFalse(AnagramCheck.checkAnagram("b", "bbb"));
		assertFalse(AnagramCheck.checkAnagram("ccc", "ccccccc"));
		assertTrue(AnagramCheck.checkAnagram("a", "a"));
		assertFalse(AnagramCheck.checkAnagram("sleep", "slep"));
		assertTrue(AnagramCheck.checkAnagram("boat", "btoa"));
		assertFalse(AnagramCheck.checkAnagram("pure", "in"));
		assertFalse(AnagramCheck.checkAnagram("fill", "fil"));

	}
}