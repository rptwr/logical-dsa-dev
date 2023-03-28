package app6_control_statements;

import java.util.Scanner;

// WAP to check for leap years

public class F 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number to check leap year");
		int num = sc.nextInt();
		if(num % 400 == 0 || (num % 4 == 0 && num % 100 != 0))
		{
			System.out.println("number is leap year");
		}
		else
		{
			System.out.println("number is not leap year");
		}
	}
}

//===========================================================

//{
//	public static void main(String[] args) {
//		int i = 1000;
//		if(i % 4 == 0)
//		{
//			if(i % 100 == 0)
//			{
//				if(i % 400 == 0)
//				{
//					System.out.println("number is leap year");
//				}
//				else
//				{
//					System.out.println("number is not leap year");
//				}
//			}
//			else
//			{
//				System.out.println("leap year");
//			}
//		}
//		else {
//			System.out.println("not a leap year");
//		}
//	}
//}