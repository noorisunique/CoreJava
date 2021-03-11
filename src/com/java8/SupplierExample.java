package com.java8;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Supplier;

//This is a functional interface 
public class SupplierExample {

	private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

	public static void main(String[] args) {
		Supplier<Double> value = () -> Math.random();
		System.out.println(value.get());

		Supplier<LocalDateTime> time = () -> LocalDateTime.now();
		System.out.println(time.get());

		Supplier<String> string = () -> dtf.format(LocalDateTime.now());
		System.out.println(string.get());
		
		Supplier<String> str=()->"Noor";
		System.out.println(str.get());
		
	}
}
