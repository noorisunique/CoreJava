package CompanyFalabella;

public class GCout {
	static GCout gcout;
	static int count = 0;

	public static void main(String[] args) throws InterruptedException {
		GCout o1 = new GCout();
		o1 = null;
		System.gc();

		Thread.sleep(1000);
		gcout = null;
		System.gc();

		Thread.sleep(1000);
		System.out.println("Final" + count + "time");

	}

		
	protected void finalize(){
		count++;
		gcout=this;
	}
}
