package com.java8;

import java.util.stream.IntStream;

public class PallendromInJava {

	public static void main(String[] args) {
		String name = "NooN";

		boolean vale = IntStream.range(0, name.length() / 2)
				.noneMatch(i -> name.charAt(i) != name.charAt(name.length() - i - 1));
		if (vale) {
			System.out.println("Palindrome");
		}

	}

}
