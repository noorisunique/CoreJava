package com.datastructure.binarytee;

//https://www.baeldung.com/java-binary-tree
public class BinaryTreeDFS_AllOrder {
	Node root;

	class Node {
		int data;
		Node left, right;

		Node(int data) {
			this.data = data;
		}
	}

	BinaryTreeDFS_AllOrder() {
		root = null;
	}

	private Node AddRecursivly(Node curr, int data) {
		if (curr == null) {
			return new Node(data);
		}
		if (data < curr.data) {
			curr.left = AddRecursivly(curr.left, data);
		} else if (data > curr.data) {
			curr.right = AddRecursivly(curr.right, data);
		} else {
			// already exist
			return curr;
		}
		return curr;
	}

	public void addNode(int data) {
		root = AddRecursivly(root, data);
	}

	// InOrder traversal Left Root Right

	public void traverseInOrder(Node curr) {
		if (curr != null) {
			traverseInOrder(curr.left);
			System.out.println(" " + curr.data);
			traverseInOrder(curr.right);
		}
	}

	// PreOrder traversal Root Left Right

	public void preOrderTraversal(Node curr) {
		if (curr != null) {
			System.out.println(curr.data);
			preOrderTraversal(curr.left);
			preOrderTraversal(curr.right);
		}
	}

	// Post Order Traversal Left Right Root
	public void postOrderTraversal(Node curr) {
		if (curr != null) {
			postOrderTraversal(curr.left);
			postOrderTraversal(curr.right);
 			System.out.println(curr.data);
		}
	}

	public void raversal() {
		System.out.println("*********************InOrder*******************");
		traverseInOrder(root);
		System.out.println("*********************PreOrder*******************");
		preOrderTraversal(root);
		System.out.println("*********************PostOrder*******************");
		postOrderTraversal(root);

	}

	public static void main(String[] args) {
		BinaryTreeDFS_AllOrder inorder = new BinaryTreeDFS_AllOrder();
		inorder.addNode(6);
		inorder.addNode(4);
		inorder.addNode(8);
		inorder.addNode(3);
		inorder.addNode(5);
		inorder.addNode(7);
		inorder.addNode(9);
		inorder.raversal();

	}

}
