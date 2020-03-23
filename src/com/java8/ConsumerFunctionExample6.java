package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerFunctionExample6 {
	public static void execute(int id, Consumer<Consumer<List<Integer>>> consumer) {
		System.out.println(consumer.accept(id));
	}

	public static void main(String args[]) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
		execute(1, i -> {
			try {
				i.accept(list);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		});
	}
}