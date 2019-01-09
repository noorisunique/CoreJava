package com.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
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

public class Sorting {
	public static void main(String[] args) {

		List<Emp> list = Arrays.asList(new Emp(12, "A1"), new Emp(15, "A4"), new Emp(11, "A3"), new Emp(13, "A2"));
		Collections.sort(list, new Comparator<Emp>() {

			@Override
			public int compare(Emp e1, Emp e2) {
				return e1.getId() - e2.getId();
			}
		});

		// list.forEach(x -> System.out.println(x.getName()));

		// java8

		list.sort((e1, e2) -> e1.getId() - e2.getId());
		// list.forEach(x -> System.out.println(x.getId()));

		String emp = list.stream().filter(x -> "A1".equals(x.getName())).map(Emp::getName).findAny().orElse("");
		System.out.println(emp);

		List<String> e1 = list.stream().map(Emp::getName).collect(Collectors.toList());
		e1.forEach(System.out::println);

	}
}
