package com.dinamicbinding;
class A{
	void m1() {
		System.out.println("A's m1");
	}
	
	void m2() {
		System.out.println("A's m2");
	}
}

class B extends A{
	void m1() {
		System.out.println("B's m1");
	}
	
	void m3() {
		System.out.println("B's m3");
	}
}

public class Test {

	public static void main(String[] args) {
		/*B b = new A();
		b.m1(); 
		b.m2();
		b.m3();*/

		A a = new B();
		a.m1();//B's m1
		a.m2();//A's m2
		//a.m3();//compilation error

		
		int a1 = 5;//4
		int b = 10;
				
		if(b-a1-- > a1) {//5 >4
			if(a1 % 2 == 0) {
				System.out.println("in the if clause");
			}else {
				System.out.println("in the else clause");
			}
		}
	}

}
