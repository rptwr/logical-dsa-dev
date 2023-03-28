package app3_arrays_pack1;
/*
Print the element which are next to even element
*/

import java.util.Arrays;
class P5
{
	public static void main(String[] args) 
	{
		int[] a1 = {10, 2, 13, 40, 15, 60, 7, 80};
		//System.out.println("initial:" + Arrays.toString(a1));
		for(int i = 0; i < a1.length - 1; i++)
		{
			if(a1[i] % 2 == 0)
			{
				System.out.print(a1[i + 1] + ", ");
			}
		}
		
		//System.out.println("final:" + Arrays.toString(a1));
	}
}
