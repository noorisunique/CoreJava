package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ExceptionHandling {
	static Consumer<Integer> process(Consumer<Integer> consumer) {
		return i -> {
			try {
				consumer.accept(i);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		};
	}

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 0, 5, 6);
		list.forEach(i -> System.out.println(50 / i));
	}
}
