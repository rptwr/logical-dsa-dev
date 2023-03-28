package app3_arrays_pack1;

/*
Assume these are the element in the array. 
{10, 20, 30, 400, 500, 110, 540}
Try replacing current element with difference of next 
two elements
*/

import java.util.Arrays;
class Q131
{
	public static void main(String[] args)
	{
		int[] a1 = {10, 20, 30, 400, 500, 110, 540}; 
		System.out.println("Initial:" + Arrays.toString(a1));
		for(int i = 0; i < a1.length - 2; i++)
		{
			a1[i] = a1[i + 1] - a1[i + 2];
		}
		System.out.println("Final:" + Arrays.toString(a1));
	}
}
