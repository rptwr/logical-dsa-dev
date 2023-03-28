package app3_arrays_pack2_imp;
/*Take 20 integer inputs from user and print the following:
number of positive numbers
number of negative numbers
number of odd numbers
number of even numbers
number of 0s.*/
import java.util.Scanner;
import java.util.Arrays;
class S2
{
	public static void main(String[] args) 
	{
		int a[]=new int[20];
		int pos=0,neg=0,odd=0,even=0,zero=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a 20 numbers");
		for(int i=0;i<20;i++)
		{
			a[i]=sc.nextInt();
			if(a[i]==0)
			{
				++zero;
			}
			else if(a[i]>0)
			{
				++pos;
			}else
			{
				++neg;
			}

			if(a[i]%2==1)
			{
				++odd;
			}else{
				++even;
			}
		}
		
		
			System.out.println(Arrays.toString(a));
			System.out.println("number of positive numbers : "+pos);
			System.out.println("number of negative numbers : "+neg);
			System.out.println("number of odd numbers : "+odd);
			System.out.println("number of even numbers : "+even);
			System.out.println("number of 0s : "+zero);
	}
}
