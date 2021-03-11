package com.lock;

//http://tutorials.jenkov.com/java-concurrency/locks.html
class Counter {
	private int count = 0;

	public int inc() {
		synchronized (this) {
			return ++count;
		}
	}
}

class CounterAccessThread extends Thread {
	private Counter c1;

	CounterAccessThread(Counter counter) {
		this.c1 = counter;
	}

	public void run() {
		System.out.println(c1.inc());
	}
}

public class Counter_with_Sync {

	public static void main(String[] args) {
		Counter c1 = new Counter();
		CounterAccessThread thread1 = new CounterAccessThread(c1);
		CounterAccessThread thread2 = new CounterAccessThread(c1);
		CounterAccessThread thread3 = new CounterAccessThread(c1);
		CounterAccessThread thread4 = new CounterAccessThread(c1);

		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
	}

}
