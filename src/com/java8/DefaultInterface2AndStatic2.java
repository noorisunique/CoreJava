package com.java8;

@FunctionalInterface
interface Interface11 {

	void method1(String str);

	default void log(String str) {
		System.out.println("I1 logging::" + str);
	}

	static void print(String str) {
		System.out.println("Printing " + str);
	}

}

@FunctionalInterface
interface Interface22 {

	void method2();

	default void log(String str) {
		System.out.println("I2 logging::" + str);
	}

}

class MyClass1 implements Interface11, Interface22 {

	@Override
	public void method2() {
	}

	@Override
	public void method1(String str) {
	}

	// MyClass won't compile without having it's own log() implementation
	@Override
	public void log(String str) {
		System.out.println("MyClass logging::" + str);
		Interface11.print("abc");
	}

}

public class DefaultInterface2AndStatic2 {

	public static void main(String[] args) {
		MyClass1 m = new MyClass1();
		m.log("Noor");
	}
}
