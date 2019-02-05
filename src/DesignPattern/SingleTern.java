package com.DesignPattern;

class ST {
	private static ST st;

	private ST() {

	}

	public static ST getInstance() {
		if (null == st) {
			st = new ST();
			System.out.println("jjj");
		}
		return st;
	}
	
}

public class SingleTern {
	public static void main(String[] args) {
		System.out.println(ST.getInstance());
		System.out.println(ST.getInstance());
		System.out.println(ST.getInstance());
		System.out.println(ST.getInstance());
		
	}
}
