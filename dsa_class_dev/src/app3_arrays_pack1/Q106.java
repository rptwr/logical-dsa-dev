package app3_arrays_pack1;

/*
Find out two consecutive elements whose absolute difference is minimum
*/
import java.util.Arrays;
class Q106
{
	public static void main(String[] args) 
	{
		int[] a1 = {10, 20, 30, 40, 50, 4, 6, 9, 100, 1, 6};
		System.out.println(Arrays.toString(a1));
		int diff = 0, minDiff = Integer.MAX_VALUE, index = 0;
		for(int i = 0; i < a1.length - 1; i++)
		{
			diff = getAbsDiff(a1[i] - a1[i + 1]);
			if(minDiff > diff)
			{
				minDiff = diff;
				index = i;
			}
		}
		System.out.println(a1[index] + ", " + a1[index + 1]);
	}
	static int getAbsDiff(int diff)
	{
		if(diff < 0)
		{
			diff = diff * (- 1);
		}
		return diff;
	}
}
