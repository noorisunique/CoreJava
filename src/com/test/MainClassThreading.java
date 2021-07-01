package com.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

abstract class Shape {

	public void identify() {

		System.out.println("I'm a shape.");

	}

}

class Rectangle extends Shape {

	@Override

	public void identify() {

		System.out.println("I'm a Rectangle.");

	}

}

class Square1 extends Shape {

	@Override

	public void identify() {

		System.out.println("I'm a Square11.");

	}

}

public class MainClassThreading {
	public static <T> void add1(T obj, Collection<? super T> c) {

		c.add(obj);

	}

	public static <U, T extends U> void add2(T obj, Collection<U> c) {

		c.add(obj);

	}

	public static void main(String s[]) {

		List<Shape> shapeList = new ArrayList<Shape>();

		List<Rectangle> rectangleList = new ArrayList<Rectangle>();

		List<Square1> Square1List = new ArrayList<Square1>();

		add1(new Rectangle(), shapeList); // Line 1

		add2(new Square1(), shapeList); // Line 2

		add1(new Rectangle(), rectangleList); // Line 3

		add2(new Square1(), rectangleList); // Line 4

		add1(new Rectangle(), Square1List); // Line 5

		add2(new Square1(), Square1List); // Line 6

	}

}