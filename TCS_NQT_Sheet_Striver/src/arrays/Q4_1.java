package arrays;

import java.util.Arrays;

// Reverse a given Array
// Solution 1: Using an extra array.

public class Q4_1 {
	public static void main(String[] args) {
		int [] arr = {5, 4, 3, 2, 1};
		int n = 5;
		reverseArray(arr, n);
	}

	
	static void reverseArray(int[] arr, int n) {
		int[] ans = new int[n];
		for (int i = n - 1; i >= 0; i--) {
			ans[n - i - 1] = arr[i];
		}
		printArray(ans, n);
		System.out.println();
		System.out.println(Arrays.toString(ans));
	}
	
	static void printArray(int[] arr, int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + ", ");
		}
	}
}




/*
 Example 1:
Input: N = 5, arr[] = {5,4,3,2,1}
Output: {1,2,3,4,5}
Explanation: Since the order of elements gets reversed the first element will occupy the fifth position, 
the second element occupies the fourth position and so on.

Example 2:
Input: N=6 arr[] = {10,20,30,40}
Output: {40,30,20,10}
Explanation: Since the order of elements gets reversed the first element will occupy the fifth position,
 the second element occupies the fourth position and so on.
 */


/*
 Solution

Solution 1: Using an extra array.

Approach: Declare an array,ans[] of the same size as the input array. Iterate from the back of the input array 
while storing the elements in ans[]  in opposite direction.


 */

