package app3_arrays_pack1;

/*
Define an array with 10 accommodations. Store 25 in 
the 2nd location. 
*/

import java.util.Arrays;
class Q114
{
	public static void main(String[] args)
	{
		int[] a1 = new int[10];
		System.out.println("Initial:" + Arrays.toString(a1));
		a1[1] = 25;
		System.out.println("Final:" + Arrays.toString(a1));
	}
}