package com.datastructure.queue.stack;

import java.util.*;

class GFG {
	private Stack stack1 = new Stack<>();
	private Stack stack2 = new Stack<>();

	public void enqueue(int element) {
		stack1.push(element);
		System.out.println(element + " inserted");
	}

	public void dequeue() {
		if (stack2.isEmpty()) {
			while (!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
		}
		System.out.println(stack2.pop() + " removed");
	}

	public static void main(String args[]) {
		GFG test = new GFG();
		test.enqueue(10);
		test.enqueue(50);
		test.enqueue(100);
		test.dequeue();
		test.dequeue();
		test.dequeue();
		
	}
}