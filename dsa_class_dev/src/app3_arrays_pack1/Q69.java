package app3_arrays_pack1;
/*
right shift by 1
*/

import java.util.Arrays;
class Q69
{
	public static void main(String[] args) 
	{
		int[] elements = {10, 20, 30, 40, 50, 60};
		System.out.println("initial:" + Arrays.toString(elements));
		for(int i = elements.length - 1; i > 0; i--)
		{
			elements[i] = elements[i - 1];
		}
		System.out.println("final:" + Arrays.toString(elements));
	}
}
