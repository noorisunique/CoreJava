package com.java8.map;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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

public class CovertArrayListToMapUsingEmp {

	public static void main(String[] args) {
		Emp emp1 = new Emp(101, "Noor");
		Emp emp2 = new Emp(102, "Noor");
		Emp emp3 = new Emp(103, "Noor");
		Emp emp4 = new Emp(104, "Noor");
		Emp emp5 = new Emp(103, "Noor");
		List<Emp> list = new ArrayList<Emp>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);

		Map<Integer, Integer> map = list.stream()
				.collect(Collectors.toMap(Emp::getId, val -> val.getId() + 2, (a, b) -> a));
		System.out.println(map);

	}

}
