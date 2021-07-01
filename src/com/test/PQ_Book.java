package com.test;

import java.util.PriorityQueue;

class Book {

	String bookName;

	int pages;

	public Book(String name, int pages) {

		this.bookName = name;

		this.pages = pages;

	}

}

public class PQ_Book {

	public static void main(String[] args) {
		Book a = new Book("cricket", 100);

		Book b = new Book("football", 500);

		Book c = new Book("hockey", 50);

		Book d = new Book("tennis", 100);

		PriorityQueue<Book> pq = new PriorityQueue<>((b1, b2) -> {

			if (b1.pages != b2.pages) {

				return b1.pages - b2.pages;

			} else {

				return (b1.bookName.compareTo(b2.bookName)) * -1;

			}

		});

		pq.add(a);

		pq.add(b);

		pq.add(c);

		pq.add(d);

		System.out.println(pq.poll().bookName);

		System.out.println(pq.poll().bookName);

		System.out.println(pq.peek().bookName);

		System.out.println(pq.poll().bookName);

	}

}
