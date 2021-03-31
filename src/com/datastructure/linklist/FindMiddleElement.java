package com.datastructure.linklist;

import java.security.MessageDigest;

public class FindMiddleElement {
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

	public void findMiddleElement() {
		Node thead = head;
		Node middle = head;
		int length = 0;

		while (middle.next != null) {
			length++;

			if (length % 2 == 0)
				middle = middle.next;
		}
		if (length % 2 == 1) {
			middle = middle.next;
		}
		System.out.println("------------" + length + "-----" + middle.data);
	}

	public static void main(String[] args) {

		FindMiddleElement list = new FindMiddleElement();

		///
		System.out.println("After");
		list.pushAfter(20);
		list.pushAfter(30);
		list.pushAfter(40);
		list.pushAfter(50);
		list.deleteNode(30);
		list.printList();
		list.findMiddleElement();

	}
}
