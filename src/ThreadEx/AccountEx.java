package com.Thread;

class Test extends Thread {
	private Integer number = 0;

	public void run() {

		for (int i = 1; i <= 1000; i++) {
			number++;
		}
	}

	public Integer getNumber() {
		return number;
	}
}

public class AccountEx {
	public static void main(String[] args) {
		System.out.print("A ");
		final Object o=new Object();
		synchronized (o) {
			o.notifyAll();
		}

		System.out.println("B");
	}
}
