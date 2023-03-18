package arrays;

/*
 Count frequency of each element in the array
Problem statement: Given an array, we have found the number of occurrences of each element in the array.

 //Solution 1: Use of two loops
 */

public class Q5_1
 {
	static void countFreq(int[] arr, int n) {
		boolean[] visited = new boolean[n];
		for (int i = 0; i < n; i++) {
			if (visited[i] == true) {
				continue;
			}
			int count = 1;
			for (int j = i + 1; j < n; j++) {
				if (arr[i] == arr[j]) {
					visited[j] = true;
					count++;
				}
			}
			System.out.println(arr[i] + ", " + count);
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {10,5,10,15,10,5};
		int n = arr.length;
		countFreq(arr, n);
	}
}

/*
Example 1:
Input: arr[] = {10,5,10,15,10,5};
Output: 10  3
	 5  2
        15  1
Explanation: 10 occurs 3 times in the array
	      5 occurs 2 times in the array
              15 occurs 1 time in the array

Example2: 
Input: arr[] = {2,2,3,4,4,2};
Output: 2  3
	3  1
        4  2
Explanation: 2 occurs 3 times in the array
	     3 occurs 1 time in the array
             4 occurs 2 time in the array
//==========================================================

Solution 1: Use of two loops

Intuition: We can simply use two loops, in which the first loop points to one element and the second loop
 finds that element in the remaining array. We will keep track of the occurrence of that same element by maintaining 
 a count variable. We also have to maintain a visited array so that it will keep track of the duplicate elements that 
 we already count.  

Approach: 

Make a visited array of type boolean.
Use the first loop to point to an element of the array.
Initialize the variable count to 1.
Make that index true in the visited array.
Run second loop, if we find the element then mark the visited index true and increase the count.
If the visited index is already true then skip the other steps.


//===================================
 Output:

10 3
5 2
15 1

Time Complexity: O(N*N)

Space Complexity:  O(N)
*/