package app3_arrays_pack1;

/*
Assume these are the element in the array. 
{10, 20, 30, 400, 500, 110, 540}
Try swapping first element with last element and make 
an array as
{540, 20, 30, 400, 500, 110, 10}

*/

import java.util.Arrays;
class Q125
{
	public static void main(String[] args)
	{
		int[] a1 = {10, 20, 30, 400, 500, 110, 540}; 
		System.out.println("Initial:" + Arrays.toString(a1));
		int t1 = a1[0];
		a1[0] = a1[a1.length - 1];
		a1[a1.length - 1] = t1;
		System.out.println("Final:" + Arrays.toString(a1));
	}
}