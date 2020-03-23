package com.sapient;

class ABC {
	public static void test() {
		System.out.println("Hello");
	}
}

public class ABCD {
	public static void main(String[] args) {
		ABC abc = null;
		abc.test();
	}
}
