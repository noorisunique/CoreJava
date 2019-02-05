package com.DesignPattern;

class SST {
	private static SST st;

	private SST() {

	}

	public synchronized static SST getInstance() {
		if (null == st) {
			synchronized (SST.class) {
				if (null == st) {
					st = new SST();
					System.out.println("jjj");
				}
			}
		}
		return st;
	}

}

public class SingleTern2 {
	public static void main(String[] args) {
		System.out.println(SST.getInstance());
		System.out.println(SST.getInstance());
		System.out.println(SST.getInstance());
		System.out.println(SST.getInstance());

	}
}
