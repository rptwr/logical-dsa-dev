package arrays;

import java.util.Arrays;

// Find the smallest element in an array

public class Q1 {
	public static void main(String[] args) {
		int[] arr1 = {2, 5, 1, 3, 0};
		System.out.println("The smallest element in the array: " + smallestElement(arr1));
		
		int[] arr2 = {8, 10, 5, 7, 9};
		System.out.println("The smallest element in the array: " + smallestElement(arr2));
	}
	
	static int smallestElement(int[] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}
	
//	private static int smallestElement(int[] arr) {
//		Arrays.sort(arr);
//		return arr[0];
//	}
	
}



// {8,10,5,7,9};