package app3_arrays_pack1;

/*
How to find all pairs on integer array whose sum is equal to 
given number

*/
import java.util.Arrays;
class Q147
{
	public static void main(String[] args) 
	{
		int[] a= {12,8,5,15,6,14,7,13,9,23,45,87,98,200,50,20,0};
		if (args.length<1)
		{
			System.out.println("Enter a number");
			return;
		}
		int n = Integer.parseInt(args[0]);
		for (int i =0 ;i<a.length;i++)
		{
			for (int j =i+1;j<a.length;j++)
			{
				if (a[i]+a[j]==n)
				{
					System.out.println(a[i]+", "+ a[j]);
				}
			}
		}
	}
}
