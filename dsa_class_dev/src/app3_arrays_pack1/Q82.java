package app3_arrays_pack1;
/*
insert a2 elements in the a1 from 4th location onwards
{10, 20, 30, 1, 201, 29, 43, 40, 50, 60, 70, 80};
*/

import java.util.Arrays;
class Q82
{
	public static void main(String[] args) 
	{
		int[] a1 = {10, 20, 30, 40, 50, 60, 70, 80};
		//           0   1   2   3   4   5   6   7
		int[] a2 = new int[a1.length];
		for(int i = 0; i < a1.length; i++)
		{
			a2[i] = a1[i];
		}
		System.out.println("a2:" + Arrays.toString(a2));
	} 
}
