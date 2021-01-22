package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//https://mkyong.com/java8/java-8-streams-map-examples/
public class MapExmple {
	public void ConvertIntoUppercase() {
		List<String> list = Arrays.asList("a", "b", "c");

		// before java 8
		List<String> temp = new ArrayList<String>();
		for (String value : list) {
			temp.add(value.toUpperCase());
		}
		System.out.println(temp);

		// Java 8
		List<String> newList = list.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(newList);

		List<Integer> intList = Arrays.asList(1, 2, 3, 4);
		// just double the value
		List<Integer> tempList = intList.stream().map(a -> a * 2).collect(Collectors.toList());
		System.out.println(tempList);

		List<Integer> div = Arrays.asList(1, 2, 3, 4);
		List<Integer> tempDiv = div.stream().map(a -> a / 2).collect(Collectors.toList());
		System.out.println(tempDiv);

		List<Integer> add = Arrays.asList(1, 2, 3, 4);
		List<Integer> addTemp = add.stream().map(a -> a + 1).collect(Collectors.toList());
		System.out.println(addTemp);
	}

	public static void main(String[] args) {
		MapExmple map = new MapExmple();
		map.ConvertIntoUppercase();
	}

}
