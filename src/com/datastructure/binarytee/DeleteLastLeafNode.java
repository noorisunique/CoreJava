package com.datastructure.binarytee;

import java.util.LinkedList;
import java.util.Queue;

//https://www.geeksforgeeks.org/delete-the-last-leaf-node-in-a-binary-tree/
public class DeleteLastLeafNode {
	static class Node {
		int data;
		Node left, right;

		Node(int data) {
			this.data = data;
			left = right = null;
		}
	}

	public void inorder(Node root) {
		if (root == null)
			return;
		inorder(root.left);
		System.out.println(root.data);
		inorder(root.right);
	}

	public static Node lastLevelLevelOrder;
	public static Node parentOfLastNode;

	public void deleteLastNode(Node root) {
		if (root == null)
			return;

		Queue<Node> q = new LinkedList<>();
		q.offer(root);

		while (!q.isEmpty()) {
			Node temp = q.poll();
			if (temp.left != null) {
				q.offer(temp.left);

				if (temp.left.left == null && temp.left.right == null) {
					lastLevelLevelOrder = temp.left;
					parentOfLastNode = temp;
				}
			}

			if (temp.right != null) {
				q.offer(temp.right);
				if (temp.right.left == null && temp.right.right == null) {
					lastLevelLevelOrder = temp.right;
					parentOfLastNode = temp;
				}
			}
		}

		if (lastLevelLevelOrder != null && parentOfLastNode != null) {
			if (parentOfLastNode.right != null)
				parentOfLastNode.right = null;
			else
				parentOfLastNode.left = null;
		} else {
			System.out.println("Tree is Empty");
		}

	}

	public static void main(String[] args) {
		Node root = new Node(6);
		root.left = new Node(5);
		root.right = new Node(4);
		root.left.left = new Node(1);
		root.left.right = new Node(2);
		root.right.right = new Node(5);

		DeleteLastLeafNode deleteLastNode = new DeleteLastLeafNode();

		System.out.println("Inorder traversal " + "before deletion of " + "last node : ");
		deleteLastNode.inorder(root);

		deleteLastNode.deleteLastNode(root);

		System.out.println("\nInorder traversal " + "after deletion " + "of last node : ");

		deleteLastNode.inorder(root);
	}

}
