package com.morgan;

class XX {
	public int x = 420;

	protected int dostuff() {
		return x;
	}
}

public class X5 extends XX {

	public static void main(String[] args) {

		new X5().callStup();
	}

	void callStup() {
		System.out.println("thsi"+this.dostuff());
		XX v=new XX();
		System.out.println("Parent"+v.dostuff());
	}
}
