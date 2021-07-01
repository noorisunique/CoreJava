package com.java8.map.merge;

import java.util.HashMap;

///https://www.programiz.com/java-programming/library/hashmap/merge
public class MainInsertNewEntryWithDublicateKey {

	public static void main(String[] args) {
		// create an HashMap
		HashMap<String, String> countries = new HashMap<>();

		// insert entries to the HashMap
		countries.put("Washington", "America");
		countries.put("Canberra", "Australia");
		countries.put("Madrid", "Spain");
		System.out.println("HashMap: " + countries);

		// merge mapping for key Washington
		String returnedValue = countries.merge("Washington", "USA", (oldValue, newValue) -> oldValue + "/" + newValue);
		System.out.println("Washington: " + returnedValue);

		// print updated HashMap
		System.out.println("Updated HashMap: " + countries);
	}
}