package com.java8;

import java.util.Arrays;
import java.util.List;

class Emp {
	private int id;
	private String name;

	public Emp(int id, String name) {
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

public class TestEx {

	public static void main(String[] args) {
		Emp e1 = new Emp(10, "Noor1");
		Emp e2 = new Emp(10, "Noor2");
		Emp e3 = new Emp(2, "Noor3");
		Emp e4 = new Emp(20, "Noor4");

		List<Emp> list = Arrays.asList(e1, e2, e3, e4);
		list.sort((a, b) -> a.getId() - b.getId());

		list.stream().forEach(val -> System.out.println(val.getId()));

	}
}
