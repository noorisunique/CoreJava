package com.morgan;


public class X6 implements Runnable {

	public static void main(String[] args) {
		new Thread(new X6("Wallance")).start();
		new Thread(new X6("Gromit")).start();
		
	}
	private String name;
	public X6(String name) {
		this.name=name;
	}
	@Override
	public void run() {
		msg(1);
		msg(2);
		
		
	}

	private synchronized void msg(int n) {
		System.out.println(name+"-"+n+"");
	}
	
}
