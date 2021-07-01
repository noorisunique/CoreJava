package com.collection.set;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

class Employee1 {

	private int id = -1;
	private String firstName = null;
	private String lastName = null;
	private int age = -1;

	public Employee1(int id, String fName, String lName, int age) {
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
		return "Employee1 : " + id + " - " + firstName + " - " + lastName + " - " + age + "\n";
	}

}

class IdSorter implements Comparator<Employee1> {

	@Override
	public int compare(Employee1 o1, Employee1 o2) {
		return o1.getId() - o2.getId();
	}

	/*
	 * @Override public int compare(Employee1 o1, Employee1 o2) { return
	 * o1.getFirstName().compareTo(o2.getFirstName()); }
	 */
}

public class SortedSetComparator {
	public static void main(String[] args) {
		SortedSet<Employee1> set = new TreeSet<Employee1>(new IdSorter());

		Employee1 e1 = new Employee1(4, "b", "dLastName", 34);
		Employee1 e2 = new Employee1(1, "a", "pLastName", 30);
		Employee1 e3 = new Employee1(3, "c", "sLastName", 31);
		Employee1 e4 = new Employee1(2, "z", "zLastName", 25);

		set.add(e2);
		set.add(e3);
		set.add(e1);
		set.add(e4);

		System.out.println(set);
	}
}