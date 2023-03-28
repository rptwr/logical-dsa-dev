package number_system_dev;
/*
Reverse a num using recursion
*/

import java.util.Scanner;
public class A6_2  
{   
	public static void reversenum(int num)  //method for reverse a num 
	{  
		if (num < 10)   
		{  
			System.out.println(num);  //prints the same num if the num is less than 10  
			return;  
		}  
		else   
		{  
			System.out.print(num % 10);  
			reversenum(num/10);  
		}	  
	}  
	public static void main(String args[])  
	{  
		System.out.print("Enter the num that you want to reverse: ");  
		Scanner sc = new Scanner(System.in);  
		int num = sc.nextInt();  
		System.out.print("The reverse of the given num is: ");  
 
		reversenum(num);  //method calling 
	}  	
}  