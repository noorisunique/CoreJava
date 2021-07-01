package com.generics.extend;

import java.util.*;
import java.util.List;

//https://www.codejava.net/java-core/collections/generics-with-extends-and-super-wildcards-and-the-get-and-put-principle
public class Test {
	private static double sum(Collection<? extends Number> numbers) {
		double result = 0.0;

		for (Number num : numbers)
			result += num.doubleValue();

		return result;
	}

	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(2, 4, 6);
		double sum = sum(integers);
		System.out.println("Sum of integers = " + sum);

		List<Double> doubles = Arrays.asList(3.14, 1.68, 2.94);
		sum = sum(doubles);
		System.out.println("Sum of doubles = " + sum);

		List<Number> numbers = Arrays.<Number> asList(2, 4, 6, 3.14, 1.68, 2.94);
		sum = sum(numbers);
		System.out.println("Sum of numbers = " + sum);

		List<? extends Number> numbers1 = new ArrayList<Number>();
		numbers1.add(1);

	}

}
