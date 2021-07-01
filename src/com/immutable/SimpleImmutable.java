package com.immutable;

//https://dzone.com/articles/how-to-create-an-immutable-class-in-java
class Age {

	private int day;
	private int month;
	private int year;

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

}

final class ImmutableStudent {

	private final int id;
	private final String name;
	private final Age age;

	public ImmutableStudent(int id, String name, Age age) {
		this.name = name;
		this.id = id;
		Age newAge = new Age();
		newAge.setDay(age.getDay());
		newAge.setMonth(age.getMonth());
		newAge.setYear(age.getYear());
		this.age = newAge;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Age getAge() {
		return age;
	}
}

public class SimpleImmutable {

	public static void main(String[] args) {
		Age age = new Age();
		age.setDay(1);
		age.setMonth(12);
		age.setYear(1234);

		ImmutableStudent student = new ImmutableStudent(1, "Alex", age);
		System.out.println("Before Modification  " + student.getAge().getYear());

		age.setYear(12224);
		student.getAge().setYear(122);
		System.out.println("After Modification  " + student.getAge().getYear());

	}

}
