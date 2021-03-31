package com.thread;

public class DeadLockExample {

	public static void main(String[] args) {
		final String r1 = "edureka";
		final String r2 = "java";

		Thread t1 = new Thread() {
			public void run() {
				synchronized (r2) {
					System.out.println("Thread 1: Locked r2");
					try {
						Thread.sleep(100);
					} catch (Exception e) {
					}
					synchronized (r1) {
						System.out.println("Thread 1: Locked r1");
					}
				}
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				synchronized (r1) {
					System.out.println("Thread 2: Locked r1");
					try {
						Thread.sleep(100);
					} catch (Exception e) {
					}
					synchronized (r2) {
						System.out.println("Thread 2: Locked r2");
					}
				}
			}
		};

		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}