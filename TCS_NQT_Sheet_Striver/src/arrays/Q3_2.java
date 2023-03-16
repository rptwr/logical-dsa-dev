package arrays;

import java.util.Arrays;

/*
 Given an array, find the second smallest and second largest element in the array.
 Print ‘-1’ in the event that either of them doesn’t exist. 
*/

// Solution 1: (Brute Force) [this approach only works if there are no duplicates] 

public class Q3_2 {
	public static void main(String[] args) {
		int[] arr = {1, 2, 4, 6, 7, 5};
//		int[] arr = {1};
		int n = arr.length;
		getElements(arr, n);
	}
	static private void getElements(int[] arr, int n) {
		if (n == 0 || n == 1) {
			System.out.println(-1);
			System.out.println(" ");
			System.out.println(-1);
			System.out.println("\n");
		}
		Arrays.sort(arr);
		int small = arr[1];
		int large = arr[n - 2];
		
		System.out.println("The second smallest element in the array: " + small);
		System.out.println("The second largest element in the array: " + large);
	}
}







/*
 Solution 1: (Brute Force) [this approach only works if there are no duplicates]

Intuition: What do we do to find the largest or the smallest element present in an array? 
We ideally sort them and the first element would be the smallest of all while the 
last element would be the largest. Can we find the second smallest and second-largest 
using a similar approach?

Approach:
Sort the array in ascending order
The element present at the second index is the second smallest element
The element present at the second index from the end is the second largest element

Time Complexity: O(NlogN), For sorting the array

Space Complexity: O(1)
 * */


//==========================================================================================

/*
 Example 1:
Input: [1,2,4,7,7,5]
Output: Second Smallest : 2
	Second Largest : 5
Explanation: The elements are as follows 1,2,3,5,7,7 and hence second largest of these is 5 and second smallest is 2

Example 2:
Input: [1]
Output: Second Smallest : -1
	Second Largest : -1
Explanation: Since there is only one element in the array, it is the largest and smallest element present in the array.
 There is no second largest or second smallest element present.
 */