package com.java8.thread;

public class RunnableEx {

	public static void main(String[] args) {
		Runnable r1 = new Runnable() {

			@Override
			public void run() {
				System.out.println("Noor");

			}
		};

		Thread t1 = new Thread(r1);
		t1.start();

		// Using Java8

		Runnable r2 = () -> System.out.println("Noor2");
		Thread t2 = new Thread(r2);
		t2.start();
	}

}
