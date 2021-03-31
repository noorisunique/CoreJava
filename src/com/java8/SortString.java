package com.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortString {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("c");
		list.add("a");
		list.add("b");
		list.add("h");
		list.add("k");

		Collections.sort(list);
		System.out.println(list);

		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);

		list.stream().sorted().forEach(a -> System.out.println(a));

		list.sort((a, b) -> a.compareTo(b));
		System.out.println(list);

	}

}
