package com.java8;

@FunctionalInterface
interface Interface1 {

	void method1(String str);

	default void log(String str) {
		System.out.println("Log");
	}

	static void print(String str) {
		System.out.println("Print");
	}
}

interface Interface2 {
	
	void method2(String str);

	default void log(String str) {
		System.out.println("Log...");
	}
}

class Test implements Interface1, Interface2{

	public void method2(String str){
		
	}
	public void method1(String str){
		
	}
	public void log(String str){
		System.out.println("Log................"+str);
	}
}

public class FunctionalInterfaceEx {
	public static void main(String[] args) {
		Test t=new Test();
		t.log("Noor");
	}
}
