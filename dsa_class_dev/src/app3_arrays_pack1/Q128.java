package app3_arrays_pack1;

/*
Assume these are the element in the array. 
{10, 20, 30, 400, 500, 110, 540}
Try replacing current element with sum of prev two 
elements

*/

import java.util.Arrays;
class Q128
{
	public static void main(String[] args)
	{
		int[] a1 = {10, 20, 30, 400, 500, 110, 540}; 
		//          0    1   2   3     4    5    6
		System.out.println("Initial:" + Arrays.toString(a1));
		int prev1 = a1[a1.length - 1];
		int prev2 = a1[a1.length - 2];
		for(int i = a1.length - 1; i > 1; i--)
		{
			a1[i] = a1[i - 1] + a1[i - 2];
		}
		a1[1] = a1[0] + prev1;
		a1[0] = prev1 + prev2;
		System.out.println("Final:" + Arrays.toString(a1));
	}
}
