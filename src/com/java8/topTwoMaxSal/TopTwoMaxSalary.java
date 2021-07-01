package com.java8.topTwoMaxSal;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Emp {

	private int id;

	private String name;

	public Emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

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

}

public class TopTwoMaxSalary {

	public static void main(String[] args) {

		List<Emp> list = new ArrayList<Emp>();

		list.add(new Emp(11, "N"));
		list.add(new Emp(11, "N1"));
		list.add(new Emp(100, "N1"));
		list.add(new Emp(11, "Na"));
		list.add(new Emp(1122, "N1"));

		// list.sort(Comparator.comparing(Emp::getId).reversed());

		list.stream().sorted(Comparator.comparing(Emp::getId, (a, b) -> b - a)).limit(2)
				.forEach(s -> System.out.println(s.getId()));

	}

}
