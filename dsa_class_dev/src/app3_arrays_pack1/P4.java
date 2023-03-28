package app3_arrays_pack1;
/*
Find out sum of all odd elements in the given array except boundary
*/

import java.util.Arrays;
class P4
{
	public static void main(String[] args) 
	{
		int[] a1 = {10, 2, 13, 40, 15, 60, 7, 80};
		//System.out.println("initial:" + Arrays.toString(a1));
		int sum = 0;
		for(int i = 1; i < a1.length - 1; i++)
		{
			if(a1[i] % 2 == 1)
			{
				sum += a1[i];
			}
		}
		System.out.println("odd sum:" + sum);
		//System.out.println("final:" + Arrays.toString(a1));
	}
}
