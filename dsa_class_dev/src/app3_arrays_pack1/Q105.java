package app3_arrays_pack1;

/*
swap odd indexed element with even indexed element
*/

import java.util.Arrays;
class Q105
{
	public static void main(String[] args) 
	{
		int[] a1 = {10, 2, 13, 40, 15, 60, 7, 80};
		System.out.println("initial:" + Arrays.toString(a1));
		int temp = 0;
		for(int i = 0; i < a1.length - 1 ; i += 2)
		{
			temp = a1[i];
			a1[i] = a1[i + 1];
			a1[i + 1] = temp;
		}
		
		System.out.println("final:" + Arrays.toString(a1));
	}
}
