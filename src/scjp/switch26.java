package scjp;

public class switch26 {
	public static void main(String[] args) {
		final byte b = 1;
		int value = 2;
		switch (value) {
		case b:
			System.out.print("A");
			break;
		case 2:
			System.out.print("B");
		case 3:
			System.out.print("C");
		default:
			System.out.print("D");
			break;
		}
	}

}
