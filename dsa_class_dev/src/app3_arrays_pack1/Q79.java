package app3_arrays_pack1;
/*
add two elements 650 750 at starting

*/

import java.util.Arrays;
class Q79
{
	public static void main(String[] args) 
	{
		int[] elements = {10, 20, 30, 40, 50, 60, 70, 80};
		//                 0   1   2   3   4   5   6   7
		System.out.println("initial:" + Arrays.toString(elements));
		int[] temp = elements;
		elements = new int[temp.length + 2];
		for(int i = 0; i < temp.length; i++)
		{
			elements[i + 2] = temp[i];
		}
		elements[0] = 650;
		elements[1] = 750;
		System.out.println("final:" + Arrays.toString(elements));
	}
}
