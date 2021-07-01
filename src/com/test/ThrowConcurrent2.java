package com.test;

import java.util.*;

public class ThrowConcurrent2 {

	public static void main(String[] args) {
		List<String> listOfBooks = new ArrayList<>();

		listOfBooks.add("Programming Pearls");

		listOfBooks.add("Clean Code");

		listOfBooks.add("Effective Java");

		listOfBooks.add("Code Complete");

		System.out.println("List before : " + listOfBooks);

		for (int i = 0; i < listOfBooks.size(); i++) {

			String book = listOfBooks.get(i);

			if (book.contains("Programming")) {

				listOfBooks.remove(i);

			}

		}

	}
}