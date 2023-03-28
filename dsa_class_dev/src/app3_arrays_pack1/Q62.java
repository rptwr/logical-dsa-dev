package app3_arrays_pack1;
/*
remove a2 elements from a1

 output:{10, 20, 30, 40, 4, 9}
		{300, 50, 90, 100, 34, 66, 1, 12, 80, 6};
*/

import java.util.Arrays;
class Q62 
{
	public static void main(String[] args) 
	{
		int[] a1 = {10, 20, 30, 40, 50, 4, 6, 9, 100, 1, 6};
		int[] a2 = {300, 50, 90, 100, 34, 66, 1, 12, 80, 6};
		
		int count = 0;
		for(int i = 0; i < a2.length; i++)  // for a2
		{
			for(int j = 0; j < a1.length - count; j++)   // for a1
			{
				if(a2[i] == a1[j])
				{
					for(int k = j; k < a1.length - count - 1; k++) //left shift by 1
					{
						a1[k] = a1[k + 1];
					}
					j--;
					count++;
				}
			}
		}
		int[] temp = a1;
		a1 = new int[a1.length - count];
		for(int i = 0; i < a1.length; i++)
		{
			a1[i] = temp[i];
		}
		System.out.println(Arrays.toString(a1));
		System.out.println(Arrays.toString(a2));
	}
}


