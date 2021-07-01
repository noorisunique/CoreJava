package com.amdoc;

public class Test4 {
	
	public static void foo(){
		throw new RuntimeException();
	}
	public static void main(String[] args) {
		foo();

	}

}
