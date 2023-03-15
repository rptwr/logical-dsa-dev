package arrays;

/*
Given an array, find the second smallest and second largest element in the array.
Print ‘-1’ in the event that either of them doesn’t exist. 
*/

public class Q3_2 {
	public static void main(String[] args) {
		
	}
}




/*
 Solution 2(Better Solution)
Intuition: Even though we want to have just the second smallest and largest elements, we are still sorting the 
entire array for that and thus increasing the time complexity. Can we somehow try to not sort the array and still 
get our answer?

Approach:
Find the smallest and largest element in the array in a single traversal
After this, we once again traverse the array and find an element that is just greater than the smallest element we 
just found.
Similarly, we would find the largest element which is just smaller than the largest element we just found
Indeed, this is our second smallest and second largest element.
 */