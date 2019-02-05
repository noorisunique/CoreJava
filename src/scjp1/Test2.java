package com.scjp1;

enum Animals {
	DOG("woof"), CAT("meow"), FISH("burble");
	String sound;

	Animals(String s) {
		sound = s;
	}
}

public class Test2 {
	static Animals a;

	public static void main(String[] args) {
		System.out.println(a.DOG.sound);
		System.out.println(a.CAT.sound);

	}
}
