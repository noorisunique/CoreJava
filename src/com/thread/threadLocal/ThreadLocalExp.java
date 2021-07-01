package com.thread.threadLocal;

//https://www.javatpoint.com/java-threadlocal-class#:~:text=Java%20ThreadLocal%20class%20provides%20thread,local%20variable%20of%20each%20other.
public class ThreadLocalExp {
	public static class MyRunnable implements Runnable {
		private ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>();

		@Override
		public void run() {
			threadLocal.set((int) (Math.random() * 50D));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(threadLocal.get());
		}
	}

	public static void main(String[] args) {
		MyRunnable runnableInstance = new MyRunnable();

		Thread t1 = new Thread(runnableInstance);
		Thread t2 = new Thread(runnableInstance);
		// this will call run() method
		t1.start();
		t2.start();
	}
}