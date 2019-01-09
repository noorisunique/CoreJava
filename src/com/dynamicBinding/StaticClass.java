package com.dynamicBinding;

//Why binding of static, final and private methods is always a static binding? 
class A {
	public void get() {
		System.out.println("NOOR");
	}

	public static void put() {
		System.out.println("PUT");
	}

}

public class StaticClass {

	public static void main(String[] args) {

		A st1 = null;
		st1.put();
		st1.get(); // null pointer Exception

	}
}