package com.datastructure.binarytee;

class Node01 {
	int data;
	Node01 left, right;

	public Node01(int data) {
		this.data = data;
		left = right = null;
	}
}

public class HeightBinaryTree {
	Node01 root;

	public HeightBinaryTree() {
		root = null;
	}

	public int printHeight(Node01 root) {
		if (root == null) {
			return 0;
		} else {
			int lheight = printHeight(root.left);
			int rheight = printHeight(root.right);

			if (lheight > rheight)
				return lheight + 1;
			else
				return rheight + 1;
		}

	}

	public static void main(String[] args) {
		HeightBinaryTree tree = new HeightBinaryTree();
		tree.root = new Node01(12);
		tree.root.left = new Node01(13);
		tree.root.right = new Node01(14);
		tree.root.left.left = new Node01(15);
		tree.root.left.right = new Node01(16);
		System.out.println(tree.printHeight(tree.root));

	}

}
