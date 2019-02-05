package com.array;

import java.util.*;

public class NthLargNumberWithSortedArray {
	public static void main(String[] args) {
		// int a[]= {2,4,9,5,6,1,9,10,33,11};

		//1. Using Arrays
		/*
		 * Arrays.sort(a); int l=a.length; for(int i=0;i<l;i++) {
		 * System.out.print(" "+a[i]); } System.out.println("  F->"+a[l-2]);
		 */

		
		//2. Using Collection
		/*
		 * Integer a[] = { 2, 4, 9, 5, 6, 1, 9, 10, 33, 11 }; List<Integer> list =
		 * Arrays.asList(a);
		 * 
		 * Collections.sort(list); int l = a.length; for (int i = 0; i < l; i++) {
		 * System.out.print(" " + a[i]); }
		 * 
		 * System.out.println("----->"+list.get(l - 2));
		 */
		
		
		//3. useing sorting
		int a[] = { 4, 3, 1, 90, 66, 33, 88 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(" " + a[i]);
		}
		System.out.println("largest: "+a[a.length-2]);
	}
}
