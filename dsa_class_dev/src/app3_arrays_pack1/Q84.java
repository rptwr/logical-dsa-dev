package app3_arrays_pack1;
/*
bubble short
*/

import java.util.Arrays;
class Q84
{
	public static void main(String[] args) 
	{
		int[] a1 = {5, 2, 7, 3, 1};
		//           0 1  2  3  4   
		int temp = 0;
		for(int i = 0; i < a1.length; i++)
		{
			for(int j = 0; j < a1.length - 1 - i; j++)
			{
				if (a1[j] > a1[j + 1])
				{
				temp = a1[j];
				a1[j] = a1[j + 1];
				a1[j + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(a1));
	} 
}
