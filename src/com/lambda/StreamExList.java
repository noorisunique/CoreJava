package com.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExList {

	public static void main(String[] args) {

		List<String> lines = Arrays.asList("A1", "A2", "A3", "A4");
		List<String> result=lines.stream()
				.filter(x->"A1".equals("A1"))
				.collect(Collectors.toList());
		
		result.forEach(x->System.out.println(x));
				
	}
}
