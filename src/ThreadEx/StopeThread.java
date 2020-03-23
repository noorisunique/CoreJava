package ThreadEx;

class T1 implements Runnable{
	public void run() {
		System.out.println("Start.....");
		while(true) {
			if(Thread.interrupted()) {
				break;
			}
		}
		System.out.println("End...");
	}
}
public class StopeThread {
public static void main(String[] args) {
	T1 obj=new T1();
	Thread t=new Thread(obj);
	t.start();
	t.interrupt();
}
}
