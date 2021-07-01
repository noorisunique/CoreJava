package com.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
//https://mkyong.com/java8/java-8-find-duplicate-elements-in-a-stream/#:~:text=In%20Java%208%20Stream%2C%20filter,stream()%20.

public class DublicateInteger {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(5, 3, 4, 1, 3, 7, 2, 9, 9, 4);
		Set<Integer> set1 = findBublicate(list);
		set1.forEach(System.out::println);

		Set<Integer> set2 = findDuplicateByGrouping(list);
		set2.forEach(System.out::println);

		Set<Integer> set3 = findDuplicateByFrequency(list);
		set3.forEach(System.out::println);

	}

	public static <T> Set<T> findBublicate(List<T> list) {
		Set<T> set = new HashSet<>();

		return list.stream().filter(n -> !set.add(n)).collect(Collectors.toSet());
	}

	public static <T> Set<T> findDuplicateByGrouping(List<T> list) {

		return list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet()
				.stream()

				.filter(m -> m.getValue() > 1)

				.map(Map.Entry::getKey).collect(Collectors.toSet());

	}

	public static <T> Set<T> findDuplicateByFrequency(List<T> list) {

		return list.stream().filter(i -> Collections.frequency(list, i) > 1).collect(Collectors.toSet());

	}
}
