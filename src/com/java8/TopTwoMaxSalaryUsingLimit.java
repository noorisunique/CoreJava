package com.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TopTwoMaxSalaryUsingLimit {

	public static void main(String[] args) {
		int a[] = { 5, 1, 3, 8, 2, 4 };
		Arrays.stream(a).sorted().limit(2).forEach(n -> System.out.println(n));

		List list = Arrays.asList(1, 2, 3, 4, 5, 6);
		list.stream().sorted(Comparator.comparing(Employee3::getEid));

	}

}
