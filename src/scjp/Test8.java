package scjp;

public class Test8 {

	public static void main(String[] args) {
		int[] scores = { 2, 4, 5, 5, 6, 8 };
		int sum = 0;
		for (int x : scores) {
			sum += x;
		}
		System.out.println(sum / scores.length);
	}
}
