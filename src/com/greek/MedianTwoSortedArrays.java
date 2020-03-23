package com.greek;

public class MedianTwoSortedArrays {

	public static int max(int a, int b) {
		return Math.max(a, b);
	}

	public static int min(int a, int b) {
		return Math.min(a, b);
	}

	public static double findMedian(int[] a, int b[], int astart, int aend, int bstart, int bend) {

		if ((aend - astart == 1) && (bend - bstart == 1)) {
			return (1.0 * (max(a[astart], b[bstart]) + min(a[aend], b[bend]))) / 2;
		}

		int a_index = (astart + aend) / 2;
		int b_index = (bstart + bend) / 2;

		int a_median = a[a_index];
		int b_median = b[b_index];
		if (a_median == b_median)
			return a_median;

		if (a_median < b_median) {
			astart = a_index;
			bend = b_index;
		} else {
			bstart = b_index;
			aend = a_index;
		}

		return findMedian(a, b, astart, aend, bstart, bend);
	}

	public static void main(String[] args) {
		int a[] = { 1, 3 };
		int b[] = { 2 };
		System.out.println(findMedian(a, b, 0, a.length - 1, 0, b.length - 1));
	}

}
