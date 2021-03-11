package com.java8;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

//https://mkyong.com/java8/java-8-supplier-examples/ 

class Student {
	private int age;

	public Student(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

public class SupplierExample3 {

	public static void main(String[] args) {
		Supplier<String> str = () -> "Noor";
		System.out.println(str.get());

		Supplier<Student> str2 = () -> new Student(10);
		System.out.println(str2.get().getAge());

		Supplier<List<Student>> str3 = () -> {
			List<Student> s = Arrays.asList(new Student(1), new Student(2), new Student(3));

			return s;
		};
		System.out.println(str3.get().get(0).getAge());
		System.out.println(str3.get().get(1).getAge());
		System.out.println(str3.get().get(2).getAge());

	}
}
