package arrays;

// Remove Duplicates in-place from Sorted Array
// Solution 1: Two pointers

public class Q11_1 {
	static int removeDuplicate(int[] arr) {
		int i = 0; 
		for (int j = 1; j < arr.length; j++) {
			if (arr[i] != arr[j]) {
				i++;
				arr[i] = arr[j];
			}
		}
		return i + 1;
	}
	public static void main(String[] args) {
		int[] arr = {1,1,2,2,2,3,3};
		int k = removeDuplicate(arr);
		System.out.println("After Removing Duplicate: ");
		for (int i = 0; i < k; i++) {
			System.out.print(arr[i] + ", ");
		}
	}
}

/*
 * Problem Statement: Given an integer array sorted in non-decreasing order,
 * remove the duplicates in place such that each unique element appears only
 * once. The relative order of the elements should be kept the same.
 * 
 * If there are k elements after removing the duplicates, then the first k
 * elements of the array should hold the final result. It does not matter what
 * you leave beyond the first k elements.
 * 
 * Note: Return k after placing the final result in the first k slots of the
 * array. ===============================================================
 * Example 1:
 * 
 * Input: arr[1,1,2,2,2,3,3]
 * 
 * Output: arr[1,2,3,_,_,_,_]
 * 
 * Explanation: Total number of unique elements are 3, i.e[1,2,3] and Therefore
 * return 3 after assigning [1,2,3] in the beginning of the array.
 * 
 * Example 2:
 * 
 * Input: arr[1,1,1,2,2,3,3,3,3,4,4]
 * 
 * Output: arr[1,2,3,4,_,_,_,_,_,_,_]
 * 
 * Explanation: Total number of unique elements are 4, i.e[1,2,3,4] and
 * Therefore return 4 after assigning [1,2,3,4] in the beginning of the array.
 * =============================================================================
 * ====
 * 
 * Solution 2: Two pointers Intuition: We can think of using two pointers ‘i’
 * and ‘j’, we move ‘j’ till we don’t get a number arr[j] which is different
 * from arr[i]. As we got a unique number we will increase the i pointer and
 * update its value by arr[j].
 * 
 * Approach:
 * 
 * Take a variable i as 0; Use a for loop by using a variable ‘j’ from 1 to
 * length of the array. If arr[j] != arr[i], increase ‘i’ and update arr[i] ==
 * arr[j]. After completion of the loop return i+1, i.e size of the array of
 * unique elements.
 * 
 * 
 * 
 */