package arrays;

import java.util.Arrays;

// Problem Statement: Rearrange the array such that the first half is arranged in increasing order,
//and the second half is arranged in decreasing order

public class Q6_1 {
	public static void main(String[] args) {
		int[] arr = {8, 7, 1, 6, 5, 9};
		int n = arr.length;
		Arrays.sort(arr);
		for (int i = 0; i < n / 2; i++) {
			System.out.print(arr[i] + ", ");
		}
		for (int j = n - 1; j >= n / 2; j--) {
			System.out.print(arr[j] + ", ");
		}
	}
}




/*
 Example 1:
Input: 8 7 1 6 5 9
Output: 1 5 6 9 8 7
Explanation: First three elements are in the ascending order and next three elements are in the descending order.

Example 2:
Input: 4 2 8 6 15 5 9 20
Output: 2 4 5 6 20 15 9 8

//========================================
 Solution:

Intuition: Sort the whole array. Then print the first half of the array to get the first half in the ascending order 
and then print the rest of the array in the reverse order.

Approach:

Sort the given array.
Print the first half of the array i.e from 0 to (n/2 -1)th index,to print the first half in the ascending order.
Then print elements from n-1 to n/2th index to get the second half in the descending order.
 
 //===================================
  Output: 1 5 6 9 8 7

Time Complexity: O(nlogn) +O(n), O(nlogn) for sorting the array and O(n) for printing the elements. 

Space Complexity: O(1).
 
 */