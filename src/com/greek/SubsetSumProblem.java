package com.greek;

public class SubsetSumProblem {

	public static void main(String[] args) {
		int a[] = { 1,3,7,5 };
		int sum = 8;
		for (int i = 0; i < a.length; i++) {
			for (int j = 1; j < a.length; j++) {
				if (a[i] + a[j] == sum) {
					System.out.println(a[i]+" "+a[j]+" = "+sum);
				}
			}
		}
	}

}
