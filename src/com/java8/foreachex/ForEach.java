package com.java8.foreachex;

import java.util.Arrays;
import java.util.List;
///https://www.geeksforgeeks.org/functional-programming-in-java-with-examples/
public class ForEach {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
		list.forEach(n -> System.out.println(n));
		
	}

}
