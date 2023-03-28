package app3_arrays_pack2_imp;
/* 
Write a program to find those pair of elements that has the
maximum and minimum difference among all element pairs.
*/
import java.util.Arrays;
class S3A
{
	public static void main(String[] args) 
	{
		int a[]={10,9,83,2,-90,28,282,90};
		System.out.println(Arrays.toString(a));
		int max=a[0],min=a[0];
		for(int i=1;i<a.length-1;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		int max_diff=max-min;
		int min_diff=max_diff;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]-a[j]<min_diff && i!=j && a[i]-a[j]>0 )
				{
					min_diff=a[i]-a[j];
				}
			}
		}
		
		System.out.println(".Array "+Arrays.toString(a));
		System.out.println("maximum difference :"+max_diff);
		System.out.println("minimum difference :"+min_diff);
	}
	
}
