package com.wildcard;

import java.util.Arrays;
import java.util.List;

public class UpperBoundWildcards {
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
		System.out.println(sum(list1));
		
	}

	public static int sum(List<? extends Number> list) {
		int sum=0;
		for (Number n : list) {
			sum+=n.intValue();
		}
		return sum;
	}
}
