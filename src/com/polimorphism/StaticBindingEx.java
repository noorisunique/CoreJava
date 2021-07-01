package com.polimorphism;

public class StaticBindingEx {

	private void eat() {
		System.out.println("dog is eating...");
	}

	public static void main(String args[]) {
		StaticBindingEx d1 = new StaticBindingEx();
		d1.eat();
	}
}