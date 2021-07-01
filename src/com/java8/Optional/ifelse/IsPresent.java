package com.java8.Optional.ifelse;

import java.util.HashMap;
import java.util.Optional;

public class IsPresent {

	public static void main(String[] args) {
		UserDictionary userDictionary = new UserDictionary();
		userDictionary.addUser(3, "Noor");
		for (int i = 0; i < 4; i++) {
			Optional optName = userDictionary.getUserByNumber(i);
			if (optName.isPresent()) {
				System.out.println("Name " + i + " is " + optName.get());
			} else {
				System.out.println("Name " + i + " is not found.");
			}
		}
	}
}