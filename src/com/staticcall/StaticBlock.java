package com.staticcall;

public class StaticBlock {
	static int a = m1();

	static int m1() {
		System.out.println("m1");
		return 10;
	}

	static {
		System.out.println("static block");
	}

	{
		System.out.println("non static block");
	}

	public static void main(String[] args) {
		StaticBlock s1=new StaticBlock();
		StaticBlock s2=new StaticBlock();
		

	}

}
