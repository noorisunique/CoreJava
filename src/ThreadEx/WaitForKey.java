package ThreadEx;

import java.util.Scanner;

class PC1 {
	public void produce() throws InterruptedException {

		System.out.println("Producer Running....");

		System.out.println("Resumed");

	}

	public void consume() throws InterruptedException {
		Scanner s = new Scanner(System.in);

		System.out.println("waiting for key....");
		//s.nextLine();
		System.out.println("Return key");
		//notify();

	}

}

public class WaitForKey {

	public static void main(String[] args) {

		PC1 pc = new PC1();
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					pc.produce();
				} catch (Exception e) {
					// TODO: handle exception
				}

			}
		});
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					pc.consume();
				} catch (Exception e) {
					// TODO: handle exception
				}

			}
		});
		t1.start();
		t2.start();
	}

}
