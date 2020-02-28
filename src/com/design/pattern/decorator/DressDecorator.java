package com.design.pattern.decorator;

public class DressDecorator implements Dress {
	private Dress dress;

	DressDecorator(Dress dress) {
		this.dress = dress;
	}

	@Override
	public void assemble() {
		this.dress.assemble();
	}

}
