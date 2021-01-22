package com.singleton;

public class Singleton {
	private static final Singleton INSTANCE = new Singleton();

	private Singleton() {
	}

	public static Singleton getInstance() {
		return INSTANCE;
	}

	public void show() {
		System.out.println("Singleon using static initialization in Java");
	}

	public static void main(String[] args) {
		System.out.println(Singleton.getInstance());
	}
}
