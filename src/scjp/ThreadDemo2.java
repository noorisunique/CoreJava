package scjp;

public class ThreadDemo2 extends Thread {

	public void run() {
		System.out.println("hi");
	}

	public static void main(String[] args) {
		Thread t = new Thread() {
			public void run() {
				System.out.println(Thread.currentThread().getState());
			}
		};
		t.start();
	}
}
