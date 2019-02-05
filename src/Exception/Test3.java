package com.Exception;

import java.io.IOException;

class AA {
	public void m1() throws IOException {
		System.out.println("M1");
	}
}

class BB extends A {
	public void m1(){
		System.out.println("M1B");
	}

	
}

public class Test3 {

	public static void main(String[] args) {
		A a=new B();
		a.m1();
	}
}
