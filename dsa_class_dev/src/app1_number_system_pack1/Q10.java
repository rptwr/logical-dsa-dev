package app1_number_system_pack1;
/*
prime number a number that can be divided exactly only by itself and 1
2 3 5 7 11 13
*/

class Q10
{
	public static void main(String[] args) 
	{
		int i = 13;
		boolean isPrime = true;

		for(int j = 2; j <= i / 2; j++)
		{
			if(i % j == 0)
			{
				isPrime = false;
				break;
			}
		}
		System.out.println(i + " is " + (isPrime ? "prime" : "not a prime"));
	}
}
