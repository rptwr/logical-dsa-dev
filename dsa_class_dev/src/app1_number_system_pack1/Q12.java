package app1_number_system_pack1;
/*
print inital 10 prime number
*/

class Q12  
{
	public static void main(String[] args) 
	{
		int i = 2;
		boolean isPrime = true;
		int count = 0;
		while(count < 10)
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
