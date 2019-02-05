package com.inheritance;

public class Test4 {
	public static void main(String[] args) {

		String s1 = "Noor";
		String s2 = "Noor";

		String s3 = new String("Noor");
		String s4 = new String("Noor");

		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s1 == s4);
		System.out.println(s3 == s4);

	}
}
