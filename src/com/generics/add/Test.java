package com.generics.add;

public class Test {
	static <T> T add(T one, T two) {
		if (one.getClass() == Integer.class) {
			// With auto-boxing / unboxing
			return (T) (Integer) ((Integer) one + (Integer) two);
		}
		if (one.getClass() == Long.class) {
			// Without auto-boxing / unboxing
			return (T) Long.valueOf(((Long) one).longValue() + ((Long) two).longValue());
		}
		
		if (one.getClass() == Double.class) {
			// Without auto-boxing / unboxing
			return (T) (Double) one).doubleValue() + ((Double) two).doubleValue());
		}
		return null;
	}

	public static void main(String[] args) {

		System.out.println(add(10, 12));
		System.out.println(add(10.20, 12.13));

	}

}
