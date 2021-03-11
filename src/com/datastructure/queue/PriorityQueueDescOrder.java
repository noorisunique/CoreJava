package com.datastructure.queue;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

//https://www.geeksforgeeks.org/priority-queue-in-reverse-order-in-java/
/*Using default Comparator Collections.reverseOrder()
Using custom Comparator
Using lambda expression*/
public class PriorityQueueDescOrder {

	public static void main(String[] args) {

		System.out.println("---Default ascending order---");
		PriorityQueue<String> pq = new PriorityQueue<>(Collections.reverseOrder());// ascending
		// default
		pq.add("C");
		pq.add("C++");
		pq.add("JAVA");
		pq.add("Python");
		pq.add("A");

		pq.forEach(name -> System.out.println(name));
		System.out.println("---Using custom Comparato---");
		// Using custom Comparator
		PriorityQueue<String> pq1 = new PriorityQueue<>(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if (o1.length() < o2.length())
					return 1;
				if (o1.length() > o2.length())
					return -1;

				return 0;

			}

		});

		// default
		pq1.add("C");
		pq1.add("C++");
		pq1.add("JAVA");
		pq1.add("Python");
		pq1.add("A");

		pq1.forEach(name -> System.out.println(name));

		System.out.println("---Using lambda expression---");

		PriorityQueue<Integer> pq2 = new PriorityQueue<Integer>((a, b) -> b - a);
		pq2.add(30);
		pq2.add(20);
		pq2.add(10);
		pq2.add(5);
		pq2.add(17);

		pq2.forEach(value -> System.out.println(value));
	}

}
