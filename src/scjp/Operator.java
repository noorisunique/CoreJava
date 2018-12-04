package scjp;

public class Operator {

	public static void main(String[] args) {
		Boolean m = true;
		int n = 14;
		do {
			n = n >> 1;
			System.out.println(n);
			if (n < 4) {
				m = new Boolean(false);
			}
		} while (m);
		//System.out.println(n);
	}

}
