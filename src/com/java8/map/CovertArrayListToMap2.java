package com.java8.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CovertArrayListToMap2 {

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

	}

}
