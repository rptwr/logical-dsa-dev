package app1_number_system_pack1;
/*
printing digit by digit from the right to left
*/
class Q7 
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
		while(i != 0)
		{
			digit = i % 10;
			System.out.println(digit + ", ");
			i = i / 10;
		}
	}
}