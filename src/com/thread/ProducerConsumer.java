package com.thread;

import java.util.*;

class ProducerClass implements Runnable {
	private List<Integer> list;

	int max = 20;
	int i = 0;

	public ProducerClass(List<Integer> list) {
		this.list = list;
	}

	public void run() {
		while (true) {
			try {
				produce(i++);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}

	public void produce(int i) {
		synchronized (list) {
			while (list.size() == max) {
				try {
					list.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		synchronized (list) {
			list.add(i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			list.notify();
		}
	}
}

class ConsumerClass implements Runnable {
	private List<Integer> list;

	public ConsumerClass(List<Integer> list) {
		super();
		this.list = list;
	}

	public void run() {
		while (true) {
			try {
				consume();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}

	public void consume() {
		synchronized (list) {
			while (list.isEmpty()) {
				try {
					list.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		synchronized (list) {
			list.remove(0);
			System.out.println(list.remove(0));
			list.notify();
		}
	}
}

public class ProducerConsumer {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		System.out.println("--------------------");
		Thread p1 = new Thread(new ProducerClass(list));
		Thread c1 = new Thread(new ConsumerClass(list));
		p1.start();
		c1.start();

	}

}

//https://www.youtube.com/watch?v=EtJALCEIxDs