package com.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee1 {
	private int eid;
	private String ename;

	public Employee1(int eid, String ename) {
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

class SortbyEmpId implements Comparator<Employee1> {

	public int compare(Employee1 o1, Employee1 o2) {
		// return o1.getEid() - o2.getEid(); descending order
		return o2.getEid() - o1.getEid();// ascending order
	}
}

public class SortEmployeeById {

	public static void main(String[] args) {

		Employee1 emp1 = new Employee1(10, "Noor1");
		Employee1 emp2 = new Employee1(9, "Noor2");
		Employee1 emp3 = new Employee1(1, "Noor3");
		Employee1 emp4 = new Employee1(13, "Noor4");

		List<Employee1> list = new ArrayList<>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);

		Comparator com = Collections.reverseOrder(new SortbyEmpId());
		Collections.sort(list, com);

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getEid() + "  " + list.get(i).getEname());
		}

	}

}
