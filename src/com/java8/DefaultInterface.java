package com.java8;

interface interf {
	default int m1() {
		System.out.println("M1");
		return 10;
	}
}

public class DefaultInterface implements interf {
	public static void main(String[] args) {
		DefaultInterface d = new DefaultInterface();
		System.out.println(d.m1());
	}
}
