package com.datastructure.sort;

public class QuickSortAlso {
	public int partition(int A[], int lb, int ub) {
		int pivot = A[lb];
		int start = lb;
		int end = ub;

		while (start < end) {
			while (A[start] <= pivot) {
				start++;
			}
			while (A[end] > pivot) {
				end--;
			}
			if (start < end) {
				int tem;
				tem = A[start];
				A[start] = A[end];
				A[end] = tem;
			}
		}
		int tem;
		tem = A[lb];
		A[lb] = A[end];
		A[end] = tem;
		return end;
	}

	public void QuickSort(int A[], int lb, int ub) {
		if (lb < ub) {
			int loc = partition(A, lb, ub);
			QuickSort(A, lb, loc - 1);
			QuickSort(A, loc + 1, ub);

		}
	}

	public static void main(String[] args) {
		QuickSortAlso sort = new QuickSortAlso();
		int arr[] = { 12, 11, 13, 5, 6, 7 };
		sort.QuickSort(arr, 0, arr.length - 1);
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
