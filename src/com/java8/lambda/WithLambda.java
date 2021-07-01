package com.java8.lambda;

interface Drawable1 {
	public void draw();
}

interface Drawable2 {
	public int draw();
}

interface Drawable3 {
	public int draw(int a);
}

interface Drawable4 {
	public int draw(int a, int b);
}

public class WithLambda {

	public static void main(String[] args) {
		Drawable1 d1 = () -> {
			System.out.println("With Lambda");
		};
		d1.draw();

		Drawable2 d2 = () -> {

			return 10;
		};
		System.out.println(d2.draw());

		Drawable3 d3 = (a) -> {

			return a;
		};
		System.out.println("d3..." + d3.draw(10));

		Drawable4 d4 = (a, b) -> {
			final int c = a + b;
			return c;
		};
		System.out.println("d4..." + d4.draw(10, 20));
	}

}
