package com.wildGeneric;
//<? extends Number>, it means any child class of Number e.g. Integer, Float, double etc

import java.util.*;

abstract class Shape {
	abstract void draw();
}

class Rectangle extends Shape {
	void draw() {
		System.out.println("drawing rectangle");
	}
}

class Circle extends Shape {
	void draw() {
		System.out.println("drawing circle");
	}
}

public class Wildcard {
	public static void drawShap(List<? extends Shape> list) {
		for (Shape e : list) {
			e.draw();
		}
	}

	public static void main(String[] args) {
		List<Rectangle> list1=new ArrayList<>();
		list1.add(new Rectangle());
		
		List<Circle> list2=new ArrayList<>();
		list2.add(new Circle());
		
		drawShap(list1);
		drawShap(list2);
		
	}
}
