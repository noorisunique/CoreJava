package com.datastructure.linklist;

public class RemoveNthNodeFromEnd {
	Node head;

	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public void push(int data) {
		Node newnode = new Node(data);
		Node temp = head;
		if (head == null) {
			temp = newnode;
			head = temp;
		} else {

			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newnode;
		}
	}

	public void printNode() {

		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	public void removeNode(int key) {
		Node fast = head;
		Node slow = head;
		if (head == null)
			return;
		while (fast.next != null) {
			slow = fast;
			for (int i = 0; i < key; i++) {
				fast = fast.next;
			}

		}
		slow.next = fast;

	}

	public Node removeNode1(int key) {

		// to store the length of the link list
		int len = 0;
		Node temp = head;

		if (temp == null)
			return null;
		while (temp != null) {
			len++;
			temp = temp.next;
		}
		// Key >Len then we can not remove node
		if (key > len) {
			System.out.println("Can not remove");
			return head;

		} // we need to remove head node
		else if (key == len) {
			return head.next;
		} else {
			int diff = len - key;
			Node prev = null;
			Node curr = head;
			for (int i = 0; i < diff; i++) {
				prev = curr;
				curr = curr.next;
			}
			prev.next = curr.next;
			return head;
		}

	}

	public static void main(String[] args) {
		RemoveNthNodeFromEnd node = new RemoveNthNodeFromEnd();
		node.push(10);
		node.push(20);
		node.push(30);
		node.push(40);
		node.push(50);
		node.push(60);
		node.push(70);
		node.printNode();
		System.out.println("Delete Nth Node");
		node.removeNode1(3);
		node.printNode();

	}
}
