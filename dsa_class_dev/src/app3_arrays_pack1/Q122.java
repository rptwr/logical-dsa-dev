package app3_arrays_pack1;

/*
Assume these are the elements in the array. 
{10, 20, 30, 400, 500, 110, 540}
Try swapping first element with 4th elements and make 
an array as
{400, 20, 30, 10, 500, 110, 540}
*/

import java.util.Arrays;
class Q122
{
	public static void main(String[] args)
	{
		int[] a1 = {10, 20, 30, 400, 500, 110, 540}; 
		System.out.println("Initial:" + Arrays.toString(a1));
		int t1 = a1[0];
		a1[0] = a1[(a1.length / 2)];
		a1[(a1.length / 2)] = t1;
		System.out.println("Final:" + Arrays.toString(a1));
	}
}