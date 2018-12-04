package com.stack;

public class CreateStack {
	class DLLNode {
		DLLNode pre;
		int data;
		DLLNode next;

		DLLNode(int d) {
			data = d;
		}
	}

	class MyStack {
		DLLNode head;
		DLLNode mid;
		int count;
	}

	MyStack createMyStack(){
		MyStack ms=new MyStack();
		ms.count=0;
		return ms;
	}
	
	void push(MyStack ms, int new_data){
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
