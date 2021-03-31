package com.datastructure.binarytee;

import java.util.Stack;

/* Class containing left and right child of
current node and key value*/
class Node05 {
	int data;
	Node05 left, right;

	public Node05(int item) {
		data = item;
		left = right = null;
	}
}

/* Class to print the inorder traversal */
class PostOrderWithoutRecursion {
	Node05 root;

	void inorder() {
		if (root == null)
			return;

		Stack<Node05> stack = new Stack<Node05>();
		stack.push(root);

		Stack<Integer> out = new Stack();
		// loop till stack is empty
		while (!stack.empty()) {
			// pop a node from the stack and push the data into the output stack
			Node05 curr = stack.pop();
			out.push(curr.data);

			// push the left and right child of the popped node into the stack
			if (curr.left != null) {
				stack.push(curr.left);
			}

			if (curr.right != null) {
				stack.push(curr.right);
			}
		}

		// print postorder traversal
		while (!out.empty()) {
			System.out.print(out.pop() + " ");
		}
	}

	public static void main(String args[]) {

		/*
		 * creating a binary tree and entering the nodes
		 */
		PostOrderWithoutRecursion tree = new PostOrderWithoutRecursion();
		tree.root = new Node05(1);
		tree.root.left = new Node05(2);
		tree.root.right = new Node05(3);
		tree.root.left.left = new Node05(4);
		tree.root.left.right = new Node05(5);
		tree.inorder();
	}
}
