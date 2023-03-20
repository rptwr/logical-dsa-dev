package arrays;

import java.util.Arrays;

//Problem Statement: Rearrange the array such that the first half is arranged in increasing order,
//and the second half is arranged in decreasing order

public class Q6_2 {
	public static void main(String[] args) {
		int[] arr = {8, 7, 1, 6, 5, 9};
		int n = arr.length;
		 // Sort first half in increasing order
		for (int i = 0; i < n / 2; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		// Sort second half in decreasing order
		for (int i = n / 2; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
//{
//	static void bubbleSort(int[] arr, int n) {
//		for (int i = 0; i < n - 1; i++) {
//			for (int j = 0; j < n - i - 1; j++) {
//				if (arr[j] > arr[j + 1]) {
//					int temp = arr[j];
//					arr[j] = arr[j + 1];
//					arr[j + 1] = temp;
//				}
//			}
//		}
//	}
//	public static void main(String[] args) {
//		int[] arr = {8, 7, 1, 6, 5, 9};
//		int n = arr.length;
//		bubbleSort(arr, n);
//		System.out.println(Arrays.toString(arr));
//		System.out.println("\n");
//		System.out.println("array in increasing-decreasing order: ");
//		for (int i = 0; i < n / 2; i++) {
//			System.out.print(arr[i] + ", ");
//		}
//		for (int j = n - 1; j >= n / 2; j--) {
//			System.out.print(arr[j] + ", ");
//		}
//	}
//}
