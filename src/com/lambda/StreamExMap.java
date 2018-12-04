package com.lambda;
//In Java 8, stream().map() lets you convert an object to something else. Review the following examples :

import java.util.*;
import java.util.stream.Collectors;

public class StreamExMap {

	public static void main(String[] args) {

		List<String> lines = Arrays.asList("A1", "A2", "A3", "A4");
		List<String> result = lines.stream().filter(x -> "A1".equals("A1")).map(String::toLowerCase)
				.collect(Collectors.toList());

		result.forEach(x -> System.out.println(x));

		List<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		
		List<Integer> res=list.stream()
				.map(x->x*2)
				.collect(Collectors.toList());
		
		res.forEach(x->System.out.println(x));

	}
}
