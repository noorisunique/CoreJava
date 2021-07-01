package com.datastructure.stack;

public class StackUsingLinkedlist {

	private class Node {
		int data;
		Node link;
	}

	Node top;

	StackUsingLinkedlist() {
		this.top = null;
	}

	public void push(int data) {
		Node temp = new Node();
		if (temp == null) {
			System.out.println("heap Overflow");
			return;
		}
		temp.data = data;
		temp.link = top;
		top = temp;
	}

	public boolean isEmpty() {
		return top == null;
	}

	public int peek() {
		if (!isEmpty()) {
			return top.data;
		} else {
			System.out.println("Stack is empty");
			return -1;
		}
	}

	public int pop() {
		if (top == null) {
			System.out.println("Stack underflow");
			return -1;
		} else {
			int data = top.data;
			top = top.link;
			return data;
		}
	}

	public void display() {

		if (top == null) {
			System.out.println("Stack underflow");
			System.exit(1);
		} else {
			Node temp = top;

			while (temp != null) {
				System.out.println(temp.data);
				temp = temp.link;
			}
		}
	}

	public static void main(String[] args) {
		StackUsingLinkedlist stack = new StackUsingLinkedlist();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);

		stack.display();
		System.out.println("Peek..." + stack.peek());
		System.out.println("Top...." + stack.pop());
		System.out.println("Top...." + stack.pop());
		System.out.println("Top...." + stack.pop());
		System.out.println("Top...." + stack.pop());

		System.out.println("Top...." + stack.pop());
			}
}
