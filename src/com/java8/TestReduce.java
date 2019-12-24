package com.java8;

import java.util.Arrays;
import java.util.List;

//Serif@123
public class TestReduce {

	public static void main(String[] args) {
		// create a list of integers
		List<Integer> number = Arrays.asList(2, 3, 4, 5);
		int even = number.stream().filter(x -> x % 2 == 1).reduce(0, (ans, i) -> ans + i);
		System.out.println(even);

	}

}
