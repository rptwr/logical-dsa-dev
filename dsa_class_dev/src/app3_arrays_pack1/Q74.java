package app3_arrays_pack1;
/*
insert a new element at the beginning
*/

import java.util.Arrays;
class Q74
{
	public static void main(String[] args) 
	{
		int[] elements = {10, 20, 30, 40, 50, 60, 70, 80};
		//                 0   1   2   3   4   5   6   7
		System.out.println("initial:" + Arrays.toString(elements));
		int[] temp = elements;
		elements = new int[temp.length + 1];
		for(int i = 0; i < elements.length - 1; i++)
		{
			elements[i + 1] = temp[i];
		}
		elements[0] = 500;
		System.out.println("final:" + Arrays.toString(elements));
	}
}
