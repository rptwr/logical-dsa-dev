package app3_arrays_pack1;

/*
Define an array with 10 accommodations. Store 35 in 
the first location.
*/

import java.util.Arrays;
class Q113
{
	public static void main(String[] args) 
	{
		int[] a1 =new int[10];
		System.out.println("Inital:" + Arrays.toString(a1));
		a1[0] = 35;
		System.out.println("Final:" + Arrays.toString(a1));
	}
}
