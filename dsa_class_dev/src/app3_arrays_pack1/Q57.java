package app3_arrays_pack1;
/*
right-rotate by 1
900, 10, 2, 5, 300, 0, 45, 109, 400, 412
*/

import java.util.Arrays;
class Q57
{
	public static void main(String[] args)
	{
		int[] elements = {10, 2, 5, 300, 0, 45, 109, 400, 412, 900};
		              //   0  1   2   3  4   5    6   7    8    9
		System.out.println("iniital content:" + Arrays.toString(elements));
		int temp = elements[elements.length - 1];
		for(int i = elements.length - 1; i > 0; i--)
		{
			elements[i] = elements[i - 1];
		}
		elements[0] = temp;
		System.out.println("final content:" + Arrays.toString(elements));
	}
}