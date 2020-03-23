package com.design.pattern.factor2;

public class MainFactory {

	public static void main(String[] args) {
		FactoryMethod fm = new FactoryMethod();
		OS os = fm.getFactory("Andriod");
		os.spec();

	}

}
