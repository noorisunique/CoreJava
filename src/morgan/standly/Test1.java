package morgan.standly;

class PU{
	public int x=420;
	protected int doStuff(){
		return x;
	}
}


public class Test1 extends PU{

	public static void main(String[] args) {
		new Test1().callStuff();

	}
	
	void callStuff(){
		System.out.println("this"+this.doStuff());
		PU ps=new PU();
		System.out.println("Parent"+ps.doStuff());
	}

}
