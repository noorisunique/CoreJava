package com.design.pattern.decorator2;

public interface Shape {
	void draw();
}

class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Shape: Rectangle");
	}
}

class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Shape: Circle");
	}
}