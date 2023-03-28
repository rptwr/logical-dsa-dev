package app3_arrays_pack2_imp;
//How to find all pairs on integer array whose sum is equal to given number
import java.util.Scanner;
class S5
{
	public static void main(String[] args) 
	{
		int a[]={10, 20, 30, 40, 50, 60, 50, 40, 30, 20, 10};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a numbers");
		int value=sc.nextInt();
		int falg=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<value)
			{
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]+a[j]==value)
					{
					System.out.println("their is piar found in a given array that sum = "+value);
					System.out.println(a[i]+","+a[j]);
					falg++;
					continue ;
					}
				}
			}
		}
		if(falg==0)
		System.out.println("their is no piar found in a given array that sum = "+value);
	}
}
