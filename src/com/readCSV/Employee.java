package com.readCSV;

public class Employee {

	private int EmpId;
	private String Name;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int empId, String name) {
		super();
		EmpId = empId;
		Name = name;
	}
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	
}
