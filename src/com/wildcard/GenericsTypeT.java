package com.wildcard;

public class GenericsTypeT<T> {

	private T t;

	public T get() {
		return t;
	}

	public void set(T t) {
		this.t = t;
	}

	public static void main(String args[]) {
		GenericsTypeT type = new GenericsTypeT();
		type.set("Pankaj");
		type.set(10);
		Object str = type.get(); // type casting, error prone and can
											// cause ClassCastException
		System.out.println(str);
	}
}