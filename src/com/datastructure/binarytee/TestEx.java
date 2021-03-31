package com.datastructure.binarytee;

import java.util.LinkedList;
import java.util.Queue;

class Node02 {

	int data;
	Node02 left, right;

	public Node02(int data) {
		this.data = data;
		left = right = null;
	}
}

public class TestEx {
	Node02 root;

	TestEx() {
		root = null;
	}

	public void levelOrder() {
		Queue<Node02> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {

			Node02 tmp = queue.poll();
			System.out.println(tmp.data);

			if (tmp.left != null)
				queue.add(tmp.left);
			if (tmp.right != null)
				queue.add(tmp.right);
		}
	}

	public static void main(String[] args) {
		TestEx txt = new TestEx();
		txt.root = new Node02(1);
		txt.root.left = new Node02(11);
		txt.root.right = new Node02(12);
		txt.root.left.left = new Node02(111);
		txt.root.right.right = new Node02(122);
		txt.levelOrder();
	}

}
