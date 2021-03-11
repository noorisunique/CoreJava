package com.java8;

import java.util.function.Predicate;

//https://mkyong.com/java8/java-8-predicate-examples/#:~:text=In%20Java%208%2C%20Predicate%20is,for%20a%20collection%20of%20objects.
public class PredicateEx1 {

	public static void main(String[] args) {
		Predicate<Integer> value = (i) -> {
			boolean a = i == 2;
			return a;
		};
		System.out.println(value.test(1));

	}

}
