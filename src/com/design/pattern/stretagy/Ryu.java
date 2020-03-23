package com.design.pattern.stretagy;

class Ryu extends Fighter {
	public Ryu(KickBehavior kickBehavior, JumpBehavior jumpBehavior) {
		super(kickBehavior, jumpBehavior);
	}

	public void display() {
		System.out.println("Ryu");
	}
}