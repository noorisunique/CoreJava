package CompanyFalabella;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Thread2 extends Thread {

	public static void main(String[] args) throws InterruptedException {

		String a = "ff";
		String b = new String(a);
		int value = 0;

		value = (a == b) ? 1 : 2;

		if (value == 1) {
			System.out.println("ffindia");
		} else if (value == 2) {
			System.out.println("ff india");
		} else {
			System.out.println("F C");
		}

	}

}
