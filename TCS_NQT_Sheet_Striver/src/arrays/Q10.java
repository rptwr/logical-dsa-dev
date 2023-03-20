package arrays;

// Find Median of the given Array
// Given an unsorted array, find the median of the given array.

import java.io.*;
import java.util.Arrays;

class Q10 {
	static private void getMedian(int[] arr, int n) {
		Arrays.sort(arr);

		if (n % 2 == 0) {
//			int ind1 = (n / 2) - 1;
//			int ind2 = (n / 2);
//			System.out.print((double) (arr[ind1] + arr[ind2]) / 2);
			int midIndex = n / 2;
			System.out.println((arr[midIndex - 1] + arr[midIndex]) / 2.0);
		} else {
			System.out.print(arr[(n / 2)]);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 4, 7, 1, 2, 5, 6 };
		int n = 6;
		System.out.print("The median of the array is: ");
		getMedian(arr, n);
	}
}

/*
 * Example 1: Input: [2,4,1,3,5] Output: 3
 * 
 * Example 2: Input: [2,5,1,7] Output: 3.5
 * 
 * ======================================= What is a Median? Median is defined
 * as the value which is present in the middle for a series of values. Note, in
 * order to find the median of an array of integers, we must make sure they are
 * sorted. 
 * ========================== 
 * Intuition : The problem requires us to
 * simply implement the mathematical formula programmatically. Hence, we need to
 * make sure that the array is sorted and calculate the answer based on whether
 * n is odd or even.
 * 
 * Approach : Sort the array in ascending order Check whether n is odd or even
 */