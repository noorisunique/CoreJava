package com.FindDublicate;

import java.util.Arrays;

public class DublicateNumberinArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,1,2,3};
		Arrays.sort(a);
		for(int i=1;i<a.length;i++) {
			if(a[i]==a[i-1]) {
				System.out.println(a[i]);
			}
		}
		
		
	}

}
