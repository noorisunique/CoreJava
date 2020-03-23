package com.sapient;

public class Friencircle {

	static int findCircleNum(int M[][]) {
		int count = 0;
		for (int i = 0; i < M.length; i++) {
			count += dfs(M, i);
		}
		return count;
	}

	static int dfs(int M[][], int i) {

		if (M[i][i] == 0) {
			return 0;
		}
		M[i][i] = 0;
		for (int j = 0; j < M.length; j++) {
			if (M[i][j] == 1) {
				M[i][j] = 0;
				M[j][i] = 0;
				dfs(M, j);
				System.out.println("sss");

			}
		}
		return 1;
	}

	public static void main(String[] args) {
		// int m[][] = { { 1, 1, 0 }, { 1, 1, 0 }, { 0, 0, 1 } };
		int m[][] = { { 1, 1, 0 }, { 1, 1, 1 }, { 0, 1, 1 } };

		System.out.println(findCircleNum(m));
	}

}
