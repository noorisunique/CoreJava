package com.clone;

//https://howtodoinjava.com/java/cloning/a-guide-to-object-cloning-in-java/
class Employee12 implements Cloneable {

	private int empoyeeId;
	private String employeeName;
	private Department11 Department11;

	public Employee12(int id, String name, Department11 dept) {
		this.empoyeeId = id;
		this.employeeName = name;
		this.Department11 = dept;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Employee12 cloned = (Employee12) super.clone();
		cloned.setDepartment11((Department11) cloned.getDepartment11().clone());
		return cloned;
	}

	public int getEmpoyeeId() {
		return empoyeeId;
	}

	public void setEmpoyeeId(int empoyeeId) {
		this.empoyeeId = empoyeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Department11 getDepartment11() {
		return Department11;
	}

	public void setDepartment11(Department11 Department11) {
		this.Department11 = Department11;
	}

}

class Department11 {
	private int id;
	private String name;

	public Department11(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class DeepCloningEx2 {

	public static void main(String[] args) throws CloneNotSupportedException {
		Department11 dept = new Department11(1, "Human Resource");
		Employee12 original = new Employee12(1, "Admin", dept);

		// Lets create a clone of original object
		Employee12 cloned = (Employee12) original.clone();

	}

}
