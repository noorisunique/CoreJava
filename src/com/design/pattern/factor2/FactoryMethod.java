package com.design.pattern.factor2;

public class FactoryMethod {

	public OS getFactory(String str) {

		if (str.equals("IOS"))
			return new IOS();
		else if (str.equals("Windows"))
			return new Windows();
		else if (str.equals("Linux"))
			return new Linux();
		else if (str.equals("Andriod"))
			return new Andriod();
		else
			return null;
	}
}
