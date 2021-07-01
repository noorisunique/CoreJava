package com.clone;

import java.util.HashMap;
import java.util.Map;

class Employee1 implements Cloneable {

	private int id;

	private String name;

	private Map<String, String> props;

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

	public Map<String, String> getProps() {
		return props;
	}

	public void setProps(Map<String, String> p) {
		this.props = p;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}

public class ClonningExample3 {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employee1 emp = new Employee1();

		emp.setId(1);
		emp.setName("Pankaj");
		Map<String, String> props = new HashMap<>();
		props.put("salary", "10000");
		props.put("city", "Bangalore");
		emp.setProps(props);

		Employee1 clonedEmp = (Employee1) emp.clone();

		System.out.println(emp.getName());
		System.out.println(clonedEmp.getName());

		clonedEmp.setName("Noor");

		System.out.println("================");
		System.out.println(emp.getName());
		System.out.println(clonedEmp.getName());

		emp.setName("Noor11");

		System.out.println("================");
		System.out.println(emp.getName());
		System.out.println(clonedEmp.getName());

	}

}