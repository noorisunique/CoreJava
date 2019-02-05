package com.Thread;

import java.util.Scanner;

class PC {
	public void produce() throws InterruptedException {
		synchronized (this) {
			System.out.println("Producer Running....");
			wait();
			System.out.println("Resumed");
		}
	}

	public void consume() throws InterruptedException {
		Scanner s = new Scanner(System.in);
		synchronized (this) {
			System.out.println("waiting for key....");
			s.nextLine();
			System.out.println("Return key");
			notify();
		}
	}

}

public class WaitForKey2 {

	public static void main(String[] args) {

		PC pc = new PC();
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					pc.produce();
				} catch (Exception e) {
					// TODO: handle exception
				}

			}
		});
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					pc.consume();
				} catch (Exception e) {
					// TODO: handle exception
				}

			}
		});
		t1.start();
		t2.start();
	}

}
