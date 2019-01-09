package com.wildcard;

public class GenericsTypeOld {

	private Object t;

	public Object get() {
		return t;
	}

	public void set(Object t) {
		this.t = t;
	}

	public static void main(String args[]) {
		GenericsTypeOld type = new GenericsTypeOld();
		type.set("Pankaj");
		type.set(10);
		//String str = (String)  // type casting, error prone and can
											// cause ClassCastException
		System.out.println(type.get());
	}
}