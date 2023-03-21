package arrays;

import java.util.Arrays;

// Insertion at Ending

public class Q13_2 {
	static void insertAtEnd(int[] arr, int n, int value) {
		for (int i = n - 1; i >= 0; i--) {
			arr[n] = value;
		}
	}

	public static void main(String args[]) {
//		int n = 8;
		int arr[] = { 10, 9, 14, 8, 20, 48, 16, 9, 0 };
		int n = arr.length - 1;
		int value = 40;
		System.out.println("Before inserting the value at beginning:");
		for (int i = 0; i <= n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		insertAtEnd(arr, n, value);
		System.out.println("After inserting the value at beginning:");
		for (int i = 0; i <= n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

	}
}


/*
 For adding the elements at the end, just add the element at the nth index.
 
 Output:

Before inserting the value at beginning:
10 9 14 8 20 48 16 9
After inserting the value at beginning:
10 9 14 8 20 48 16 9 40

Time Complexity: θ(n), since n iterations are required to shiftθ(1) since we need to directly add an element at the end of the array

Space Complexity: O(1)
 */