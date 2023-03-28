package app1_number_system_pack1;
/*
sum of all the digit in given number
*/
class Q8
{
	public static void main(String[] args)
	{
		if(args.length == 0)
		{
			System.out.println("pls supply int number");
			return;
		}
		int i = Integer.parseInt(args[0]);  //1234
		int digit;
		int sum = 0;
		while(i != 0)
		{
			digit = i % 10;
			sum += digit;
			i = i / 10;
		}
		System.out.println(sum);
	}
}