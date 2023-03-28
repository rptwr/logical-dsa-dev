package app3_arrays_pack1;

/*
Define an array with 10 accommodations. Store 25 in 
the last location and 200 in the last but one location. 
*/

import java.util.Arrays;
class Q117
{
	public static void main(String[] args)
	{
		int[] a1 = new int[10];
		System.out.println("Initial:" + Arrays.toString(a1));
		a1[a1.length - 1] = 25;
		a1[a1.length - 2] = 200;
		System.out.println("Final:" + Arrays.toString(a1));
	}
}