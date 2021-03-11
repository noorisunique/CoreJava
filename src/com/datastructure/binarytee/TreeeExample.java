package com.datastructure.binarytee;

class Node20 {
	Node20 left, right;
	int data;

	public Node20(int data) {
		this.left = this.right = null;
		this.data = data;
	}

}

public class TreeeExample {

	Node20 root;

	TreeeExample() {
		this.root = null;
	}

	private void printInorder(Node20 root) {
		if (root == null)
			return;
		
		printInorder(root.left);
		System.out.println(root.data);
		printInorder(root.right);
		
	}

	public static void main(String[] args) {
		Node20 node = new Node20(10);
		node.left = new Node20(20);
		node.right = new Node20(30);

		TreeeExample ex = new TreeeExample();
		ex.printInorder(node);

	}

}
