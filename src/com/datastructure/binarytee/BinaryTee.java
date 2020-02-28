package com.datastructure.binarytee;

//https://www.geeksforgeeks.org/binary-search-tree-set-2-delete/
public class BinaryTee {

	Node root;

	class Node {
		int data;
		Node left, right;

		public Node(int data) {
			this.data = data;
			left = right = null;
		}
	}

	public BinaryTee() {
		root = null;
	}

	private Node addRecursive(Node curr, int data) {
		if (curr == null) {
			return new Node(data);
		}
		if (data < curr.data) {
			curr.left = addRecursive(curr.left, data);
		} else if (data > curr.data) {
			curr.right = addRecursive(curr.right, data);
		} else {
			return curr;// already exist
		}
		return curr;
	}

	BinaryTee(int data) {
		root = new Node(data);
	}

	public void addNode(int data) {
		root = addRecursive(root, data);
	}

	private boolean findingElement(Node curr, int data) {
		if (curr == null)
			return false;
		if (data == curr.data)
			return true;
		return data < curr.data ? findingElement(curr.left, data) : findingElement(curr.right, data);
	}

	public void containsNode(int data) {
		boolean b = findingElement(root, data);
		System.out.println(b);
	}

	public Node deleteRecursivly(Node curr, int data) {
		if (curr == null)
			return curr;

		if (data < curr.data) {
			curr.left = deleteRecursivly(curr.left, data);
		} else if (data > curr.data) {
			curr.right = deleteRecursivly(curr.right, data);
		} else {
			if (curr.left == null)
				return curr.right;
			else if (curr.right == null)
				return curr.left;

			curr.data = minData(curr.right);
			curr.right = deleteRecursivly(curr.right, curr.data);

		}
		return curr;
	}

	public void traverseInOrder(Node curr) {
		if (curr != null) {
			traverseInOrder(curr.left);
			System.out.println(" " + curr.data);
			traverseInOrder(curr.right);
		}
	}

	public void traversal() {
		System.out.println("*********************InOrder*******************");
		traverseInOrder(root);
	}

	public int minData(Node curr) {
		int minV = curr.data;
		while (curr.left != null) {
			minV = curr.left.data;
			curr = curr.left;
		}
		return minV;
	}

	public void deleteNode(int data) {
		Node node = deleteRecursivly(root, data);
	}

	public static void main(String[] args) {
		BinaryTee bt = new BinaryTee();
		bt.addNode(6);
		bt.addNode(4);
		bt.addNode(8);
		bt.addNode(3);
		bt.addNode(5);
		bt.addNode(7);
		bt.addNode(9);
		bt.traversal();
		bt.deleteNode(8);
		bt.traversal();
	}
}
