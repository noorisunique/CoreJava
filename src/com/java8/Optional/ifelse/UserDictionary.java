package com.java8.Optional.ifelse;

import java.util.HashMap;
import java.util.Optional;

public class UserDictionary {

	final HashMap<Integer, String> theList = new HashMap<>();

	UserDictionary() {
		theList.put(0, "John Doe");
		theList.put(1, "Alfred Neuman");
		theList.put(2, "John Galt");
	}

	void addUser(int number, String name) {
		theList.put(number, name);
	}

	Optional getUserByNumber(int number) {
		return Optional.ofNullable(theList.get(number));
	}
}