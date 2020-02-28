package com.datastructure.linklist;

public class MaxContiguousNodeSum {

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

	public int sum() {

		if (head == null)
			return 0;
		if (head.next == null)
			return head.data;
		int max_ending_here = head.data;
		int max_so_far = head.data;
		head = head.next;
		while (head != null) {
			max_ending_here = Math.max(head.data, head.data + max_ending_here);
			max_so_far = Math.max(max_ending_here, max_so_far);
			head = head.next;
		}
		return max_so_far;
	}

	public static void main(String[] args) {
		MaxContiguousNodeSum ree = new MaxContiguousNodeSum();
		ree.push(-2);
		ree.push(-3);
		ree.push(4);
		ree.push(-1);
		ree.push(-2);
		ree.push(1);
		ree.push(5);
		ree.push(-3);

		System.out.println(ree.sum());
	}
}
