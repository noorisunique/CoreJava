package com.immutable;

class Address1 implements Cloneable {

	String fisrtLine;
	String secondLine;
	String city;

	public Address1(String fisrtLine, String secondLine, String city) {
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

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public String toString() {
		return "Address [" + fisrtLine + " " + secondLine + " " + city + "]";
	}
}

class User1 {
	private final String fisrtName;
	private final String lastName;
	// private final String address;
	private final Address1 address;

	public User1(String fisrtName, String lastName, Address1 address) {
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

	public Address1 getAddress() throws CloneNotSupportedException {
		return (Address1)address.clone();
	}
}

public final class ImmutableClass2 {
	public static void main(String[] args) throws CloneNotSupportedException {
		User1 u = new User1("Noor", "Wajid", new Address1("hhh", "kkkk", "Jablapur"));

		Address1 address = u.getAddress();
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