package com.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Company2 {

	public static void main(String[] args) {
		String[] strings = new String[] { "abD", "aB", "ABC", "cDe", "CDd" };
		
		Collections.sort(Arrays.asList(strings),String::compareToIgnoreCase);
		for (String string : strings) {
			System.out.println(string);
		}
		
		
	}

}
