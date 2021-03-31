package com.thread;

import java.util.Date;
import java.util.concurrent.LinkedBlockingQueue;

class Task3 implements Runnable {
	public void run() {
		System.out.println("noor...");
	}
}

class CustomThreadPool1 {

	private int poolsize;

	private WorkerThread11 workerthread[];
	private LinkedBlockingQueue<Runnable> queue;

	public CustomThreadPool1(int poolsize) {
		this.poolsize = poolsize;
		WorkerThread11 workerthread[] = new WorkerThread11[poolsize];
		queue = new LinkedBlockingQueue<>();

		for (int i = 0; i < poolsize; i++) {
			workerthread[i] = new WorkerThread11();
			workerthread[i].start();
		}
	}

	private class WorkerThread11 extends Thread {
		public void run() {
			Runnable task;
			while (true) {
				synchronized (queue) {
					if (queue.isEmpty()) {
						try {
							queue.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					task = (Runnable) queue.poll();
				}
				task.run();
			}
		}
	}

	public void execute(Runnable task) {
		synchronized (queue) {
			queue.add(task);
			queue.notify();
		}
	}
}

public class CustomThreadPoolExample2 {
	public static void main(String[] args) {
		CustomThreadPool1 customThreadPool = new CustomThreadPool1(2);

		for (int i = 1; i <= 5; i++) {
			Task3 task = new Task3();
			System.out.println("Created : ");

			customThreadPool.execute(task);
		}
	}
}