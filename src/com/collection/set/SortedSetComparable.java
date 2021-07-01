package com.collection.set;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

class Employee implements Comparable<Employee>{

	private int id = -1;
	private String firstName = null;
	private String lastName = null;
	private int age = -1;

	public Employee(int id, String fName, String lName, int age) {
		this.id = id;
		this.firstName = fName;
		this.lastName = lName;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee : " + id + " - " + firstName + " - " + lastName + " - " + age + "\n";
	}

	@Override
	public int compareTo(Employee o) {
		
		return this.id-o.id;
	}
}

class FirstNameSorter implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getId()- o2.getId();
	}
	
	/*@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getFirstName().compareTo(o2.getFirstName());
	}*/
}

public class SortedSetComparable {
	public static void main(String[] args) {
		SortedSet<Employee> set = new TreeSet<Employee>();

		Employee e1 = new Employee(4, "b", "dLastName", 34);
		Employee e2 = new Employee(1, "a", "pLastName", 30);
		Employee e3 = new Employee(3, "c", "sLastName", 31);
		Employee e4 = new Employee(2, "z", "zLastName", 25);

		set.add(e2);
		set.add(e3);
		set.add(e1);
		set.add(e4);

		System.out.println(set);
	}
}