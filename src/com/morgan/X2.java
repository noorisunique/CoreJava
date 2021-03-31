package com.morgan;

class E0 extends Exception{}
class E1 extends E0{}

public class X2 {

	public static void main(String[] args) {
		try {
			throw new E1();
		} catch (E0 e) {
			System.out.println("E0---");
		}catch (Exception e) {
			System.out.println("cout ---");
		}
	}
	

}
