package com.immutable;

class Address implements Cloneable{

	String fisrtLine;
	String secondLine;
	String city;

	public Address(String fisrtLine, String secondLine, String city) {
		super();
		this.fisrtLine = fisrtLine;
		this.secondLine = secondLine;
		this.city = city;
	}

	public String getFisrtLine() {
		return fisrtLine;
	}

	public void setFisrtLine(String fisrtLine) {
		this.fisrtLine = fisrtLine;
	}

	public String getSecondLine() {
		return secondLine;
	}

	public void setSecondLine(String secondLine) {
		this.secondLine = secondLine;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String toString() {
		return "Address [" + fisrtLine + " " + secondLine + " " + city + "]";
	}
}

class User {
	private final String fisrtName;
	private final String lastName;
	// private final String address;
	private final Address address;

	public User(String fisrtName, String lastName, Address address) {
		super();
		this.fisrtName = fisrtName;
		this.lastName = lastName;
		this.address = address;
	}

	public String getFisrtName() {
		return fisrtName;
	}

	public String getLastName() {
		return lastName;
	}

	public Address getAddress() {
		return address;
	}
}

public final class ImmutableClass {
	public static void main(String[] args) {
		User u = new User("Noor", "Wajid", new Address("hhh", "kkkk", "Jablapur"));

		Address address = u.getAddress();
		System.out.println(address.hashCode());
		System.out.println(address);
		address.setFisrtLine("hh1");
		address.setSecondLine("LLL");
		address.setCity("Noor");
		System.out.println(u.getAddress());
		System.out.println(address.hashCode());
	}
}
// problem changing same address value still User class s not immutable