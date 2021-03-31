package com.thread;

public class InterThreadCommunication {
	long balance = 1000;

	public synchronized long withdraw(long wamt) {

		if (balance < wamt) {
			try {
				System.out.println("Insufficient Balance");
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Before withdraw " + balance);

		balance = balance - wamt;

		System.out.println("After withdraw " + balance);

		return wamt;
	}

	public synchronized void deposit(long damt) {

		System.out.println("Before deposit " + balance);
		balance = balance + damt;
		System.out.println("After deposit " + balance);
		notify();
	}

	public static void main(String[] args) {
		InterThreadCommunication obj = new InterThreadCommunication();
		new Thread() {
			public void run() {
				obj.withdraw(1200);
			}
		}.start();

		new Thread() {
			public void run() {
				obj.deposit(500);
			}
		}.start();
	}
}
///https://www.youtube.com/watch?v=lp3pOF4cu4k