package com.sapient;

import java.util.Arrays;

public class sortAlphaNumberCharacter {
	public static void main(String[] args) {
		String input = "CAE2W3@D#";
		int len = input.length();
		char[] arr = new char[len];
		String output = "";
		int sum = 0;
		boolean digitPresent = false;
		String specialOutput = "";
		for (int i = 0; i < len; i++) {
			char c = input.charAt(i);
			if (Character.isAlphabetic(c)) {
				arr[i] = c;
			} else if (Character.isDigit(c)) {
				digitPresent = true;
				sum = sum + Integer.parseInt(String.valueOf(c));
			} else {
				specialOutput = specialOutput.concat(String.valueOf(c));
			}
		}
		Arrays.sort(arr);
		for (char c : arr) {
			output = output.concat(String.valueOf(c));
		}

		if (digitPresent)
			output = output.concat(String.valueOf(sum)).concat(specialOutput);
		else
			output = output.concat(specialOutput);
		System.out.println("output is " + output);
	}
}