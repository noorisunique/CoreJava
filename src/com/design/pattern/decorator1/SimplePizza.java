package com.design.pattern.decorator1;

class SimplePizza extends Pizza {
	public SimplePizza() {
		description = "SimplePizza";
	}

	public int getCost() {
		return 50;
	}
}