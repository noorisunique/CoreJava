package com.String;

import java.util.Scanner;
import java.util.regex.Pattern;

public class VowelCounter {
	public static void main(String args[]) {
		System.out.println("Please enter some text");
		Scanner reader = new Scanner(System.in);
		String input = reader.nextLine();
		char[] letters = input.toCharArray();
		int count = 0;
		for (char c : letters) {
			switch (c) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
				break;
			default:

			}
		}
		System.out.println("Number of vowels in String [" + input + "] is : " + count);

		String str = "Noor";
		int vowel = 0;
		int consonents = 0;
		char[] charArr = str.toCharArray();
		for (char c : charArr) {
			if (Pattern.matches("[aeiou]", Character.toString(c)))
				vowel++;
			else {
				consonents++;
			}
		}
		System.out.println(vowel + " " + consonents);

	}
}
