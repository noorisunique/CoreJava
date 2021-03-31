package hackethon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class FindingClosestNumberto0 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter wr = new PrintWriter(System.out);
		int N = Integer.parseInt(br.readLine().trim());
		int[] A = new int[N];
		String[] arr_A = br.readLine().split(" ");
		for (int i_A = 0; i_A < N; i_A++) {
			A[i_A] = Integer.parseInt(arr_A[i_A]);
		}
		int out_ = Solve(N, A);
		System.out.println(out_);

		wr.close();
		br.close();

	}

	public static int Solve(int N, int A[]) {

		int min = A[0];
		for (int i = 1; i < N; i++) {

			if (min > Math.abs(0 - A[i])) {
				min = Math.abs(0 - A[i]);
			} else {
				min = Math.abs(min);
			}
		}
		return min;
	}

}
