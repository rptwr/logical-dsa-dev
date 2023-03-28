package app1_number_system_pack1;
/*

*/

class Q14   
{
	public static void main(String[] args) 
	{
		int i = 2;
		boolean isPrime = true;
		int count = 0;
		while(i <= 500)
		{
			for(int j = 2; j <= i / 2; j++)
			{
				if(i % j == 0)
				{
					isPrime = false;
					break;
				}
			}
			if(isPrime && ((i - 1) % 3 == 0))
			{
				System.out.print(i + ", ");
			}
			isPrime = true;
			i++;
		}
	}
}
