package com.serializatioSerialVersionUID;

import java.io.Serializable;

//https://dzone.com/articles/what-is-serialversionuid
public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;

	private String lastname;

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	private byte age;
	private String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String whoIsThis() {
		StringBuffer employee = new StringBuffer();
		employee.append(getName()).append(" is ").append(getAge()).append(" years old and lives at ")
				.append(getAddress());
		return employee.toString();
	}

}