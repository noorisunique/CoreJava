package com.hashmap;

import java.util.LinkedHashSet;

class Book {
	public int id;
	public String name;

	public Book(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}

public class LinkedHashSet1 {
	public static void main(String[] args) {

		LinkedHashSet<String> set = new LinkedHashSet<>();
		set.add(null);
		set.add(null);
		set.add(null);
		set.add(null);
		set.add(null);
		set.add(null);
		set.add("One");
		set.add(null);
		System.out.println(set);
		for (String string : set) {
			System.out.println(string);
		}

		///
		LinkedHashSet<Book> set1 = new LinkedHashSet<>();
		set1.add(new Book(1, "Noor1"));
		set1.add(new Book(1, "Noor1"));
		set1.add(new Book(1, "Noor1"));
		for (Book book : set1) {
			System.out.println(book.id + " " + book.name);
		}
	}
}
