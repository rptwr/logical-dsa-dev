package app3_arrays_pack1;
/*
right-shift by 2
10, 2, 10, 2, 5, 300, 0, 45, 109, 400
*/


import java.util.Arrays;
class Q55 
{
	public static void main(String[] args)
	{
		int[] elements = {10, 2, 5, 300, 0, 45, 109, 400, 412, 900};
		              //   0  1   2   3  4   5    6   7    8    9
		System.out.println("iniital content:" + Arrays.toString(elements));
		for(int i = elements.length - 1; i > 1; i--)
		{
			elements[i] = elements[i - 2];
		}
		System.out.println("final content:" + Arrays.toString(elements));
	}
}
