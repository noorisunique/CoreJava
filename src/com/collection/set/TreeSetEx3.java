package com.collection.set;

import java.util.Set;
import java.util.TreeSet;

class Test2 implements Comparable<Test2>{
	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Test2 o) {
		// TODO Auto-generated method stub
		return this.id-o.id;
	}

}

public class TreeSetEx3 {

	public static void main(String[] args) {
		Set<Test2> set = new TreeSet<>();
		Test2 t1 = new Test2();
		t1.setId(12);

		Test2 t2 = new Test2();
		t2.setId(1);

		Test2 t3 = new Test2();
		t3.setId(9);

		Test2 t4 = new Test2();
		t4.setId(9);

		set.add(t1);
		set.add(t2);
		set.add(t3);
		set.add(t4);
		for (Test2 Test2 : set) {
			System.out.println(Test2.getId());
		}
	}

}
