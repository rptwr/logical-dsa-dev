package app7_recursive_algo;

/*
sum of 1 to 100 without for loop
*/

class M11
{
	static int sum;
	public static void main(String[] args) 
	{
		sum(1);
		System.out.println(sum);
	}
	public static void sum(int i) 
	{
		if(i == 101)
		{
			return;
		}
		sum += i;
		i++;
		sum(i);

	}
}


