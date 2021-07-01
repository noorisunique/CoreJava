package com.test;

interface Square {

	public int getArea();

}

public class MainClass {

	private int sides = 10;

	public static void main(String[] args) {

		Square impl = new Square() {

			int sides = 5;

			public int getArea() {

				return sides * sides;

			}

			public int getPerimeter() {

				return sides * 4;

			}

		};

		MainClass mainClass = new MainClass();

		System.out.println(impl.getArea() + impl.getPerimeter() + mainClass.sides);

	}

}