package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//https://www.geeksforgeeks.org/stream-flatmap-java-examples/
public class MapFlatExample1 {

	public static void main(String[] args) {

		List<Integer> primeNumber = Arrays.asList(5, 7, 13, 17);
		List<Integer> evenNumber = Arrays.asList(2, 4, 6, 8);
		List<Integer> oddNumber = Arrays.asList(1, 5, 7, 9);

		List<List<Integer>> listOfListofInts = Arrays.asList(primeNumber, evenNumber, oddNumber);

		System.out.println("The Structure before flattening is : " + listOfListofInts);
		List<Integer> listofInts = listOfListofInts.stream().flatMap(x -> x.stream()).collect(Collectors.toList());
		System.out.println("The Structure after flattening is : " + listofInts);

	}

}
