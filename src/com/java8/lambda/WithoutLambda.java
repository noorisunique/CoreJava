package com.java8.lambda;

interface Drawable {
	public void draw();
}

public class WithoutLambda {

	public static void main(String[] args) {
		Drawable d1 = new Drawable() {

			@Override
			public void draw() {
				System.out.println("Noor...");

			}
		};

		d1.draw();
	}

}
