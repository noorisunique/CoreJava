package com.association;

class Bank {
	private String name;

	// bank name
	Bank(String name) {
		this.name = name;
	}

	public String getBankName() {
		return this.name;
	}
}

class Employee {
	private String name;

	Employee(String name) {
		this.name = name;
	}

	public String getEmployeeName() {
		return this.name;
	}
}

class Association {
	public static void main(String[] args) {
		Bank bank = new Bank("HDFC");
		Employee emp = new Employee("anshul");
		System.out.println(emp.getEmployeeName() + " is employee of " + bank.getBankName());
	}
}