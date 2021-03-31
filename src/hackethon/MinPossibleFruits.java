package hackethon;

import java.util.Scanner;

//https://practice.geeksforgeeks.org/problems/minimum-possible-fruits/0
//https://practice.geeksforgeeks.org/viewSol.php?subId=30802544520803&pid=767&user=Indira%20Mythili
public class MinPossibleFruits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			float q = sc.nextFloat();
			float p = sc.nextFloat();
			int res = 100000;
			for (int i = 1; i < 100000; i++) {
				float p1 = i * p / 100;
				float q1 = i * q / 100;
				if (Math.ceil(p1) <= Math.floor(q1)) {
					res = i;
					break;
				}
			}
			System.out.println(res);
		}
	}
}