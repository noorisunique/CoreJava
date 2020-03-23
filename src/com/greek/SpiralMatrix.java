package com.greek;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
	public static List<Integer> spiralOrder(int[][] matrix) {
		if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
			return new ArrayList();
		}

		int m = matrix.length;
		int n = matrix[0].length;
		int top = 0;
		int bottom = m - 1;
		int left = 0;
		int right = n - 1;
		List<Integer> result = new ArrayList<>();
		while (result.size() < m * n) {

			for (int j = left; j <= right && result.size() < m * n; j++) {
				result.add(matrix[top][j]);
			}
			top++;
			for (int i = top; i <= bottom && result.size() < m * n; i++) {
				result.add(matrix[i][right]);
			}
			right--;

			for (int j = right; j >= left && result.size() < m * n; j--) {
				result.add(matrix[bottom][j]);
			}
			bottom--;

			for (int i = bottom; i >= top && result.size() < m * n; i--) {
				result.add(matrix[i][left]);
			}
			left++;
		}
		return result;
	}

	public static void main(String[] args) {
		int a[][] = { 
						{ 1, 2, 3 }, 
						{ 4, 5, 6 }, 
						{ 7, 8, 9 } 
					};
		System.out.println(spiralOrder(a));
	}

}
