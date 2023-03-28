package app7_recursive_algo;

/*
Print 0 to 50 without loop
*/

class M7
{
	public static void main(String[] args) 
	{
		test(1);
	}
	public static void test(int i) 
	{
		System.out.println(i);
		if(i == 50)
		{
			return;
		}
		i++;
		test(i);

	}
}


