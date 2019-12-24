package com.java8;

import java.util.concurrent.atomic.AtomicBoolean;

public class AtomicBooleanEx {
	AtomicBoolean isFirstTime;

	public void load() {
		isFirstTime = new AtomicBoolean(true);
		if (isFirstTime.get()) {
			isFirstTime.set(false);
		}
		
	}

	public static void main(String[] args) {
		AtomicBooleanEx o1 = new AtomicBooleanEx();
		o1.load();
		o1.load();
		o1.load();
		o1.load();
		
	}
}
