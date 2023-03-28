package number_system_dev;
/*
Count number of digits in a given number
*/

class A3
{
	public static void main(String[] args)
	{
		int num = 12345;
		int count = 0;
		while (num != 0)
		{
			count++;
			num = num / 10;
		}
		System.out.println(count);
	}
}

//class A3 
//{
//	public static void main(String[] args) 
//	{
//		int num = 12345;
//		int count = 0;
//		num = num / 10;
//		count++;
//		num = num / 10;
//		count++;
//		num = num / 10;
//		count++;
//		num = num / 10;
//		count++;
//		num = num / 10;
//		count++;
//		System.out.println(count);
//	}
//}
