package com.datastructure.binarytee;

import java.util.Stack;

class NodeLeaves {
	int data;
	NodeLeaves left, right;

	public NodeLeaves(int item) {
		data = item;
		left = right = null;
	}

	public boolean isLeaf() {
		return left == null ? right == null : false;
	}

}

class printLeavesNode {
	NodeLeaves root;
	int c;

	int printLeave(NodeLeaves curr) {
		if (curr == null) {
			return 0;
		}
		if (curr.isLeaf()) {
			System.out.println(curr.data);
			c++;
		}
		printLeave(curr.left);
		printLeave(curr.right);
		return c;
	}

	public static void main(String args[]) {

		/*
		 * creating a binary tree and entering the nodes
		 */
		printLeavesNode tree = new printLeavesNode();
		tree.root = new NodeLeaves(1);
		tree.root.left = new NodeLeaves(2);
		tree.root.right = new NodeLeaves(3);
		tree.root.left.left = new NodeLeaves(4);
		tree.root.left.right = new NodeLeaves(5);
		tree.root.left.right.left = new NodeLeaves(50);
		tree.root.left.right.right = new NodeLeaves(80);
		// tree.printLeave(tree.root);
		System.out.println("leafe Node---   " + tree.printLeave(tree.root));
	}
}
