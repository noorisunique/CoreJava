package com.java8;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Supplier;

//https://mkyong.com/java8/java-8-supplier-examples/ 

class Developer {
	String name;
	BigDecimal salary;
	LocalDate start;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public LocalDate getStart() {
		return start;
	}

	public void setStart(LocalDate start) {
		this.start = start;
	}

}

public class SupplierExample2 {

	public static Developer factory(Supplier<? extends Developer> s) {

		Developer developer = s.get();
		developer.setName("Noor");
		developer.setStart(LocalDate.of(1231, 1, 12));
		developer.setSalary(BigDecimal.ONE);
		return developer;
	}

	public static void main(String[] args) {
		Developer developer = SupplierExample2.factory(() -> new Developer());
		System.out.println(developer.getName());
		System.out.println(developer.getSalary());
		System.out.println(developer.getStart());

	}
}
