package arrays;

import java.util.Arrays;

// Insertion at specific position

public class Q13_3 {
	private static void insertAtPos(int[] arr, int pos, int value, int n) {
		for (int i = n; i >= pos; i--) {
			arr[i] = arr[i - 1];
		}
		arr[pos - 1] = value;
	}
	public static void main(String[] args) {
		int[] arr = {10, 9, 14, 8, 20, 48, 16, 9, 0};
		int n = arr.length - 1;
		int pos = 5;
		int value = 40;
		System.out.println(Arrays.toString(arr));
		insertAtPos(arr, pos, value, n);
		System.out.println(Arrays.toString(arr));
	}
}


/*
 For adding the element at a specific position, just shift array elements to right by one position,
  and after that add an element at the desired position.
  =====================================
  Before inserting the value at beginning:
10 9 14 8 20 48 16 9
After inserting the value at beginning:
10 9 14 8 40 20 48 16 9

Time Complexity: O(n) since we need to shift the elements to right according to the position.

Space Complexity: O(1)
  
  
 */