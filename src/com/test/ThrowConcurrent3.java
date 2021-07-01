package com.test;

import java.util.*;

public class ThrowConcurrent3 {

	public static void main(String[] args) {
		 List<String> listOfBooks = new ArrayList<>();

	        listOfBooks.add("Programming Pearls");

	        listOfBooks.add("Clean Code");

	        listOfBooks.add("Effective Java");

	        listOfBooks.add("Code Complete");

	 

	        Iterator<String> iterator = listOfBooks.iterator();

	        while (iterator.hasNext()) {

	            String book = iterator.next();

	            listOfBooks.remove(book);

	        }

	    }
}