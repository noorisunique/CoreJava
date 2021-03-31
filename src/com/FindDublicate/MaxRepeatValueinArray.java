package com.FindDublicate;

public class MaxRepeatValueinArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,1,2,3,2,23,3,3,3,3,24};
		int max=1,number=0;
		for(int i=0;i<a.length;i++) {
			int counter=1;
			for(int j=1;j<a.length;j++) {
				if(a[i]==a[j])
					counter++;
			}
			if(counter>max) {
				max=counter;
				number=a[i];
			}
		}
		System.out.println(number);

	}

}
