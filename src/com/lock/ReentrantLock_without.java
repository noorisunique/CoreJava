package com.lock;
//https://www.journaldev.com/2377/java-lock-example-reentrantlock

class Resource {

	public void dosomthing() {

	}

	public void doLogging() {
		System.out.println("Bar.....");
	}
}

class SynchronizedLockExample implements Runnable {
	private Resource resource;

	public SynchronizedLockExample(Resource resource) {
		this.resource = resource;
	}

	public void run() {
		synchronized (resource) {
			resource.dosomthing();
		}
	}
}

public class ReentrantLock_without {
	Resource t1;

	public ReentrantLock_without() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

	}

}
