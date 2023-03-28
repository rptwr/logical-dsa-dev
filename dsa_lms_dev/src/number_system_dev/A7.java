package number_system_dev;
/*
Given number containing even number of digits 
make it in two part
first part -- first half
second part -- second half
*/

import java.util.Scanner;
class A7 
{
	public static void main(String[] args) 
	{
		System.out.println("Pls enter even number of Numeral");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();  //1234
		int digitCount = 0;
		int temp = num1;
		while (temp != 0)
		{
			digitCount++;
			temp = temp / 10;
		}
		int factor = 1;
		for (int i = 1; i <= (digitCount / 2); i++)
		{
			factor = factor * 10;
		}
		int firstHalf = num1 / factor;
		int secondHalf = num1 % factor;
		System.out.println("num1:" + num1);
		System.out.println("firstHalf:" + firstHalf);
		System.out.println("secondHalf:" + secondHalf);
	}
}
