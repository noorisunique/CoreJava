package com.greek;

public class ReverseNumber {
	public static int reverse(int x) {
		int n = x;
		int s = 0;
		int r = 0;

		while (x != 0) {
			int temp = r * 10 + x % 10;
			if (temp / 10 != r)
				return 0;
			r = temp;
			x = x / 10;
		}

		return r;
	}

	public static void main(String[] args) {

		System.out.println(reverse(123));
	}

}
