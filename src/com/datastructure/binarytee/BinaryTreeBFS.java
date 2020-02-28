package com.datastructure.binarytee;

import java.util.LinkedList;
import java.util.Queue;

//https://www.baeldung.com/java-binary-tree
public class BinaryTreeBFS {
	Node root;

	class Node {
		int data;
		Node left, right;

		Node(int data) {
			this.data = data;
			left = right = null;
		}
	}

	BinaryTreeBFS() {
		root = null;
	}

	private Node AddNode(Node curr, int data) {
		if (curr == null)
			return new Node(data);
		if (data < curr.data) {
			curr.left = AddNode(curr.left, data);
		} else if (data > curr.data) {
			curr.right = AddNode(curr.right, data);
		} else {
			return curr;
		}
		return curr;
	}

	public void addNode(int data) {
		root = AddNode(root, data);
	}

	public void traversalLevelOrder() {
		if (root == null)
			return;

		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while (!q.isEmpty()) {
			Node node = q.remove();
			System.out.println(node.data);
			if (node.left != null) {
				q.add(node.left);
			}
			if (node.right != null) {
				q.add(node.right);
			}

		}
	}

	public static void main(String[] args) {
		BinaryTreeBFS bfs = new BinaryTreeBFS();
		bfs.addNode(6);
		bfs.addNode(4);
		bfs.addNode(8);
		bfs.addNode(3);
		bfs.addNode(5);
		bfs.addNode(7);
		bfs.addNode(9);
		bfs.traversalLevelOrder();
	}

}
