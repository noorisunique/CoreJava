package com.datastructure.binarytee;

import java.util.HashSet;
import java.util.Stack;

/* Class containing left and right child of
current node and key value*/
class Node06 {
	int data;
	Node06 left, right;

	public Node06(int item) {
		data = item;
		left = right = null;
	}
}

/* Class to print the inorder traversal */
class PostOrderWithoutRecursionUsingHashSet {
	Node06 root;

	void inorder() {
		if (root == null)
			return;

		HashSet<Node06> visited = new HashSet<Node06>();
		Node06 temp = root;
		while (temp != null && !visited.contains(temp)) {
			if (temp.left != null && !visited.contains(temp.left)) {
				temp = temp.left;
			} else if (temp.right != null && !visited.contains(temp.right)) {
				temp = temp.right;
			} else {
				System.out.printf("%d ", temp.data);
				visited.add(temp);
				temp = root;
			}
		}
	}

	public static void main(String args[]) {

		/*
		 * creating a binary tree and entering the nodes
		 */
		PostOrderWithoutRecursionUsingHashSet tree = new PostOrderWithoutRecursionUsingHashSet();
		tree.root = new Node06(1);
		tree.root.left = new Node06(2);
		tree.root.right = new Node06(3);
		tree.root.left.left = new Node06(4);
		tree.root.left.right = new Node06(5);
		tree.inorder();
	}
}
