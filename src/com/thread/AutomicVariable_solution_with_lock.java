package com.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//https://www.codejava.net/java-core/concurrency/understanding-atomic-variables-in-java
class Counter2 {
	private int value;
	private Lock lock = new ReentrantLock();

	public void increment() {
		lock.lock();
		value++;
		lock.unlock();
	}

	public void decrement() {
		lock.lock();
		value--;
		lock.unlock();
	}

	public synchronized int get() {
		return value;
	}
}

class UpdateThread2 extends Thread {
	private Counter2 counter;

	public UpdateThread2(Counter2 counter) {
		this.counter = counter;
	}

	public void run() {
		try {
			Thread.sleep(100);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}

		counter.increment();
	}
}

public class AutomicVariable_solution_with_lock {
	static final int NUMBER_THREADS = 100;

	public static void main(String[] args) throws InterruptedException {
		Counter2 counter = new Counter2();
		System.out.println("Initial Counter = " + counter.get());

		UpdateThread2[] threads = new UpdateThread2[NUMBER_THREADS];

		for (int i = 0; i < NUMBER_THREADS; i++) {
			threads[i] = new UpdateThread2(counter);
			threads[i].start();
		}

		for (int i = 0; i < NUMBER_THREADS; i++) {
			threads[i].join();
		}

		System.out.println("Final Counter = " + counter.get());
	}
}