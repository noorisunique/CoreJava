package com.test;

final class Algo {

	public static <T> T max(T x, T y) { // Line 1

		return x > y ? x : y; // Line 2

	}

}

public class Demo {

	public static void main(String s[]) {

		System.out.println(Algo.max(10, 20));

	}

}
