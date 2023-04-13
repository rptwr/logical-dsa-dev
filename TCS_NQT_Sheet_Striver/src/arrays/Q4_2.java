package arrays;

import java.util.Arrays;

//Reverse a given Array
// Solution 2:  Space optimized iterative method
public class Q4_2 {
	
	static void printArray(int[] arr, int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + ", ");
		}
	}
	static void reverseArray(int[] arr, int n) {
		int p1 = 0, p2 = n - 1;
		while (p1 < p2) {
			int temp = arr[p1];
			arr[p1] = arr[p2];
			arr[p2] = temp;
			p1++;
			p2--;
		}
		printArray(arr, n);
//		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		int [] arr = {5, 4, 3, 2, 1};
		int n = 5;
		reverseArray(arr, n);
	}

}

/*
 Approach: Unlike the previous method we use the same array to obtain the result. 
 Follow the steps below.

Keep a pointer p1  at the first index and another p2 at the last index of array. 
Swap the elements  pointed by p1 and p2,Post swapping increment p1 and decrement p2.
This process is repeated for only the first n/2 elements where n is the length of array.
Note: Swapping all the n elements instead of n/2 elements leaves the array unaltered.

//========================
 Output:

The reversed array is:-
1 2 3 4 5

Time Complexity: O(n), single-pass involved.

Space Complexity: O(1) 

 */