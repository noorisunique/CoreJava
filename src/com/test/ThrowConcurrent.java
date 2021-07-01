package com.test;

import java.util.*;

public class ThrowConcurrent {

	public static void main(String[] args) {
		List<String> listOfBooks = new ArrayList<>();

		listOfBooks.add("Programming Pearls");

		listOfBooks.add("Clean Code");

		listOfBooks.add("Effective Java");

		listOfBooks.add("Code Complete");

		for (String book : listOfBooks) {

			if (book.contains("Code"))
				;

			{

				listOfBooks.remove(book);

			}

		}

	}
}