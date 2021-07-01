package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Company {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 3, 7, 4, 6, 8, 10);

		System.out.println(numbers.stream().map(i -> i * 1.0 / numbers.stream().mapToInt(Integer::intValue).sum())
				.collect(Collectors.toList()));
	}

}
