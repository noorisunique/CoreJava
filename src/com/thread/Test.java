package com.thread;

class MyTest {

	int balance = 200;

	synchronized void Withdraw(int amt) {
		System.out.println("Before Withdraw " + balance);
		if (balance < amt) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		balance = balance - amt;
		System.out.println("After Withdraw " + balance);
	}

	synchronized public void deposite(int amt) {
		System.out.println("Before Deposit " + balance);
		balance = balance + amt;
		System.out.println("After Deposit " + balance);
		notify();
	}
}

public class Test {
	public static void main(String[] args) {
		MyTest test1 = new MyTest();

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				test1.Withdraw(300);
			}
		});
		t1.start();

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				test1.deposite(300);
			}
		});
		t2.start();

	}
}
