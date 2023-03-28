package app1_number_system_pack1;

 //Assume total number of digits in a given number is even. Reverse only first half of the given number
import java.util.Scanner;
public class Q86
{
	public static void main(String[] args) 
	{
		System.out.println("enter a number");
		int n;
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		int count=0;
		int j=1;
		int num=n;

		for(int i=0;;i++)
		{
			if(i%2==0)
			{
				j=j*10;
			}
			if(n>=10)
			{
				count++;
			n=n/10;
			}else
			{
				count++;
				break;
			}
			
		}

		int num1=num%j;
		num=num-num1;
		int rev=0;
		//for reverseing second half
		for(int i=1;i<=10;i++)
		{
			if(num>=10)
			{
				int k=0;
				k=num%10;
				rev=(rev*10)+k;
				num=num/10;

			}else
			{
				rev=(rev*10)+num;
				num=0;
				break;
			}
		}
		//num2=(num2*j)+num1;
		String s=rev+"";
			s=s+num1;
		num=Integer.parseInt(s);
		System.out.println(s);
	}
 
}