package com.String.compareex;

public class CompareEx {

	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "abc";
		System.out.println(s1 == s2);
		String s3 = new String("abc");
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s3));

	}

}
