package com.Thread;

class Table {
	synchronized public void printNumber(int num) {
		for (int i = 1; i < 5; i++) {
			System.out.println(num*i);
			
		}
	}
}

class MyThread1 extends Thread {
	private Table table;
	private int number;

	public MyThread1(int number, Table table) {
		this.table = table;
		this.number = number;
	}

	public void run() {
		table.printNumber(number);
	}
}

class MyThread2 extends Thread {
	private Table table;
	private int number;

	public MyThread2(int number, Table table) {
		this.table = table;
		this.number = number;
	}

	public void run() {
		table.printNumber(number);
	}
}

public class Print_1to10_byTwoThread {
	public static void main(String[] args) {

		Table table = new Table();
		MyThread1 m1 = new MyThread1(5, table);
		MyThread2 m2 = new MyThread2(100, table);
		
		m1.start();
		m2.start();
		
	}
}
