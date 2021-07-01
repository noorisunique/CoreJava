package com.amdoc;

public class Test5 {
	
	public  void printSt(){
		System.out.println("Test5");
	}
	public static void main(String[] args) {
		Test5 a=new B();
		a.printSt();

	}

}
class B extends Test5{
	
	public void printSt(){
		super.printSt();
		System.out.println("BBBBB");
	}
}