package com.thread;

//http://rakshasingh.weebly.com/blog/can-two-different-threads-operate-on-two-different-synchronized-methods-of-same-class-simultaneously
public class SimulteniouslyExceute {

	public synchronized void testMethod1() {
		try {
			System.out.println("testMethod1 " + Thread.currentThread().getName());
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}
	}

	public synchronized void testMethod2() {
		try {
			System.out.println("testMethod2 " + Thread.currentThread().getName());
			Thread.sleep(2000);
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}
	}

	public static void main(String[] args) throws InterruptedException {
		final SimulteniouslyExceute t = new SimulteniouslyExceute();
		Thread t1 = new Thread() {
			public void run() {
				t.testMethod1();
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				t.testMethod2();
			}
		};
		t1.start();
		Thread.sleep(500);
		t2.start();
		Thread.sleep(500);
		System.out.println(t2.getState());
	}
}