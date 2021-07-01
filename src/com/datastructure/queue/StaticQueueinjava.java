package com.datastructure.queue;

class MyQueue {

	private static int front, rear, capacity;
	private static int queue[];

	MyQueue(int c) {
		front = rear = 0;
		capacity = c;
		queue = new int[capacity];
	}

	static void queueEnqueue(int data) {
		if (rear == capacity) {
			System.out.println("Queue is full");
			return;
		} else {
			queue[rear++] = data;
		}
	}

	static void queueDequeue() {
		if (front == rear) {
			System.out.println("Queue is empty");
			return;
		} else {
			for (int i = 0; i < rear - 1; i++) {
				queue[i] = queue[i + 1];
			}
			if (rear < capacity) {
				queue[rear] = 0;
				rear--;
			}
		}
		return;
	}

	static void queueDisplay() {
		if (rear == front) {
			System.out.println("Queue is empty");
			return;
		}

		for (int i = 0; i < rear; i++) {
			System.out.println(queue[i]);
		}
		return;
	}

	static void queueFront() {
		if (front == rear) {
			System.out.println("Queue is empty");
		}
		System.out.println("Front element is:" + queue[front]);
		return;
	}
}

public class StaticQueueinjava {

	public static void main(String[] args) {
		MyQueue queue = new MyQueue(4);
		queue.queueEnqueue(1);
		queue.queueEnqueue(2);
		queue.queueEnqueue(3);
		queue.queueEnqueue(4);

		queue.queueDisplay();
		queue.queueFront();
		queue.queueDequeue();
		queue.queueDisplay();
	}

}
