package com.datastructure.binarytee;

public class PrintMin_Max_Fashion {
	Node root;
	int size;
	int arr[];
	int index;

	class Node {
		int data;
		Node left, right;

		Node(int data) {
			this.data = data;
			left = right = null;
		}
	}

	PrintMin_Max_Fashion() {
		root = null;
	}

	private Node addNodeRecursivly(Node curr, int data) {
		if (curr == null)
			return new Node(data);
		if (data < curr.data) {
			curr.left = addNodeRecursivly(curr.left, data);
		} else if (data > curr.data) {
			curr.right = addNodeRecursivly(curr.right, data);
		} else {
			// already exist
			return curr;
		}

		return curr;
	}

	public void addNode(int data) {
		root = addNodeRecursivly(root, data);
	}

	public int sizeOfTree(Node curr) {
		if (curr == null) {
			return 0;
		}
		int left = sizeOfTree(curr.left);
		int right = sizeOfTree(curr.right);
		return (left + right + 1);
	}

	public void size() {
		System.out.println("Tree Size: " + sizeOfTree(root));
	}

	public void printMinMaxFashion() {
		size = sizeOfTree(root);
		arr = new int[size];
		traversal();
		for (int i : arr) {
			System.out.println(i);
		}
		int i = 0;
		index--;
		while (i < index) {
			System.out.print(arr[i++] + " " + arr[index--] + " ");

		}
		if (i == index)
			System.out.println(arr[i]);
	}

	public void inOrderTraversal(Node curr) {
		if (curr != null) {
			inOrderTraversal(curr.left);
			arr[index++] = curr.data;
			inOrderTraversal(curr.right);
		}
	}

	public void traversal() {
		inOrderTraversal(root);
	}

	public static void main(String[] args) {
		PrintMin_Max_Fashion bt = new PrintMin_Max_Fashion();
		bt.addNode(6);
		bt.addNode(4);
		bt.addNode(8);
		bt.addNode(3);
		bt.addNode(5);
		bt.addNode(7);
		bt.addNode(9);
		bt.printMinMaxFashion();
	}
}
