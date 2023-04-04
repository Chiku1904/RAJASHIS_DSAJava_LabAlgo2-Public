package com.greatlearning.lab2_ii;

public class MergeSort {

	public void sort(int[] arr, int first, int last) {

		if (first < last) {
			int mid = (first + last) / 2;

			sort(arr, first, mid);
			sort(arr, mid + 1, last);

			merge(arr, first, mid, last);
		}
	}

	private void merge(int[] arr, int first, int mid, int last) {

		int i, j, k;
		i = first;
		j = mid + 1;
		k = first;

		int[] newArr = new int[last + 1];

		while (i <= mid && j <= last) {
			if (arr[i] >= arr[j]) {
				newArr[k++] = arr[i++];
			} else {
				newArr[k++] = arr[j++];
			}
		}
		if (i > mid) {
			while (j <= last) {
				newArr[k++] = arr[j++];
			}
		}
		if (j > last) {
			while (i <= mid) {
				newArr[k++] = arr[i++];
			}
		}
		for (int z = first; z <= last; z++) {
			arr[z] = newArr[z];
		}
	}
}