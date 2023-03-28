package app3_arrays_pack1;

import java.util.Arrays;
class Q96
{
	public static void main(String[] args) 
	{
		int[] a1 = {10, 20, 30, 40, 50, 60, 70, 80};
		for(int i = a1.length - 1; i >= a1.length / 2; i--)
		{
			System.out.print(a1[i] + ", ");
		}
	}
}
