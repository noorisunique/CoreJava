package com.lock;

//http://tutorials.jenkov.com/java-concurrency/locks.html
class Counter2 {
	private int count = 0;

	public int inc() {

		return ++count;

	}
}

class CounterAccessThread2 extends Thread {
	private Counter2 c1;

	CounterAccessThread2(Counter2 counter) {
		this.c1 = counter;
	}

	public void run() {
		System.out.println(c1.inc());
	}
}

public class Counter_with_Sync_without {

	public static void main(String[] args) {
		Counter2 c1 = new Counter2();
		CounterAccessThread2 thread1 = new CounterAccessThread2(c1);
		CounterAccessThread2 thread2 = new CounterAccessThread2(c1);
		CounterAccessThread2 thread3 = new CounterAccessThread2(c1);
		CounterAccessThread2 thread4 = new CounterAccessThread2(c1);

		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
	}

}
