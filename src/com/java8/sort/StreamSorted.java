package com.java8.sort;

import java.util.*;
import java.util.stream.Collectors;

public class StreamSorted {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("ddsdsdsdsdsd", "f", "d", "a",
				"c", "w");
		
		names
		.stream()
		.filter(x->x.length()>10)
		.map(s->s.toUpperCase())
		.sorted()
		.collect(Collectors.toList());
		
		System.out.println(names
				.stream()
				.map(s->s.toUpperCase())
				.sorted()
				.collect(Collectors.toList()));
	}

}
