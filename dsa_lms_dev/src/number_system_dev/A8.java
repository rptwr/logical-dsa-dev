package number_system_dev;
/*
WAP to reverse secondhalf 
firstHalf deigit should be kept as it is.
*/
import java.util.Scanner;
class A8
{
	public static void main(String[] args)
	{
		System.out.println("Enter even number of numeral");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int temp = num1;
		int digitCount = 0;
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
		int reverseInSecondHalf = firstHalf;
		while (secondHalf != 0)
		{
			reverseInSecondHalf = (reverseInSecondHalf * 10) + (secondHalf % 10);
			secondHalf = secondHalf / 10;
		}
		System.out.println(firstHalf);
		System.out.println(reverseInSecondHalf);
	}
}