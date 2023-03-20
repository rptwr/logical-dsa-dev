package arrays;

import java.util.*;
import java.util.stream.IntStream;
//Calculate Sum of the Elements of the Array
// Using collection in Java   // For Java: Instream sum() gives the sum of all the elements in the stream.

public class Q7_2 {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		int n = arr.length;
		int sum = IntStream.of(arr).sum();
		System.out.println("Sum of the elements of the Array: " + sum);
	}
}




//The sum of the elements of the array is 15
//
//Time Complexity: O(n).
//
//Space Complexity: O(1).