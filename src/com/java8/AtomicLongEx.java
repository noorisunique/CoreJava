package com.java8;

import java.util.concurrent.atomic.AtomicLong;

public class AtomicLongEx {
	public static void main(String[] args) {
		AtomicLong time = new AtomicLong();
		// time.get();
		// time.set(System.currentTimeMillis());
		long expectedValue = 123;
		long newValue = 234;
		System.out.println(time.compareAndSet(expectedValue, newValue));
		for (int i = 0; i < 10; i++) {
			time.incrementAndGet();
		}
		System.out.println(time);

	}
}
