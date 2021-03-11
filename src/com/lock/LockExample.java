package com.lock;
//https://www.journaldev.com/2377/java-lock-example-reentrantlock

class TestLock {

	public synchronized void foo() {
		bar();
	}

	public synchronized void bar() {
		System.out.println("Bar.....");
	}
}

public class LockExample {

	public static void main(String[] args) {
		TestLock t = new TestLock();
		t.foo();
		t.foo();
		t.foo();
		t.foo();
		t.foo();

	}

}
