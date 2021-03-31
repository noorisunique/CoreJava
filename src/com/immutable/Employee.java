package com.immutable;

public final class Employee {
	final String pancardNumber;

	public Employee(String pancardNumber) {
		this.pancardNumber = pancardNumber;
	}

	public String getPancardNumber() {
		return pancardNumber;
	}

}

//https://www.javatpoint.com/how-to-create-immutable-class