package com.datastructure.linklist;

public class ReverseEvenElements {
	Node head;

	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public void push(int data) {
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

	public void printData() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	public void reverseEvenElement() {
		Node prev = null;
		Node curr = head;
		Node temp;
		if (head == null) {
			return;
		}

		while (curr != null && curr.data % 2 == 0) {
			temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = temp;
		}
		if (head != curr) {
			head.next = curr;
			reverseEvenElement();
		} else {

			reverseEvenElement();
		}
	}

	public static void main(String[] args) {
		ReverseEvenElements ree = new ReverseEvenElements();
		ree.push(1);
		ree.push(22);
		ree.push(32);
		ree.push(3);

		ree.reverseEvenElement();
		ree.printData();
	}
}
