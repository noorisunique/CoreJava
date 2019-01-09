package com.thread;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Resource {

	public void doSomething() {
		// do some operation, DB read, write etc
	}

	public void doLogging() {
		// logging, no need for thread safety
	}
}

class SynchronizedLockExample implements Runnable {

	private Resource resource;

	public SynchronizedLockExample(Resource r) {
		this.resource = r;
	}

	@Override
	public void run() {
		synchronized (resource) {
			resource.doSomething();
		}
		resource.doLogging();
	}
}

class ConcurrencyLockExample implements Runnable {

	private Resource resource;
	private Lock lock;

	public ConcurrencyLockExample(Resource r) {
		this.resource = r;
		this.lock = new ReentrantLock();
	}

	@Override
	public void run() {
		try {
			if (lock.tryLock(10, TimeUnit.SECONDS)) {
				resource.doSomething();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			// release lock
			lock.unlock();
		}
		resource.doLogging();
	}

}

public class ReentrantLockEx {

}

/*
Java Lock vs synchronized
Based on above details and program, we can easily conclude following differences between Java Lock and synchronization.

1.Java Lock API provides more visibility and options for locking, unlike synchronized where a thread might end up waiting 
	indefinitely for the lock, we can use tryLock() to make sure thread waits for specific time only.
2.Synchronization code is much cleaner and easy to maintain whereas with Lock we are forced to have try-finally block to 
	make sure Lock is released even if some exception is thrown between lock() and unlock() method calls.
3.synchronization blocks or methods can cover only one method whereas we can acquire the lock in one method and release it 
	in another method with Lock API.
4.synchronized keyword doesn’t provide fairness whereas we can set fairness to true while creating ReentrantLock object 
	so that longest waiting thread gets the lock first.
5.We can create different conditions for Lock and different thread can await() for different conditions.
*/
