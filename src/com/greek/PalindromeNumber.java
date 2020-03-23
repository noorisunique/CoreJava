package com.greek;

//https://leetcode.com/problems/palindrome-number/
public class PalindromeNumber {
	public static boolean isPalindrome(int x) {
		int r = 0;
		int sum = 0;

		while (x > 0) {
			sum = sum * 10 + x % 10;
			x = x / 10;

		}
		if (x == sum)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome(121));

	}

}
