package arrays;

// Average of all the elements in the array
public class Q9 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int n = arr.length, sum = 0;
		for (int i = 0; i < n; i++) {
			sum += (double) arr[i]; // using double as average can be in decimal.
		}
		double average = sum / n;
		System.out.println("Average of all the elements in the array: " + average);
	}
}

/*
 * Example 1: Input: N = 5, array[] = {1,2,3,4,5} Output: 3 Explanation: Average
 * is the sum of all the elements divided by number of elements.Therefore
 * (1+2+3+4+5)/5 = 3.
 * 
 * Example 2: Input: N=6, array[] = {1,2,1,1,5,1} Output: 1.8 Explanation:
 * Average is the sum of all the elements divided by number of
 * elements.Therefore (1+2+1+1+5+1)/6 = 1.8
 * =====================================================================
 * 
 * The average is 3.0
 * 
 * Time Complexity: O(n) As we are traversing the array once.
 * 
 * Space Complexity: O(1).
 * 
 * 
 * 
 * 
 */