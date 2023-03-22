package arrays;

import java.util.Arrays;

// Find all repeating elements in an array
// Solution 1: Brute Force

public class Q14_1 {
	private static void findRepeatingElement(int[] arr) {
		int count = 0;
		int[] dup = new int[arr.length];
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					dup[count++] = arr[i];
				}
			}
		}
		System.out.println("The repeating elements are: ");
//		System.out.println(Arrays.toString(dup));

		for (int i = 0; i < count; i++) {
			if (dup[i] != dup[i + 1]) {
				System.out.print(dup[i] + ", ");
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 3, 4, 4, 5, 2 };
		findRepeatingElement(arr);
	}
}

/*
 * Example 1: Input: Arr[] = [1,1,2,3,4,4,5,2] Output: 1,2,4 Explanation: 1,2
 * and 4 are the elements which are occurring more than once.
 * 
 * Example 2: Input: Arr[] = [1,1,0] Output: 1 Explanation: Only 1 is occurring
 * more than once in the given array.
 * ==========================================================
 * 
 * Solution 1: Brute Force
 * 
 * Approach:
 * 
 * The process is as follows:-
 * 
 * Use an array to store all repeating elements. These elements are not distinct
 * in the array. This is because for every pair of repeating elements it will
 * store elements in the array. Start iterating the array. This will pick up an
 * element for which we want to find its duplicates. Iterate another nested loop
 * for finding all pairs. Pairs which have both elements are repeating elements
 * and store them in the array created in the initial step. Start iterating in
 * the array containing repeating elements. If the current element is not equal
 * to the next element in the array then we print the current element. This is
 * to ensure all unique repeating elements.
 * 
 * 
 * ========================================================= Output:
 * 
 * The repeating elements are: 1 2 4
 * 
 * Time Complexity: O(N2)+O(N)
 * 
 * Reason: We are taking one element and searching its repeating element again
 * in the array. Also, iterating through the dup array which contains repeating
 * elements to find unique repeating elements.
 * 
 * Space Complexity: O(N)
 * 
 * Reason: We are using an array for storing all repeating elements.
 * 
 * 
 * 
 * 
 */