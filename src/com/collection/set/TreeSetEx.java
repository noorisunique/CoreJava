package com.collection.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class IntegerEx implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {

		return o2 - o1;
	}
}

public class TreeSetEx {

	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<>(new IntegerEx());
		set.add(13);
		set.add(12);
		set.add(11);
		set.add(10);
		System.out.println(set);

	}

}
