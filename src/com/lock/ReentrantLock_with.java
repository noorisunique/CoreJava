package com.lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//https://www.journaldev.com/2377/java-lock-example-reentrantlock

class ResourceObject {
	private int counter;
	private boolean isflag = true;

	public void dosomthing() {
		counter++;
		System.out.println("DoSomthing..." + counter + " " + Thread.currentThread().getName());
	}

	public boolean isComplete() {
		return isflag;
	}

	public void doLogging() {
		System.out.println("doLogging.....");
	}
}

class SynchronizedLockClass extends Thread {
	private ResourceObject resource;
	private Lock lock;
	private final Condition m_initializeDatabaseComplete;

	public SynchronizedLockClass(ResourceObject resource) {
		this.resource = resource;
		this.lock = new ReentrantLock();
		m_initializeDatabaseComplete = lock.newCondition();
	}

	@Override
	public void run() {
		lock.lock();
		try {
			resource.dosomthing();
			while (!resource.isComplete()) {
				m_initializeDatabaseComplete.await();
			}
		} catch (Exception e) {

		} finally {
			lock.unlock();
		}
		resource.doLogging();
	}
}

public class ReentrantLock_with {

	public static void main(String[] args) {
		ResourceObject resource = new ResourceObject();
		SynchronizedLockClass o1 = new SynchronizedLockClass(resource);
		o1.start();
		SynchronizedLockClass o2 = new SynchronizedLockClass(resource);
		o2.start();
		SynchronizedLockClass o3 = new SynchronizedLockClass(resource);
		o3.start();
		SynchronizedLockClass o4 = new SynchronizedLockClass(resource);
		o4.start();
		SynchronizedLockClass o5 = new SynchronizedLockClass(resource);
		o5.start();

	}

}
