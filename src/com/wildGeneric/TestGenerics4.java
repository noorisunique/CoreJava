package com.wildGeneric;

//we can create generic method that can accept any type of argument.
public class TestGenerics4 {
	public static <E> void printArray(E[] elements) {
		for (E element : elements) {
			System.out.println(element);
		}
		System.out.println();
	}

	public static void main(String args[]) {
		Integer[] intArray = { 10, 20, 30, 40, 50 };
		Character[] charArray = { 'J', 'A', 'V', 'A', 'T', 'P', 'O', 'I', 'N', 'T' };
		Float[] flotArray = { 1.3F, 4.6F, 7.0F };

		System.out.println("Printing Integer Array");
		printArray(intArray);

		System.out.println("Printing Character Array");
		printArray(charArray);
		
		System.out.println("Printing Float Array");
		printArray(flotArray);
		
		
	}
}