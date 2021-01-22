package com.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class A {
	private final Lock lock = new ReentrantLock();
	int counter = 0;
	public void print() {

		lock.lock();
		try {
			counter++;
		} finally {
			lock.unlock();
		}

	}
}

class B extends Thread {
	private A a1;

	B(String t1, A a1) {
		super(t1);
		this.a1 = a1;
	}

	public void run() {

		
		a1.print();
		System.out.println("B........ "+a1.counter+"   " + Thread.currentThread().getName());
	}
}

public class LockTestThread2 {

	public static void main(String args[]) {
		A a1 = new A();
		B b1 = new B("Thread 1", a1);
		B b2 = new B("Thread 2", a1);
		B b3 = new B("Thread 3", a1);

		b1.start();
		b2.start();
		b3.start();
	}
}