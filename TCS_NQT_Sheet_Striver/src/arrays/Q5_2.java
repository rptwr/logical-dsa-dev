package arrays;

/*
 Count frequency of each element in the array
Problem statement: Given an array, we have found the number of occurrences of each element in the array.

//Solution 2: Using Map
 */

import java.util.*;

public class Q5_2 {
 
public static void main(String args[]){  
   
   int arr[] = {10,5,10,15,10,5};
     int n = arr.length;
     Frequency(arr, n);
  }
static void Frequency(int arr[], int n)
{
    Map<Integer, Integer> map = new HashMap<>();
 
    for (int i = 0; i < n; i++)
    {
        if (map.containsKey(arr[i]))
        {
            map.put(arr[i], map.get(arr[i]) + 1);
        }
        else
        {
            map.put(arr[i], 1);
        }
    }
    // Traverse through map and print frequencies
    for (Map.Entry<Integer,Integer> entry : map.entrySet())
    {
        System.out.println(entry.getKey() + " " + entry.getValue());
    }
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
Intuition: We can use a map of value and frequency pair, in which we can easily update the frequency of an element 
if it is already present in the map, if it is not present in the map then insert it in the map with frequency as 1.
 After completing all the iterations, print the value frequency pair. 

Approach:

Take a unordered_map/HashMap of <Integer , Integer> pair.
Use a for loop to iterate the array.
If the element is not present in the map then insert it with frequency 1, otherwise increase the existing
 frequency by 1.
Print the value frequency pair.

//=======================
 
 Time Complexity: O(N)

Space Complexity: O(n)
*/