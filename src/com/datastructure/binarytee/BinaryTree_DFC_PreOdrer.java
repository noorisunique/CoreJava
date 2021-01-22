package com.datastructure.binarytee;
//https://www.geeksforgeeks.org/dfs-traversal-of-a-tree-using-recursion/

class Node2 {

	int data;
	Node2 left, right;

	public Node2(int data) {
		this.data = data;
		left = right = null;
	}
}

public class BinaryTree_DFC_PreOdrer {
	Node2 root;

	BinaryTree_DFC_PreOdrer() {
		root = null;
	}

	public void printInorder(Node2 node) {
		if (node == null)
			return;
		printInorder(node.left);
		System.out.println(node.data);
		printInorder(node.right);
	}

	public void printInorder() {
		printInorder(root);
	}

	public static void main(String[] args) {
		BinaryTree_DFC_PreOdrer tree = new BinaryTree_DFC_PreOdrer();
		tree.root = new Node2(1);
		tree.root.left = new Node2(2);
		tree.root.right = new Node2(3);
		tree.root.left.left = new Node2(4);
		tree.root.left.right = new Node2(5);

		System.out.println("\nInorder traversal of binary tree is ");
		tree.printInorder();

	}

}
