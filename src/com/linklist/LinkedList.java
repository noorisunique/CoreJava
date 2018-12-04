package com.linklist;

public class LinkedList {
	Node head;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}

		public static void main(String[] args) {
			LinkedList list = new LinkedList();
			list.head = new Node(1);
			Node sec = new Node(2);
			Node third = new Node(3);

			list.head.next = sec;
			sec.next = third;
			/*Node temp=list.head;
			while(temp!=null){
				System.out.println(temp.data);
				temp=temp.next;
			}*/
		}
	}
}
