package com.datastructure.queue;

import java.util.concurrent.ConcurrentLinkedQueue;

//https://www.geeksforgeeks.org/concurrentlinkedqueue-in-java-with-examples/
//It can be used when an unbounded Queue is shared among many threads.
public class ConcurrentLinkedQueueDemo {

	public static void main(String[] args) {
		ConcurrentLinkedQueue<Integer> queue = new ConcurrentLinkedQueue<>();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		queue.add(5);
		System.out.println(queue);
		// Displaying the first element
		System.out.println("First Element is: " + queue.peek());

		// Remove and display the first element
		System.out.println("Head Element is: " + queue.poll());

		ConcurrentLinkedQueue<Integer> queue1 = new ConcurrentLinkedQueue<>(queue);
		System.out.println(queue1);
	}

}
