package com.Thread;

class ZZ {

	int  max = 10;
	int counter = 1;
	boolean flag = true;

	public void printOdd() {
		while (counter < max) {
			synchronized (this) {
				if (!flag) {
					try {
						wait();
					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
				}
				System.out.printf("%-13s  %-13s%n",Thread.currentThread().getName(),counter);
				counter++;
				flag = false;
				notify();

			}
		}
	}

	public void printEven() {
		while (counter < max) {
			synchronized (this) {
				if (flag) {
					try {
						wait();
					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
				}
				System.out.printf("%-13s  %-13s%n",Thread.currentThread().getName(),counter);
				counter++;
				flag = true;
				notify();

			}
		}
	}
}

public class PrintOddEvenMain {
	public static void main(String[] args) {
		ZZ z = new ZZ();
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				z.printOdd();

			}
		});
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				z.printEven();

			}
		});
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
