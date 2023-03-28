package app7_recursive_algo;

class M6
{
	public static void main(String[] args) 
	{
		System.out.println(1);
		test(1);
		System.out.println(2);
	}
	public static void test(int i) 
	{
		System.out.println(3);
		if(i == 3)
		{
			return;
		}
		i++;
		test(i);
		System.out.println(4);
	}
}
