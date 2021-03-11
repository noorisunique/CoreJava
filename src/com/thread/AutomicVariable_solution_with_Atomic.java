package com.thread;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//https://www.codejava.net/java-core/concurrency/understanding-atomic-variables-in-java
class Counter3 {
	private AtomicInteger value = new AtomicInteger();

	public void increment() {
		value.incrementAndGet();
	}

	public void decrement() {
		value.decrementAndGet();
	}

	public int get() {
		return value.get();
	}
}

class UpdateThread3 extends Thread {
	private Counter3 counter;

	public UpdateThread3(Counter3 counter) {
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

public class AutomicVariable_solution_with_Atomic {
	static final int NUMBER_THREADS = 100;

	public static void main(String[] args) throws InterruptedException {
		Counter3 counter = new Counter3();
		System.out.println("Initial Counter = " + counter.get());

		UpdateThread3[] threads = new UpdateThread3[NUMBER_THREADS];

		for (int i = 0; i < NUMBER_THREADS; i++) {
			threads[i] = new UpdateThread3(counter);
			threads[i].start();
		}

		for (int i = 0; i < NUMBER_THREADS; i++) {
			threads[i].join();
		}

		System.out.println("Final Counter = " + counter.get());
	}
}