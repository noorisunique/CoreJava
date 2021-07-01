package com.java8.map.merge;

import java.util.HashMap;

///https://www.programiz.com/java-programming/library/hashmap/merge
public class MainInsertNewEntry {

	public static void main(String[] args) {
		// create an HashMap
		HashMap<String, Integer> prices = new HashMap<>();

		// insert entries to the HashMap
		prices.put("Shoes", 200);
		prices.put("Bag", 300);
		prices.put("Pant", 150);
		System.out.println("HashMap: " + prices);

		int returnedValue = prices.merge("Shirt", 100, (oldValue, newValue) -> oldValue + newValue);
		System.out.println("Price of Shirt: " + returnedValue);

		// print updated HashMap
		System.out.println("Updated HashMap: " + prices);
	}
}