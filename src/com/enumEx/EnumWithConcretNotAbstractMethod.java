package com.enumEx;

import java.util.Scanner;

enum Color1 {
	RED, GREEN, BLUE;

	// enum constructor called separately for each
	// constant
	private Color1() {
		System.out.println("Constructor called for : " + this.toString());
	}

	// Only concrete (not abstract) methods allowed
	public void colorInfo() {
		System.out.println("Universal Color");
	}
}

// Driver class that contains an object of "day" and
// main().
public class EnumWithConcretNotAbstractMethod {

	public static void main(String[] args) {
		Color1 c1 = Color1.RED;
		System.out.println(c1);
		c1.colorInfo();
	}

}