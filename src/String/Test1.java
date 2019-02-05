package com.String;

public class Test1 {

	public static void main(String[] args) {
		String s1="Noor";
		String s2="Noor";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		String s3=new String("Noor");
		String s4=new String("Noor");
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		System.out.println(s1.equals(s4));
	}

}
