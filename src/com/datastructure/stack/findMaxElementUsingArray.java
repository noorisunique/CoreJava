package com.datastructure.stack;

class MyStack {
	static final int MAX = 100;
	int top;
	int a[] = new int[MAX];

	boolean isEmpty() {
		return (top < 0);
	}

	MyStack() {
		top = -1;
	}



	boolean push(int x) {
		if (top >= (MAX - 1)) {
			System.out.println("Stack Overflow");
			return false;
		} else {
			
			a[++top] = x;
			System.out.println(x + " pushed into stack");
			return true;
		}
	}

	int pop() {
		if (top < 0) {
			System.out.println("Stack Underflow");
			return 0;
		} else {
			int x = a[top--];
			return x;
		}
	}

	int peek() {
		if (top < 0) {
			System.out.println("Stack Underflow");
			return 0;
		} else {
			int x = a[top];
			return x;
		}
	}

	
}

public class findMaxElementUsingArray {

	public static void main(String[] args) {
		MyStack stack = new MyStack();
		stack.push(11);
		stack.push(12);
		stack.push(130);
		stack.push(14);
		
		System.out.println(stack.peek());

	}

}
