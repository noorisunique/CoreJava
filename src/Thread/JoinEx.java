package com.Thread;

class AA implements Runnable {
	public void run() {
		synchronized (this) {
			System.out.println(Thread.currentThread().getName());
		}

	}
}

public class JoinEx {

	public static void main(String[] args) {
		System.out.println("Main Thead Started");
		AA a1 = new AA();
		AA a2 = new AA();

		Thread t1 = new Thread(a1);
		Thread t2 = new Thread(a1);

		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO: handle exception
		}

		System.out.println("Main Thread Ended");
	}
}
