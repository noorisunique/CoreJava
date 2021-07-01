package igtsolutions.com;

import java.io.IOException;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t = new Test1();
		int i = t.check();
		System.out.println(i);
	}

	int check() {
		try {
			throw new IOException();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("C block");
			return 1;
		} finally {
			System.out.println("finally");
			return 2;
		}
	}
}
