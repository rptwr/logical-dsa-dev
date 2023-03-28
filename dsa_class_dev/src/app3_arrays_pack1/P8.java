package app3_arrays_pack1;
/*
left shift by 1 in the secon half
*/

import java.util.Arrays;
class P8
{
	public static void main(String[] args) 
	{
		int[] a1 = {10, 2, 13, 40, 15, 60, 7, 80};
		System.out.println("initial:" + Arrays.toString(a1));
		for(int i = a1.length / 2; i < a1.length - 1 ; i++)
		{
			a1[i] = a1[i + 1];
		}
		
		System.out.println("final:" + Arrays.toString(a1));
	}
}
