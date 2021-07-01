package com.collection.set;

import java.util.Set;
import java.util.TreeSet;

class Test implements Comparable<Test>{
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
	public int compareTo(Test o) {
		// TODO Auto-generated method stub
		return this.id-o.id;
	}

}

public class TreeSetEx2 {

	public static void main(String[] args) {
		Set<Test> set = new TreeSet<>();
		Test t1 = new Test();
		t1.setId(12);

		Test t2 = new Test();
		t2.setId(1);

		Test t3 = new Test();
		t3.setId(9);

		Test t4 = new Test();
		t4.setId(9);

		set.add(t1);
		set.add(t2);
		set.add(t3);
		set.add(t4);
		for (Test test : set) {
			System.out.println(test.getId());
		}
	}

}
