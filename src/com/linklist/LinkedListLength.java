package com.linklist;

public class LinkedListLength {
	Node head;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}

		public static void main(String[] args) {
			int counter=0;
			LinkedListLength list = new LinkedListLength();
			list.head = new Node(1);
			Node sec = new Node(2);
			Node third = new Node(3);

			list.head.next = sec;
			sec.next = third;
			Node temp=list.head;
			while(temp!=null){
				System.out.println(temp.data);
				temp=temp.next;
				counter++;
			}
			System.out.println("LinkedList length== "+counter);
		}
	}
}
