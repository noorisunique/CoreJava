package com.datastructure.queue;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Producer2 implements Runnable {

	Buffer1 buffer1;

	Producer2(Buffer1 buffer1) {
		this.buffer1 = buffer1;
	}

	public void run() {
		for (int i = 0; i < 3; i++) {
			buffer1.add(i);
		}
	}
}

class Consumer2 implements Runnable {
	Buffer1 buffer1;

	Consumer2(Buffer1 buffer1) {
		this.buffer1 = buffer1;
	}

	public void run() {
		System.out.println(buffer1.get());
	}
}

class Buffer1 {

	Queue<Integer> queue = new ConcurrentLinkedQueue<>();

	public void add(int i) {
		queue.add(i);
	}

	public int get() {
		return queue.poll();
	}
}

public class Example {

	public static void main(String[] args) {
		Buffer1 buf=new Buffer1();
		ExecutorService executorService=Executors.newCachedThreadPool();
		executorService.execute(new Producer2(buf));
		executorService.execute(new Consumer2(buf));
		executorService.execute(new Consumer2(buf));
		executorService.execute(new Consumer2(buf));
		executorService.shutdown();
	}

}
