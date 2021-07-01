package com.java8;

import java.util.function.Supplier;

//https://eherrera.net/ocpj8-notes/04-lambda-built-in-functional-interfaces
public class SupplierEx {

	public static void main(String[] args) {
		int n = 3;
		display(() -> n + 10);
		display(() -> n + 100);
	}

	static void display(Supplier<Integer> arg) {
		System.out.println(arg.get());
	}
}