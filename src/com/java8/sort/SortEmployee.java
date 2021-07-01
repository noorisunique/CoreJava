package com.java8.sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Employee {

	private int id;
	private String name;

	Employee(int id, String name) {
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

public class SortEmployee {

	public static void main(String[] args) {
		List<Employee> list=Arrays.asList(
				new Employee(12, "Noor1"),
				new Employee(100, "Noor2"),
				new Employee(1, "Noor3"),
				new Employee(2, "Noor4")
				);
		
		list.sort(Comparator.comparing(Employee::getId));
		for (Employee employee : list) {
			System.out.println(employee.getId());
		}
		
		
		List<Employee> list1=Arrays.asList(
				new Employee(12, "Noor1"),
				new Employee(100, "Noor2"),
				new Employee(1, "Noor3"),
				new Employee(2, "Noor4")
				);
		
		
		list1.sort(Comparator.comparing(Employee::getId,(a,b)->b-a));
		for (Employee employee : list1) {
			System.out.println(employee.getId());
		}
	}

}
