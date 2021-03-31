package com.exception;


class A3 {
	void m1() throws ArithmeticException{
		System.out.println("In m1 A");
	}
}

class B3 extends A3 {
	void m1() {
		System.out.println("In m1 B");
	}

	void m2() {
		System.out.println("In m2 B");
	}
}

public class SupperClassIsUnCheckedException3 {

	public static void main(String[] args) {
		A3 a = new B3();
		a.m1();

	}
}
