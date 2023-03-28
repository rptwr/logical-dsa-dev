package app3_arrays_pack1;
/*
right shift by 1 in second half
*/

import java.util.Arrays;
class Q72
{
	public static void main(String[] args) 
	{
		int[] elements = {10, 20, 30, 40, 50, 60, 70, 80};
		//                 0   1   2   3   4   5   6   7
		System.out.println("initial:" + Arrays.toString(elements));
		for(int i = elements.length - 1; i > elements.length / 2; i--)
		{
			elements[i] = elements[i - 1];
		}
		System.out.println("final:" + Arrays.toString(elements));
	}
}
