package app3_arrays_pack1;

/*
For every element make a double in the given array
*/

import java.util.Arrays;
class Q97
{
	public static void main(String[] args) 
	{
		int[] a1 = {10, 20, 30, 40, 50, 60, 70, 80};
		System.out.println("initial:" + Arrays.toString(a1));
		for(int i = 0; i < a1.length; i++)
		{
			a1[i] = 2 * a1[i];
			//a[i] = a1[i] + a1[i];
		}
		System.out.println("final:" + Arrays.toString(a1));
	}
}
