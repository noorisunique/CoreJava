package com.sapient;
//https://www.geeksforgeeks.org/longest-palindromic-substring-set-2/
public class LongestPalinSubstring {
	static void printSubStr(String str, int low, int high) {
		System.out.println(str.substring(low, high));
	}
	static int longestPalSubstr(String str) {
		int maxLength = 1; // The result (length of LPS)
		int start = 0;
		int len = str.length();
		int low, high;
		for (int i = 1; i < len; ++i) {
			low = i - 1;
			high = i + 1;
			while (low >= 0 && high < len && str.charAt(low) == str.charAt(high)) {
				if (high - low + 1 > maxLength) {
					start = low;
					maxLength = high - low + 1;
				}
				--low;
				++high;
			}
		}
		System.out.print("Longest palindrome substring is: ");
		printSubStr(str, start, start + maxLength);
		return maxLength;
	}
	public static void main(String[] args) {
		String str = "122243323341";
		System.out.println(str.substring(0,3));
		System.out.println("Length is: " + longestPalSubstr(str));
	}
}