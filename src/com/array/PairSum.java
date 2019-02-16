package com.array;

public class PairSum {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, -2};
		int sum=7;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if((a[i]+a[j])==sum) {
					System.out.println("("+a[i]+" "+a[j]+")"+" "+sum);
				}
			}
		}
	}
}
