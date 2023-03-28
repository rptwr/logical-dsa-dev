package app7_recursive_algo;

/*
sum of 1 to 100 without for loop and without global variable
*/

class M12
{
	public static void main(String[] args) 
	{
		int sum = sum(1);
		System.out.println(sum);
	}
	static int sum(int i) 
	{
		if(i == 101)
		{
			return 0;
		}
		return i + sum(++i);

	}
}


