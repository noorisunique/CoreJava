package com.datastructure.binarytee;

import java.util.Stack;

/* Class containing left and right child of
current node and key value*/
class Node04 {
	int data;
	Node04 left, right;

	public Node04(int item) {
		data = item;
		left = right = null;
	}
}

/* Class to print the inorder traversal */
class InorderWithoutRecursion {
	Node04 root;

	void inorder() {
		if (root == null)
			return;

		Stack<Node04> s = new Stack<Node04>();
		Node04 curr = root;

		// traverse the tree
		while (curr != null || s.size() > 0) {

			/*
			 * Reach the left most Node of the curr Node
			 */
			while (curr != null) {
				/*
				 * place pointer to a tree node on the stack before traversing the node's left
				 * subtree
				 */
				s.push(curr);
				curr = curr.left;
			}

			/* Current must be NULL at this point */
			curr = s.pop();

			System.out.print(curr.data + " ");

			/*
			 * we have visited the node and its left subtree. Now, it's right subtree's turn
			 */
			curr = curr.right;
		}
	}

	public static void main(String args[]) {

		/*
		 * creating a binary tree and entering the nodes
		 */
		InorderWithoutRecursion tree = new InorderWithoutRecursion();
		tree.root = new Node04(1);
		tree.root.left = new Node04(2);
		tree.root.right = new Node04(3);
		tree.root.left.left = new Node04(4);
		tree.root.left.right = new Node04(5);
		tree.inorder();
	}
}
