package com.datastructure.linklist;

public class LinkedListInsert {
	Node head;

	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	void deleteNode(int key) {
		Node temp = head;
		Node prev = null;

		if (temp != null && temp.data == key) {
			head = temp.next;
			return;
		}

		while (temp != null && temp.data != key) {
			prev = temp;
			temp = temp.next;
		}
		if (temp == null)
			return;
		prev.next = temp.next;
	}

	// Inserts a new Node at front of the list.
	public void push(int new_data) {
		Node node = new Node(new_data);
		node.next = head;
		head = node;
	}

	public void pushAfter(int data) {
		Node node = new Node(data);
		Node temp = head;
		if (head == null) {
			temp = node;
			head = temp;
		} else {
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
		}

	}

	public void printList() {
		Node thead = head;
		while (thead != null) {
			System.out.println(thead.data);
			thead = thead.next;
		}
	}

	public static void main(String[] args) {

		LinkedListInsert list = new LinkedListInsert();
		// System.out.println("Before");
		// list.push(10);
		// list.push(11);
		// list.push(12);
		// list.push(13);
		// list.printList();

		///
		System.out.println("After");
		list.pushAfter(20);
		list.pushAfter(30);
		list.pushAfter(40);
		list.pushAfter(50);
		list.deleteNode(30);
		list.printList();
	}
}
