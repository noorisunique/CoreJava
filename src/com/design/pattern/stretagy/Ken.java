package com.design.pattern.stretagy;

class Ken extends Fighter {
	public Ken(KickBehavior kickBehavior, JumpBehavior jumpBehavior) {
		super(kickBehavior, jumpBehavior);
	}

	public void display() {
		System.out.println("Ken");
	}
}