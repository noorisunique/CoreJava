package com.array;

import java.util.*;

public class NthSmallestNumberWithUnSortedArray {
	public static void main(String[] args) {
		int a[] = { 12, 3, 5, 7, 19 };
		int k=2;
		Arrays.sort(a);
		System.out.println("kth smallest element "+a[k-1]);
		System.out.println("kth largest element "+a[a.length-2]);
		
	}
}
