package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

//https://mkyong.com/java8/java-8-predicate-examples/#:~:text=In%20Java%208%2C%20Predicate%20is,for%20a%20collection%20of%20objects.
public class PredicateInFilter {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4);
		List<Integer> collect = list.stream().filter(i -> i > 1).collect(Collectors.toList());
		System.out.println(collect);

		Predicate<Integer> value = (i) -> i > 1;

		List<Integer> list2 = list.stream().filter(value).collect(Collectors.toList());
		System.out.println(list2);

	}

}
