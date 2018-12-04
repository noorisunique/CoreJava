package com.lambda;

import java.util.ArrayList;
import java.util.List;

public class ForEachExList {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("A1");
		list.add("A2");
		list.add("A3");
		list.add("A4");

		list.forEach(x->System.out.println(x));
	}
}
