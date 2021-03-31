package com.design.pattern.visitor;

public class Test1 {

	public static void main(String[] args) {
		LinuxConfiguration l = new LinuxConfiguration();
		WindowsConfiguration w = new WindowsConfiguration();
		L1Router r1 = new L1Router();
		L2Router r2 = new L2Router();
		L3Router r3 = new L3Router();
		r1.accept(l);
		r1.accept(w);

	}
}
