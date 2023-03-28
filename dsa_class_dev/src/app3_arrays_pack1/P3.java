package app3_arrays_pack1;
/*
Print all the elements from the array which are between 10 and 20 including 10 and 20
*/

import java.util.Arrays;
class P3 
{
	public static void main(String[] args) 
	{
		int[] a1 = {10, 2, 13, 40, 15, 60, 7, 80};
		//System.out.println("initial:" + Arrays.toString(a1));
		for(int i = 0; i < a1.length; i++)
		{
			if(a1[i] >= 10 && a1[i] <= 20)
			{
				System.out.print(a1[i] + ", ");
			}
		}
		//System.out.println("final:" + Arrays.toString(a1));
	}
}
