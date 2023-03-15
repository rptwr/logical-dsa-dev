package arrays;

import java.util.Arrays;

// Find the Largest element in an array

public class Q2 {
	public static void main(String[] args) {
		int[] arr1 = {2, 5, 1, 3, 0};
		System.out.println("The largest element in the array: " + largestElement(arr1));
		
		int[] arr2 = {8, 10, 5, 7, 9};
		System.out.println("The largest element in the array: " + largestElement(arr2));
	}
	
	private static int largestElement(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	
//	static int largestElement(int[] arr) {
//		Arrays.sort(arr);
//		return arr[arr.length - 1];
//	}
}
