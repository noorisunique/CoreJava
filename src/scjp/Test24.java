package scjp;

//Readable.java
 interface Readable {
	public void read();

	public int MAX_LENGTH = 10;
}

 class MyReader implements Readable {

	public void read() {
		//Readable.MAX_LENGTH = 25;
		System.out.println(Readable.MAX_LENGTH);
	}}

	

public class Test24 {

	public static void main(String[] args) {
		new MyReader().read();

	}

}
