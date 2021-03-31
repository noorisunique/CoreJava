package com.String;

public class SubString {
	public static void main(String[] args) {
		String str = "ab,abc,abcd,xy,xyz,xyzc";
		String s[] = str.split(",");
		for (int i = 1; i < s.length; i++) {
			
			if (s[i].contains(s[i-1])) {

			} else {
				System.out.println(s[i]);
			}
			if (i == s.length - 1) {
				System.out.println(s[i]);
			}
		}

	}
}
