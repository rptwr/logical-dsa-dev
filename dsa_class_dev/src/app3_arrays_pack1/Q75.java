package app3_arrays_pack1;
/*
insert a new element at the third location

*/

import java.util.Arrays;
class Q75
{
	public static void main(String[] args) 
	{
		int[] elements = {10, 20, 30, 40, 50, 60, 70, 80};
		//                 0   1   2   3   4   5   6   7
		System.out.println("initial:" + Arrays.toString(elements));
		int[] temp = elements;
		elements = new int[temp.length + 1];
		for(int i = 0; i < temp.length; i++)
		{
			elements[i] = temp[i];
		}
		for(int i = elements.length - 1; i > 2 ; i--)
		{
			elements[i ] = elements[i - 1];
		}
		elements[2] = 550;
		System.out.println("final:" + Arrays.toString(elements));
	}
}
