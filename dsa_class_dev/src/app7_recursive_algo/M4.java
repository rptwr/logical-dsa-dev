package app7_recursive_algo;

class M4
{
	static int i = 0;
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test1();
		System.out.println("main end");
	}
	public static void test1() 
	{
		if(i == 2)
		{
			return;
		}
		System.out.println("test1 begin");
		i++;
		test1();
		System.out.println("test1 end");
	}
}
