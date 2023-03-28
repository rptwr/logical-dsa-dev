package app3_arrays_pack2_imp;
/*
Find a triplet that sum to a given value
*/
import java.util.Scanner;
class S10
{
	public static void main(String[] args) 
	{
		//int a[]={10, 20, 30, 40, 50, 60};
		int a[]={12,3,5,56,76,43,656,65,87,4,34};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a numbers");
		int value=sc.nextInt();
		int falg=0;
		int p=0,q=0,r=0;
		for(int i=0;i<a.length-1;i++)
		{p++;
			if(a[i]<value)
			{
				for(int j=i+1;j<a.length-1;j++)
				{q++;
					if(a[i]+a[j]<value)
					{
					for(int k=j+1;k<a.length;k++)
						{r++;
							if(a[i]+a[j]+a[k]==value)
							{
								//System.out.println("their is triplet found in a given array that sum = "+value);
								System.out.println(a[i]+","+a[j]+","+a[k]);
								falg++;
								continue;
							}
						}
					}
				}
			}
		}
		System.out.println(p+","+q+","+r);
		if(falg==0)
		System.out.println("their is no triplet found in a given array that sum = "+value);
	}
}
