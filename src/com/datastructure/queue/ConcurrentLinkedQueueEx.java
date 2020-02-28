package com.datastructure.queue;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Produser implements Runnable {
	Buffer buffer;

	Produser(Buffer buffer) {
		this.buffer = buffer;
	}

	public void run() {
		for (int i = 0; i < 3; i++) {
			buffer.put(i);
		}
	}
}

class Consumer implements Runnable {
	Buffer buffer;

	public Consumer(Buffer buffer) {
		this.buffer = buffer;
	}

	public void run() {
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		buffer.get();
	}
}

//share class use by thread
class Buffer {
	int i;
	 Queue<Integer> q = new ConcurrentLinkedQueue<>();
	//Queue<Integer> q = new PriorityQueue<>();
	 
	public void get() {
		System.out.println("Consumer reads  " + q.poll());
	}

	public void put(int i) {
		this.i = i;
		q.add(i);
		System.out.println("Putting..." + i);
	}

}

public class ConcurrentLinkedQueueEx {

	public static void main(String[] args) {
		Buffer buffer = new Buffer();
		ExecutorService service = Executors.newFixedThreadPool(4);
		service.execute(new Produser(buffer));
		service.execute(new Consumer(buffer));
		service.execute(new Consumer(buffer));
		service.execute(new Consumer(buffer));

		service.shutdown();
	}

}
