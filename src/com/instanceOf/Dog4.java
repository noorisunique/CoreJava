package com.instanceOf;

class Animal2 {
	public void get() {
		System.out.println("Animal");
	}
}

class Dog4 extends Animal2 {
	public void get() {
		System.out.println("Dog");
	}
	public void test(){
		System.out.println("Test");
	}

	static void method(Animal2 a) {
		
			Dog4 d = (Dog4) a;// downcasting
			System.out.println("ok downcasting performed");
			d.get();
			d.test();
		
	}

	public static void main(String[] args) {
		Animal2 a = new Dog4();
		Dog4.method(a);
		
		Animal2 a1=new Animal2();
		Dog4.method(a1);////Now ClassCastException but not in case of instanceof operator  
	}

}