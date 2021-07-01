package com.interfaceex;

interface I1 {

	void m1();

}

interface I2 {

	void m1();
}

public class InterfaceEx implements I1, I2 {
	@Override
	public void m1() {
		System.out.println("Noor....");

	}

	public static void main(String[] args) {
		InterfaceEx m1 = new InterfaceEx();
		m1.m1();
	}

}
