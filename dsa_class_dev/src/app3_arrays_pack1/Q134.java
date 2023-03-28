package app3_arrays_pack1;

/*
Assume these are the element in the array. 
{10, 20, 30, 400, 500, 110, 540, 90}
Try replacing every element by increasing 1 unit in the 
first half and replacing every element by reducing one 
unit in the second half
*/

import java.util.Arrays;
class Q134
{
	public static void main(String[] args)
	{
		int[] a1 = {10, 20, 30, 400, 500, 110, 540}; 
		System.out.println("Initial:" + Arrays.toString(a1));
		for(int i = 0; i < (a1.length / 2); i++)
		{
			a1[i] = a1[i] + 1;
		}
		for(int i = (a1.length / 2) + 1; i < a1.length; i++)
		{
			a1[i] = a1[i] - 1;
		}
		System.out.println("Final:" + Arrays.toString(a1));
	}
}
