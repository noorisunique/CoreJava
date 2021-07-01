package com.datastructure.queue.arrayList;

import java.util.ArrayList;

public class MyQueue {

	private ArrayList<Integer> myArray = new ArrayList<Integer>();

	public void put(Integer n) {
		myArray.add(n);
	}

	public Integer take() {
		Integer res = myArray.get(0);
		myArray.remove(0);

		return res;
	}
	public static void main(String[] args) {
		MyQueue m1=new MyQueue();
		m1.put(121);
		m1.put(122);
		m1.put(123);
		m1.put(124);
		System.out.println(m1.take());
		System.out.println(m1.take());
		System.out.println(m1.take());
		System.out.println(m1.take());
		
	}
}