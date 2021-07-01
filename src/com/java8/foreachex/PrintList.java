package com.java8.foreachex;

import java.util.ArrayList;
import java.util.List;

public class PrintList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		list.add("Noor1");
		list.add("Noor1");
		list.add("Noor1");

		list.forEach(n -> {

			String n1 = "Noor";
			String s2 = "noor" + n1;

			System.out.println(n1);
		});

	}

}
