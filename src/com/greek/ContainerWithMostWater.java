package com.greek;
//https://www.youtube.com/watch?v=cdRaaEYk6tI
public class ContainerWithMostWater {
	public static int maxArea(int[] height) {
		int maxArea = 0;
		if (height == null)
			return maxArea;
		int left = 0;
		int right = height.length - 1;

		while (left < right) {
			int area = (right - left) * Math.min(height[left], height[right]);
			maxArea = Math.max(maxArea, area);

			if (height[left] < height[right]) {
				left++;
			} else {
				right--;
			}
		}
		return maxArea;
	}

	public static void main(String[] args) {
		int a[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
		System.out.println(maxArea(a));
	}

}
