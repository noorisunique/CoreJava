package com.design.pattern.decorator;

public class CasualDress extends DressDecorator {

	CasualDress(Dress dress) {
		super(dress);

	}

	public void assemble() {
		super.assemble();
		System.out.println("Adding Casual Dress Features");
	}

}
