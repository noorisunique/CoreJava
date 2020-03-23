package com.design.pattern.stretagy;

interface JumpBehavior {
	public void jump();
}

class ShortJump implements JumpBehavior {
	public void jump() {
		System.out.println("Short Jump");
	}
}

class LongJump implements JumpBehavior {
	public void jump() {
		System.out.println("Long Jump");
	}
}
