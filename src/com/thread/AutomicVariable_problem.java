package com.thread;

//https://www.codejava.net/java-core/concurrency/understanding-atomic-variables-in-java
class Counter {
	private int value;

	public void increment() {
		value++;
	}

	public void decrement() {
		value--;
	}

	public int get() {
		return value;
	}
}

class UpdateThread extends Thread {
	private Counter counter;

	public UpdateThread(Counter counter) {
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

public class AutomicVariable_problem {
	static final int NUMBER_THREADS = 100;

	public static void main(String[] args) throws InterruptedException {
		Counter counter = new Counter();
		System.out.println("Initial Counter = " + counter.get());

		UpdateThread[] threads = new UpdateThread[NUMBER_THREADS];

		for (int i = 0; i < NUMBER_THREADS; i++) {
			threads[i] = new UpdateThread(counter);
			threads[i].start();
		}

		for (int i = 0; i < NUMBER_THREADS; i++) {
			threads[i].join();
		}

		System.out.println("Final Counter = " + counter.get());
	}
}