package com.Thread;

 class OddEvenRunnable implements Runnable{
	 
	public int PRINT_NUMBERS_UPTO=10;
	static int  number=1;
	int remainder;
	static Object lock=new Object();
 
	OddEvenRunnable(int remainder)
	{
		this.remainder=remainder;
	}
 
	@Override
	public void run() {
		while (number < PRINT_NUMBERS_UPTO) {
			synchronized (lock) {
				while (number % 2 != remainder) { // wait for numbers other than remainder
					try {
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println(Thread.currentThread().getName() + " " + number);
				number++;
				lock.notifyAll();
			}
		}
	}
}

public class PrintOddEvenMainUsingReminder {
	public static void main(String[] args) {
		OddEvenRunnable e1 = new OddEvenRunnable(1);
		OddEvenRunnable e2 = new OddEvenRunnable(0);
		Thread t1 = new Thread(e1);
		Thread t2 = new Thread(e2);
		t1.start();
		t2.start();

	}
}
