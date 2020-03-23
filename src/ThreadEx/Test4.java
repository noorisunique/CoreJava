package ThreadEx;

class A {
	private int max = 20;
	private int counter = 1;

	public void print1To10() {
		
		synchronized (this) {
			System.out.println("Thread 1 Start");
			for (int i = 1; i <= 10; i++) {
				System.out.println(i);
				if (i == 10) {
					try {
						
						 wait();
						 
					} catch (Exception e) {
						// TODO: handle exception
					}
				}
				counter++;
			}
			notify();
			System.out.println("Thread 1 Finished");
			
		}
		
	}

	public void print10To20() {
		
		synchronized (this) {
			System.out.println("Thread 2 Start");
			for (int i = 11; i < 21; i++) {
				System.out.println(i);
				if (i == 20) {
					try {
						
						 wait();
						
					} catch (Exception e) {
						// TODO: handle exception
					}
				}

			}
			
			System.out.println("Thread 2 Finished");
		
		}
		
		
	}

}

public class Test4 {

	public static void main(String[] args) {
		A a = new A();
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					a.print1To10();
				} catch (Exception e) {
					// TODO: handle exception
				}

			}
		});
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					a.print10To20();
				} catch (Exception e) {
					// TODO: handle exception
				}

			}
		});
		t1.start();
		t2.start();
		try {

			t1.join();
			t2.join();	
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
