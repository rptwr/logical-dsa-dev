package app3_arrays_pack1;
/*
right shift by 1 in first half
*/

import java.util.Arrays;
class Q73
{
	public static void main(String[] args) 
	{
		int[] elements = {10, 20, 30, 40, 50, 60, 70, 80};
		//                 0   1   2   3   4   5   6   7
		System.out.println("initial:" + Arrays.toString(elements));
		for(int i = (elements.length / 2 ) - 1; i > 0; i--)
		{
			elements[i] = elements[i - 1];
		}
		System.out.println("final:" + Arrays.toString(elements));
	}
}
