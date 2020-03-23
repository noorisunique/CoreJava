package com.greek;

public class ConvertIntegerToRoman {

	public static String intToRoman(int num) {
		int[] arabics = { 1000, 500, 100, 50, 10, 5, 1 };
		String romans[] = new String[] { "M", "D", "C", "L", "X", "V", "I" };

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < arabics.length; i++) {
			while (num - arabics[i] >= 0) {
				sb.append(romans[i]);
				num = num - arabics[i];
			}
		}

		return sb.toString();
	}

	public static void main(String[] args) {
		System.out.println(intToRoman(400));

	}

}
