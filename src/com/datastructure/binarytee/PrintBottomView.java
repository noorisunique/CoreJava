package com.datastructure.binarytee;

//https://www.geeksforgeeks.org/bottom-view-binary-tree/
//https://www.youtube.com/watch?v=V7alrvgS5AI
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;



public class PrintBottomView {
	Node root;

	PrintBottomView() {
		root = null;
	}

	PrintBottomView(Node root) {
		this.root = root;
	}

	public void bottomView() {
		if (root == null) {
			return;
		}
		int hd = 0;

		Map<Integer, Integer> map = new TreeMap<>();

		Queue<Node> queue = new LinkedList<Node>();

		root.hd = hd;
		queue.add(root);

		while (!queue.isEmpty()) {
			Node temp = queue.remove();
			hd = temp.hd;
			map.put(hd, temp.data);

			if (temp.left != null) {
				temp.left.hd = hd - 1;
				queue.add(temp.left);
			}
			if (temp.right != null) {
				temp.right.hd = hd + 1;
				queue.add(temp.right);
			}
		}
		for (Integer node : map.values()) {
			System.out.println(node);
		}
	}

	public static void main(String[] args) {

		Node root = new Node(20);
		root.left = new Node(8);
		root.right = new Node(22);
		root.left.left = new Node(5);
		root.left.right = new Node(3);
		root.right.left = new Node(4);
		root.right.right = new Node(25);
		root.left.right.left = new Node(10);
		root.left.right.right = new Node(14);
		PrintBottomView bv = new PrintBottomView(root);
		System.out.println("Bottom View");
		bv.bottomView();

	}

}
