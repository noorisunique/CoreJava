package com.wissen;

import java.text.DecimalFormat;

public class DoubleExample {

	public static void main(String[] args) {

		double a = 13;
		double b = 3;
		System.out.println(a / b);

		double d = 1.234567;
		DecimalFormat df = new DecimalFormat("#.##");
		System.out.print(df.format(a / b));

	}

}
