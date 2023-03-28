package app3_arrays_pack1;
/*
remove 4th element
*/

import java.util.Arrays;
class Q83
{
	public static void main(String[] args) 
	{
		int[] a1 = {10, 20, 30, 40, 50, 60, 70, 80, 90};
		//           0   1   2   3   4   5   6   7   8
		for(int i = a1.length - 1; i > 3; i--)
		{
			a1[i] = a1[i + 1];
		}
		System.out.println("a2:" + Arrays.toString(a1));
	} 
}
