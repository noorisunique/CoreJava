package com.wildcard;

import java.util.Arrays;
import java.util.List;

public class LowerBoundWildcard {
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
		sum(list1);

	}

	public static void sum(List<? super Integer> list) {
		System.out.println(list);
	}
}
