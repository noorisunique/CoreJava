package com.sapient;

import java.util.Arrays;

public class sortAlphaNumberCharacter2 {
	public static void main(String[] args) {
		String input = "CAE2W3@D#";
		char arr[] = new char[input.length()];
		String specialchar = "";
		String alphabetic = "";
		int sum = 0;
		for (int i = 0; i < input.length(); i++) {
			Character character = input.charAt(i);
			if (Character.isAlphabetic(character)) {
				arr[i] = character;
			} else if (character.isDigit(character)) {
				sum = sum + Integer.parseInt(String.valueOf(character));
			} else {
				specialchar = specialchar.concat(String.valueOf(character));
			}
		}
		Arrays.sort(arr);
		for (char c : arr) {
			alphabetic = alphabetic.concat(String.valueOf(c));
		}

	
		System.out.println(alphabetic.concat(String.valueOf(sum)).concat(specialchar));

	}
}