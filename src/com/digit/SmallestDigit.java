package com.digit;

import java.util.Arrays;

public class SmallestDigit {
	public static void main(String[] args) {
		int inp = 57437821;
		int len = Integer.toString(inp).length();
		int[] arr = new int[len];
		for (int i = 0; i < len; i++) {
			arr[i] = inp % 10;
			inp = inp / 10;
		}
		Arrays.sort(arr);
		int num = 0;
		for (int i = 0; i < len; i++) {
			num = (num * 10) + arr[i];
		}
		System.out.println(num);
	}
}
