package com.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//https://www.baeldung.com/java-sorting
class Employee3 {
	private int eid;
	private String ename;

	public Employee3(int eid, String ename) {
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

public class SortEmployeeByIdUsingComparator {

	public static void main(String[] args) {

		Employee3 emp1 = new Employee3(10, "Noor1");
		Employee3 emp2 = new Employee3(9, "Noor2");
		Employee3 emp3 = new Employee3(1, "Noor3");
		Employee3 emp4 = new Employee3(13, "Noor4");

		List<Employee3> list = new ArrayList<>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.sort(Comparator.comparing(Employee3::getEid));

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getEid() + "  " + list.get(i).getEname());
		}
	}
}

//https://www.baeldung.com/java-sorting