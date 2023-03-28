package app1_number_system_pack1;
/*
Take two number from cla between those print prime number
*/

class Q13   
{
	public static void main(String[] args) 
	{
		if(args.length < 2)
		{
			System.out.println("enter two int number");
			return;
		}
		int i = Integer.parseInt(args[0]);
		int i2 = Integer.parseInt(args[1]);
		boolean isPrime = true;
		int count = 0;
		while(i < i2)
		{
			for(int j = 2; j <= i / 2; j++)
			{
				if(i % j == 0)
				{
					isPrime = false;
					break;
				}
			}
			if(isPrime)
			{
				System.out.print(i + ", ");
				count++;
			}
			isPrime = true;
			i++;
		}
	}
}
