package com.java8.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CovertArrayListToMap {

	public static void main(String[] args) {
		List<String> listOfString = new ArrayList<>();
		listOfString.add("Java");
		listOfString.add("JavaScript");
		listOfString.add("Python");
		listOfString.add("C++");
		listOfString.add("Ruby");

		Map<String, Integer> map8 = listOfString.stream()
				.collect(Collectors.toMap(Function.identity(), String::length));
		System.out.println(map8);

		// [1, 2, 3, 4, 5, 3, 6]
		// key and value is square
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 3, 6);
		Map<Integer, Integer> map = list.stream()
				.collect(Collectors.toMap(Integer::intValue, val -> val * val, (a1, a2) -> a1));
		System.out.println(map);
	}

}
