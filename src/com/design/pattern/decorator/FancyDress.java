package com.design.pattern.decorator;

public class FancyDress extends DressDecorator {

	FancyDress(Dress dress) {
		super(dress);

	}

	public void assemble() {
		super.assemble();
		System.out.println("Adding Fancy Dress Features");
	}

}
