package app4_strings_pack2_basics;

public class Q40
{
	public static void main(String[] args) {
		System.out.println("main begin");
		test(3);
		System.out.println("main end");
	}
	public static void test(int i)
	{
		if (i == 0)
		{
			return;
		}
		System.out.println("test begin:" + i);
		i --;
		test(i);
		System.out.println("test end:" + i);
	}
}