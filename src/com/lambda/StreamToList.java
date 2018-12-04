package com.lambda;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamToList {
	public static void main(String[] args) {
		Stream<String> s=Stream.of("A","B");
		List<String> list=s.collect(Collectors.toList());
		list.forEach(x->System.out.println(x));
	}
}
