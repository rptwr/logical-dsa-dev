package app3_arrays_pack1;
/*
right-rotate by 2
412, 900, 10, 2, 5, 300, 0, 45, 109, 400
*/

import java.util.Arrays;
class Q59
{
	public static void main(String[] args)
	{
		int[] elements = {10, 2, 5, 300, 0, 45, 109, 400, 412, 900};
		              //   0  1   2   3  4   5    6   7    8    9
		System.out.println("iniital content:" + Arrays.toString(elements));
		int temp1 = elements[elements.length - 1];
		int temp2 = elements[elements.length - 2];
		for(int i = elements.length - 1; i > 1; i--)
		{
			elements[i] = elements[i - 2];
		}
		elements[1] = temp1;
		elements[0] = temp2;
		System.out.println("final content:" + Arrays.toString(elements));
	}
}