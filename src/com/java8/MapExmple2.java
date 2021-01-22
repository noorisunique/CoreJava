package com.java8;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//https://mkyong.com/java8/java-8-streams-map-examples/
///2. List of objects -> List of String
class Staff {
	private String name;
	private int age;
	private BigDecimal salary;

	public Staff(String name, int age, BigDecimal salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

}

public class MapExmple2 {

	public static void main(String[] args) {

		List<Staff> list = new ArrayList<>();
		list.add(new Staff("Noor1", 132, new BigDecimal(10000)));
		list.add(new Staff("Noor2", 232, new BigDecimal(20000)));
		list.add(new Staff("Noor3", 332, new BigDecimal(30000)));

		// Before java 8
		List<String> temp = new ArrayList<>();
		for (Staff staff : list) {
			temp.add(staff.getName());
		}
		System.out.println(temp);

		// Java 8
		List<String> newList = list.stream().map(staff -> staff.getName()).collect(Collectors.toList());
		System.out.println(newList);

	}

}
