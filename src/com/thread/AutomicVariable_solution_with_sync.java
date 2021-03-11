package com.thread;

//https://www.codejava.net/java-core/concurrency/understanding-atomic-variables-in-java
class Counter1 {
	private int value;

	public synchronized void increment() {
		value++;
	}

	public synchronized void decrement() {
		value--;
	}

	public synchronized int get() {
		return value;
	}
}

class UpdateThread1 extends Thread {
	private Counter1 counter;

	public UpdateThread1(Counter1 counter) {
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

public class AutomicVariable_solution_with_sync {
	static final int NUMBER_THREADS = 100;

	public static void main(String[] args) throws InterruptedException {
		Counter1 counter = new Counter1();
		System.out.println("Initial Counter = " + counter.get());

		Thread[] threads = new Thread[NUMBER_THREADS];

		for (int i = 0; i < NUMBER_THREADS; i++) {
			threads[i] = new UpdateThread1(counter);
			threads[i].start();
		}

		for (int i = 0; i < NUMBER_THREADS; i++) {
			threads[i].join();
		}

		System.out.println("Final Counter = " + counter.get());
	}
}