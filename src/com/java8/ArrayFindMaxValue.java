package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayFindMaxValue {

	public static void main(String[] args) {
		int a[] = { 2, 4, 8, 9, 1, 3, 4 };

		// sum
		System.out.println(Arrays.stream(a).sum());
		// One Way
		int min = Arrays.stream(a).min().getAsInt();
		System.out.println(min);

		int max = Arrays.stream(a).max().getAsInt();
		System.out.println(max);

		// Using List
		List<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 10, 3, 4, 5));
		// find sum using reduce

		System.out.println("Sum array--- Reduce   " + arrayList.stream().reduce(0, (a1, b1) -> a1 + b1));

		System.out.println("Max array--- Reduce   " + arrayList.stream().reduce(0, (a1, b1) -> {

			if (a1 > b1) {
				a1 = a1;
			} else {
				a1 = b1;
			}
			return a1;
		}));

		System.out.println("Min array--- Reduce   " + arrayList.stream().reduce(0, (a1, b1) -> {

			if (b1 > a1) {
				b1 = b1;
			} else {
				b1 = a1;
			}
			return b1;
		}));
		int b = arrayList.stream().max(Integer::compare).get();
		System.out.println("-----" + b);

		System.out.println(arrayList.stream().mapToInt(Integer::intValue).max().getAsInt());

	}

}

//https://www.baeldung.com/java-array-min-max
//https://stackoverflow.com/questions/27570295/java-8-find-max