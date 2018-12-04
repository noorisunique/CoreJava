package com.linklist;

public class InsertHead {
	Node head;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public static void main(String[] args) {
		InsertHead list = new InsertHead();
		list.head = new Node(1);
		Node sec = new Node(2);
		Node third = new Node(3);

		list.head.next = sec;
		sec.next = third;
		// add node in first
		Node first = new Node(10);
		first.next = list.head;
		list.head = first;

		// add after 2

		Node new_node = new Node(20);
		Node temp = list.head;
		while (temp.data != 2) {
			temp = temp.next;
		}
		new_node.next = temp.next;
		temp.next = new_node;

		// delete node 2
		temp = list.head;
		Node preNode=null;
		while (temp.data != 2) {
			preNode=temp;
			temp=temp.next;
		}
		preNode.next=temp.next;
		temp.next=temp.next;
		
		
		
		
		// traverse
		temp = list.head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
}
