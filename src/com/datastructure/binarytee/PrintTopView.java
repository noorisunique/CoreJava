package com.datastructure.binarytee;

import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.TreeMap;

//https://www.geeksforgeeks.org/print-nodes-top-view-binary-tree/

public class PrintTopView {
	Node root;

	

	public PrintTopView() {
		root = null;
	}

	private void TopView(Node root) {
		class QueueObject {
			Node node;
			int hd;

			public QueueObject(Node node, int hd) {
				this.node = node;
				this.hd = hd;
			}
		}
		Queue<QueueObject> q = new LinkedList<QueueObject>();
		Map<Integer, Node> topViewMap = new TreeMap<Integer, Node>();
		if (root == null) {
			return;
		} else {
			q.add(new QueueObject(root, 0));
		}
		System.out.println("The top view of the tree is : ");

		while (!q.isEmpty()) {
			QueueObject temp = q.poll();
			if (!topViewMap.containsKey(temp.hd)) {
				topViewMap.put(temp.hd, temp.node);
			}
			if (temp.node.left != null) {
				q.add(new QueueObject(temp.node.left, temp.hd - 1));
			}
			if (temp.node.right != null) {
				q.add(new QueueObject(temp.node.right, temp.hd + 1));
			}
		}

		for (Entry<Integer, Node> entry : topViewMap.entrySet()) {
			System.out.println(entry.getValue().data);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintTopView tree = new PrintTopView();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.right = new Node(4);
		tree.root.left.right.right = new Node(5);
		tree.root.left.right.right.right = new Node(6);
		System.out.println("Following are nodes in top view of Binary Tree");
		tree.TopView(tree.root);
	}

}
