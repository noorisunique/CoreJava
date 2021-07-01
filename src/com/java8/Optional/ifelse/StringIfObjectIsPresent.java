package com.java8.Optional.ifelse;

import java.util.Optional;

class Emp {
	private int id;

	Emp(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}

public class StringIfObjectIsPresent {
	private static void getStringIfObjectIsPresent(Optional<Emp> object) {
		//object.ifPresent(s -> System.out.println("hello world"));
		
		object.orElseThrow(RuntimeException::new);
		System.out.println(object.get().getId());
	}

	public static void main(String[] args) {
		Emp emp=new Emp(101);
		Optional<Emp> optional = Optional.of(emp);
		getStringIfObjectIsPresent(optional);

	}

}
