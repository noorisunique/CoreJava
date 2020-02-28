package com.datastructure.queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueEx {

	public static void main(String[] args) {
		PriorityQueue<String> pq = new PriorityQueue<>();
		pq.add("C");
		pq.add("C++");
		pq.add("JAVA");
		pq.add("Python");
		pq.add("A");
		

		/*Iterator it = pq.iterator();
		while (it.hasNext())
			System.out.println(it.next());*/

		pq.forEach(name -> System.out.println(name));

	}

}
