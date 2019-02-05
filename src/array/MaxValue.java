package com.array;

public class MaxValue {
	public static void main(String[] args) {
		int a[] = { 11, 5, 3, 1, 2, 8, 2, 4, 90 };
		int max=0;
		for(int i=1;i<a.length-4;i++) {
			
				if(a[i]>a[i-1]) {
					 max=a[i];
				}
			
		}
		System.out.println(max);
	}
}
