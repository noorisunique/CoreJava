package com.datastructure.binarytee;

import java.util.Stack;

class Node03 {

	int data;
	Node03 left, right;

	Node03(int data) {
		this.data = data;
		left = right = null;
	}
}

public class BinaryTree_DFC_Inodrer_UsingStack {
	Node03 root;

	void inorder() {
		if (root == null)
			return;

		Stack<Node03> s = new Stack<Node03>();
		Node03 curr = root;

		// traverse the tree
		while (curr != null || s.size() > 0) {

			/*
			 * Reach the left most Node03 of the curr Node03
			 */
			while (curr != null) {
				/*
				 * place pointer to a tree Node03 on the stack before traversing the Node03's
				 * left subtree
				 */
				s.push(curr);
				curr = curr.left;
			}

			/* Current must be NULL at this point */
			curr = s.pop();

			System.out.print(curr.data + " ");

			/*
			 * we have visited the Node03 and its left subtree. Now, it's right subtree's
			 * turn
			 */
			curr = curr.right;
		}
	}

	public static void main(String args[]) {

		/*
		 * creating a binary tree and entering the Node03s
		 */
		BinaryTree_DFC_Inodrer_UsingStack tree = new BinaryTree_DFC_Inodrer_UsingStack();
		tree.root = new Node03(1);
		tree.root.left = new Node03(2);
		tree.root.right = new Node03(3);
		tree.root.left.left = new Node03(4);
		tree.root.left.right = new Node03(5);
		tree.inorder();
	}
}