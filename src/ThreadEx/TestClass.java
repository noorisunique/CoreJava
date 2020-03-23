package ThreadEx;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Emp extends Thread {
	Lock lock = new ReentrantLock();

	public void run() {
		try {
			// lock.lock();
			//synchronized (this) {
				for (int i = 0; i < 5; i++) {
					System.out.println(Thread.currentThread().getName());
					Thread.sleep(1000);
				}
			//}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			// lock.unlock();
		}

	}
}

public class TestClass {
	public static void main(String[] args) {
		for (int i = 0; i < 4; i++) {
			Emp emp = new Emp();
			emp.start();
			try {
				emp.join();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

	}
}
