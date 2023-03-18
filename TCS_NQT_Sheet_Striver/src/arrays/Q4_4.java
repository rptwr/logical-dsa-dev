package arrays;

import java.util.*;

//Reverse a given Array
//Solution 2:  Using library function (New Approach)

public class Q4_4 {

	static void printArray(Integer[] arr, int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + ", ");
		}
	}

	static void reverseArray(Integer arr[]) {
		Collections.reverse(Arrays.asList(arr));
	}

	

	public static void main(String[] args) {
		Integer[] arr = { 5, 4, 3, 2, 1 };
		int n = 5;
		reverseArray(arr);
		printArray(arr, n);
	}

}

/*
The reverse method in java can be imported from the Collections class present in java.util package. 

Note:

Since this method expects an object as a parameter we have to convert the array into a list object using asList().
Java collections require wrapper classes instead of primitive data type.In order to  reverse an integer array use 
Integer instead of int.
Syntax: Collections.reverse(class_obj); 
 
//================= 
 
Output:

The reversed array is:-
1 2 3 4 5

Time Complexity: O(n)

Space Complexity: O(1) 
*/