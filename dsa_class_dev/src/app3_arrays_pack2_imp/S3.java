package app3_arrays_pack2_imp;
/* 
Write a program to find those pair of elements that has the
maximum and minimum difference among all element pairs.
*/
import java.util.Arrays;
class S3
{
	public static void main(String[] args) 
	{
		int a[]={10,9,83,2,-90,28,282,90};
		System.out.println(Arrays.toString(a));
		int temp=0;
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}		
		}
		
		int max_diff=a[a.length-1]-a[0];
		int min_diff=Integer.MAX_VALUE;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i+1]-a[i]< min_diff)
			{
				min_diff=a[i+1]-a[i];
			}
		}
		System.out.println(".Array "+Arrays.toString(a));
		System.out.println("maximum difference :"+max_diff);
		System.out.println("minimum difference :"+min_diff);
	}
	
}
