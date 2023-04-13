package arrays;

/*
Given an array, find the second smallest and second largest element in the array.
Print ‘-1’ in the event that either of them doesn’t exist. 
*/
// Solution 2(Better Solution)
public class Q3_3 {
	static private void getElements(int[] arr, int n) {
		if (n == 0 || n == 1) {
			System.out.print(-1);
			System.out.print(" ");
			System.out.print(-1);
			System.out.print("\n");
		}
		int small = Integer.MAX_VALUE;  // The first two lines initialize small and second_small to the maximum value that an int can hold using the Integer.MAX_VALUE constant. This ensures that any value assigned to these variables later in the code will be smaller than their initial values.
		int second_small = Integer.MAX_VALUE;   // 2147483647
		int large = Integer.MIN_VALUE;   // The next two lines initialize large and second_large to the minimum value that an int can hold using the Integer.MIN_VALUE constant. This ensures that any value assigned to these variables later in the code will be larger than their initial values.
		int second_large = Integer.MIN_VALUE;    // -2147483648
		System.out.println(small);
		System.out.println(second_small);
		System.out.println(large);
		System.out.println(second_large);
		int i;
		for (i = 0; i < n; i++) {
			small = Math.min(small, arr[i]);
			large = Math.max(large, arr[i]);
		}
		System.out.println(small);
		System.out.println(large);
		for (i = 0; i < n; i++) {
			if (arr[i] < second_small && arr[i] != small) {
				second_small = arr[i];
			}
			if (arr[i] > second_large && arr[i] != large) {
				second_large = arr[i];
			}
		}

		System.out.println("Second smallest is " + second_small);
		System.out.println("Second largest is " + second_large);
	}

	public static void main(String[] args) {
//		int[] arr = { 1, 2, 4, 6, 7, 5 };
		int[] arr = { 1, 2, 4, 7, 7, 5 };
		int n = arr.length;
		getElements(arr, n);
	}
}

/*
 * Solution 2(Better Solution) Intuition: Even though we want to have just the
 * second smallest and largest elements, we are still sorting the entire array
 * for that and thus increasing the time complexity. Can we somehow try to not
 * sort the array and still get our answer?
 * 
 * Approach: Find the smallest and largest element in the array in a single
 * traversal After this, we once again traverse the array and find an element
 * that is just greater than the smallest element we just found. Similarly, we
 * would find the largest element which is just smaller than the largest element
 * we just found Indeed, this is our second smallest and second largest element.
 */