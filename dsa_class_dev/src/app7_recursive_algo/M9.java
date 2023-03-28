package app7_recursive_algo;

/*
read all element of array elements without a for loop
*/

//class M9
//{
//	static int array[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//	public static void main(String[] args) 
//	{
//		test(0);
//	}
//	public static void test(int i) 
//	{
//		System.out.println(array[i]);
//		if(i == array.length -1 )
//		{
//			return;
//		}
//		i++;
//		test(i);
//
//	}
//}
//

class M9
{
	public static void main(String[] args) 
	{
		int[] elements = {10, 20, 30, 40, 50, 60};
		print(elements, 0 );
	}
	public static void print(int[] elements, int i) 
	{
		if(i == elements.length)
		{
			return;
		}
		System.out.println(elements[i] + ", ");
		i++;
		print(elements, i);

	}
}


