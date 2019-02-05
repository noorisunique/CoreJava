package hackethon;

import java.util.Scanner;

public class MultiplyByTwo {
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scan.nextInt();
		scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		for (int i = 1; i <= 10; i++) {
			System.out.println(n+"x"+i+"="+n*i);
		}
		scan.close();

	}
}
