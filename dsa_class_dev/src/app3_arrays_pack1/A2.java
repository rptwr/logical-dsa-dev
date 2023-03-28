package app3_arrays_pack1;
//recursive algo
class A2 
{
	public static void main(String[] args) 
	{
		int sum = sum(4);
		System.out.println(sum);
	}
	static int sum(int i)
	{
		if(i == 0)
		{
			return 0;
		}
		return i + sum(--i);
	}
}
