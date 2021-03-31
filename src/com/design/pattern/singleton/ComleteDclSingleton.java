package com.design.pattern.singleton;

public class ComleteDclSingleton {
	private static volatile ComleteDclSingleton instance;// volatile is monadatory

	private ComleteDclSingleton() {}
	public static ComleteDclSingleton getInstance() {
		if (instance == null) {
			synchronized (ComleteDclSingleton.class) {
				if (instance == null) {
					instance = new ComleteDclSingleton();
				}
			}
		}
		return instance;
	}

	public static void main(String[] args) {
		ComleteDclSingleton s1 =ComleteDclSingleton.getInstance();
		ComleteDclSingleton s2 = ComleteDclSingleton.getInstance();
		System.out.println(s1.hashCode() + "  " + s2.hashCode());
	}
}