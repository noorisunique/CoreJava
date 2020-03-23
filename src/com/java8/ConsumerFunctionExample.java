package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerFunctionExample {
	public static void main(String args[]) {
		Consumer<Integer> consumer = i -> System.out.print(" " + i);
		List<Integer> integerList = Arrays.asList(1,2,3,4,5);
		printList(integerList, consumer);
	}

	public static void printList(List<Integer> listOfIntegers, Consumer<Integer> consumer) {
		for (Integer integer : listOfIntegers) {
			consumer.accept(integer);
		}
	}
}