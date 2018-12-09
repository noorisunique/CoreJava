package com.instanceOf;

class Animal1 {
	public void get() {
		System.out.println("Animal");
	}
}

class Dog3 extends Animal1 {
	public void get() {
		System.out.println("Dog");
	}
	public void test(){
		System.out.println("Test");
	}

	static void method(Animal1 a) {
		if (a instanceof Dog3) {
			Dog3 d = (Dog3) a;// downcasting
			System.out.println("ok downcasting performed");
			d.get();
			d.test();
		}
	}

	public static void main(String[] args) {
		Animal1 a = new Dog3();
		Dog3.method(a);
	}

}