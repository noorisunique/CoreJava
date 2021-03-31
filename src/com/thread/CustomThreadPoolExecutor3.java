package com.thread;

import java.util.concurrent.LinkedBlockingQueue;

class WorkerThread extends Thread {

	public void run() {
		System.out.println("-------------------");
	}
}

class ThreadPool1 {
	private final int poolsize;

	private final LinkedBlockingQueue<Runnable> queue;

	private final WorkerThread wthread[];

	public ThreadPool1(int poolSize) {
		this.poolsize = poolSize;
		this.wthread = new WorkerThread[poolSize];
		this.queue = new LinkedBlockingQueue<>();
		for (int i = 0; i < poolSize; i++) {
			wthread[i] = new WorkerThread();
			wthread[i].start();
		}
	}

	public void execute(Runnable task) {
		synchronized (queue) {
			queue.add(task);
			queue.notify();
		}

	}
}

public class CustomThreadPoolExecutor3 {

	public static void main(String[] args) {
		ThreadPool1 pool = new ThreadPool1(7);

		for (int i = 0; i < 5; i++) {
			WorkerThread task = new WorkerThread();
			pool.execute(task);
		}
	}

}