package com.polimorphism;

class Animal {
	void eat() {
		System.out.println("animal is eating...");
	}
}

class Dog extends Animal {
	void eat() {
		System.out.println("dog is eating...");
	}

}

public class DynamicBinding {

	public static void main(String[] args) {
		Animal dog = new Dog();
		dog.eat();

	}

}
