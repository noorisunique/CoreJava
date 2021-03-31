package com.thread;

class Thread1 extends Thread {
	public void run() {

		for (int i = 0; i < 10; i++) {
			System.out.println("My Thread1....." + Thread.currentThread().getName() + " " + i);
		}
	}
}

class Thread2 extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("My Thread2....." + Thread.currentThread().getName() + " " + i);
		}
	}
}

class ThreadJoiningGFG2 {

	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		t1.start();
		t2.start();
		try {
			t1.join();// main thread is telling that t1 and t2 will execute first then i will execute
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i < 10; i++) {
			System.out.println("My Main....." + Thread.currentThread().getName() + " " + i);
		}

	}
}

//https://www.youtube.com/watch?v=FqiWipNHzPQ