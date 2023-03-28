package app3_arrays_pack1;

/*
Assume these are the element in the array. 
{10, 20, 30, 400, 500, 110, 540}
Try swapping last element with 4th element and make 
an array as
{10, 20, 30, 540, 500, 110, 400}

*/

import java.util.Arrays;
class Q124
{
	public static void main(String[] args)
	{
		int[] a1 = {10, 20, 30, 400, 500, 110, 540}; 
		System.out.println("Initial:" + Arrays.toString(a1));
		int t1 = a1[a1.length - 1];
		a1[a1.length - 1] = a1[a1.length / 2];
		a1[a1.length / 2] = t1;
		System.out.println("Final:" + Arrays.toString(a1));
	}
}