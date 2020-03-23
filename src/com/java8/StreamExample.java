package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 100; i++) {
			list.add(i);
		}

		// sequential stream
		Stream<Integer> seq = list.stream().filter(p -> p > 90);
		seq.forEach(x->System.out.println(x));
		// parrallel stream
		System.out.println("Parrallel");
		Stream<Integer> par = list.parallelStream().filter(p -> p > 90);
		par.forEach(x->System.out.println(x));
		
	}
}
