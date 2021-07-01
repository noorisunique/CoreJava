package com.java8;

import java.util.Arrays;
import java.util.List;

public class Map1 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

		System.out.println(list.stream().filter(x -> x % 2 == 1).map(x -> x * x).mapToInt(Integer::intValue).max().getAsInt());

	}

}
