package com.array;

public class LargeandSmall {
	public static void main(String[] args) {
		int a[] = { 50, 6, 5, 4, 7, 9, 21, 1 ,23};
		int large = a[0];
		int small = a[0];
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] > large) {
				large=a[i];
			}
			if(a[i]<small) {
				small=a[i];
			}
		}
		System.out.println("smalles elemeent->"+small);
		System.out.println("largest elemeent->"+large);
		
	}
}
