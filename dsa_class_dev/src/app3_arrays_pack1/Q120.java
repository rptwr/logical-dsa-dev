package app3_arrays_pack1;

/*
Assume these are the elements in the array. 
{10, 20, 30, 400, 500, 110, 540}
Try swapping first two elements and make an array as
{20, 10, 30, 400, 500, 110, 540}
*/

import java.util.Arrays;
class Q120
{
	public static void main(String[] args)
	{
		int[] a1 = {10, 20, 30, 400, 500, 110, 540}; 
		System.out.println("Initial:" + Arrays.toString(a1));
		int t1 = a1[0];
		a1[0] = a1[1];
		a1[1] = t1;
		System.out.println("Final:" + Arrays.toString(a1));
	}
}