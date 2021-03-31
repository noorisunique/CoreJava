package com.datastructure.binarytee;

import java.util.Stack;

/* Class containing left and right child of
current node and key value*/
class NodeInOreder {
	int data;
	NodeInOreder left, right;

	public NodeInOreder(int item) {
		data = item;
		left = right = null;
	}
}

/* Class to print the inorder traversal */
class InorderWithoutRecursion2 {
	NodeInOreder root;

	void inorder() {
		if (root == null)
			return;

		Stack<NodeInOreder> stack = new Stack<NodeInOreder>();
		NodeInOreder curr = root;

		// traverse the tree
		while (!stack.isEmpty() || curr != null) {

			if (curr != null) {
				stack.push(curr);
				curr = curr.left;
			} else {
				curr = stack.pop();

				System.out.print(curr.data + " ");

				curr = curr.right;
			}
		}
	}

	public static void main(String args[]) {

		/*
		 * creating a binary tree and entering the nodes
		 */
		InorderWithoutRecursion2 tree = new InorderWithoutRecursion2();
		tree.root = new NodeInOreder(1);
		tree.root.left = new NodeInOreder(2);
		tree.root.right = new NodeInOreder(3);
		tree.root.left.left = new NodeInOreder(4);
		tree.root.left.right = new NodeInOreder(5);
		tree.inorder();
	}
}
