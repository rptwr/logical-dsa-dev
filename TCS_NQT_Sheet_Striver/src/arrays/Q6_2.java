package arrays;

import java.util.Arrays;

//Problem Statement: Rearrange the array such that the first half is arranged in increasing order,
//and the second half is arranged in decreasing order

public class Q6_2 {
	static void bubbleSort(int[] arr, int n) {
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int[] arr = {8, 7, 1, 6, 5, 9};
		int n = arr.length;
		bubbleSort(arr, n);
		System.out.println(Arrays.toString(arr));
		System.out.println("\n");
		System.out.println("array in increasing-decreasing order: ");
		for (int i = 0; i < n / 2; i++) {
			System.out.print(arr[i] + ", ");
		}
		for (int j = n - 1; j >= n / 2; j--) {
			System.out.print(arr[j] + ", ");
		}
	}
}
