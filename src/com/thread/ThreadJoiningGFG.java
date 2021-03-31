package com.thread;

class ThreadJoiningGFG extends Thread {

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("My Thread....." + Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) {
		ThreadJoiningGFG t = new ThreadJoiningGFG();
		t.start();
		try {
			t.join();// it means main thread will stop and custom thread will finish first
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Main Thread...");
	}
}

//https://www.youtube.com/watch?v=FqiWipNHzPQ