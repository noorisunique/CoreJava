package com.design.pattern;

interface Prototype {
	public Prototype getClone();
}

class EmployeeRecord implements Prototype {

	private String name;

	public EmployeeRecord(String name) {
		super();
		this.name = name;
	}

	public void showRecord() {
		System.out.println(name);
	}

	@Override
	public Prototype getClone() {
		return new EmployeeRecord(name);
	}

}

public class PrototypeDesignPattern {
	public static void main(String[] args) {
		EmployeeRecord employeeRecord=new EmployeeRecord("Noor");
		employeeRecord.showRecord();
		EmployeeRecord epm=(EmployeeRecord) employeeRecord.getClone();
		epm.getClone();
		epm.showRecord();
	}
}
