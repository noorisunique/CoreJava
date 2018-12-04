package scjp;

public class ThreadDemo extends Thread{
	
	public void run(){
		System.out.println("hi");
	}
	
	public static void main(String[] args) {
		ThreadDemo td=new ThreadDemo();
		td.start();
		td.start();
	}
}
