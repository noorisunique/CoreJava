package morgan.standly;

public class Test5 extends Thread{
	private static int x;
	public synchronized void DoS(){
		int curr=x;
		curr++;
		x=curr;
	}
	
	public void run(){
		DoS();
	}
	public static void main(String[] args) {
		Test5 t1=new Test5();
		t1.start();
	}
}
