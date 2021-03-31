package com.morgan;

import java.util.Iterator;
import java.util.TreeSet;

class Drink implements Comparable {

	public String name;

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

}

public class X7 {

	public static void main(String[] args) {
		Drink one = new Drink();
		Drink two = new Drink();

		one.name = "Coffee";
		two.name = "Tea";

		TreeSet<Drink> set = new TreeSet<>();
		set.add(one);
		set.add(two);
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			Drink d=(Drink)iterator.next();
			System.out.print(d.name);
		}
			
			

	}

}
