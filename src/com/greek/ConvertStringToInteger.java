package com.greek;

import java.util.List;
//https://www.youtube.com/watch?v=lJy5GhKYHl0
public class ConvertStringToInteger {
	public static int myAtoi(String str) {
		if (str == null || str.length() == 0)
			return 0;

		double result = 0;
		str = str.trim();

		boolean isNegative = false;
		int startIndex = 0;

		if (str.charAt(0) == '+' || str.charAt(0) == '-') {
			startIndex++;
		}
		if (str.charAt(0) == '-') {
			isNegative = true;
		}

		// handle Normal case "123"
		for (int i = startIndex; i < str.length(); i++) {
			if (str.charAt(i) < '0' || str.charAt(i) > '9') {
				break;
			}

			int digitValue = (int) (str.charAt(i) - '0');// '9'-'0'
			result = result * 10 + digitValue;
		}

		if (isNegative) {
			result = -result;
		}

		// handle out of integer range		
		if (result > Integer.MAX_VALUE) {
			return Integer.MAX_VALUE;
		}
		if (result < Integer.MIN_VALUE) {
			return Integer.MIN_VALUE;
		}

		return (int) result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(myAtoi("-77"));
	}

}
