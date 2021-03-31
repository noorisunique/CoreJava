package com.java8;

import java.util.Arrays;

public class Test111 {

	public static void main(String[] args) {
		int a[] = { 1, 6, 54, 3, 2 };
		int min = Arrays.stream(a).min().getAsInt();
		System.out.println(min);
	}

}
