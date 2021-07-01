package com.test;

import java.util.concurrent.Semaphore;

class Q1 {

	int n;

	static Semaphore semCon = new Semaphore(0);

	static Semaphore semProd = new Semaphore(1);

	void get() {

		try {

			semCon.acquire();

		} catch (InterruptedException e) {

			System.out.println("InterruptedException caught");

		}

		System.out.println("Got: " + n);

		semProd.release();

	}

	void put(int n) {

		try {

			semProd.acquire();

		} catch (InterruptedException e) {

			System.out.println("InterruptedException caught");

		}

		this.n = n;

		System.out.println("Put: " + n);

		semCon.release();

	}

}

class Producer implements Runnable {

	Q1 q;

	Producer(Q1 q) {

		this.q = q;

		new Thread(this, "Producer").start();

	}

	public void run() {

		for (int i = 0; i < 4; i++)

			q.put(i);

	}

}

class Consumer implements Runnable {

	Q1 q;

	Consumer(Q1 q) {

		this.q = q;

		new Thread(this, "Consumer").start();

	}

	public void run() {

		for (int i = 0; i < 4; i++)

			q.get();

	}

}

class ProdCon {

	public static void main(String args[]) {

		Q1 q = new Q1();

		new Consumer(q);

		new Producer(q);

	}

}