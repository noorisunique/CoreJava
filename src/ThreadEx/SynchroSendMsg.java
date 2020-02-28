package com.Thread;

class Sender {
	public void send(String msg) {
		System.out.println("Sending\t" + msg);
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println("Thread intrrupted");
		}
		System.out.println(msg + "Sent");
	}
}

class SendThread implements Runnable{
	private String msg;
	private Thread t;
	Sender sender;
	public SendThread(String msg,Sender sender) {
		this.msg=msg;
		this.sender=sender;
	}
	
	public void run() {
		synchronized(sender){
			System.out.println(Thread.currentThread().getName()+" "+Thread.holdsLock(sender));
			sender.send(msg);
		}
	}
	
}

public class SynchroSendMsg {

	public static void main(String[] args) {
		Sender sender=new Sender();
		SendThread st1=new SendThread("Hi", sender);
		SendThread st2=new SendThread("Bye", sender);
		Thread t1=new Thread(st1,"T1");
		Thread t2=new Thread(st2,"T2");
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		}catch (InterruptedException e) {
			// TODO: handle exception
		}
		
		
	}
}
