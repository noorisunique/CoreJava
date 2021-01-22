package com.java8;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

///https://mkyong.com/java8/java-8-streams-map-examples/
//3. List of objects -> List of other objects
class Staff1 {
	private String name;
	private int age;
	private BigDecimal salary;

	public Staff1(String name, int age, BigDecimal salary) {
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

class PublicStaff {
	private String name;
	private int age;
	private BigDecimal salary;

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

public class MapExample3 {

	// before java 8
	private static List<PublicStaff> ConvertToPublicStaff(List<Staff1> list) {

		List<PublicStaff> result = new ArrayList<>();
		for (Staff1 staff : list) {

			PublicStaff temp = new PublicStaff();
			temp.setName(staff.getName());
			temp.setAge(staff.getAge());
			temp.setSalary(staff.getSalary());

			result.add(temp);
		}
		return result;

	}

	public static void main(String[] args) {
		List<Staff1> list = Arrays.asList(new Staff1("Noor1", 31, new BigDecimal(1000)),
				new Staff1("Noor2", 31, new BigDecimal(1000)), new Staff1("Noor3", 31, new BigDecimal(1000)));

		// before java 8
		List<PublicStaff> publicStaff = ConvertToPublicStaff(list);
		for (PublicStaff staff : publicStaff) {
			System.out.println(staff.getName());
		}

		// java 8
		List<PublicStaff> newPublicStaff = list.stream().map(temp -> {

			PublicStaff pstaff = new PublicStaff();
			pstaff.setName(temp.getName());
			pstaff.setAge(temp.getAge());
			pstaff.setSalary(temp.getSalary());
			return pstaff;

		}).collect(Collectors.toList());

		for (PublicStaff staff : newPublicStaff) {
			System.out.println(staff.getName());
		}
	}

}
