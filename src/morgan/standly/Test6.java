package morgan.standly;

public class Test6 {
	
	
	public static void main(String[] args) {
		System.out.println("1");
		synchronized (args) {
			System.out.println("2");
			try {
				args.wait();
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
			System.out.println("3");
		}
	}
}
