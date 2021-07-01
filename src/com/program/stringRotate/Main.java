package com.program.stringRotate;

public class Main {

	public static boolean checkRotatation(String original, String rotation) {
		if (original.length() != rotation.length()) {
			return false;
		}
		String concatenated = original + original;
		System.err.println(concatenated);
		if (concatenated.indexOf(rotation) != -1) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) throws Exception {

		String input = "abcd";

		String rotation = "dabc";
		if (checkRotatation(input, rotation)) {
			System.out.println(input + " and " + rotation + " are rotation of each other");
		} else {
			System.out.println("Sorry, they are not rotation of another");
		}

	}
}
