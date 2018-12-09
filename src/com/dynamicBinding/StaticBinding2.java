package com.dynamicBinding;

public class StaticBinding2 {
	
		private void print() {
			System.out.println("print in subclass.");
		}

	public static void main(String[] args) {
		StaticBinding2 A = new StaticBinding2();
		A.print();
	}
}