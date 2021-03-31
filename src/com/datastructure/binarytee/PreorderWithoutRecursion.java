package com.datastructure.binarytee;

import java.util.Stack;

class NodePreOrder {

	int data;
	NodePreOrder left, right;

	NodePreOrder(int item) {
		data = item;
		left = right = null;
	}
}

class PreorderWithoutRecursion {

	NodePreOrder root;

	void iterativePreorder() {
		iterativePreorder(root);
	}

	// An iterative process to print preorder traversal of Binary tree
	void iterativePreorder(NodePreOrder NodePreOrder) {

		// Base Case
		if (NodePreOrder == null) {
			return;
		}

		// Create an empty stack and push root to it
		Stack<NodePreOrder> NodePreOrderStack = new Stack<NodePreOrder>();
		NodePreOrderStack.push(root);

		/*
		 * Pop all items one by one. Do following for every popped item a) print it b)
		 * push its right child c) push its left child Note that right child is pushed
		 * first so that left is processed first
		 */
		while (NodePreOrderStack.empty() == false) {

			// Pop the top item from stack and print it
			NodePreOrder myNodePreOrder = NodePreOrderStack.peek();
			System.out.print(myNodePreOrder.data + " ");
			NodePreOrderStack.pop();

			// Push right and left children of the popped NodePreOrder to stack
			if (myNodePreOrder.right != null) {
				NodePreOrderStack.push(myNodePreOrder.right);
			}
			if (myNodePreOrder.left != null) {
				NodePreOrderStack.push(myNodePreOrder.left);
			}
		}
	}

	// driver program to test above functions
	public static void main(String args[]) {
		PreorderWithoutRecursion tree = new PreorderWithoutRecursion();
		tree.root = new NodePreOrder(10);
		tree.root.left = new NodePreOrder(8);
		tree.root.right = new NodePreOrder(2);
		tree.root.left.left = new NodePreOrder(3);
		tree.root.left.right = new NodePreOrder(5);
		tree.root.right.left = new NodePreOrder(2);
		tree.iterativePreorder();
	}
}
