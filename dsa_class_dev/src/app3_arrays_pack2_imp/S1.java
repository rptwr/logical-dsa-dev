package app3_arrays_pack2_imp;
/*
Write a program to check if elements of an array are same or
not while reading from front or back
{10, 20, 30, 40, 50, 60, 50, 40, 30, 20, 10}
*/
import java.util.Arrays;
class S1 
{
	public static void main(String[] args) 
	{
		int a[]={10, 20, 30, 40, 50, 60, 50, 40, 30, 20, 10};
		int i=(a.length/2);
		for(int j=0;i<a.length;i++,j++)
		{
			if(a[i]==a[i-j])
			{
				continue;
			}else{

				break;
			}
		}
	
			System.out.println(i==a.length-1?"elements of an array are same while reading from front or back":"elements of an array are same while reading from front or back");
			System.out.println(Arrays.toString(a));
	}
}
