package app3_arrays_pack1;

/*
Assume these are the element in the array. 
{10, 20, 30, 400, 500, 110, 540, 90}
Try replacing middle elements with a sum of first last 
element
*/

import java.util.Arrays;
class Q137
{
	public static void main(String[] args)
	{
		int[] a1 = {10, 20, 30, 400, 500, 110, 540}; 
		System.out.println("Initial:" + Arrays.toString(a1));
		int sum = a1[0] + a1[a1.length - 1];
		a1[a1.length / 2] = sum;
		System.out.println("Final:" + Arrays.toString(a1));
	}
}
