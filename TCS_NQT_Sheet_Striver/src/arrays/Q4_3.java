package arrays;

import java.util.Arrays;

//Reverse a given Array
// Solution 2:  Recursive method

public class Q4_3 
{
	
	static void printArray(int[] arr, int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + ", ");
		}
	}
	static void reverseArray(int[] arr, int start, int end) {
		if (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			reverseArray(arr, start + 1, end - 1);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 5, 4, 3, 2, 1 };
		int n = 5;
		reverseArray(arr, 0, n - 1);
		printArray(arr, n);
//		System.out.println(Arrays.toString(arr));
	}

}


/*
 * Solution 3: Recursive method

Approach: The recursive method has an approach almost similar to the iterative one. 
The approach has been broken down into some steps for simplicity.

Create a function that takes an array ,start index and end index of the array as parameters.
Swap the elements present  at start and end index, 
The portion of array left to be reversed is arr[start+1,end-1]. Make a recursive call to reverse the rest of array. 
While calling recursion pass start +1  and end – 1 as parameters for the shrinked array. Repeat step 2.
Continue recursion as long as ‘start < end’ condition is satisfied. This is the base case for our recursion.

 * //======================== 
 * Output:

The reversed array is:-
1 2 3 4 5

Time Complexity: O(n)

Space Complexity: O(1)
 * 
 */