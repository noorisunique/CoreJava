package com.java8.Optional.ifelse;

import java.util.Optional;

public class OrElseThrow {

	public static void main(String[] args) throws Throwable {

		UserDictionary userDictionary = new UserDictionary();
		for (int i = 0; i < 4; i++) {
			String user = (String) userDictionary.getUserByNumber(i).orElseThrow(() -> new Exception("Name not found!"));
			System.err.println("Name " + i + " is " + user);
		}

	}

}
