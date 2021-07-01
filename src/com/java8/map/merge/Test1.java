package com.java8.map.merge;

import java.util.*;

///https://dzone.com/articles/one-method-to-rule-them-all-mapmerge
public class Test1 {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("Foo", "Bar", "Foo", "Buzz", "Foo", "Buzz", "Fizz", "Fizz");
		Map<String, Integer> map = new HashMap<String, Integer>();
		words.forEach(word -> {
			Integer prev = map.get(word);
			if (prev == null) {
				map.put(word, 1);
			} else {
				map.put(word, prev + 1);
			}
		});
		System.out.println(map);
	}

}
