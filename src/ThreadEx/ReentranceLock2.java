package com.Thread;

import java.util.Date;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class PrintingJob1 implements Runnable {
	private PrinterQueue1 printerQueue;
	public PrintingJob1(PrinterQueue1 printerQueue) {
		this.printerQueue = printerQueue;
	}

	@Override
	public void run() {
		System.out.printf("%s: Going to print a document\n", Thread.currentThread().getName());
		printerQueue.printJob();
	}
}

class PrinterQueue1 {
	private final Lock queueLock = new ReentrantLock();

	public void printJob() {
		queueLock.lock();
		
		try {
			System.out.println("asansklaks");
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			System.out.printf("%s: The document has been printed\n", Thread.currentThread().getName());
			queueLock.unlock();
		}
	}
}

public class ReentranceLock2 {
	public static void main(String[] args) {
		PrinterQueue1 printerQueue = new PrinterQueue1();
		Thread thread[] = new Thread[10];
		for (int i = 0; i < 10; i++) {
			thread[i] = new Thread(new PrintingJob1(printerQueue), "Thread " + i);
		}
		for (int i = 0; i < 10; i++) {
			thread[i].start();
		}
	}
}
