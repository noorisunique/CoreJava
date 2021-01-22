package com.datastructure.binarytee;
//https://www.geeksforgeeks.org/dfs-traversal-of-a-tree-using-recursion/

class Node3 {

	int data;
	Node3 left, right;

	public Node3(int data) {
		this.data = data;
		left = right = null;
	}
}

public class BinaryTree_DFC_Inodrer {
	Node3 root;

	BinaryTree_DFC_Inodrer() {
		root = null;
	}

	public void printInorder(Node3 node) {
		if (node == null)
			return;
		System.out.println(node.data);
		printInorder(node.left);
		printInorder(node.right);

	}

	public void printInorder() {
		printInorder(root);
	}

	public static void main(String[] args) {
		BinaryTree_DFC_Inodrer tree = new BinaryTree_DFC_Inodrer();
		tree.root = new Node3(1);
		tree.root.left = new Node3(2);
		tree.root.right = new Node3(3);
		tree.root.left.left = new Node3(4);
		tree.root.left.right = new Node3(5);

		System.out.println("\nInorder traversal of binary tree is ");
		tree.printInorder();

	}

}
