package number_system_dev;
class A4 
{
	public static void main(String[] args) 
	{
		int num1 = 1234;
		int num2 = num1 % 10;
		int num3 = num1 % 100;
		int num4 = num1 % 1000;
		int num5 = num1 % 10000;
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
	}
}


/*
Mod operator (%) gives a remainder
if you want to read last digit 
% 10 return last digit.
we will use mod operator with 10 multiples
*/