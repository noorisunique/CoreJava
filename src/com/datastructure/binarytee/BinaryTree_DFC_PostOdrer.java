package com.datastructure.binarytee;
//https://www.geeksforgeeks.org/dfs-traversal-of-a-tree-using-recursion/

class Node4 {

	int data;
	Node4 left, right;

	public Node4(int data) {
		this.data = data;
		left = right = null;
	}
}

public class BinaryTree_DFC_PostOdrer {
	Node4 root;

	BinaryTree_DFC_PostOdrer() {
		root = null;
	}

	public void printInorder(Node4 node) {
		if (node == null)
			return;
		printInorder(node.left);
		printInorder(node.right);
		System.out.println(node.data);	
	}

	public void printInorder() {
		printInorder(root);
	}

	public static void main(String[] args) {
		BinaryTree_DFC_PostOdrer tree = new BinaryTree_DFC_PostOdrer();
		tree.root = new Node4(1);
		tree.root.left = new Node4(2);
		tree.root.right = new Node4(3);
		tree.root.left.left = new Node4(4);
		tree.root.left.right = new Node4(5);

		System.out.println("\nInorder traversal of binary tree is ");
		tree.printInorder();

	}

}
