package app1_number_system_pack1;
/*

*/
class Q15 
{
	public static void main(String[] args) 
	{
		if (args.length == 0)
		{
			System.out.println("pls supply one int command line args");
			return;
		}
		int i = Integer.parseInt(args[0]);

		//reverse i content and assign to j
		int k = i;
		int j = 0;
		while (k != 0)
		{
			j = j * 10 + k % 10;
			k = k / 10;
		}
		System.out.println("given number is :" + i);
		System.out.println("and its reverse is :" + j);
	}
}
