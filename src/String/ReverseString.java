package com.String;

public class ReverseString {
	public static void main(String[] args) {
		String str="Noor";
		char c[]=str.toCharArray();
		for(int i=c.length-1;i>=0;i--) {
			System.out.print(c[i]);
		}
	}
}
