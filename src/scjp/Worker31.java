package scjp;

public class Worker31 extends Thread {
	public void run() {
		System.out.print("N");
	}

	public static void main(String[] args) {
		Thread worker = new Worker31();
		worker.run();
		System.out.print("O");
	}
}
