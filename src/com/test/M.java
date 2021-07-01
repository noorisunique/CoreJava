package com.test;

import java.util.*;
import java.util.stream.IntStream;

class P {

	String name;

	List<Q> qList = new ArrayList<>();

	P(String name) {

		this.name = name;

	}

}

class Q {

	String name;

	Q(String name) {

		this.name = name;

	}

}

public class M {

	public static void main(String sp[]) {

		IntStream.range(1, 4)

				.mapToObj(i -> new P("P" + i))

				.peek(f -> IntStream.range(1, 4)

						.mapToObj(i -> new Q("Q" + i + " <- " + f.name))

						.forEach(f.qList::add))

				.flatMap(f -> f.qList.stream())

				.forEach(x -> System.out.println(x.name));

	}

}