package com.array;

import java.util.Arrays;

public class RepeatedValun {

	public static void main(String[] args) {
		int a[] = { 10, 20, 1, 2, 3, 1, 2, 3, 4, 5,20 };
		Arrays.sort(a);
		for (int i = 0; i < a.length-1; i++) {
			if(a[i]==a[i+1]) {
				System.out.println(a[i]);
			}
		}
	}
}
