package com.datastructure.linklist;

public class LengthOfLinkList {
	class Node {
		
	}

	// 1. Iterative Solution
	public int length(){
		 int count=0;
		 Node current = this.head;

		 while(current != null){
		  count++;
		  current=current.next()
		 }
		 return count;
		}

	// 2. Recursive Solution:
	public int length(Node current) {
		if (current == null) { // base case
			return 0;
		}
		return 1 + length(current.next());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
