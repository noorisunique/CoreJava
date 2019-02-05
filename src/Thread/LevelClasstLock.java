package com.Thread;

class Greek1 implements Runnable{
	
	public void run() {
		System.out.println(Thread.currentThread().getName());
		synchronized(Greek1.class) {
			
			System.out.println(Thread.currentThread().getName()+"--Started");
			System.out.println(Thread.currentThread().getName()+"--Ended");
		}
	}
}
public class LevelClasstLock {

	public static void main(String[] args) {
		Greek1 g1=new Greek1();
		Thread t1=new Thread(g1);
		Thread t2=new Thread(g1);
		
		Greek1 g2=new Greek1();	
		Thread t3=new Thread(g2);
		t1.setName("T1");
		t2.setName("T2");
		t2.setName("T3");
		t1.start();
		t2.start();
		t3.start();
		try {
			t1.join();
			t2.join();
			t3.join();			
		}catch (InterruptedException e) {
			// TODO: handle exception
		}
	}
}
