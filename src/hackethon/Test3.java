package hackethon;

import java.util.Scanner;

public class Test3 {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("================================");
		for (int i = 0; i < 3; i++) {
			String s1 = sc.next();
			int numbers = sc.nextInt();
			// Complete this line
			int l = s1.length();
			int dig = String.valueOf(numbers).length();
			if (l < 11 && numbers >= 0 && numbers < 1000) {
				if (dig < 3) {
					System.out.printf("%-13s  %-13s%n", s1, String.format("%03d", numbers));
				} else {
					System.out.printf("%-13s  %-13s%n", s1, numbers);
				}
			}
		}
		System.out.println("================================");

	}

}
