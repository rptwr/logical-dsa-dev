package arrays;

// Calculate Sum of the Elements of the Array
// Problem Statement: Given an array, we have to find the sum of all the elements in the array.

public class Q7_1 {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		int n = arr.length, sum = 0;
		for (int i = 0; i < n; i++) {
			sum += arr[i];
		}
		System.out.println("Sum of the elements of the Array: " + sum);
	}
}




/*
 Example 1:
Input: N = 5, array[] = {1,2,3,4,5}
Output: 15
Explanation: Sum of all the elements is 1+2+3+4+5 = 15

Example 2:
Input:  N=6, array[] = {1,2,1,1,5,1}
Output: 11
Explanation: Sum of all the elements is 1+2+1+1+5+1 = 11

//=================
 Solution 1: Using for loop                                                                                                                                             

Approach: 

Using for loop traverse through the array and while traversing  maintain  a variable for storing sum of the 
elements in the array.
After completing the traversal simply print the sum.
 
 //====================
  The sum of the elements of the array is 15

Time Complexity: O(n) As we traverse the array once.

Space Complexity: O(1).
 
 */