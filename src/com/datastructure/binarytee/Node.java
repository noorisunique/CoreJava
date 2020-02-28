package com.datastructure.binarytee;

public class Node {
	int data;
	Node left, right;
	int hd;

	Node(int data) {
		this.data = data;
		hd = Integer.MAX_VALUE;
		left = right = null;
	}
}