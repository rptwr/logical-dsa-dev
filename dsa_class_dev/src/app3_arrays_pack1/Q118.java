package app3_arrays_pack1;

/*
Define an array with 11 accommodations. Store 25 in 
the middle.
*/

import java.util.Arrays;
class Q118
{
	public static void main(String[] args)
	{
		int[] a1 = new int[11];
		System.out.println("Initial:" + Arrays.toString(a1));
		a1[a1.length / 2] = 25;
		System.out.println("Final:" + Arrays.toString(a1));
	}
}