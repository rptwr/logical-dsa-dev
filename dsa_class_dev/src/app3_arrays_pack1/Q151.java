package app3_arrays_pack1;

/*
Find the length of the longest consecutive elements 
sequence.
[10, 100, 5, 20, 4, 200, 1, 3, 25, 15, 2],
The longest consecutive elements sequence is [1, 2, 3, 4, 5]. 
Return its length: 5

*/

import java.io.*;
import java.util.*;
 
class Q151
	{
 
    static int findLongestConseqSubseq(int arr[], int n)
    {
        Arrays.sort(arr);
        int ans = 0, count = 0;
        ArrayList<Integer> v = new ArrayList<Integer>();
        v.add(arr[0]);
 
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1])
                v.add(arr[i]);
        }
        for (int i = 0; i < v.size(); i++) {
            if (i > 0 && v.get(i) == v.get(i - 1) + 1)
                count++;
            else
                count = 1;
            ans = Math.max(ans, count);
        }
        return ans;
    }
    public static void main(String[] args)
    {
        int arr[] = {10, 100, 5, 20, 4, 200, 1, 3, 25, 15, 2};
		System.out.println("Initial:" + Arrays.toString(arr));
        int n = arr.length;
 
        System.out.println("longest consecutive elements sequence is: " + findLongestConseqSubseq(arr, n));
    }
}
 
