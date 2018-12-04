package com.linklist;

public class LinkedListReverse {
	Node head;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
		/* Function to reverse the linked list */
	    Node reverse(Node node) { 
	        Node prev = null; 
	        Node current = node; 
	        Node next = null; 
	        while (current != null) { 
	            next = current.next; 
	            current.next = prev; 
	            prev = current; 
	            current = next; 
	        } 
	        node = prev; 
	        return node; 
	    } 

		public static void main(String[] args) {
			LinkedListReverse list = new LinkedListReverse();
			list.head = new Node(1);
			Node sec = new Node(2);
			Node third = new Node(3);

			list.head.next = sec;
			sec.next = third;
			Node temp=list.head;
			while(temp!=null){
				System.out.println(temp.data);
				temp=temp.next;
			}
			Node prev = null; 
	        Node current = list.head; 
	        Node next = null; 
	        while (current != null) { 
	            next = current.next; 
	            current.next = prev; 
	            prev = current; 
	            current = next; 
	        } 
	        
	        System.out.println("After Reverse");
	         temp=prev;
			while(temp!=null){
				System.out.println(temp.data);
				temp=temp.next;
			}
			
			
		}
	}
}
