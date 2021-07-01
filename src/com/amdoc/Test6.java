package com.amdoc;

import java.util.HashSet;

public class Test6 {

	public static void main(String[] args) {

		Book b1 = new Book(10023);
		Book b2 = new Book(10053);
		Book b3 = new Book(10088);
		Book b4 = new Book(10099);
		Book b5 = new Book(12000);

		HashSet<Book> bookset=new HashSet<>();
		bookset.add(b1);
		bookset.add(b2);
		bookset.add(b3);
		bookset.add(b4);
		bookset.add(b5);
		System.out.println(bookset.size());
		System.out.println(bookset.contains(new Book(12000)));
		System.out.println(bookset.remove(new Book(10099)));
		System.out.println(bookset.size());
		
	}

}

class Book {
	private int isbn;

	public Book(int isbn) {
		super();
		this.isbn = isbn;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return isbn;
	}

	@Override
	public boolean equals(Object obj) {
		boolean res = false;
		Book b = (Book) obj;
		if (b.getIsbn() == isbn)
			res = true;
		return res;
	}
}