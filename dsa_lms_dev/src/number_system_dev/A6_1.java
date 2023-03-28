package number_system_dev;
/*
Reverse the digit for-loop
*/

class A6_1
{
	public static void main(String[] args)
	{
		if (args.length == 0)
		{
			System.out.println("pls enter int number");
			return;
		}
		int num = Integer.parseInt(args[0]);  // 12345
		int reverse = 0;
		for(; num != 0; num = num / 10)
		{
			int remainder = num % 10;
			reverse = (reverse * 10) + remainder; 
		}
		System.out.println(reverse);
	}
}

/*
for (; num != 0; )
{
	int remainder = num % 10;
	reverse = (reverse * 10) + remainder;
	num = num / 10;
}  */