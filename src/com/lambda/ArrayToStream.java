package com.lambda;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayToStream {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5 };
		IntStream s=Arrays.stream(a);
		s.forEach(x->System.out.println(x));
	}
}
