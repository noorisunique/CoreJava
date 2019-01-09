package com.wildcard;

public class GenericsMethods {

	// Java Generic Method
	public static <T> boolean isEqual(GenericsTypeT<T> g1, GenericsTypeT<T> g2) {
		return g1.get().equals(g2.get());
	}

	public static void main(String args[]) {
		GenericsTypeT<String> g1 = new GenericsTypeT<>();
		g1.set("Pankaj");

		GenericsTypeT<String> g2 = new GenericsTypeT<>();
		g2.set("Pankaj");

		boolean isEqual = GenericsMethods.<String>isEqual(g1, g2);
		// above statement can be written simply as
		isEqual = GenericsMethods.isEqual(g1, g2);
		// This feature, known as type inference, allows you to invoke a generic
		// method as an ordinary method, without specifying a type between angle
		// brackets.
		// Compiler will infer the type that is needed
	}
}