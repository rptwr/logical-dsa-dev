package app3_arrays_pack1;
/*
insert a2 elements in the a1 from 9th index onwards
{10, 20, 30, 1, 201, 29, 43, 40, 50, 60, 70, 80};
*/

import java.util.Arrays;
class Q81
{
	public static void main(String[] args) 
	{
		int[] a1 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110};
		//           0   1   2   3   4   5   6   7   8   9    10
		int[] a2 = {1, 201, 29, 43, 23, 44};

		
		System.out.println(Arrays.toString(a1));
	}
}
