package com.java8;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class MaxValueOptionalExample {

	public static void main(String[] args) {
		OptionalInt maxOdd = IntStream.of(10, 20, 30, 3).filter(i -> i % 2 == 1).max();
		if (maxOdd.isPresent()) {
			int odd = maxOdd.getAsInt();
			System.out.println(odd);
		} else {
			System.out.println("Stream is empty");
		}

	}

}
