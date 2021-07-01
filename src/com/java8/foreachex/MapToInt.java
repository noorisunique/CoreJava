package com.java8.foreachex;

import java.util.Arrays;
import java.util.List;

///https://www.geeksforgeeks.org/functional-programming-in-java-with-examples/
public class MapToInt {
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
		System.out.println(list.stream().filter(n -> n % 2 == 1).mapToInt(e -> e * e).reduce(Integer::sum).getAsInt());
		
			
	}

}
