package com.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//http://tutorials.jenkov.com/java-concurrency/locks.html
class Counter1 {
	private int count = 0;
	private Lock lock = new ReentrantLock();

	public int inc() {
		lock.lock();
		int newCount = ++count;
		lock.unlock();
		return newCount;
	}
}

class CounterAccessThread1 extends Thread {
	private Counter1 c1;

	CounterAccessThread1(Counter1 counter) {
		this.c1 = counter;
	}

	public void run() {
		System.out.println(c1.inc());
	}
}

public class Counter_with_Lock {

	public static void main(String[] args) {
		Counter1 c1 = new Counter1();
		CounterAccessThread1 thread1 = new CounterAccessThread1(c1);
		CounterAccessThread1 thread2 = new CounterAccessThread1(c1);
		CounterAccessThread1 thread3 = new CounterAccessThread1(c1);
		CounterAccessThread1 thread4 = new CounterAccessThread1(c1);

		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
	}

}
