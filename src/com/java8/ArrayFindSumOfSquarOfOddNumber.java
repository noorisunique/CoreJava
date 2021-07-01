package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//http://www.java2s.com/Tutorials/Java/Java_Stream/0020__Java_Stream_Operation.htm
public class ArrayFindSumOfSquarOfOddNumber {

	public static void main(String[] args) {
		// Before Java 8
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		int sum = 0;
		for (int n : numbers) {
			if (n % 2 == 1) {
				int square = n * n;
				sum = sum + square;
			}
		}
		System.out.println("Before Java 8" + sum);

		sum = 0;

		sum = numbers.stream().filter(a -> a % 2 == 1).map(a -> a * a).reduce(0, Integer::sum);

		System.out.println("After Java 8" + sum);

	}

}