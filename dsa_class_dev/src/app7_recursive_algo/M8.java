package app7_recursive_algo;

/*
Print 1000 to 1 without loop
*/

class M8
{
	public static void main(String[] args) 
	{
		test(1000);
	}
	public static void test(int i) 
	{
		System.out.println(i);
		if(i == 1)
		{
			return;
		}
		i--;
		test(i);

	}
}


