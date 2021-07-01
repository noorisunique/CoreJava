package com.immutable;

import java.util.ArrayList;

final class ImmutableStudent1 {

	private final int id;
	private final String name;
	private final ArrayList<String> list;

	public ImmutableStudent1(int id, String name, ArrayList<String> list) {
		this.name = name;
		this.id = id;
		ArrayList<String> newlist = new ArrayList<>();
		for (String string : list) {
			newlist.add(string);
		}
		this.list = newlist;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public ArrayList<String> getList() {
		return list;
	}

}

public class ImmutableWithArrayList {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("A1");
		list.add("A2");
		list.add("A3");

		ImmutableStudent1 student = new ImmutableStudent1(1, "Alex", list);
		System.out.println("Before Modification  of ArrayList" + student.getList());

		list.add("A4");

		System.out.println("After Modification  of ArrayList" + student.getList());

	}

}
