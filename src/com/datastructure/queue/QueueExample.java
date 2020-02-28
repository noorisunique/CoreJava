package com.datastructure.queue;

import java.util.LinkedList;
import java.util.Queue;
//https://www.geeksforgeeks.org/queue-interface-java/
public class QueueExample {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		q.add(10);
		q.add(11);
		q.add(12);
		q.add(13);
		q.add(13);
		q.add(14);
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q);
		System.out.println(q.peek());
		int r=q.remove();
		System.out.println(q);
	}
}
