package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
	private int id;
	private String name;
	private List<String> techSkill;

	public Employee() {
	}

	public Employee(int id, String name, List<String> techSkill) {
		super();
		this.id = id;
		this.name = name;
		this.techSkill = techSkill;
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

	public List<String> getTechSkill() {
		return techSkill;
	}

	public void setTechSkill(List<String> techSkill) {
		this.techSkill = techSkill;
	}

}

public class MapInfoBeans {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add(".Net");
		list.add("Java");
		list.add("C++");

		List<Employee> list1 = Arrays.asList(new Employee(12, "Noor", list), new Employee(123, "Noor", list),
				new Employee(124, "Noor", list));
		List<Employee> list2 = list1.stream().map(emp -> {
			for (String val : emp.getTechSkill()) {
				Employee emp1 = new Employee();
				if (val == ".Net") {

					emp1.setId(1000);
				} else if (val == "Java") {
					emp1.setId(2000);
				} else {
					emp1.setId(3000);
				}
				return emp1;
			}
			return null;

		}).collect(Collectors.toList());

		for (Employee values : list2) {
			System.out.println(values.getId());
		}

	}

}
