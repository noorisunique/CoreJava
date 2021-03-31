package com.morgan;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class KeyMaster {

	public int i;

	public KeyMaster(int i) {
		this.i = i;
	}

	@Override
	public int hashCode() {

		return i;
	}

	@Override
	public boolean equals(Object o) {

		return i == ((KeyMaster) o).i;
	}

}

public class X8 {

	public static void main(String[] args) {
		Set<KeyMaster> set = new HashSet<>();
		KeyMaster k1 = new KeyMaster(1);
		KeyMaster k2 = new KeyMaster(2);
		set.add(k1);
		set.add(k1);
		set.add(k2);
		set.add(k2);

		System.out.println(set.size() + ":");
		k2.i = 1;

		System.out.println(set.size() + ":");
		set.remove(k1);

		System.out.println(set.size() + ":");
		set.remove(k2);

		System.out.println(set.size());
	}

}
