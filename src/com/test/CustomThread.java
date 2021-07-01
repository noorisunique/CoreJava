package com.test;

import java.util.*;

public  class CustomThread implements Runnable {

	private static int runTill = 10000;

	private static int count = 0; // Line 3

	@Override

	public void run() {

		for (int i = 0; i < runTill; i++) {

			count++; // Line 7

		}

	}

	public static void main(String s[]) throws Exception {

		int iteration = 10;

		List<Thread> list = new ArrayList<>();

		for (int i = 0; i < iteration; i++) {

			Thread t = new Thread(new CustomThread());

			t.start();

			list.add(t);

		}

		for (Thread t : list) {

			t.join();

		}

		System.out.println(count);

	}

}