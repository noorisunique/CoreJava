package com.java8.Optional.ifelse;

import java.util.Optional;

public class OrElse {

	public static void main(String[] args) {

		UserDictionary userDictionary = new UserDictionary();
		for (int i = 0; i < 4; i++) {
			String user = (String) userDictionary.getUserByNumber(i).orElse("Name not found!");
			System.err.println("Name " + i + " is " + user);
		}

	}

}
