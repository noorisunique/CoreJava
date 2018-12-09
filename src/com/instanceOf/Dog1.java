package com.instanceOf;

class Animal {
}

class Dog1 extends Animal {// Dog inherits Animal

	public void get(){
		System.out.println("Hey");
	}
	public static void main(String args[]) {
		Dog1 d = new Dog1();
		System.out.println(d instanceof Animal);// true
		
		Dog1 d2=(Dog1)new Animal();// down casting is not possible like this
		
		
		
	}
}