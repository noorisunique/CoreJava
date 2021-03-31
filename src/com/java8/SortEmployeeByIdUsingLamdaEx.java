package com.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee2 {
	private int eid;
	private String ename;

	public Employee2(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

}

public class SortEmployeeByIdUsingLamdaEx {

	public static void main(String[] args) {

		Employee2 emp1 = new Employee2(10, "Noor1");
		Employee2 emp2 = new Employee2(9, "Noor2");
		Employee2 emp3 = new Employee2(1, "Noor3");
		Employee2 emp4 = new Employee2(13, "Noor4");

		List<Employee2> list = new ArrayList<>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);

		// Sort By Id
		list.sort((Employee2 e1, Employee2 e2) -> e1.getEid() - e2.getEid());

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getEid() + "  " + list.get(i).getEname());
		}

		// Sort by Name
		System.out.println("Sort by Name====");
		list.sort((Employee2 e1, Employee2 e2) -> e1.getEname().compareTo(e2.getEname()));

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getEid() + "  " + list.get(i).getEname());
		}
	}

}
