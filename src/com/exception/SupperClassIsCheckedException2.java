package com.exception;

import java.io.IOException;

class A2 {
	void m1() throws IOException {
		System.out.println("In m1 A");
	}
}

class B2 extends A2 {
	void m1() {
		System.out.println("In m1 B");
	}

	void m2() {
		System.out.println("In m2 B");
	}
}

public class SupperClassIsCheckedException2 {

	public static void main(String[] args) {
		A2 a = new B2();
		try {
			a.m1();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // compile time error

	}
}
