package com.Thread;

class MyThreadStart extends Thread {

	public void start() {
		System.out.println("Noor");
	}
	
	public void run() {
		System.out.println("Run...");
	}
}

public class OvverrideStartMethod {

	public static void main(String[] args) {
		MyThreadStart t1=new MyThreadStart();
		
	}
}
