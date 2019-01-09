package com.wildcard;

import java.util.Arrays;
import java.util.List;

public class LowerBoundWildcard {
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
		sum(list1);
		List<Number> number = Arrays.asList(1, 2, 3, 4, 5.0, 8.0);
		sum2(number);

	}

	// problem , Number can hold byte, double, float, int, long, and short
	public static void sum2(List<Number> list) {
		double sum = 0;
		for (Number n : list) {
			sum += n.doubleValue();
		}
		System.out.println(sum);
	}

	// Upper Bounded Wildcard
	public static int sum1(List<? extends Number> list) {
		int sum = 0;
		for (Number n : list) {
			sum += n.intValue();
		}
		return sum;
	}

	// LowerBoundWildcard - Number and Object can also hold integer but double
	// also we need only number
	public static void sum(List<? super Integer> list) {
		System.out.println(list);
	}

	// Unbounded Wildcard
	public static void printData(List<?> list) {
		for (Object obj : list) {
			System.out.print(obj + "::");
		}
	}
}
