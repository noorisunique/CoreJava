package com.dynamicBinding;
//Why binding of static, final and private methods is always a static binding? 

class A {
	public static void get() {
		System.out.println("Noor");
	}
}

public class StaticClass {

	public static void main(String[] args) {
		A st = new A();
		st.get();
		A.get();
		A st1 = null;
		st1.get();
	}
}