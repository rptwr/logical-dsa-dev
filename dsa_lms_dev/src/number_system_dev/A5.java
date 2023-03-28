package number_system_dev;
/*
Sum of every digit in a given number
*/
class A5
{
	public static void main(String[] args) 
	{
		if (args.length == 0)
		{
			System.out.println("pls enter int number");
			return;
		}
		int i = Integer.parseInt(args[0]);  //12345
		int sum = 0;
		int digit;
		while (i != 0)
		{
			digit = i % 10;
			sum += digit;
			i = i / 10;
		}
		System.out.println("sum of digit:" + sum);
	}
}
