package arrays;

import java.util.Arrays;
import java.util.HashSet;

// Remove Duplicates in-place from Sorted Array
//Solution 2: Brute Force

public class Q11_2 
{
	static int removeDuplicate(int[] arr) {
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		int k = set.size();
		int j = 0;
		for (int x: set) {  
			arr[j++] = x;  // Now put all elements of the set in the array from the starting of the array.
		}
		return k;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 2, 2, 3, 3 };
		int k = removeDuplicate(arr);
		System.out.println("After Removing Duplicate: ");
		for (int i = 0; i < k; i++) {
			System.out.print(arr[i] + ", ");
		}
	}
}










/*
 * Solution 1: Brute Force
 * 
 * Intuition: We have to think of a data structure that does not store duplicate
 * elements. So can we use a Hash set? Yes! We can. As we know HashSet only
 * stores unique elements.
 * 
 * Approach:
 * 
 * Declare a HashSet. 
 * Run a for loop from starting to the end. 
 * Put every element of the array in the set. 
 * Store size of the set in a variable K. 
 * Now put all elements of the set in the array from the starting of the array. 
 * Return K.
 * ========================================
 * Output: The array after removing duplicate elements is 1 2 3

Time complexity: O(n*log(n))+O(n)

Space Complexity: O(n) 
 * 
 */