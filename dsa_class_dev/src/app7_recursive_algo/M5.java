package app7_recursive_algo;

class M5
{
	static int i = 3;
	public static void main(String[] args) 
	{
		System.out.println(1);
		test();
		System.out.println(2);
	}
	public static void test() 
	{
		if(i == 5)
		{
			return;
		}
		System.out.println(3);
		i++;
		test();
		System.out.println(4);
	}
}
