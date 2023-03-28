package number_system_dev;
/*
Reverse the digit using while loop.
*/

class A6 
{
	public static void main(String[] args)
	{
		if (args.length == 0)
		{
			System.out.println("pls enter int number");
			return;
		}
		int num = Integer.parseInt(args[0]);  // 12345
		int digit;
		int reverse = 0;
		while (num != 0)
		{
			digit = num % 10;
			//System.out.println(digit + ", ");
			reverse = (reverse * 10) + digit;
			num = num / 10;
		}
		System.out.println(reverse);
	}
}

