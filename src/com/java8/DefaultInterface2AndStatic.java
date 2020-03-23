package com.java8;

interface Left {
	default void m1() {
		System.out.println("Left.................");
	}
}

interface Right {
	default void m1() {
		System.out.println("Right ......................");
	}
}

interface Static{
	public static void get(){
		System.out.println("Statick...................");
	}
}
class MyClass implements Left, Right {
	public void m1() {
		Right.super.m1();
	}
}

public class DefaultInterface2AndStatic {

	public static void main(String[] args) {
		Static.get();
		MyClass m = new MyClass();
		m.m1();
	}
}
