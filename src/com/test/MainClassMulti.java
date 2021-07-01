package com.test;

class Geek1 extends Thread {

	public void run() {

		synchronized (this) {

			System.out.println(Thread.currentThread().getName() + "...starts");

			try {

				this.wait();

			} catch (InterruptedException e) {

				e.printStackTrace();

			}

			System.out.println(Thread.currentThread().getName() + "...notified");

		}

	}

}

class Geek3 extends Thread {

	Geek1 geeks1;

	Geek3(Geek1 geeks1) {

		this.geeks1 = geeks1;

	}

	public void run() {

		synchronized (this.geeks1) {

			System.out.println(Thread.currentThread().getName() + "...starts");

			this.geeks1.notifyAll(); // Line 1

			this.geeks1.notifyAll(); // Line 2

			this.geeks1.notifyAll(); // Line 3

			this.geeks1.notifyAll(); // Line 4

			System.out.println(Thread.currentThread().getName() + "...notified");

		}

	}

}

class MainClassMulti {

	public static void main(String[] args) throws InterruptedException {

		Geek1 geeks1 = new Geek1();

		Geek3 geeks3 = new Geek3(geeks1);

		Thread t1 = new Thread(geeks1, "Thread-1");

		Thread t3 = new Thread(geeks3, "Thread-3");

		t1.start();

		Thread.sleep(1000);

		t3.start();

	}
}