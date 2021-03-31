package com.thread;

class PC {
	boolean flag = true;
	int counter = 0;
	int max = 20;

	public void odd() {
		synchronized (this) {
			while (counter < max) {
				while (!flag) {
					try {
						wait();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				System.out.println(counter);
				counter++;
				flag = false;
				notify();
			}
		}
	}

	public void even() {
		synchronized (this) {
			while (counter < max) {
				while (flag) {
					try {
						wait();
					} catch (Exception e) {
						e.getSuppressed();
					}
				}
				System.out.println(counter);
				counter++;
				flag = true;
				notify();
			}
		}
	}

}

public class WaitNotify {

	public static void main(String[] args) {
		PC pc=new PC();
		Thread t1=new Thread(new Runnable() {
			
			@Override
			public void run() {
				pc.odd();
			}
		});
		
		Thread t2=new Thread(new Runnable() {
			
			@Override
			public void run() {
				pc.even();
			}
		});
		
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
