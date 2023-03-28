package app3_arrays_pack1;
/*
Print first half of the element which are bigger than first element
*/

import java.util.Arrays;
class P7
{
	public static void main(String[] args) 
	{
		int[] a1 = {10, 2, 13, 40, 15, 60, 7, 80};
		System.out.println("initial:" + Arrays.toString(a1));
		for(int i = 0; i < (a1.length/2) ; i++)
		{
			a1[i] = i;
		}
		
		System.out.println("final:" + Arrays.toString(a1));
	}
}
