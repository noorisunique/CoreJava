package com.thread.threadLocal;

public class ThreadLocalSetExp {
	public static void main(String[] args) {
		ThreadLocal<Integer> tlocal1 = new ThreadLocal<Integer>();
		ThreadLocal<String> tlocal2 = new ThreadLocal<String>();

		// setting the value
		tlocal1.set(50);
		// returns the current thread's value of this thread-local
		System.out.println("Value: " + tlocal1.get());

		// setting the value
		tlocal2.set("javatpoint");
		// returns the current thread's value of this thread-local
		System.out.println("Value: " + tlocal2.get());
	}
}