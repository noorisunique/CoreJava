package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//https://www.youtube.com/watch?v=b0On2gN020k
public class ReduceExample {

	// what was the issue without reduce
	public void withoutReduceForInteger() {
		List<Integer> list = Arrays.asList(1, 2, 3, 4);
		int result = 0;

		for (int i : list) {
			result = result + i * 2;
		}

		System.out.println(result);
		System.out.println(list.stream().reduce(2, (a, b) -> a + b));
	}

	public void reduceForInteger() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);

		System.out.println(list.stream().reduce((a, b) -> a + b));// ((1+2)+3)+4
		System.out.println(list.stream().reduce(0, (a, b) -> a + b));

		System.out.println(list.stream().reduce((a, b) -> a * b));
		System.out.println(list.stream().reduce(1, (a, b) -> a * b));

	}

	public void reduceForString() {
		List<String> list = new ArrayList<>();
		list.add("Noor");
		list.add("amair");
		list.add("Amit");
		list.add("Rajul Kumar");
		list.add("Sandeep");
		list.add("Noor");

		Optional<String> value = list.stream()
				.reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2);
		System.out.println(value);
	}

	public static void main(String[] args) {
		ReduceExample reduce = new ReduceExample();
		System.out.println("**withoutReduceForInteger**");
		reduce.withoutReduceForInteger();
		System.out.println("**withReduceForInteger**");
		reduce.reduceForInteger();
		reduce.reduceForString();
	}

}
