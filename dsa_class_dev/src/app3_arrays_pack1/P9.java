package app3_arrays_pack1;
/*
find out avg of odd elmnt except first and last stmnt(boundary)
*/

import java.util.Arrays;
class P9
{
	public static void main(String[] args) 
	{
		int[] a1 = {10, 2, 13, 40, 15, 60, 7, 80};
		//System.out.println("initial:" + Arrays.toString(a1));
		int sum = 0, count = 0;
		for(int i = 1; i < a1.length - 1 ; i++)
		{
			if(a1[i] % 2 == 1)
			{
				sum += a1[i];
				count++;
			}
		}
		double avg = (double) sum / count;
		
		System.out.println("avg:" + avg);
	}
}
