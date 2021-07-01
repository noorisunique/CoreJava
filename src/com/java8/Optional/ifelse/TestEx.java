package com.java8.Optional.ifelse;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class Add {

	private int id;
	private String name;

	Add(int id, String name) {
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

	public static void main(String[] args) throws Throwable {
		Add add1 = new Add(101, "Noor3");
		Add add2 = new Add(102, "Noor1");
		Add add3 = new Add(103, "Noor2");
		Add add4 = new Add(104, "Noor4");;
		List<Add> list = Arrays.asList(add1, add2, add3, add4);

		for (Add add : list) {
			Optional optional = Optional.ofNullable(add);
			Add user=(Add) optional.orElseThrow(()->new RuntimeException("Noor.."));
			
		}
	}
}
