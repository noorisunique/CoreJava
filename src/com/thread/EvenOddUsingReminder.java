package com.thread;

class OdEvenRunnable extends Thread {

	private int reminder;
	private int cunter = 1;

	OdEvenRunnable(int reminder) {
		this.reminder = reminder;
	}

	public void run() {
		while (cunter < 20) {
			synchronized (this) {
				if (cunter % 2 != reminder) {
					try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println(cunter);
				cunter++;
				notifyAll();
			}
		}
	}
}

public class EvenOddUsingReminder {

	public static void main(String[] args) {
		OdEvenRunnable odd = new OdEvenRunnable(1);
		OdEvenRunnable even = new OdEvenRunnable(0);
		odd.start();
		even.start();
	}
}
