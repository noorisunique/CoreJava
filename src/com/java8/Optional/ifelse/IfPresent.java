package com.java8.Optional.ifelse;

import java.util.Optional;

public class IfPresent {

	public static void main(String[] args) {
		UserDictionary user = new UserDictionary();
		Optional optional = user.getUserByNumber(1);
		optional.ifPresent(id -> {
			id=10;
			System.out.println(id);
		});

	}

}
