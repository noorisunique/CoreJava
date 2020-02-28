package com.datastructure.linklist;

public class ReverseLinkList {
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

		while (curr != null) {
			temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = temp;
		}
		head = prev;
	}

	public static void main(String[] args) {
		ReverseLinkList ree = new ReverseLinkList();
		ree.push(12);
		ree.push(22);
		ree.push(32);

		ree.reverseEvenElement();
		ree.printData();
	}
}
