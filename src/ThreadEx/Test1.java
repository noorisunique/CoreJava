package com.Thread;

class Test1 {
	public enum Dogs {
		c, h, s
	};

	public static void main(String[] args) throws Exception {
		Runnable r = new Runnable() {

			@Override
			public void run() {
				System.out.println("Cat");
			}
		};

		Thread t1 = new Thread(r) {
			@Override
			public void run() {
				System.out.println("Dog");

			}
		};
		t1.start();
	}
}