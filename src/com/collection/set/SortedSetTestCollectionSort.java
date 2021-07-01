package com.collection.set;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetTestCollectionSort {

	public static void main(String[] args) {
		SortedSet<Employee> set = new TreeSet<Employee>();

		Employee e1 = new Employee(4, "aTestName", "dLastName", 34);
		Employee e2 = new Employee(2, "nTestName", "pLastName", 30);
		Employee e3 = new Employee(3, "kTestName", "sLastName", 31);
		Employee e4 = new Employee(1, "dTestName", "zLastName", 25);

		set.add(e2);
		set.add(e3);
		set.add(e1);
		set.add(e4);

		System.out.println(set);

	}

}
