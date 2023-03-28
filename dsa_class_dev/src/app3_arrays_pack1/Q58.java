package app3_arrays_pack1;
/*
left-rotate by 2
5, 300, 0, 45, 109, 400, 412, 900, 10, 2
*/

import java.util.Arrays;
class Q58
{
	public static void main(String[] args)
	{
		int[] elements = {10, 2, 5, 300, 0, 45, 109, 400, 412, 900};
		              //   0  1   2   3  4   5    6   7    8    9
		System.out.println("iniital content:" + Arrays.toString(elements));
		int temp1 = elements[0];
		int temp2 = elements[1];
		for(int i = 0; i < elements.length - 2; i++)
		{
			elements[i] = elements[i + 2];
		}
		elements[elements.length - 2] = temp1;
		elements[elements.length - 1] = temp2;
		System.out.println("final content:" + Arrays.toString(elements));
	}
}