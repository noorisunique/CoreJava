package com.lambda;

import java.util.Arrays;
import java.util.List;

class Developer {
	private  String name;
	private  Integer age;

	public Developer(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	
}

public class CompareTest {

	public static void main(String[] args) {

		List<Developer> items = Arrays.asList(
				new Developer("A1", 12),
				new Developer("A2", 13),
				new Developer("A3", 14),
				new Developer("A4", 15),
				new Developer("A5", 16),
				new Developer("A6", 17)
				);
		//Sort by Key
		items.sort((o1,o2)->o2.getAge()-o1.getAge());
		items.forEach(item -> System.out.println(item.getAge()));
		
		//Sort by Name
		items.sort((o1,o2)->o2.getName().compareTo(o1.getName()));
		items.forEach(item -> System.out.println(item.getName()));
		
		
	}
}