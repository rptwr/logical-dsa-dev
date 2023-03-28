package app1_number_system_pack1;
class Q4
{
	public static void main(String[] args)
	{
		if(args.length == 0)
		{
			System.out.println("pls supply one int number");
			return;
		}
		int i = Integer.parseInt(args[0]);
		int count = 0;
		while(i != 0)
		{
			count++;
			i = i / 10;
		}
		System.out.println(count);
	}
}