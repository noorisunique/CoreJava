package com.String;

public class RemoveWhiteSpace {
	public static void main(String[] args) {
		String str="dd ddd  ddd   ";
		System.out.println(str.replaceAll("\\s",""));
	}
}
